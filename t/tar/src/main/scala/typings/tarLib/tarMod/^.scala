package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val blockSize: scala.Double = js.native
  val c: tarLib.Anon_Callback = js.native
  val fieldEnds: js.Array[scala.Double] = js.native
  val fieldOffs: js.Array[scala.Double] = js.native
  val fieldSize: js.Array[scala.Double] = js.native
  val headerSize: scala.Double = js.native
  val knownExtended: tarLib.Anon_AtimeCharset = js.native
  val modes: tarLib.Anon_Gexec = js.native
  val numeric: tarLib.Anon_Atime = js.native
  val r: tarLib.Anon_CallbackErrFileListOptions = js.native
  val t: tarLib.Anon_CallbackErrFileList = js.native
  val types: tarLib.Anon_ = js.native
  val u: tarLib.Anon_CallbackErrFileListOptions = js.native
  val x: tarLib.Anon_CallbackErr = js.native
  def Extract(opts: java.lang.String): tarLib.tarMod.ParseStream = js.native
  def Extract(opts: tarLib.tarMod.ExtractOptions): tarLib.tarMod.ParseStream = js.native
  def Pack(): tarLib.tarMod.PackStream = js.native
  def Pack(props: tarLib.tarMod.HeaderProperties): tarLib.tarMod.PackStream = js.native
  def Parse(): tarLib.tarMod.ParseStream = js.native
  def create(options: tarLib.tarMod.CreateOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Readable = js.native
  def create(
    options: tarLib.tarMod.CreateOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  @JSName("create")
  def create_Promise(
    options: tarLib.tarMod.CreateOptions with tarLib.tarMod.FileOptions,
    fileList: js.Array[java.lang.String]
  ): js.Promise[scala.Unit] = js.native
  @JSName("create")
  def create_Unit(
    options: tarLib.tarMod.CreateOptions with tarLib.tarMod.FileOptions with tarLib.Anon_Sync,
    fileList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("create")
  def create_Unit(
    options: tarLib.tarMod.CreateOptions with tarLib.tarMod.FileOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extract(options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions): js.Promise[scala.Unit] = js.native
  def extract(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions,
    fileList: js.Array[java.lang.String]
  ): js.Promise[scala.Unit] = js.native
  def extract(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extract(
    options: tarLib.tarMod.ExtractOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
  @JSName("extract")
  def extract_Unit(options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions with tarLib.Anon_Sync): scala.Unit = js.native
  @JSName("extract")
  def extract_Unit(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions with tarLib.Anon_Sync,
    fileList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("extract")
  def extract_Unit(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  @JSName("extract")
  def extract_Writable(options: tarLib.tarMod.ExtractOptions): nodeLib.streamMod.Writable = js.native
  @JSName("extract")
  def extract_Writable(options: tarLib.tarMod.ExtractOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def list(): nodeLib.streamMod.Writable = js.native
  def list(options: tarLib.tarMod.ListOptions with tarLib.tarMod.FileOptions): js.Promise[scala.Unit] = js.native
  def list(
    options: tarLib.tarMod.ListOptions with tarLib.tarMod.FileOptions,
    fileList: js.Array[java.lang.String]
  ): js.Promise[scala.Unit] = js.native
  def list(
    options: tarLib.tarMod.ListOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
  @JSName("list")
  def list_Unit(options: tarLib.tarMod.ListOptions with tarLib.tarMod.FileOptions with tarLib.Anon_Sync): scala.Unit = js.native
  @JSName("list")
  def list_Unit(
    options: tarLib.tarMod.ListOptions with tarLib.tarMod.FileOptions with tarLib.Anon_Sync,
    fileList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("list")
  def list_Writable(options: tarLib.tarMod.ListOptions): nodeLib.streamMod.Writable = js.native
  @JSName("list")
  def list_Writable(options: tarLib.tarMod.ListOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def replace(options: tarLib.tarMod.ReplaceOptions): js.Promise[scala.Unit] = js.native
  def replace(options: tarLib.tarMod.ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def replace(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def replace(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def update(options: tarLib.tarMod.ReplaceOptions): js.Promise[scala.Unit] = js.native
  def update(options: tarLib.tarMod.ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def update(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def update(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

