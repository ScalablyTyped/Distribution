package typings.tableau.global.tableau

import typings.tableau.tableau.SheetSizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Sheet")
@js.native
class Sheet ()
  extends typings.tableau.tableau.Sheet {
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  /* CompleteClass */
  override def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions] = js.native
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  /* CompleteClass */
  override def getIndex(): Double = js.native
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  /* CompleteClass */
  override def getIsActive(): Boolean = js.native
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  /* CompleteClass */
  override def getIsHidden(): Boolean = js.native
  /** Gets the name of the sheet. */
  /* CompleteClass */
  override def getName(): String = js.native
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  /* CompleteClass */
  override def getSheetType(): typings.tableau.tableau.SheetType = js.native
  /** Gets the size information that the author specified when publishing the workbook. */
  /* CompleteClass */
  override def getSize(): SheetSizeOptions = js.native
  /** Gets the URL for this sheet. */
  /* CompleteClass */
  override def getUrl(): String = js.native
  /** Gets the Workbook to which this Sheet belongs. */
  /* CompleteClass */
  override def getWorkbook(): typings.tableau.tableau.Workbook = js.native
}

