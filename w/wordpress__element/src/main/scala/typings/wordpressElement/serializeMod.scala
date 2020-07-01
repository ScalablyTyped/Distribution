package typings.wordpressElement

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element/build-types/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  def default(element: ReactNode): String = js.native
  def default(element: ReactNode, context: js.Any): String = js.native
  def default(element: ReactNode, context: js.Any, legacyContext: js.Any): String = js.native
  def hasPrefix(string: String, prefixes: js.Array[String]): Boolean = js.native
  def renderAttributes(props: js.Any): String = js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any): String = js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any): String = js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  def renderElement(element: ReactNode): String = js.native
  def renderElement(element: ReactNode, context: js.Any): String = js.native
  def renderElement(element: ReactNode, context: js.Any, legacyContext: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  def renderStyle(style: js.Any): String = js.native
  type WPComponent = (ComponentClass[js.Object, js.Any]) | FunctionComponent[js.Object]
  type WPElement = ReactElement
}

