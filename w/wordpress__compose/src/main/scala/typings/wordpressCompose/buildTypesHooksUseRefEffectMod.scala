package typings.wordpressCompose

import typings.react.mod.DependencyList
import typings.react.mod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseRefEffectMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-ref-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TElement](
    callback: js.Function1[/* node */ TElement, js.Function0[Unit] | Unit],
    dependencies: DependencyList
  ): RefCallback[TElement | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefCallback[TElement | Null]]
}
