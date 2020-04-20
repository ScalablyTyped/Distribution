package typings.tabris.mod

import typings.std.Symbol
import typings.tabris.AnonInstantiableNativeObject
import typings.tabris.AnonInstantiableObject
import typings.tabris.JSX.ElementClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "JsxProcessor")
@js.native
class JsxProcessor () extends js.Object {
  val jsxFactory: Symbol = js.native
  val jsxType: Symbol = js.native
  def createCustomComponent(`type`: AnonInstantiableObject, attributes: js.Object): ElementClass | String = js.native
  def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  def createElement(`type`: AnonInstantiableObject, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  def createFunctionalComponent(`type`: js.Function1[/* param */ js.Object, _], attributes: js.Object): ElementClass | String = js.native
  def createIntrinsicElement(`type`: String, attributes: js.Object): ElementClass | String = js.native
  def createNativeObject(Type: AnonInstantiableNativeObject, attributes: js.Object): NativeObject = js.native
}

