package typings.wixUiCore.wixUiCoreSrcMod

import typings.wixUiCore.anon.PartialSliderPropsClassName
import typings.wixUiCore.srcComponentsSliderSliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src", "Slider")
@js.native
class Slider protected ()
  extends typings.wixUiCore.srcComponentsSliderMod.Slider {
  def this(props: SliderProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SliderProps, context: js.Any) = this()
}
/* static members */
object Slider {
  
  @JSImport("wix-ui-core/src", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src", "Slider.defaultProps")
  @js.native
  def defaultProps: PartialSliderPropsClassName = js.native
  @scala.inline
  def defaultProps_=(x: PartialSliderPropsClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "Slider.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
