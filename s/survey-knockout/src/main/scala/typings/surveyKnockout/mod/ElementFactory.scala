package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ElementFactory")
@js.native
class ElementFactory () extends StObject {
  
  def clear(): Unit = js.native
  
  def createElement(elementType: String, name: String): IElement = js.native
  
  def getAllTypes(): js.Array[String] = js.native
  
  def registerElement(elementType: String, elementCreator: js.Function1[/* name */ String, IElement]): Unit = js.native
  
  def unregisterElement(elementType: String): Unit = js.native
  def unregisterElement(elementType: String, removeFromSerializer: Boolean): Unit = js.native
}
/* static members */
object ElementFactory {
  
  @JSImport("survey-knockout", "ElementFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ElementFactory.Instance")
  @js.native
  def Instance: ElementFactory = js.native
  @scala.inline
  def Instance_=(x: ElementFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
