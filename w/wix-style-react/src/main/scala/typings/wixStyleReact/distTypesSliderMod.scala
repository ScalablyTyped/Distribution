package typings.wixStyleReact

import org.scalablytyped.runtime.NumberDictionary
import typings.react.mod.FocusEvent
import typings.react.mod.PureComponent
import typings.std.Element
import typings.wixStyleReact.wixStyleReactStrings.horizontal
import typings.wixStyleReact.wixStyleReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSliderMod {
  
  @JSImport("wix-style-react/dist/types/Slider", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SliderProps, js.Object, Any]
  
  type Slider = PureComponent[SliderProps, js.Object, Any]
  
  @js.native
  trait SliderProps extends StObject {
    
    var allowCross: js.UndefOr[Boolean] = js.native
    
    var ariaLabelForHandle: js.UndefOr[js.Array[String] | String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataHook: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[vertical | horizontal] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayMarks: js.UndefOr[Boolean] = js.native
    
    var displayTooltip: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var marks: js.UndefOr[NumberDictionary[Double | String]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double] | Double, Unit]] = js.native
    
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double] | Double, Unit]] = js.native
    
    var onBlur: js.UndefOr[
        js.Function2[
          /* value */ js.Array[Double] | Double, 
          /* event */ js.UndefOr[FocusEvent[Element, Element]], 
          Unit
        ]
      ] = js.native
    
    def onChange(value: js.Array[Double]): Unit = js.native
    def onChange(value: Double): Unit = js.native
    
    var onFocus: js.UndefOr[
        js.Function2[
          /* value */ js.Array[Double] | Double, 
          /* event */ js.UndefOr[FocusEvent[Element, Element]], 
          Unit
        ]
      ] = js.native
    
    var pushable: js.UndefOr[Boolean | Double] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var startPoint: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[js.Array[Double] | Double] = js.native
  }
}
