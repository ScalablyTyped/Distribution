package typings.useSidecar

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.useSidecar.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderPropMod {
  
  @JSImport("use-sidecar/dist/es5/renderProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderCar[T /* <: js.Array[Any] */, K, C](WrappedComponent: C, defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  
  type CombinedProps[T /* <: js.Array[Any] */, K] = Children[T] & K
  
  type RenderPropComponent[T /* <: js.Array[Any] */, K] = ComponentType[CombinedProps[T, K]]
}
