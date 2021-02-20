package typings.unzipper

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.RegExp
import typings.std.Uint8Array
import typings.unzipper.anon.CompressedSize
import typings.unzipper.anon.Disknum
import typings.unzipper.anon.Path
import typings.unzipper.anon.Size
import typings.unzipper.anon.TransformpromisePromisevo
import typings.unzipper.unzipperStrings.Directory
import typings.unzipper.unzipperStrings.close
import typings.unzipper.unzipperStrings.data
import typings.unzipper.unzipperStrings.drain
import typings.unzipper.unzipperStrings.end
import typings.unzipper.unzipperStrings.error
import typings.unzipper.unzipperStrings.finish
import typings.unzipper.unzipperStrings.pause
import typings.unzipper.unzipperStrings.pipe
import typings.unzipper.unzipperStrings.readable
import typings.unzipper.unzipperStrings.resume
import typings.unzipper.unzipperStrings.unpipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzipper", "BufferStream")
  @js.native
  def BufferStream(entry: Entry): js.Promise[Buffer] = js.native
  
  @JSImport("unzipper", "Extract")
  @js.native
  def Extract(): ParseStream = js.native
  @JSImport("unzipper", "Extract")
  @js.native
  def Extract(opts: ParseOptions): ParseStream = js.native
  
  object Open {
    
    @JSImport("unzipper", "Open.buffer")
    @js.native
    def buffer(data: Buffer): js.Promise[CentralDirectory] = js.native
    
    @JSImport("unzipper", "Open.file")
    @js.native
    def file(filename: String): js.Promise[CentralDirectory] = js.native
    
    @JSImport("unzipper", "Open.s3")
    @js.native
    def s3(client: js.Any, params: js.Any): js.Promise[CentralDirectory] = js.native
    
    @JSImport("unzipper", "Open.url")
    @js.native
    def url(request: ClientRequest, opt: String): js.Promise[CentralDirectory] = js.native
    @JSImport("unzipper", "Open.url")
    @js.native
    def url(request: ClientRequest, opt: RequestOptions): js.Promise[CentralDirectory] = js.native
  }
  
  @JSImport("unzipper", "Parse")
  @js.native
  def Parse(): ParseStream = js.native
  @JSImport("unzipper", "Parse")
  @js.native
  def Parse(opts: ParseOptions): ParseStream = js.native
  
  @JSImport("unzipper", "ParseOne")
  @js.native
  def ParseOne(): Duplex = js.native
  @JSImport("unzipper", "ParseOne")
  @js.native
  def ParseOne(`match`: js.UndefOr[scala.Nothing], opts: ParseOptions): Duplex = js.native
  @JSImport("unzipper", "ParseOne")
  @js.native
  def ParseOne(`match`: RegExp): Duplex = js.native
  @JSImport("unzipper", "ParseOne")
  @js.native
  def ParseOne(`match`: RegExp, opts: ParseOptions): Duplex = js.native
  
  @JSImport("unzipper", "unzip")
  @js.native
  def unzip(source: Size, offset: Double, _password: String): Entry = js.native
  
  @js.native
  trait CentralDirectory extends StObject {
    
    var commentLength: Double = js.native
    
    var diskNumber: Double = js.native
    
    var diskStart: Double = js.native
    
    def extract(opts: ParseOptions): js.Promise[Unit] = js.native
    
    var files: js.Array[File] = js.native
    
    var numberOfRecords: Double = js.native
    
    var numberOfRecordsOnDisk: Double = js.native
    
    var offsetToStartOfCentralDirectory: Double = js.native
    
    var signature: Double = js.native
    
    var sizeOfCentralDirectory: Double = js.native
  }
  object CentralDirectory {
    
    @scala.inline
    def apply(
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
    implicit class CentralDirectoryMutableBuilder[Self <: CentralDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommentLength(value: Double): Self = StObject.set(x, "commentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskNumber(value: Double): Self = StObject.set(x, "diskNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskStart(value: Double): Self = StObject.set(x, "diskStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtract(value: ParseOptions => js.Promise[Unit]): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setNumberOfRecords(value: Double): Self = StObject.set(x, "numberOfRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfRecordsOnDisk(value: Double): Self = StObject.set(x, "numberOfRecordsOnDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetToStartOfCentralDirectory(value: Double): Self = StObject.set(x, "offsetToStartOfCentralDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: Double): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeOfCentralDirectory(value: Double): Self = StObject.set(x, "sizeOfCentralDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): TransformpromisePromisevo = js.native
    
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
    
    var extra: js.Any = js.native
    
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
  
  @js.native
  trait ParseOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var forceStream: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setForceStream(value: Boolean): Self = StObject.set(x, "forceStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceStreamUndefined: Self = StObject.set(x, "forceStream", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /* Inlined unzipper.unzipper.PullStream & {promise (): std.Promise<void>} */
  @js.native
  trait ParseStream extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def promise(): js.Promise[Unit] = js.native
    
    def pull(eof: String, includeEof: Boolean): js.Promise[Buffer] = js.native
    def pull(eof: Double, includeEof: Boolean): js.Promise[Buffer] = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def stream(eof: String, includeEof: Boolean): PassThrough = js.native
    def stream(eof: Double, includeEof: Boolean): PassThrough = js.native
    
    def uncork(): Unit = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(
      str: String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  @js.native
  trait PullStream extends Duplex {
    
    def pull(eof: String, includeEof: Boolean): js.Promise[Buffer] = js.native
    def pull(eof: Double, includeEof: Boolean): js.Promise[Buffer] = js.native
    
    def stream(eof: String, includeEof: Boolean): PassThrough = js.native
    def stream(eof: Double, includeEof: Boolean): PassThrough = js.native
  }
}
