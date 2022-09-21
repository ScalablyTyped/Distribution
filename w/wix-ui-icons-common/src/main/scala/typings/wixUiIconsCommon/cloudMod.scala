package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCloudMod.CloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Cloud", JSImport.Default)
  @js.native
  val default: FC[CloudProps] = js.native
  
  type _To = FC[CloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `cloudMod.foo` */
  override def _to: FC[CloudProps] = default
}
