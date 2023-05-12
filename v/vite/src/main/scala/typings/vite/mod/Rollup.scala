package typings.vite.mod

import typings.rollup.mod.RollupBuild
import typings.rollup.mod.RollupOptions
import typings.rollup.mod.RollupOptionsFunction
import typings.rollup.mod.RollupWatchOptions
import typings.rollup.mod.RollupWatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rollup {
  
  @JSImport("vite", "Rollup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vite", "Rollup.VERSION")
  @js.native
  val VERSION: String = js.native
  
  inline def defineConfig(optionsFunction: RollupOptionsFunction): RollupOptionsFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(optionsFunction.asInstanceOf[js.Any]).asInstanceOf[RollupOptionsFunction]
  inline def defineConfig(options: js.Array[RollupOptions]): js.Array[RollupOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RollupOptions]]
  inline def defineConfig(options: RollupOptions): RollupOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[RollupOptions]
  
  inline def rollup(options: RollupOptions): js.Promise[RollupBuild] = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RollupBuild]]
  
  inline def watch(config: js.Array[RollupWatchOptions]): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]
  inline def watch(config: RollupWatchOptions): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]
}
