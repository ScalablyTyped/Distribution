package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHomeSmallMod.HomeSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HomeSmall", JSImport.Default)
  @js.native
  val default: FC[HomeSmallProps] = js.native
  
  type _To = FC[HomeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `homeSmallMod.foo` */
  override def _to: FC[HomeSmallProps] = default
}
