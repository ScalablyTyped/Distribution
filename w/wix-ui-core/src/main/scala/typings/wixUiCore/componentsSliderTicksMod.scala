package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSliderTicksMod {
  
  @JSImport("wix-ui-core/src/components/slider/Ticks", "Ticks")
  @js.native
  class Ticks protected ()
    extends PureComponent[TicksProps, js.Object, js.Any] {
    def this(props: TicksProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TicksProps, context: js.Any) = this()
    
    def calcMaximumTickDensity(): Double = js.native
    
    def calcStep(): Double = js.native
    
    def renderTick(i: js.Any, min: js.Any, max: js.Any, vertical: js.Any, thumbSize: js.Any): Element = js.native
  }
  
  trait TicksProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var max: Double
    
    var min: Double
    
    def onTickClick(any: js.Any): Unit
    
    var step: Double
    
    var thumbSize: Double
    
    var tickMarksShape: String
    
    var trackSize: Double
    
    var vertical: Boolean
  }
  object TicksProps {
    
    inline def apply(
      max: Double,
      min: Double,
      onTickClick: js.Any => Unit,
      step: Double,
      thumbSize: Double,
      tickMarksShape: String,
      trackSize: Double,
      vertical: Boolean
    ): TicksProps = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onTickClick = js.Any.fromFunction1(onTickClick), step = step.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], tickMarksShape = tickMarksShape.asInstanceOf[js.Any], trackSize = trackSize.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TicksProps]
    }
    
    extension [Self <: TicksProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnTickClick(value: js.Any => Unit): Self = StObject.set(x, "onTickClick", js.Any.fromFunction1(value))
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
      
      inline def setTickMarksShape(value: String): Self = StObject.set(x, "tickMarksShape", value.asInstanceOf[js.Any])
      
      inline def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
