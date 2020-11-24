package typings.xast.mod

import typings.xast.xastStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends Parent {
  
  /**
    * Information associated with the element.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  @JSName("children")
  var children_Element: js.Array[Element | Text | Comment | Instruction | Cdata] = js.native
  
  /**
    * The element's qualified name.
    */
  var name: String = js.native
  
  @JSName("type")
  var type_Element: element = js.native
}
object Element {
  
  @scala.inline
  def apply(children: js.Array[Element | Text | Comment | Instruction | Cdata], name: String, `type`: element): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: (Element | Text | Comment | Instruction | Cdata)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[Element | Text | Comment | Instruction | Cdata]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: element): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
