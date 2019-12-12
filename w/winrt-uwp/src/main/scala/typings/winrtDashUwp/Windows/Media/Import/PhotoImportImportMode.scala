package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSiblings
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecars
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecarsAndSiblings
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportImportMode.importEverything
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportImportMode with Double] = js.native
  /* 2 */ @js.native
  object ignoreSiblings extends TopLevel[ignoreSiblings with Double]
  
  /* 1 */ @js.native
  object ignoreSidecars extends TopLevel[ignoreSidecars with Double]
  
  /* 3 */ @js.native
  object ignoreSidecarsAndSiblings extends TopLevel[ignoreSidecarsAndSiblings with Double]
  
  /* 0 */ @js.native
  object importEverything extends TopLevel[importEverything with Double]
  
}

