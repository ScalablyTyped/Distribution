package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dashboard
  extends StObject
     with Sheet {
  
  /** Gets the collection of objects. */
  def getObjects(): js.Array[DashboardObject]
  
  /**
    * Returns the StoryPoint object to which this Dashboard belongs (if it’s on a story sheet).
    * Otherwise, it returns null.
    * If the Dashboard instance does not come from a call to StoryPoint.getContainedSheet(), it also returns null.
    */
  def getParentStoryPoint(): StoryPoint
  
  /**
    * Gets the collection of worksheets contained in the dashboard.
    * Note that this is a helper method and is equivalent to looping through getObjects() and collecting all of
    * the DashboardObject.Worksheet pointers when DashboardObject.getType() === tableau.DashboardObjectType.WORKSHEET.
    */
  def getWorksheets(): js.Array[Worksheet]
}
object Dashboard {
  
  @scala.inline
  def apply(
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsHidden: () => Boolean,
    getName: () => String,
    getObjects: () => js.Array[DashboardObject],
    getParentStoryPoint: () => StoryPoint,
    getSheetType: () => SheetType,
    getSize: () => SheetSizeOptions,
    getUrl: () => String,
    getWorkbook: () => Workbook,
    getWorksheets: () => js.Array[Worksheet]
  ): Dashboard = {
    val __obj = js.Dynamic.literal(changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsHidden = js.Any.fromFunction0(getIsHidden), getName = js.Any.fromFunction0(getName), getObjects = js.Any.fromFunction0(getObjects), getParentStoryPoint = js.Any.fromFunction0(getParentStoryPoint), getSheetType = js.Any.fromFunction0(getSheetType), getSize = js.Any.fromFunction0(getSize), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook), getWorksheets = js.Any.fromFunction0(getWorksheets))
    __obj.asInstanceOf[Dashboard]
  }
  
  @scala.inline
  implicit class DashboardMutableBuilder[Self <: Dashboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetObjects(value: () => js.Array[DashboardObject]): Self = StObject.set(x, "getObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentStoryPoint(value: () => StoryPoint): Self = StObject.set(x, "getParentStoryPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorksheets(value: () => js.Array[Worksheet]): Self = StObject.set(x, "getWorksheets", js.Any.fromFunction0(value))
  }
}
