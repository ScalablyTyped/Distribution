package typings.waypoints.anon

import typings.std.HTMLElement
import typings.waypoints.WaypointContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByElement extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext]
}

object FindByElement {
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): FindByElement = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
    __obj.asInstanceOf[FindByElement]
  }
}

