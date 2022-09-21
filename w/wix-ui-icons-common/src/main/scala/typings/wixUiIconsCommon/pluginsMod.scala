package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPluginsMod.PluginsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Plugins", JSImport.Default)
  @js.native
  val default: FC[PluginsProps] = js.native
  
  type _To = FC[PluginsProps]
  
  /* This means you don't have to write `default`, but can instead just say `pluginsMod.foo` */
  override def _to: FC[PluginsProps] = default
}
