package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

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
  sealed trait readAndDelete extends PhotoImportAccessMode
  
  /** Photos are imported with read-only access. */
  @js.native
  sealed trait readOnly extends PhotoImportAccessMode
  
  /** Photos are imported with read and write access. */
  @js.native
  sealed trait readWrite extends PhotoImportAccessMode
  
  /* 2 */ val readAndDelete: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode.readAndDelete with Double = js.native
  /* 1 */ val readOnly: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode.readOnly with Double = js.native
  /* 0 */ val readWrite: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportAccessMode.readWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportAccessMode with Double] = js.native
}

