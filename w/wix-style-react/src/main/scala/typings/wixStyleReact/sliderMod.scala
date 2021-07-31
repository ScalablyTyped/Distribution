package typings.wixStyleReact

import org.scalablytyped.runtime.NumberDictionary
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("wix-style-react/dist/es/src/Slider", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SliderProps, js.Object, js.Any]
  
  type Slider = PureComponent[SliderProps, js.Object, js.Any]
  
  @js.native
  trait SliderProps extends StObject {
    
    var allowCross: js.UndefOr[Boolean] = js.native
    
    var dataHook: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayMarks: js.UndefOr[Boolean] = js.native
    
    var displayTooltip: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var marks: js.UndefOr[NumberDictionary[Double | String]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double] | Double, Unit]] = js.native
    
    def onChange(value: js.Array[Double]): Unit = js.native
    def onChange(value: Double): Unit = js.native
    
    var pushable: js.UndefOr[Boolean | Double] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var startPoint: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[js.Array[Double] | Double] = js.native
  }
}
