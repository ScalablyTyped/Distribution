package typings.wordpressData

import typings.react.mod.Consumer
import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsAsyncModeProviderMod {
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider", "AsyncModeConsumer")
  @js.native
  val AsyncModeConsumer: Consumer[Boolean] = js.native
  
  @JSImport("@wordpress/data/build-types/components/async-mode-provider", "AsyncModeProvider")
  @js.native
  val AsyncModeProvider: Provider[Boolean] = js.native
  
  inline def useAsyncMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncMode")().asInstanceOf[Boolean]
}
