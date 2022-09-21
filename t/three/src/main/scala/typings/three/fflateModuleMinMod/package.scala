package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.fflateModuleMinMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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

inline def unzipSync(data: js.typedarray.Uint8Array): Unzipped = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(data.asInstanceOf[js.Any]).asInstanceOf[Unzipped]

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

inline def zlibSync(data: js.typedarray.Uint8Array, opts: ZlibOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zlibSync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

type AsyncFlateStreamHandler = js.Function3[/* err */ js.Error, /* data */ js.typedarray.Uint8Array, /* final */ Boolean, Unit]

type AsyncGunzipOptions = AsyncOptions

type AsyncTerminable = js.Function0[Unit]

type AsyncUnzipOptions = AsyncOptions

type AsyncUnzlibOptions = AsyncInflateOptions

type AsyncZippableFile = js.typedarray.Uint8Array | (js.Tuple2[js.typedarray.Uint8Array, AsyncZipOptions])

type FlateCallback = js.Function2[/* err */ js.Error | String, /* data */ js.typedarray.Uint8Array, Unit]

type FlateStreamHandler = js.Function2[/* data */ js.typedarray.Uint8Array, /* final */ Boolean, Unit]

type StringStreamHandler = js.Function2[/* data */ String, /* final */ Boolean, Unit]

type UnzipCallback = js.Function2[/* err */ js.Error | String, /* data */ Unzipped, Unit]

type UnzipFileHandler = js.Function1[/* file */ UnzipFile, Unit]

type Unzipped = StringDictionary[js.typedarray.Uint8Array]

type ZippableFile = js.typedarray.Uint8Array | (js.Tuple2[js.typedarray.Uint8Array, ZipOptions])

type ZlibOptions = DeflateOptions
