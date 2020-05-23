package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardObject extends js.Object {
  /** Gets the Dashboard object that contains this object. */
  def getDashboard(): Dashboard
  /**
    * Gets what the object represents, which is an enum with the following values:
    * BLANK, WORKSHEET, QUICK_FILTER, PARAMETER_CONTROL, PAGE_FILTER, LEGEND, TITLE, TEXT, IMAGE, WEB_PAGE.
    */
  def getObjectType(): DashboardObjectType
  /** Gets the coordinates relative to the top-left corner of the dashboard of the object. */
  def getPosition(): Point
  /** Gets the size of the object. */
  def getSize(): Size
  /** If getType() returns WORKSHEET, this contains a pointer to the Worksheet object. */
  def getWorksheet(): Worksheet
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
}

