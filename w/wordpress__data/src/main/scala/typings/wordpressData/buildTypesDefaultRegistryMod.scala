package typings.wordpressData

import org.scalablytyped.runtime.Shortcut
import typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDefaultRegistryMod extends Shortcut {
  
  @JSImport("@wordpress/data/build-types/default-registry", JSImport.Default)
  @js.native
  val default: WPDataRegistry = js.native
  
  type _To = WPDataRegistry
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesDefaultRegistryMod.foo` */
  override def _to: WPDataRegistry = default
}
