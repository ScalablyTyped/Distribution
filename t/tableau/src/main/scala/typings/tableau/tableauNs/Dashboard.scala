package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Dashboard")
@js.native
class Dashboard () extends js.Object {
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

