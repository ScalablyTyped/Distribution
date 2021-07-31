package typings.wordpressElement

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("@wordpress/element/build-types/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: ReactNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(element: ReactNode, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(element: ReactNode, context: js.Any, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(element: ReactNode, context: Unit, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hasPrefix(string: String, prefixes: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefix")(string.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def renderAttributes(props: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderAttributes")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def renderComponent(Component: ComponentType[js.Object], props: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: js.Any, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderComponent(Component: ComponentType[js.Object], props: js.Any, context: Unit, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def renderElement(element: ReactNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def renderElement(element: ReactNode, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderElement(element: ReactNode, context: js.Any, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderElement(element: ReactNode, context: Unit, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def renderNativeComponent(`type`: String, props: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNativeComponent")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNativeComponent")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNativeComponent")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderNativeComponent(`type`: String, props: js.Any, context: Unit, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNativeComponent")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def renderStyle(style: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderStyle")(style.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type WPComponent = (ComponentClass[js.Object, js.Any]) | FunctionComponent[js.Object]
  
  type WPElement = ReactElement
}
