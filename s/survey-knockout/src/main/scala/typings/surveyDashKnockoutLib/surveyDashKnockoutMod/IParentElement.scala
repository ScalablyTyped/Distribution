package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentElement extends js.Object {
  var isReadOnly: scala.Boolean
  def addElement(element: IElement, index: scala.Double): js.Any
  def removeElement(element: IElement): scala.Boolean
}

object IParentElement {
  @scala.inline
  def apply(
    addElement: (IElement, scala.Double) => js.Any,
    isReadOnly: scala.Boolean,
    removeElement: IElement => scala.Boolean
  ): IParentElement = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), isReadOnly = isReadOnly, removeElement = js.Any.fromFunction1(removeElement))
  
    __obj.asInstanceOf[IParentElement]
  }
}

