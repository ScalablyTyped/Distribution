package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsContentManagerMod.ContentManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentManagerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/ContentManager", JSImport.Default)
  @js.native
  val default: FC[ContentManagerProps] = js.native
  
  type _To = FC[ContentManagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `contentManagerMod.foo` */
  override def _to: FC[ContentManagerProps] = default
}
