package typings.tableau.global.tableau

import typings.tableau.tableau.SheetSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Dashboard")
@js.native
class Dashboard ()
  extends StObject
     with typings.tableau.tableau.Dashboard {
  
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
  
  /** Gets the collection of objects. */
  /* CompleteClass */
  override def getObjects(): js.Array[typings.tableau.tableau.DashboardObject] = js.native
  
  /**
    * Returns the StoryPoint object to which this Dashboard belongs (if it’s on a story sheet).
    * Otherwise, it returns null.
    * If the Dashboard instance does not come from a call to StoryPoint.getContainedSheet(), it also returns null.
    */
  /* CompleteClass */
  override def getParentStoryPoint(): typings.tableau.tableau.StoryPoint = js.native
  
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
  
  /**
    * Gets the collection of worksheets contained in the dashboard.
    * Note that this is a helper method and is equivalent to looping through getObjects() and collecting all of
    * the DashboardObject.Worksheet pointers when DashboardObject.getType() === tableau.DashboardObjectType.WORKSHEET.
    */
  /* CompleteClass */
  override def getWorksheets(): js.Array[typings.tableau.tableau.Worksheet] = js.native
}
