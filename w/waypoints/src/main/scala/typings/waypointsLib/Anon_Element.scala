package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  def findByElement(element: stdLib.HTMLElement): js.UndefOr[WaypointContext]
}

object Anon_Element {
  @scala.inline
  def apply(findByElement: js.Function1[stdLib.HTMLElement, js.UndefOr[WaypointContext]]): Anon_Element = {
    val __obj = js.Dynamic.literal(findByElement = findByElement)
  
    __obj.asInstanceOf[Anon_Element]
  }
}

