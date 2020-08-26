package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParentElement extends js.Object {
  var isReadOnly: Boolean = js.native
  def addElement(element: IElement, index: Double): js.Any = js.native
  def removeElement(element: IElement): Boolean = js.native
}

object IParentElement {
  @scala.inline
  def apply(addElement: (IElement, Double) => js.Any, isReadOnly: Boolean, removeElement: IElement => Boolean): IParentElement = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), isReadOnly = isReadOnly.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[IParentElement]
  }
  @scala.inline
  implicit class IParentElementOps[Self <: IParentElement] (val x: Self) extends AnyVal {
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
    def setAddElement(value: (IElement, Double) => js.Any): Self = this.set("addElement", js.Any.fromFunction2(value))
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveElement(value: IElement => Boolean): Self = this.set("removeElement", js.Any.fromFunction1(value))
  }
  
}

