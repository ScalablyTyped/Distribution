package typings.wordpressComponents

import typings.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithFocusOutsideMod {
  
  @JSImport("@wordpress/components/higher-order/with-focus-outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: HFOComponent[Any, Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/components.@wordpress/components/higher-order/with-focus-outside.HFOComponent<infer U, any> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/components.@wordpress/components/higher-order/with-focus-outside.HFOComponent<infer U, any> ? react.react.ComponentType<U> : never */ js.Any]
  
  @js.native
  trait HFOComponent[P, S]
    extends StObject
       with ComponentClass[P, S]
}
