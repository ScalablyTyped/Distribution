package typings.wordpressDom.mod

import typings.std.Element
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabbable extends Focusable {
  
  /**
    * Returns `true` if the specified element is tabbable, or `false` otherwise.
    *
    * @param element - Element to test.
    */
  def isTabbableIndex(element: Element): Boolean = js.native
}
object Tabbable {
  
  @scala.inline
  def apply(find: ParentNode => js.Array[Element], isTabbableIndex: Element => Boolean): Tabbable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
    __obj.asInstanceOf[Tabbable]
  }
  
  @scala.inline
  implicit class TabbableOps[Self <: Tabbable] (val x: Self) extends AnyVal {
    
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
    def setIsTabbableIndex(value: Element => Boolean): Self = this.set("isTabbableIndex", js.Any.fromFunction1(value))
  }
}
