package typings.wordpressData

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsRegistryProviderContextMod extends Shortcut {
  
  @JSImport("@wordpress/data/build-types/components/registry-provider/context", JSImport.Default)
  @js.native
  val default: Provider[WPDataRegistry] = js.native
  
  @JSImport("@wordpress/data/build-types/components/registry-provider/context", "Context")
  @js.native
  val Context: typings.react.mod.Context[WPDataRegistry] = js.native
  
  @JSImport("@wordpress/data/build-types/components/registry-provider/context", "RegistryConsumer")
  @js.native
  val RegistryConsumer: Consumer[WPDataRegistry] = js.native
  
  type _To = Provider[WPDataRegistry]
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesComponentsRegistryProviderContextMod.foo` */
  override def _to: Provider[WPDataRegistry] = default
}
