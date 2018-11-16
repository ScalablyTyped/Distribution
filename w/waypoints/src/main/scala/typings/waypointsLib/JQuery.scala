package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def waypoint(): JQuery = js.native
  def waypoint(
    handler: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[java.lang.String], scala.Unit]
  ): JQuery = js.native
  def waypoint(
    handler: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[java.lang.String], scala.Unit],
    options: WaypointOptionsJQuery
  ): JQuery = js.native
  def waypoint(options: WaypointOptionsJQuery): JQuery = js.native
}

