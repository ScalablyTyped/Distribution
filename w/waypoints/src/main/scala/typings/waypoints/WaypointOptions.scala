package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointOptions extends WaypointOptionsBase {
  var context: js.UndefOr[HTMLElement] = js.native
  var element: HTMLElement = js.native
  def handler(): Unit = js.native
  def handler(direction: String): Unit = js.native
}

