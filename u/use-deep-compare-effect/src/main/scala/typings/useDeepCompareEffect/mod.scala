package typings.useDeepCompareEffect

import typings.std.Parameters
import typings.std.ReturnType
import typings.useDeepCompareEffect.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-deep-compare-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: EffectCallback, dependencies: DependencyList): UseEffectReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseEffectReturn]
  
  inline def useDeepCompareEffectNoCheck(callback: EffectCallback, dependencies: DependencyList): UseEffectReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectNoCheck")(callback.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseEffectReturn]
  
  inline def useDeepCompareMemoize[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareMemoize")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type DependencyList = /* import warning: importer.ImportType#apply Failed type conversion: use-deep-compare-effect.use-deep-compare-effect.UseEffectParams[1] */ js.Any
  
  type EffectCallback = /* import warning: importer.ImportType#apply Failed type conversion: use-deep-compare-effect.use-deep-compare-effect.UseEffectParams[0] */ js.Any
  
  type UseEffectParams = Parameters[FnCall]
  
  type UseEffectReturn = ReturnType[FnCall]
}
