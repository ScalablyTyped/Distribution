package typings.yauzl

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.yauzl.anon.Data
import typings.yauzl.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yauzl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yauzl", "Entry")
  @js.native
  open class Entry () extends StObject {
    
    var comment: String = js.native
    
    var compressedSize: Double = js.native
    
    var compressionMethod: Double = js.native
    
    var crc32: Double = js.native
    
    var externalFileAttributes: Double = js.native
    
    var extraFieldLength: Double = js.native
    
    var extraFields: js.Array[Data] = js.native
    
    var fileCommentLength: Double = js.native
    
    var fileName: String = js.native
    
    var fileNameLength: Double = js.native
    
    var generalPurposeBitFlag: Double = js.native
    
    def getLastModDate(): js.Date = js.native
    
    var internalFileAttributes: Double = js.native
    
    def isCompressed(): Boolean = js.native
    
    def isEncrypted(): Boolean = js.native
    
    var lastModFileDate: Double = js.native
    
    var lastModFileTime: Double = js.native
    
    var relativeOffsetOfLocalHeader: Double = js.native
    
    var uncompressedSize: Double = js.native
    
    var versionMadeBy: Double = js.native
    
    var versionNeededToExtract: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("yauzl", "RandomAccessReader")
  @js.native
  open class RandomAccessReader () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def _readStreamForRange(start: Double, end: Double): Unit = js.native
    
    def close(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    def createReadStream(options: End): Unit = js.native
    
    def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
  }
  
  @JSImport("yauzl", "ZipFile")
  @js.native
  open class ZipFile protected () extends EventEmitter {
    def this(
      reader: RandomAccessReader,
      centralDirectoryOffset: Double,
      fileSize: Double,
      entryCount: Double,
      comment: String,
      autoClose: Boolean,
      lazyEntries: Boolean,
      decodeStrings: Boolean,
      validateEntrySizes: Boolean
    ) = this()
    
    var autoClose: Boolean = js.native
    
    def close(): Unit = js.native
    
    var comment: String = js.native
    
    var decodeStrings: Boolean = js.native
    
    var emittedError: Boolean = js.native
    
    var entriesRead: Double = js.native
    
    var entryCount: Double = js.native
    
    var fileSize: Double = js.native
    
    var isOpen: Boolean = js.native
    
    var lazyEntries: Boolean = js.native
    
    def openReadStream(entry: Entry, callback: js.Function2[/* err */ js.Error | Null, /* stream */ Readable, Unit]): Unit = js.native
    def openReadStream(
      entry: Entry,
      options: ZipFileOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* stream */ Readable, Unit]
    ): Unit = js.native
    
    def readEntry(): Unit = js.native
    
    var readEntryCursor: Boolean = js.native
    
    var validateEntrySizes: Boolean = js.native
  }
  
  inline def dosDateTimeToDate(date: Double, time: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dosDateTimeToDate")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def fromBuffer(buffer: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fromBuffer(buffer: Buffer, callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromBuffer(buffer: Buffer, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromBuffer(
    buffer: Buffer,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromFd(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fromFd(fd: Double, callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromFd(fd: Double, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromFd(
    fd: Double,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandomAccessReader")(reader.asInstanceOf[js.Any], totalSize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandomAccessReader")(reader.asInstanceOf[js.Any], totalSize.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def open(path: String, callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(path: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(
    path: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* zipfile */ ZipFile, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFileName(fileName: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  trait Options extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var lazyEntries: js.UndefOr[Boolean] = js.undefined
    
    var strictFileNames: js.UndefOr[Boolean] = js.undefined
    
    var validateEntrySizes: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setLazyEntries(value: Boolean): Self = StObject.set(x, "lazyEntries", value.asInstanceOf[js.Any])
      
      inline def setLazyEntriesUndefined: Self = StObject.set(x, "lazyEntries", js.undefined)
      
      inline def setStrictFileNames(value: Boolean): Self = StObject.set(x, "strictFileNames", value.asInstanceOf[js.Any])
      
      inline def setStrictFileNamesUndefined: Self = StObject.set(x, "strictFileNames", js.undefined)
      
      inline def setValidateEntrySizes(value: Boolean): Self = StObject.set(x, "validateEntrySizes", value.asInstanceOf[js.Any])
      
      inline def setValidateEntrySizesUndefined: Self = StObject.set(x, "validateEntrySizes", js.undefined)
    }
  }
  
  trait ZipFileOptions extends StObject {
    
    var decompress: Boolean | Null
    
    var decrypt: Boolean | Null
    
    var end: Double | Null
    
    var start: Double | Null
  }
  object ZipFileOptions {
    
    inline def apply(): ZipFileOptions = {
      val __obj = js.Dynamic.literal(decompress = null, decrypt = null, end = null, start = null)
      __obj.asInstanceOf[ZipFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipFileOptions] (val x: Self) extends AnyVal {
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressNull: Self = StObject.set(x, "decompress", null)
      
      inline def setDecrypt(value: Boolean): Self = StObject.set(x, "decrypt", value.asInstanceOf[js.Any])
      
      inline def setDecryptNull: Self = StObject.set(x, "decrypt", null)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
    }
  }
}
