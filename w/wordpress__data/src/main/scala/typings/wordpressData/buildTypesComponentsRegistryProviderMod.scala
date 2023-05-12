package typings.wordpressData

import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsRegistryProviderMod {
  
  @JSImport("@wordpress/data/build-types/components/registry-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/data/build-types/components/registry-provider", "RegistryConsumer")
  @js.native
  val RegistryConsumer: Consumer[WPDataRegistry] = js.native
  
  @JSImport("@wordpress/data/build-types/components/registry-provider", "RegistryProvider")
  @js.native
  val RegistryProvider: Provider[WPDataRegistry] = js.native
  
  inline def useRegistry(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegistry")().asInstanceOf[js.Function]
}
