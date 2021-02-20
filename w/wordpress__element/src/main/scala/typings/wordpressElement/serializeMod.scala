package typings.wordpressElement

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("@wordpress/element/build-types/serialize", JSImport.Default)
  @js.native
  def default(element: ReactNode): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", JSImport.Default)
  @js.native
  def default(element: ReactNode, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", JSImport.Default)
  @js.native
  def default(element: ReactNode, context: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", JSImport.Default)
  @js.native
  def default(element: ReactNode, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "hasPrefix")
  @js.native
  def hasPrefix(string: String, prefixes: js.Array[String]): Boolean = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "renderAttributes")
  @js.native
  def renderAttributes(props: js.Any): String = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "renderComponent")
  @js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderComponent")
  @js.native
  def renderComponent(
    Component: ComponentType[js.Object],
    props: js.Any,
    context: js.UndefOr[scala.Nothing],
    legacyContext: js.Any
  ): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderComponent")
  @js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderComponent")
  @js.native
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "renderElement")
  @js.native
  def renderElement(element: ReactNode): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderElement")
  @js.native
  def renderElement(element: ReactNode, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderElement")
  @js.native
  def renderElement(element: ReactNode, context: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderElement")
  @js.native
  def renderElement(element: ReactNode, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "renderNativeComponent")
  @js.native
  def renderNativeComponent(`type`: String, props: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderNativeComponent")
  @js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderNativeComponent")
  @js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any): String = js.native
  @JSImport("@wordpress/element/build-types/serialize", "renderNativeComponent")
  @js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element/build-types/serialize", "renderStyle")
  @js.native
  def renderStyle(style: js.Any): String = js.native
  
  type WPComponent = (ComponentClass[js.Object, js.Any]) | FunctionComponent[js.Object]
  
  type WPElement = ReactElement
}
