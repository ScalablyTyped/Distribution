package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFindByElement extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext]
}

object AnonFindByElement {
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): AnonFindByElement = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
    __obj.asInstanceOf[AnonFindByElement]
  }
}

