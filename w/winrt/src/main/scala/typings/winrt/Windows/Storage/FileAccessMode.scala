package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  @js.native
  sealed trait read extends FileAccessMode
  
  @js.native
  sealed trait readWrite extends FileAccessMode
  
  /* 0 */ val read: typings.winrt.Windows.Storage.FileAccessMode.read with Double = js.native
  /* 1 */ val readWrite: typings.winrt.Windows.Storage.FileAccessMode.readWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAccessMode with Double] = js.native
}

