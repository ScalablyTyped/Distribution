package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithFocusReturnMod {
  
  @JSImport("@wordpress/components/higher-order/with-focus-return", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default(options: WFROptions): js.Function1[
    /* wrapped */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrapped */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ]]
  // prettier-ignore
  inline def default[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WFROptions] (val x: Self) extends AnyVal {
      
      inline def setOnFocusReturn(value: () => Boolean | Unit): Self = StObject.set(x, "onFocusReturn", js.Any.fromFunction0(value))
      
      inline def setOnFocusReturnUndefined: Self = StObject.set(x, "onFocusReturn", js.undefined)
    }
  }
}
