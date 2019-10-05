package typings.winrtDashUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

/** Specifies whether to access a file in read-only mode or in read/write mode. */
@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  /** Access the file stream in read-only mode. */
  @js.native
  sealed trait read extends FileAccessMode
  
  /** Access the file stream in read/write mode. */
  @js.native
  sealed trait readWrite extends FileAccessMode
  
  /* 0 */ val read: typings.winrtDashUwp.Windows.Storage.FileAccessMode.read with Double = js.native
  /* 1 */ val readWrite: typings.winrtDashUwp.Windows.Storage.FileAccessMode.readWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAccessMode with Double] = js.native
}

