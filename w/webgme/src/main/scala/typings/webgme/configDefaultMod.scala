package typings.webgme

import org.scalablytyped.runtime.Shortcut
import typings.webgme.GmeConfig.PluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configDefaultMod extends Shortcut {
  
  @JSImport("webgme/config/config.default", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PluginConfig = js.native
  
  type _To = js.Object & PluginConfig
  
  /* This means you don't have to write `^`, but can instead just say `configDefaultMod.foo` */
  override def _to: js.Object & PluginConfig = ^
}
