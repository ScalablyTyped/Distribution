package typings.winrtDashUwp.Windows.Media.Import

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
  sealed trait ignoreSiblings extends PhotoImportImportMode
  
  /** Sidecar files are ignored. */
  @js.native
  sealed trait ignoreSidecars extends PhotoImportImportMode
  
  /** Sidecar files and sibling files are ignored. */
  @js.native
  sealed trait ignoreSidecarsAndSiblings extends PhotoImportImportMode
  
  /** All files are imported. */
  @js.native
  sealed trait importEverything extends PhotoImportImportMode
  
  /* 2 */ val ignoreSiblings: typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSiblings with Double = js.native
  /* 1 */ val ignoreSidecars: typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecars with Double = js.native
  /* 3 */ val ignoreSidecarsAndSiblings: typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecarsAndSiblings with Double = js.native
  /* 0 */ val importEverything: typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.importEverything with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportImportMode with Double] = js.native
}

