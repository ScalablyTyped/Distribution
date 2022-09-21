package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Slider", JSImport.Default)
  @js.native
  val default: FC[SliderProps] = js.native
  
  type _To = FC[SliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: FC[SliderProps] = default
}
