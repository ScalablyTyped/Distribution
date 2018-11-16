package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DashboardObject")
@js.native
class DashboardObject () extends js.Object {
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

