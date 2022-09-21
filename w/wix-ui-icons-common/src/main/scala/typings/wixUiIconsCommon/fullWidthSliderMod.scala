package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFullWidthSliderMod.FullWidthSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullWidthSliderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FullWidthSlider", JSImport.Default)
  @js.native
  val default: FC[FullWidthSliderProps] = js.native
  
  type _To = FC[FullWidthSliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `fullWidthSliderMod.foo` */
  override def _to: FC[FullWidthSliderProps] = default
}
