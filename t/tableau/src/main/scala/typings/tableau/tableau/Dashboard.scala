package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dashboard extends Sheet {
  /** Gets the collection of objects. */
  def getObjects(): js.Array[DashboardObject] = js.native
  /**
    * Returns the StoryPoint object to which this Dashboard belongs (if it’s on a story sheet).
    * Otherwise, it returns null.
    * If the Dashboard instance does not come from a call to StoryPoint.getContainedSheet(), it also returns null.
    */
  def getParentStoryPoint(): StoryPoint = js.native
  /**
    * Gets the collection of worksheets contained in the dashboard.
    * Note that this is a helper method and is equivalent to looping through getObjects() and collecting all of
    * the DashboardObject.Worksheet pointers when DashboardObject.getType() === tableau.DashboardObjectType.WORKSHEET.
    */
  def getWorksheets(): js.Array[Worksheet] = js.native
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
  implicit class DashboardOps[Self <: Dashboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetObjects(value: () => js.Array[DashboardObject]): Self = this.set("getObjects", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentStoryPoint(value: () => StoryPoint): Self = this.set("getParentStoryPoint", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorksheets(value: () => js.Array[Worksheet]): Self = this.set("getWorksheets", js.Any.fromFunction0(value))
  }
  
}

