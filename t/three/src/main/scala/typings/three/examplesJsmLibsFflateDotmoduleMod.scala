package typings.three

import typings.fflate.mod.AsyncDeflateOptions
import typings.fflate.mod.AsyncFlateStreamHandler
import typings.fflate.mod.AsyncGunzipOptions
import typings.fflate.mod.AsyncGzipOptions
import typings.fflate.mod.AsyncInflateOptions
import typings.fflate.mod.AsyncTerminable
import typings.fflate.mod.AsyncUnzipOptions
import typings.fflate.mod.AsyncZipOptions
import typings.fflate.mod.AsyncZippable
import typings.fflate.mod.AsyncZlibOptions
import typings.fflate.mod.DeflateOptions
import typings.fflate.mod.FlateCallback
import typings.fflate.mod.FlateStreamHandler
import typings.fflate.mod.GzipOptions
import typings.fflate.mod.StringStreamHandler
import typings.fflate.mod.UnzipCallback
import typings.fflate.mod.UnzipFileHandler
import typings.fflate.mod.UnzipOptions
import typings.fflate.mod.Unzipped
import typings.fflate.mod.ZipOptions
import typings.fflate.mod.Zippable
import typings.fflate.mod.ZlibOptions
import typings.three.threeInts.`0`
import typings.three.threeInts.`10`
import typings.three.threeInts.`11`
import typings.three.threeInts.`12`
import typings.three.threeInts.`13`
import typings.three.threeInts.`14`
import typings.three.threeInts.`1`
import typings.three.threeInts.`2`
import typings.three.threeInts.`3`
import typings.three.threeInts.`4`
import typings.three.threeInts.`5`
import typings.three.threeInts.`6`
import typings.three.threeInts.`7`
import typings.three.threeInts.`8`
import typings.three.threeInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLibsFflateDotmoduleMod {
  
  @JSImport("three/examples/jsm/libs/fflate.module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncCompress")
  @js.native
  /**
    * Creates an asynchronous GZIP stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncCompress ()
    extends typings.fflate.mod.AsyncCompress {
    def this(cb: AsyncFlateStreamHandler) = this()
    /**
      * Creates an asynchronous GZIP stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: GzipOptions) = this()
    def this(opts: GzipOptions, cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncDecompress")
  @js.native
  /**
    * Creates an asynchronous decompression stream
    * @param cb The callback to call whenever data is decompressed
    */
  open class AsyncDecompress ()
    extends typings.fflate.mod.AsyncDecompress {
    def this(cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncDeflate")
  @js.native
  /**
    * Creates an asynchronous DEFLATE stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncDeflate ()
    extends typings.fflate.mod.AsyncDeflate {
    def this(cb: AsyncFlateStreamHandler) = this()
    /**
      * Creates an asynchronous DEFLATE stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: DeflateOptions) = this()
    def this(opts: DeflateOptions, cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncGunzip")
  @js.native
  /**
    * Creates an asynchronous GUNZIP stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncGunzip ()
    extends typings.fflate.mod.AsyncGunzip {
    def this(cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncGzip")
  @js.native
  /**
    * Creates an asynchronous GZIP stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncGzip ()
    extends typings.fflate.mod.AsyncGzip {
    def this(cb: AsyncFlateStreamHandler) = this()
    /**
      * Creates an asynchronous GZIP stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: GzipOptions) = this()
    def this(opts: GzipOptions, cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncInflate")
  @js.native
  /**
    * Creates an asynchronous inflation stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncInflate ()
    extends typings.fflate.mod.AsyncInflate {
    def this(cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncUnzipInflate")
  @js.native
  open class AsyncUnzipInflate protected ()
    extends typings.fflate.mod.AsyncUnzipInflate {
    /**
      * Creates a DEFLATE decompression that can be used in ZIP archives
      */
    def this(_underscore: String) = this()
    def this(_underscore: String, sz: Double) = this()
  }
  /* static members */
  object AsyncUnzipInflate {
    
    @JSImport("three/examples/jsm/libs/fflate.module", "AsyncUnzipInflate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "AsyncUnzipInflate.compression")
    @js.native
    def compression: Double = js.native
    inline def compression_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncUnzlib")
  @js.native
  /**
    * Creates an asynchronous Zlib decompression stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncUnzlib ()
    extends typings.fflate.mod.AsyncUnzlib {
    def this(cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncZipDeflate")
  @js.native
  open class AsyncZipDeflate protected ()
    extends typings.fflate.mod.AsyncZipDeflate {
    /**
      * Creates a DEFLATE stream that can be added to ZIP archives
      * @param filename The filename to associate with this data stream
      * @param opts The compression options
      */
    def this(filename: String) = this()
    def this(filename: String, opts: DeflateOptions) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "AsyncZlib")
  @js.native
  /**
    * Creates an asynchronous DEFLATE stream
    * @param cb The callback to call whenever data is deflated
    */
  open class AsyncZlib ()
    extends typings.fflate.mod.AsyncZlib {
    def this(cb: AsyncFlateStreamHandler) = this()
    /**
      * Creates an asynchronous DEFLATE stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: ZlibOptions) = this()
    def this(opts: ZlibOptions, cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Compress")
  @js.native
  /**
    * Creates a GZIP stream
    * @param cb The callback to call whenever data is deflated
    */
  open class Compress_ ()
    extends typings.fflate.mod.Compress_ {
    def this(cb: FlateStreamHandler) = this()
    /**
      * Creates a GZIP stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: GzipOptions) = this()
    def this(opts: GzipOptions, cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "DecodeUTF8")
  @js.native
  /**
    * Creates a UTF-8 decoding stream
    * @param cb The callback to call whenever data is decoded
    */
  open class DecodeUTF8 ()
    extends typings.fflate.mod.DecodeUTF8 {
    def this(cb: StringStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Decompress")
  @js.native
  /**
    * Creates a decompression stream
    * @param cb The callback to call whenever data is decompressed
    */
  open class Decompress_ ()
    extends typings.fflate.mod.Decompress_ {
    def this(cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Deflate")
  @js.native
  open class Deflate_ ()
    extends typings.fflate.mod.Deflate_ {
    def this(cb: FlateStreamHandler) = this()
    /**
      * Creates a DEFLATE stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: DeflateOptions) = this()
    def this(opts: DeflateOptions, cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "EncodeUTF8")
  @js.native
  /**
    * Creates a UTF-8 decoding stream
    * @param cb The callback to call whenever data is encoded
    */
  open class EncodeUTF8 ()
    extends typings.fflate.mod.EncodeUTF8 {
    def this(cb: FlateStreamHandler) = this()
  }
  
  object FlateErrorCode {
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.ExtraFieldTooLong")
    @js.native
    val ExtraFieldTooLong: `9` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.FilenameTooLong")
    @js.native
    val FilenameTooLong: `11` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidBlockType")
    @js.native
    val InvalidBlockType: `1` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidDate")
    @js.native
    val InvalidDate: `10` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidDistance")
    @js.native
    val InvalidDistance: `3` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidHeader")
    @js.native
    val InvalidHeader: `6` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidLengthLiteral")
    @js.native
    val InvalidLengthLiteral: `2` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidUTF8")
    @js.native
    val InvalidUTF8: `8` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.InvalidZipData")
    @js.native
    val InvalidZipData: `13` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.NoCallback")
    @js.native
    val NoCallback: `7` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.NoStreamHandler")
    @js.native
    val NoStreamHandler: `5` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.StreamFinished")
    @js.native
    val StreamFinished: `4` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.StreamFinishing")
    @js.native
    val StreamFinishing: `12` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.UnexpectedEOF")
    @js.native
    val UnexpectedEOF: `0` = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "FlateErrorCode.UnknownCompressionMethod")
    @js.native
    val UnknownCompressionMethod: `14` = js.native
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Gunzip")
  @js.native
  /**
    * Creates a GUNZIP stream
    * @param cb The callback to call whenever data is inflated
    */
  open class Gunzip_ ()
    extends typings.fflate.mod.Gunzip_ {
    def this(cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Gzip")
  @js.native
  /**
    * Creates a GZIP stream
    * @param cb The callback to call whenever data is deflated
    */
  open class Gzip_ ()
    extends typings.fflate.mod.Gzip_ {
    def this(cb: FlateStreamHandler) = this()
    /**
      * Creates a GZIP stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: GzipOptions) = this()
    def this(opts: GzipOptions, cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Inflate")
  @js.native
  /**
    * Creates an inflation stream
    * @param cb The callback to call whenever data is inflated
    */
  open class Inflate_ ()
    extends typings.fflate.mod.Inflate_ {
    def this(cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "UnzipInflate")
  @js.native
  /**
    * Creates a DEFLATE decompression that can be used in ZIP archives
    */
  open class UnzipInflate ()
    extends typings.fflate.mod.UnzipInflate
  /* static members */
  object UnzipInflate {
    
    @JSImport("three/examples/jsm/libs/fflate.module", "UnzipInflate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "UnzipInflate.compression")
    @js.native
    def compression: Double = js.native
    inline def compression_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "UnzipPassThrough")
  @js.native
  open class UnzipPassThrough ()
    extends typings.fflate.mod.UnzipPassThrough
  /* static members */
  object UnzipPassThrough {
    
    @JSImport("three/examples/jsm/libs/fflate.module", "UnzipPassThrough")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/libs/fflate.module", "UnzipPassThrough.compression")
    @js.native
    def compression: Double = js.native
    inline def compression_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Unzip")
  @js.native
  /**
    * Creates a ZIP decompression stream
    * @param cb The callback to call whenever a file in the ZIP archive is found
    */
  open class Unzip_ ()
    extends typings.fflate.mod.Unzip_ {
    def this(cb: UnzipFileHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Unzlib")
  @js.native
  /**
    * Creates a Zlib decompression stream
    * @param cb The callback to call whenever data is inflated
    */
  open class Unzlib_ ()
    extends typings.fflate.mod.Unzlib_ {
    def this(cb: FlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "ZipDeflate")
  @js.native
  open class ZipDeflate protected ()
    extends typings.fflate.mod.ZipDeflate {
    /**
      * Creates a DEFLATE stream that can be added to ZIP archives
      * @param filename The filename to associate with this data stream
      * @param opts The compression options
      */
    def this(filename: String) = this()
    def this(filename: String, opts: DeflateOptions) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "ZipPassThrough")
  @js.native
  open class ZipPassThrough protected ()
    extends typings.fflate.mod.ZipPassThrough {
    /**
      * Creates a pass-through stream that can be added to ZIP archives
      * @param filename The filename to associate with this data stream
      */
    def this(filename: String) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Zip")
  @js.native
  /**
    * Creates an empty ZIP archive to which files can be added
    * @param cb The callback to call whenever data for the generated ZIP archive
    *           is available
    */
  open class Zip_ ()
    extends typings.fflate.mod.Zip_ {
    def this(cb: AsyncFlateStreamHandler) = this()
  }
  
  @JSImport("three/examples/jsm/libs/fflate.module", "Zlib")
  @js.native
  /**
    * Creates a Zlib stream
    * @param cb The callback to call whenever data is deflated
    */
  open class Zlib_ ()
    extends typings.fflate.mod.Zlib_ {
    def this(cb: FlateStreamHandler) = this()
    /**
      * Creates a Zlib stream
      * @param opts The compression options
      * @param cb The callback to call whenever data is deflated
      */
    def this(opts: ZlibOptions) = this()
    def this(opts: ZlibOptions, cb: FlateStreamHandler) = this()
  }
  
  inline def compress(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def compress(data: js.typedarray.Uint8Array, opts: AsyncGzipOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def compressSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def compressSync(data: js.typedarray.Uint8Array, opts: GzipOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decompress(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def decompress(data: js.typedarray.Uint8Array, opts: AsyncInflateOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def decompressSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def decompressSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def deflate(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def deflate(data: js.typedarray.Uint8Array, opts: AsyncDeflateOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def deflateSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def deflateSync(data: js.typedarray.Uint8Array, opts: DeflateOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def gunzip(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def gunzip(data: js.typedarray.Uint8Array, opts: AsyncGunzipOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def gunzipSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def gunzipSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def gzip(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def gzip(data: js.typedarray.Uint8Array, opts: AsyncGzipOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def gzipSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def gzipSync(data: js.typedarray.Uint8Array, opts: GzipOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def inflate(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def inflate(data: js.typedarray.Uint8Array, opts: AsyncInflateOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def inflateSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def inflateSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def strFromU8(dat: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def strFromU8(dat: js.typedarray.Uint8Array, latin1: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strFromU8")(dat.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strToU8(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def strToU8(str: String, latin1: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("strToU8")(str.asInstanceOf[js.Any], latin1.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def unzip(data: js.typedarray.Uint8Array, cb: UnzipCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def unzip(data: js.typedarray.Uint8Array, opts: AsyncUnzipOptions, cb: UnzipCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def unzipSync(data: js.typedarray.Uint8Array): Unzipped = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[Unzipped]
  inline def unzipSync(data: js.typedarray.Uint8Array, opts: UnzipOptions): Unzipped = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unzipped]
  
  inline def unzlib(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def unzlib(data: js.typedarray.Uint8Array, opts: AsyncGunzipOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("unzlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def unzlibSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def unzlibSync(data: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("unzlibSync")(data.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def zip(data: AsyncZippable, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def zip(data: AsyncZippable, opts: AsyncZipOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def zipSync(data: Zippable): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def zipSync(data: Zippable, opts: ZipOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def zlib(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  inline def zlib(data: js.typedarray.Uint8Array, opts: AsyncZlibOptions, cb: FlateCallback): AsyncTerminable = (^.asInstanceOf[js.Dynamic].applyDynamic("zlib")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AsyncTerminable]
  
  inline def zlibSync(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def zlibSync(data: js.typedarray.Uint8Array, opts: ZlibOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
