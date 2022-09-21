package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsEditSmallMod.EditSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/EditSmall", JSImport.Default)
  @js.native
  val default: FC[EditSmallProps] = js.native
  
  type _To = FC[EditSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `editSmallMod.foo` */
  override def _to: FC[EditSmallProps] = default
}
