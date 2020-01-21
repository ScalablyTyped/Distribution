package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportStage extends js.Object

/** Specifies the stages of the photo import process. */
@JSGlobal("Windows.Media.Import.PhotoImportStage")
@js.native
object PhotoImportStage extends js.Object {
  /** Imported items are currently being deleted from the source. */
  @js.native
  sealed trait deletingImportedItemsFromSource extends PhotoImportStage
  
  /** Items are currently being found. */
  @js.native
  sealed trait findingItems extends PhotoImportStage
  
  /** Items are currently being imported */
  @js.native
  sealed trait importingItems extends PhotoImportStage
  
  /** The photo import process has not started. */
  @js.native
  sealed trait notStarted extends PhotoImportStage
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportStage with Double] = js.native
  /* 3 */ @js.native
  object deletingImportedItemsFromSource extends TopLevel[deletingImportedItemsFromSource with Double]
  
  /* 1 */ @js.native
  object findingItems extends TopLevel[findingItems with Double]
  
  /* 2 */ @js.native
  object importingItems extends TopLevel[importingItems with Double]
  
  /* 0 */ @js.native
  object notStarted extends TopLevel[notStarted with Double]
  
}

