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
  
  inline def renderCar[T /* <: js.Array[js.Any] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  inline def renderCar[T /* <: js.Array[js.Any] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  
  type CombinedProps[T /* <: js.Array[js.Any] */, K] = Children[T] & K
  
  trait Options extends StObject {
    
    var pure: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    }
  }
  
  type RenderPropComponent[T /* <: js.Array[js.Any] */, K] = ComponentType[CombinedProps[T, K]]
}
