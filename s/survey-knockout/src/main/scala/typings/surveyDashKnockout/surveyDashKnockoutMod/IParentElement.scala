package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentElement extends js.Object {
  var isReadOnly: Boolean
  def addElement(element: IElement, index: Double): js.Any
  def removeElement(element: IElement): Boolean
}

object IParentElement {
  @scala.inline
  def apply(addElement: (IElement, Double) => js.Any, isReadOnly: Boolean, removeElement: IElement => Boolean): IParentElement = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), isReadOnly = isReadOnly.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement))
  
    __obj.asInstanceOf[IParentElement]
  }
}

