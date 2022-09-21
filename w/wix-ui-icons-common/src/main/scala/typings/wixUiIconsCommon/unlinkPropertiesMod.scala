package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUnlinkPropertiesMod.UnlinkPropertiesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkPropertiesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UnlinkProperties", JSImport.Default)
  @js.native
  val default: FC[UnlinkPropertiesProps] = js.native
  
  type _To = FC[UnlinkPropertiesProps]
  
  /* This means you don't have to write `default`, but can instead just say `unlinkPropertiesMod.foo` */
  override def _to: FC[UnlinkPropertiesProps] = default
}
