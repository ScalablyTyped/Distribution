package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFocusReturnMod {
  
  @JSImport("@wordpress/components/higher-order/with-focus-return", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default(options: WFROptions): js.Function1[/* wrapped */ ComponentType[js.Any], ComponentType[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wrapped */ ComponentType[js.Any], ComponentType[js.Any]]]
  // prettier-ignore
  inline def default[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Any]]
  
  @JSImport("@wordpress/components/higher-order/with-focus-return", "Provider")
  @js.native
  val Provider: ComponentType[js.Object] = js.native
  
  trait WFROptions extends StObject {
    
    var onFocusReturn: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  }
  object WFROptions {
    
    inline def apply(): WFROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WFROptions]
    }
    
    extension [Self <: WFROptions](x: Self) {
      
      inline def setOnFocusReturn(value: () => Boolean | Unit): Self = StObject.set(x, "onFocusReturn", js.Any.fromFunction0(value))
      
      inline def setOnFocusReturnUndefined: Self = StObject.set(x, "onFocusReturn", js.undefined)
    }
  }
}
