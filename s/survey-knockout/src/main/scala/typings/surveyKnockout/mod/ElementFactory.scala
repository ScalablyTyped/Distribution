package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ElementFactory")
@js.native
class ElementFactory () extends js.Object {
  
  def clear(): Unit = js.native
  
  def createElement(elementType: String, name: String): IElement = js.native
  
  def getAllTypes(): js.Array[String] = js.native
  
  def registerElement(elementType: String, elementCreator: js.Function1[/* name */ String, IElement]): Unit = js.native
  
  def unregisterElement(elementType: String): Unit = js.native
  def unregisterElement(elementType: String, removeFromSerializer: Boolean): Unit = js.native
}
/* static members */
@JSImport("survey-knockout", "ElementFactory")
@js.native
object ElementFactory extends js.Object {
  
  var Instance: ElementFactory = js.native
}
