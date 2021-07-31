package typings.tabris.mod

import typings.std.Symbol
import typings.tabris.JSX.ElementClass
import typings.tabris.anon.Instantiable
import typings.tabris.anon.InstantiableNativeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "JsxProcessor")
@js.native
class JsxProcessor () extends StObject {
  
  def createCustomComponent(`type`: Instantiable, attributes: js.Object): ElementClass | String = js.native
  
  def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  def createElement(`type`: Instantiable, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  
  def createFunctionalComponent(`type`: js.Function1[/* param */ js.Object, js.Any], attributes: js.Object): ElementClass | String = js.native
  
  def createIntrinsicElement(`type`: String, attributes: js.Object): ElementClass | String = js.native
  
  def createNativeObject(Type: InstantiableNativeObject, attributes: js.Object): NativeObject = js.native
  
  val jsxFactory: Symbol = js.native
  
  val jsxType: Symbol = js.native
}
