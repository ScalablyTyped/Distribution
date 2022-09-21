package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPluginMod.PluginProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Plugin", JSImport.Default)
  @js.native
  val default: FC[PluginProps] = js.native
  
  type _To = FC[PluginProps]
  
  /* This means you don't have to write `default`, but can instead just say `pluginMod.foo` */
  override def _to: FC[PluginProps] = default
}
