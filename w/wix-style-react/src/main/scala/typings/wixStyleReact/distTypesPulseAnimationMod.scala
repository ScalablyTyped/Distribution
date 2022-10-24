package typings.wixStyleReact

import typings.csstype.mod.Property.BorderRadius
import typings.react.mod.AnimationEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.wixStyleReact.wixStyleReactStrings.B10
import typings.wixStyleReact.wixStyleReactStrings.G10
import typings.wixStyleReact.wixStyleReactStrings.P10
import typings.wixStyleReact.wixStyleReactStrings.R10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPulseAnimationMod {
  
  @JSImport("wix-style-react/dist/types/PulseAnimation", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PulseAnimationProps, js.Object, Any]
  
  type PulseAnimation = PureComponent[PulseAnimationProps, js.Object, Any]
  
  trait PulseAnimationProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var borderRadius: js.UndefOr[BorderRadius[String | Double]] = js.undefined
    
    var children: ReactNode
    
    var color: B10 | R10 | P10 | G10
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[String | Double] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLDivElement], Unit]] = js.undefined
  }
  object PulseAnimationProps {
    
    inline def apply(color: B10 | R10 | P10 | G10): PulseAnimationProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[PulseAnimationProps]
    }
    
    extension [Self <: PulseAnimationProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBorderRadius(value: BorderRadius[String | Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: B10 | R10 | P10 | G10): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDelay(value: String | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnEnd(value: /* event */ AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* event */ AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
