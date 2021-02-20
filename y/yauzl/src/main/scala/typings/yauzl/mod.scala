package typings.yauzl

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Error
import typings.yauzl.anon.Data
import typings.yauzl.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yauzl", "Entry")
  @js.native
  class Entry () extends StObject {
    
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
    
    def getLastModDate(): Date = js.native
    
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
  
  @JSImport("yauzl", "RandomAccessReader")
  @js.native
  abstract class RandomAccessReader () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def _readStreamForRange(start: Double, end: Double): Unit = js.native
    
    def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def createReadStream(options: End): Unit = js.native
    
    def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
  }
  
  @JSImport("yauzl", "ZipFile")
  @js.native
  class ZipFile protected () extends EventEmitter {
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
    
    def openReadStream(
      entry: Entry,
      callback: js.Function2[/* err */ js.UndefOr[Error], /* stream */ js.UndefOr[Readable], Unit]
    ): Unit = js.native
    def openReadStream(
      entry: Entry,
      options: ZipFileOptions,
      callback: js.Function2[/* err */ js.UndefOr[Error], /* stream */ js.UndefOr[Readable], Unit]
    ): Unit = js.native
    
    def readEntry(): Unit = js.native
    
    var readEntryCursor: Boolean = js.native
    
    var validateEntrySizes: Boolean = js.native
  }
  
  @JSImport("yauzl", "dosDateTimeToDate")
  @js.native
  def dosDateTimeToDate(date: Double, time: Double): Date = js.native
  
  @JSImport("yauzl", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): Unit = js.native
  @JSImport("yauzl", "fromBuffer")
  @js.native
  def fromBuffer(
    buffer: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  @JSImport("yauzl", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer, options: Options): Unit = js.native
  @JSImport("yauzl", "fromBuffer")
  @js.native
  def fromBuffer(
    buffer: Buffer,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  
  @JSImport("yauzl", "fromFd")
  @js.native
  def fromFd(fd: Double): Unit = js.native
  @JSImport("yauzl", "fromFd")
  @js.native
  def fromFd(
    fd: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  @JSImport("yauzl", "fromFd")
  @js.native
  def fromFd(fd: Double, options: Options): Unit = js.native
  @JSImport("yauzl", "fromFd")
  @js.native
  def fromFd(
    fd: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  
  @JSImport("yauzl", "fromRandomAccessReader")
  @js.native
  def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  @JSImport("yauzl", "fromRandomAccessReader")
  @js.native
  def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  
  @JSImport("yauzl", "open")
  @js.native
  def open(path: String): Unit = js.native
  @JSImport("yauzl", "open")
  @js.native
  def open(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  @JSImport("yauzl", "open")
  @js.native
  def open(path: String, options: Options): Unit = js.native
  @JSImport("yauzl", "open")
  @js.native
  def open(
    path: String,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  
  @JSImport("yauzl", "validateFileName")
  @js.native
  def validateFileName(fileName: String): String | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var lazyEntries: js.UndefOr[Boolean] = js.native
    
    var strictFileNames: js.UndefOr[Boolean] = js.native
    
    var validateEntrySizes: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setLazyEntries(value: Boolean): Self = StObject.set(x, "lazyEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyEntriesUndefined: Self = StObject.set(x, "lazyEntries", js.undefined)
      
      @scala.inline
      def setStrictFileNames(value: Boolean): Self = StObject.set(x, "strictFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictFileNamesUndefined: Self = StObject.set(x, "strictFileNames", js.undefined)
      
      @scala.inline
      def setValidateEntrySizes(value: Boolean): Self = StObject.set(x, "validateEntrySizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateEntrySizesUndefined: Self = StObject.set(x, "validateEntrySizes", js.undefined)
    }
  }
  
  @js.native
  trait ZipFileOptions extends StObject {
    
    var decompress: Boolean | Null = js.native
    
    var decrypt: Boolean | Null = js.native
    
    var end: Double | Null = js.native
    
    var start: Double | Null = js.native
  }
  object ZipFileOptions {
    
    @scala.inline
    def apply(): ZipFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZipFileOptions]
    }
    
    @scala.inline
    implicit class ZipFileOptionsMutableBuilder[Self <: ZipFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressNull: Self = StObject.set(x, "decompress", null)
      
      @scala.inline
      def setDecrypt(value: Boolean): Self = StObject.set(x, "decrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecryptNull: Self = StObject.set(x, "decrypt", null)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNull: Self = StObject.set(x, "end", null)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
    }
  }
}
