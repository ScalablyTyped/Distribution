package typings.waypoints.anon

import typings.std.HTMLElement
import typings.waypoints.WaypointContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindByElement extends js.Object {
  
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext] = js.native
}
object FindByElement {
  
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): FindByElement = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
    __obj.asInstanceOf[FindByElement]
  }
  
  @scala.inline
  implicit class FindByElementOps[Self <: FindByElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindByElement(value: HTMLElement => js.UndefOr[WaypointContext]): Self = this.set("findByElement", js.Any.fromFunction1(value))
  }
}
