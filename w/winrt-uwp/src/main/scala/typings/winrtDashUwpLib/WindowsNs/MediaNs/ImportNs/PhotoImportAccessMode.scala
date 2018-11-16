package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportAccessMode extends js.Object

/** Specifies the access mode with which photos are imported. */
@JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
@js.native
object PhotoImportAccessMode extends js.Object {
  /** Photos are imported with read and delete access. */
  @js.native
  sealed trait readAndDelete
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode
  
  /** Photos are imported with read-only access. */
  @js.native
  sealed trait readOnly
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode
  
  /** Photos are imported with read and write access. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode
  
  val readAndDelete: readAndDelete with java.lang.String = js.native
  val readOnly: readOnly with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode with java.lang.String
  ] = js.native
}

