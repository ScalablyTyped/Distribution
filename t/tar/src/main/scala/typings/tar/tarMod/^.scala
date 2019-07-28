package typings.tar.tarMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import typings.tar.Anon_Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val blockSize: Double = js.native
  val fieldEnds: js.Array[Double] = js.native
  val fieldOffs: js.Array[Double] = js.native
  val fieldSize: js.Array[Double] = js.native
  val headerSize: Double = js.native
  def Extract(opts: String): ParseStream = js.native
  def Extract(opts: ExtractOptions): ParseStream = js.native
  def Pack(): PackStream = js.native
  def Pack(props: HeaderProperties): PackStream = js.native
  def Parse(): ParseStream = js.native
  def create(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def create(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Readable = js.native
  @JSName("create")
  def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
  @JSName("create")
  def create_Unit(options: CreateOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
  @JSName("create")
  def create_Unit(
    options: CreateOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def extract(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
  def extract(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def extract(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def extract(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
  @JSName("extract")
  def extract_Unit(options: ExtractOptions with FileOptions with Anon_Sync): Unit = js.native
  @JSName("extract")
  def extract_Unit(options: ExtractOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
  @JSName("extract")
  def extract_Unit(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSName("extract")
  def extract_Writable(options: ExtractOptions): Writable = js.native
  @JSName("extract")
  def extract_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
  def list(): Writable = js.native
  def list(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
  def list(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def list(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
  @JSName("list")
  def list_Unit(options: ListOptions with FileOptions with Anon_Sync): Unit = js.native
  @JSName("list")
  def list_Unit(options: ListOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
  @JSName("list")
  def list_Writable(options: ListOptions): Writable = js.native
  @JSName("list")
  def list_Writable(options: ListOptions, fileList: js.Array[String]): Writable = js.native
  def replace(options: ReplaceOptions): js.Promise[Unit] = js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
  def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
  def update(options: ReplaceOptions): js.Promise[Unit] = js.native
  def update(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
  def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def update(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
}

