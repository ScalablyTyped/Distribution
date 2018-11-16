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
  
  val ignoreSiblings: ignoreSiblings with java.lang.String = js.native
  val ignoreSidecars: ignoreSidecars with java.lang.String = js.native
  val ignoreSidecarsAndSiblings: ignoreSidecarsAndSiblings with java.lang.String = js.native
  val importEverything: importEverything with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportImportMode with java.lang.String
  ] = js.native
}

