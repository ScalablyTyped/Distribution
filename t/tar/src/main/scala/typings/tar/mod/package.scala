package typings.tar.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.tar.anon.CreateOptionsFileOptionss
import typings.tar.anon.ExtractOptionsFileOptions
import typings.tar.anon.Sync
import typings.tar.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Extract_(opts: String): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
inline def Extract_(opts: ExtractOptions): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]

inline def blockSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("blockSize").asInstanceOf[Double]

inline def c(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def c(
  options: CreateOptions & FileOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def c(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def c_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
inline def c_Readable(
  options: CreateOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]

inline def create(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def create(
  options: CreateOptions & FileOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def create(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
inline def create_Readable(
  options: CreateOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]

inline def extract(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def extract(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def extract(
  options: ExtractOptions & FileOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def extract(
  options: ExtractOptions & FileOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def extract(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def extract(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def extract_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
inline def extract_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
inline def extract_Writable(
  options: ExtractOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
inline def extract_Writable(
  options: ExtractOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]

inline def fieldEnds: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("fieldEnds").asInstanceOf[js.Array[Double]]

inline def fieldOffs: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("fieldOffs").asInstanceOf[js.Array[Double]]

inline def fieldSize: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("fieldSize").asInstanceOf[js.Array[Double]]

inline def headerSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("headerSize").asInstanceOf[Double]

inline def list(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Parse]
inline def list(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def list(optionsOrFileList: js.Array[String]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def list(optionsOrFileList: js.Array[String], callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def list(optionsOrFileList: ListOptions): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def list(optionsOrFileList: ListOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def list(options: ListOptions & RequiredFileOptions & Sync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def list(options: ListOptions & RequiredFileOptions & Sync, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def list(options: ListOptions, fileList: js.Array[String]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def list(
  options: ListOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]

inline def list_Promise(options: ListOptions & RequiredFileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def list_Promise(options: ListOptions & RequiredFileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def r(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def r(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def r(
  options: ReplaceOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def r(
  options: ReplaceOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def replace(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def replace(
  options: ReplaceOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def replace(
  options: ReplaceOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def t(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")().asInstanceOf[Parse]
inline def t(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(callback.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def t(optionsOrFileList: js.Array[String]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def t(optionsOrFileList: js.Array[String], callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def t(optionsOrFileList: ListOptions): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
inline def t(optionsOrFileList: ListOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def t(options: ListOptions & RequiredFileOptions & Sync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def t(options: ListOptions & RequiredFileOptions & Sync, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def t(options: ListOptions, fileList: js.Array[String]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Parse]
inline def t(
  options: ListOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]

inline def t_Promise(options: ListOptions & RequiredFileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def t_Promise(options: ListOptions & RequiredFileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def u(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def u(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def u(
  options: ReplaceOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def u(
  options: ReplaceOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def update(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def update(
  options: ReplaceOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def update(
  options: ReplaceOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def x(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def x(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def x(
  options: ExtractOptions & FileOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def x(
  options: ExtractOptions & FileOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def x(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def x(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def x_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
inline def x_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
inline def x_Writable(
  options: ExtractOptions,
  fileList: js.Array[String],
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
inline def x_Writable(
  options: ExtractOptions,
  fileList: Unit,
  callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]

type fields = Fields_
