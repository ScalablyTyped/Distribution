package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectAll
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNew
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportItemSelectionMode extends js.Object

/** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
@JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
@js.native
object PhotoImportItemSelectionMode extends js.Object {
  /** All found items are initially selected. */
  @js.native
  sealed trait selectAll extends PhotoImportItemSelectionMode
  
  /** New found items are initially selected. */
  @js.native
  sealed trait selectNew extends PhotoImportItemSelectionMode
  
  /** No found items are initially selected. */
  @js.native
  sealed trait selectNone extends PhotoImportItemSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportItemSelectionMode with Double] = js.native
  /* 0 */ @js.native
  object selectAll extends TopLevel[selectAll with Double]
  
  /* 2 */ @js.native
  object selectNew extends TopLevel[selectNew with Double]
  
  /* 1 */ @js.native
  object selectNone extends TopLevel[selectNone with Double]
  
}

