package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Sheet")
@js.native
class Sheet () extends js.Object {
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions] = js.native
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  def getIndex(): scala.Double = js.native
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  def getIsActive(): scala.Boolean = js.native
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  def getIsHidden(): scala.Boolean = js.native
  /** Gets the name of the sheet. */
  def getName(): java.lang.String = js.native
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  def getSheetType(): SheetType = js.native
  /** Gets the size information that the author specified when publishing the workbook. */
  def getSize(): SheetSizeOptions = js.native
  /** Gets the URL for this sheet. */
  def getUrl(): java.lang.String = js.native
  /** Gets the Workbook to which this Sheet belongs. */
  def getWorkbook(): Workbook = js.native
}

