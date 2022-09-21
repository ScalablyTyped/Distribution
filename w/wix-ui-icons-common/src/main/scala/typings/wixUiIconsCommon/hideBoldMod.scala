package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHideBoldMod.HideBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hideBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HideBold", JSImport.Default)
  @js.native
  val default: FC[HideBoldProps] = js.native
  
  type _To = FC[HideBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `hideBoldMod.foo` */
  override def _to: FC[HideBoldProps] = default
}
