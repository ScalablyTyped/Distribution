package typings.wordpressData

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Consumer
import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsAsyncModeProviderContextMod extends Shortcut {
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider/context", JSImport.Default)
  @js.native
  val default: Provider[Boolean] = js.native
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider/context", "AsyncModeConsumer")
  @js.native
  val AsyncModeConsumer: Consumer[Boolean] = js.native
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider/context", "Context")
  @js.native
  val Context: typings.react.mod.Context[Boolean] = js.native
  
  type _To = Provider[Boolean]
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesComponentsAsyncModeProviderContextMod.foo` */
  override def _to: Provider[Boolean] = default
}
