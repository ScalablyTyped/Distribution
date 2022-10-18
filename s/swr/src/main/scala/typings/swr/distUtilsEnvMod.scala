package typings.swr

import typings.node.timersMod.global.NodeJS.Timeout
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsEnvMod {
  
  @JSImport("swr/dist/utils/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swr/dist/utils/env", "IS_SERVER")
  @js.native
  val IS_SERVER: Boolean = js.native
  
  inline def rAF(f: js.Function1[/* repeated */ Any, Unit]): Double | Timeout = ^.asInstanceOf[js.Dynamic].applyDynamic("rAF")(f.asInstanceOf[js.Any]).asInstanceOf[Double | Timeout]
  
  @JSImport("swr/dist/utils/env", "slowConnection")
  @js.native
  val slowConnection: Boolean = js.native
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
