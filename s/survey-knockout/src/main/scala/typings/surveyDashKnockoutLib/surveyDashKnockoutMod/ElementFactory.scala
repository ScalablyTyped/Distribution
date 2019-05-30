package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ElementFactory")
@js.native
class ElementFactory () extends js.Object {
  def clear(): scala.Unit = js.native
  def createElement(elementType: java.lang.String, name: java.lang.String): IElement = js.native
  def getAllTypes(): js.Array[java.lang.String] = js.native
  def registerElement(elementType: java.lang.String, elementCreator: js.Function1[/* name */ java.lang.String, IElement]): scala.Unit = js.native
  def unregisterElement(elementType: java.lang.String): scala.Unit = js.native
  def unregisterElement(elementType: java.lang.String, removeFromSerializer: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "ElementFactory")
@js.native
object ElementFactory extends js.Object {
  var Instance: surveyDashKnockoutLib.surveyDashKnockoutMod.ElementFactory = js.native
}

