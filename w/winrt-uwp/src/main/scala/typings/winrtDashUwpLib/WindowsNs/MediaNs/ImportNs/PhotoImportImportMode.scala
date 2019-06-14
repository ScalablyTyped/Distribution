package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportImportMode extends js.Object

/** Specifies the types of files that are included in an import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportImportMode")
@js.native
object PhotoImportImportMode extends js.Object {
  /** Sibling files are ignored. */
  @js.native
  sealed trait ignoreSiblings
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode
  
  /** Sidecar files are ignored. */
  @js.native
  sealed trait ignoreSidecars
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode
  
  /** Sidecar files and sibling files are ignored. */
  @js.native
  sealed trait ignoreSidecarsAndSiblings
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode
  
  /** All files are imported. */
  @js.native
  sealed trait importEverything
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode
  
  /* 2 */ val ignoreSiblings: ignoreSiblings with scala.Double = js.native
  /* 1 */ val ignoreSidecars: ignoreSidecars with scala.Double = js.native
  /* 3 */ val ignoreSidecarsAndSiblings: ignoreSidecarsAndSiblings with scala.Double = js.native
  /* 0 */ val importEverything: importEverything with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode with scala.Double
  ] = js.native
}

