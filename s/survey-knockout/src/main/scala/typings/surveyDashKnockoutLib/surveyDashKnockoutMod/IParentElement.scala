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
    addElement: js.Function2[IElement, scala.Double, js.Any],
    isReadOnly: scala.Boolean,
    removeElement: js.Function1[IElement, scala.Boolean]
  ): IParentElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addElement")(addElement)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("removeElement")(removeElement)
    __obj.asInstanceOf[IParentElement]
  }
}

