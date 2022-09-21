package typings.useDeepCompareEffect

import typings.useDeepCompareEffect.mod.DependencyList
import typings.useDeepCompareEffect.mod.EffectCallback
import typings.useDeepCompareEffect.mod.UseEffectReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDeepCompareEffectUmdMod {
  
  @JSImport("use-deep-compare-effect/dist/use-deep-compare-effect.umd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDeepCompareEffectNoCheck(callback: EffectCallback, dependencies: DependencyList): UseEffectReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectNoCheck")(callback.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseEffectReturn]
  
  inline def useDeepCompareMemoize[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareMemoize")(value.asInstanceOf[js.Any]).asInstanceOf[T]
}
