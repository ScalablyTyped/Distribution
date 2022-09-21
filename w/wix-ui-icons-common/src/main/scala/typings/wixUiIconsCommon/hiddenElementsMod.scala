package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHiddenElementsMod.HiddenElementsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenElementsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/HiddenElements", JSImport.Default)
  @js.native
  val default: FC[HiddenElementsProps] = js.native
  
  type _To = FC[HiddenElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenElementsMod.foo` */
  override def _to: FC[HiddenElementsProps] = default
}
