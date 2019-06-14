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
  
  /* 2 */ val readAndDelete: readAndDelete with scala.Double = js.native
  /* 1 */ val readOnly: readOnly with scala.Double = js.native
  /* 0 */ val readWrite: readWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode with scala.Double
  ] = js.native
}

