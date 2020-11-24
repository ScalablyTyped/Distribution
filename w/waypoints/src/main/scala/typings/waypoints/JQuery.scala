package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def waypoint(): JQuery = js.native
  def waypoint(handler: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]): JQuery = js.native
  def waypoint(
    handler: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit],
    options: WaypointOptionsJQuery
  ): JQuery = js.native
  def waypoint(options: WaypointOptionsJQuery): JQuery = js.native
}
