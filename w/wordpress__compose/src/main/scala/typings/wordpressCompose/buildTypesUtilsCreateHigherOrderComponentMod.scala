package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesUtilsCreateHigherOrderComponentMod {
  
  @JSImport("@wordpress/compose/build-types/utils/create-higher-order-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHigherOrderComponent[TInner /* <: ComponentType[Any] */, TOuter /* <: ComponentType[Any] */](mapComponent: js.Function1[/* Inner */ TInner, TOuter], modifierName: String): js.Function1[/* Inner */ TInner, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHigherOrderComponent")(mapComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Inner */ TInner, TOuter]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    C extends react.react.ComponentType<infer P> ? P : never
    }}}
    */
  @js.native
  trait GetProps[C] extends StObject
  
  type WithInjectedProps[C, I] = ComponentType[(WithoutInjectedProps[C, I]) & I]
  
  type WithoutInjectedProps[C, I] = Omit[GetProps[C], /* keyof I */ String]
}
