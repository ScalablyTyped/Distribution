package typings.wixUiCore

import typings.wixUiCore.anon.PartialSliderProps
import typings.wixUiCore.sliderSliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("wix-ui-core/dist/src/components/slider", "Slider")
  @js.native
  class Slider protected ()
    extends typings.wixUiCore.sliderSliderMod.Slider {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: js.Any) = this()
  }
  /* static members */
  object Slider {
    
    @JSImport("wix-ui-core/dist/src/components/slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/slider", "Slider.defaultProps")
    @js.native
    def defaultProps: PartialSliderProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
