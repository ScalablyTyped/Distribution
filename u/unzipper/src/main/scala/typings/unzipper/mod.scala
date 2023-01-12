package typings.unzipper

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Transform
import typings.unzipper.anon.CompressedSize
import typings.unzipper.anon.Disknum
import typings.unzipper.anon.Path
import typings.unzipper.anon.Promise
import typings.unzipper.anon.Size
import typings.unzipper.unzipperStrings.Directory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzipper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BufferStream(entry: Entry): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("BufferStream")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def Extract(): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")().asInstanceOf[ParseStream]
  inline def Extract(opts: ParseOptions): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
  
  object Open {
    
    @JSImport("unzipper", "Open")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buffer(data: Buffer): js.Promise[CentralDirectory] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CentralDirectory]]
    
    inline def file(filename: String): js.Promise[CentralDirectory] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CentralDirectory]]
    
    inline def s3(client: Any, params: Any): js.Promise[CentralDirectory] = (^.asInstanceOf[js.Dynamic].applyDynamic("s3")(client.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CentralDirectory]]
    
    inline def url(request: ClientRequest, opt: String): js.Promise[CentralDirectory] = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(request.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CentralDirectory]]
    inline def url(request: ClientRequest, opt: RequestOptions): js.Promise[CentralDirectory] = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(request.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CentralDirectory]]
  }
  
  inline def Parse(): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[ParseStream]
  inline def Parse(opts: ParseOptions): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
  
  inline def ParseOne(): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseOne")().asInstanceOf[Duplex]
  inline def ParseOne(`match`: js.RegExp): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseOne")(`match`.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def ParseOne(`match`: js.RegExp, opts: ParseOptions): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseOne")(`match`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def ParseOne(`match`: Unit, opts: ParseOptions): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseOne")(`match`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  inline def unzip(source: Size, offset: Double, _password: String): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(source.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[Entry]
  
  trait CentralDirectory extends StObject {
    
    var commentLength: Double
    
    var diskNumber: Double
    
    var diskStart: Double
    
    def extract(opts: ParseOptions): js.Promise[Unit]
    
    var files: js.Array[File]
    
    var numberOfRecords: Double
    
    var numberOfRecordsOnDisk: Double
    
    var offsetToStartOfCentralDirectory: Double
    
    var signature: Double
    
    var sizeOfCentralDirectory: Double
  }
  object CentralDirectory {
    
    inline def apply(
      commentLength: Double,
      diskNumber: Double,
      diskStart: Double,
      extract: ParseOptions => js.Promise[Unit],
      files: js.Array[File],
      numberOfRecords: Double,
      numberOfRecordsOnDisk: Double,
      offsetToStartOfCentralDirectory: Double,
      signature: Double,
      sizeOfCentralDirectory: Double
    ): CentralDirectory = {
      val __obj = js.Dynamic.literal(commentLength = commentLength.asInstanceOf[js.Any], diskNumber = diskNumber.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), files = files.asInstanceOf[js.Any], numberOfRecords = numberOfRecords.asInstanceOf[js.Any], numberOfRecordsOnDisk = numberOfRecordsOnDisk.asInstanceOf[js.Any], offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], sizeOfCentralDirectory = sizeOfCentralDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[CentralDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CentralDirectory] (val x: Self) extends AnyVal {
      
      inline def setCommentLength(value: Double): Self = StObject.set(x, "commentLength", value.asInstanceOf[js.Any])
      
      inline def setDiskNumber(value: Double): Self = StObject.set(x, "diskNumber", value.asInstanceOf[js.Any])
      
      inline def setDiskStart(value: Double): Self = StObject.set(x, "diskStart", value.asInstanceOf[js.Any])
      
      inline def setExtract(value: ParseOptions => js.Promise[Unit]): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setNumberOfRecords(value: Double): Self = StObject.set(x, "numberOfRecords", value.asInstanceOf[js.Any])
      
      inline def setNumberOfRecordsOnDisk(value: Double): Self = StObject.set(x, "numberOfRecordsOnDisk", value.asInstanceOf[js.Any])
      
      inline def setOffsetToStartOfCentralDirectory(value: Double): Self = StObject.set(x, "offsetToStartOfCentralDirectory", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Double): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSizeOfCentralDirectory(value: Double): Self = StObject.set(x, "sizeOfCentralDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Transform & Promise = js.native
    
    def buffer(): js.Promise[Buffer] = js.native
    
    var extra: Disknum = js.native
    
    var path: String = js.native
    
    var props: Path = js.native
    
    var `type`: String = js.native
    
    var vars: CompressedSize = js.native
  }
  
  @js.native
  trait File extends StObject {
    
    def buffer(): js.Promise[Buffer] = js.native
    def buffer(password: String): js.Promise[Buffer] = js.native
    
    var comment: String = js.native
    
    var compressedSize: Double = js.native
    
    var compressionMethod: Double = js.native
    
    var crc32: Double = js.native
    
    var diskNumber: Double = js.native
    
    var externalFileAttributes: Double = js.native
    
    var extra: Any = js.native
    
    var extraFieldLength: Double = js.native
    
    var fileCommentLength: Double = js.native
    
    var fileNameLength: Double = js.native
    
    var flags: Double = js.native
    
    var internalFileAttributes: Double = js.native
    
    var isUnicode: Double = js.native
    
    var lastModifiedDate: Double = js.native
    
    var lastModifiedTime: Double = js.native
    
    var offsetToLocalFileHeader: Double = js.native
    
    var path: String = js.native
    
    var pathBuffer: Buffer = js.native
    
    var signature: Double = js.native
    
    def stream(): Entry = js.native
    def stream(password: String): Entry = js.native
    
    var `type`: Directory | typings.unzipper.unzipperStrings.File = js.native
    
    var uncompressedSize: Double = js.native
    
    var versionMadeBy: Double = js.native
    
    var versionsNeededToExtract: Double = js.native
  }
  
  trait ParseOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var forceStream: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setForceStream(value: Boolean): Self = StObject.set(x, "forceStream", value.asInstanceOf[js.Any])
      
      inline def setForceStreamUndefined: Self = StObject.set(x, "forceStream", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait ParseStream extends PullStream {
    
    def promise(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait PullStream extends Duplex {
    
    def pull(eof: String, includeEof: Boolean): js.Promise[Buffer] = js.native
    def pull(eof: Double, includeEof: Boolean): js.Promise[Buffer] = js.native
    
    def stream(eof: String, includeEof: Boolean): PassThrough = js.native
    def stream(eof: Double, includeEof: Boolean): PassThrough = js.native
  }
}
