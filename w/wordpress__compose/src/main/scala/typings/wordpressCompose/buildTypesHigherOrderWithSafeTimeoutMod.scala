package typings.wordpressCompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.wordpressCompose.anon.ContextType
import typings.wordpressCompose.anon.Instantiable
import typings.wordpressCompose.buildTypesUtilsCreateHigherOrderComponentMod.WithoutInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderWithSafeTimeoutMod {
  
  @JSImport("@wordpress/compose/build-types/higher-order/with-safe-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A higher-order component used to provide and manage delayed function calls
    * that ought to be bound to a component's lifecycle.
    */
  inline def default(Inner: ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  inline def default(Inner: FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps]): ContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[ContextType]
  
  /**
    * We cannot use the `Window['setTimeout']` and `Window['clearTimeout']`
    * types here because those functions include functionality that is not handled
    * by this component, like the ability to pass extra arguments.
    *
    * In the case of this component, we only handle the simplest case where
    * `setTimeout` only accepts a function (not a string) and an optional delay.
    */
  trait TimeoutProps extends StObject {
    
    def clearTimeout(id: Double): Unit
    
    def setTimeout(fn: js.Function0[Unit], delay: Double): Double
  }
  object TimeoutProps {
    
    inline def apply(clearTimeout: Double => Unit, setTimeout: (js.Function0[Unit], Double) => Double): TimeoutProps = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[TimeoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeoutProps] (val x: Self) extends AnyVal {
      
      inline def setClearTimeout(value: Double => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
