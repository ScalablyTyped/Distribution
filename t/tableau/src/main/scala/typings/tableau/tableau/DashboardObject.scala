package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardObject extends js.Object {
  /** Gets the Dashboard object that contains this object. */
  def getDashboard(): Dashboard = js.native
  /**
    * Gets what the object represents, which is an enum with the following values:
    * BLANK, WORKSHEET, QUICK_FILTER, PARAMETER_CONTROL, PAGE_FILTER, LEGEND, TITLE, TEXT, IMAGE, WEB_PAGE.
    */
  def getObjectType(): DashboardObjectType = js.native
  /** Gets the coordinates relative to the top-left corner of the dashboard of the object. */
  def getPosition(): Point = js.native
  /** Gets the size of the object. */
  def getSize(): Size = js.native
  /** If getType() returns WORKSHEET, this contains a pointer to the Worksheet object. */
  def getWorksheet(): Worksheet = js.native
}

object DashboardObject {
  @scala.inline
  def apply(
    getDashboard: () => Dashboard,
    getObjectType: () => DashboardObjectType,
    getPosition: () => Point,
    getSize: () => Size,
    getWorksheet: () => Worksheet
  ): DashboardObject = {
    val __obj = js.Dynamic.literal(getDashboard = js.Any.fromFunction0(getDashboard), getObjectType = js.Any.fromFunction0(getObjectType), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[DashboardObject]
  }
  @scala.inline
  implicit class DashboardObjectOps[Self <: DashboardObject] (val x: Self) extends AnyVal {
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
    def setGetDashboard(value: () => Dashboard): Self = this.set("getDashboard", js.Any.fromFunction0(value))
    @scala.inline
    def setGetObjectType(value: () => DashboardObjectType): Self = this.set("getObjectType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Size): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = this.set("getWorksheet", js.Any.fromFunction0(value))
  }
  
}

