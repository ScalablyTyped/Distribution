package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext]
}

object Anon_Element {
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): Anon_Element = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
  
    __obj.asInstanceOf[Anon_Element]
  }
}

