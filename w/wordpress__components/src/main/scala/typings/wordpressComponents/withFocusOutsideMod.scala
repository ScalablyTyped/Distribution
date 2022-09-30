package typings.wordpressComponents

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFocusOutsideMod {
  
  @JSImport("@wordpress/components/higher-order/with-focus-outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: HFOComponent[Any, Any] */](wrapped: T): ComponentType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Any]]
  
  @js.native
  trait HFOComponent[P, S]
    extends StObject
       with ComponentClass[P, S]
}
