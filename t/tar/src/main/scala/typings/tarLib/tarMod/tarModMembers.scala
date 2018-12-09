package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", JSImport.Namespace)
@js.native
object tarModMembers extends js.Object {
  val blockSize: scala.Double = js.native
  val c: js.Function3[
    /* options */ CreateOptions with FileOptions, 
    /* fileList */ js.Array[java.lang.String], 
    /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
    scala.Unit
  ] = js.native
  val fieldEnds: js.Array[scala.Double] = js.native
  val fieldOffs: js.Array[scala.Double] = js.native
  val fieldSize: js.Array[scala.Double] = js.native
  val headerSize: scala.Double = js.native
  val knownExtended: tarLib.Anon_Path = js.native
  val modes: tarLib.Anon_Oread = js.native
  val numeric: tarLib.Anon_Ino = js.native
  val r: js.Function3[
    /* options */ ReplaceOptions, 
    /* fileList */ js.UndefOr[js.Array[java.lang.String]], 
    /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
    js.Promise[scala.Unit]
  ] = js.native
  val t: js.Function2[
    /* options */ ListOptions with FileOptions with tarLib.Anon_Sync, 
    /* fileList */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ] = js.native
  val types: tarLib.Anon_GlobalExtendedHeader = js.native
  val u: js.Function3[
    /* options */ ReplaceOptions, 
    /* fileList */ js.UndefOr[js.Array[java.lang.String]], 
    /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
    js.Promise[scala.Unit]
  ] = js.native
  val x: js.Function3[
    /* options */ ExtractOptions with FileOptions, 
    /* fileList */ js.UndefOr[js.Array[java.lang.String]], 
    /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
    scala.Unit
  ] = js.native
  def Extract(opts: java.lang.String): ParseStream = js.native
  def Extract(opts: ExtractOptions): ParseStream = js.native
  def Pack(): PackStream = js.native
  def Pack(props: HeaderProperties): PackStream = js.native
  def Parse(): ParseStream = js.native
  def create(options: CreateOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Readable = js.native
  def create(
    options: CreateOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  @JSName("create")
  def create_Promise(options: CreateOptions with FileOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  @JSName("create")
  def create_Unit(
    options: CreateOptions with FileOptions with tarLib.Anon_Sync,
    fileList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("create")
  def create_Unit(
    options: CreateOptions with FileOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extract(options: ExtractOptions with FileOptions): js.Promise[scala.Unit] = js.native
  def extract(options: ExtractOptions with FileOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def extract(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extract(
    options: ExtractOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
  @JSName("extract")
  def extract_Unit(options: ExtractOptions with FileOptions with tarLib.Anon_Sync): scala.Unit = js.native
  @JSName("extract")
  def extract_Unit(
    options: ExtractOptions with FileOptions with tarLib.Anon_Sync,
    fileList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("extract")
  def extract_Unit(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  @JSName("extract")
  def extract_Writable(options: ExtractOptions): nodeLib.streamMod.Writable = js.native
  @JSName("extract")
  def extract_Writable(options: ExtractOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def list(): nodeLib.streamMod.Writable = js.native
  def list(options: ListOptions with FileOptions): js.Promise[scala.Unit] = js.native
  def list(options: ListOptions with FileOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def list(
    options: ListOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
  @JSName("list")
  def list_Unit(options: ListOptions with FileOptions with tarLib.Anon_Sync): scala.Unit = js.native
  @JSName("list")
  def list_Unit(options: ListOptions with FileOptions with tarLib.Anon_Sync, fileList: js.Array[java.lang.String]): scala.Unit = js.native
  @JSName("list")
  def list_Writable(options: ListOptions): nodeLib.streamMod.Writable = js.native
  @JSName("list")
  def list_Writable(options: ListOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def replace(options: ReplaceOptions): js.Promise[scala.Unit] = js.native
  def replace(options: ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def update(options: ReplaceOptions): js.Promise[scala.Unit] = js.native
  def update(options: ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def update(
    options: ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def update(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

