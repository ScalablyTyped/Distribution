package typings.wixAnimations

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("wix-animations/src", "Animator")
  @js.native
  class Animator protected ()
    extends Component[AnimatorProps, js.Object, js.Any] {
    def this(props: AnimatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatorProps, context: js.Any) = this()
  }
  
  trait AnimatorProps extends StObject {
    
    var childClassName: js.UndefOr[String] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var height: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.undefined
    
    var opacity: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Boolean] = js.undefined
    
    var sequence: js.UndefOr[Sequence | Boolean] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var timing: js.UndefOr[Timing] = js.undefined
    
    var translate: js.UndefOr[Translate | Boolean | String] = js.undefined
    
    var width: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.undefined
  }
  object AnimatorProps {
    
    inline def apply(): AnimatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatorProps]
    }
    
    extension [Self <: AnimatorProps](x: Self) {
      
      inline def setChildClassName(value: String): Self = StObject.set(x, "childClassName", value.asInstanceOf[js.Any])
      
      inline def setChildClassNameUndefined: Self = StObject.set(x, "childClassName", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHeight(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction1(value: /* element */ js.Any => Double): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSequence(value: Sequence | Boolean): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      inline def setTranslate(value: Translate | Boolean | String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setWidth(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthFunction1(value: /* element */ js.Any => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Delay extends StObject {
    
    var enter: js.UndefOr[Double] = js.undefined
    
    var exit: js.UndefOr[Double] = js.undefined
  }
  object Delay {
    
    inline def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixAnimations.wixAnimationsStrings.top
    - typings.wixAnimations.wixAnimationsStrings.bottom
    - typings.wixAnimations.wixAnimationsStrings.left
    - typings.wixAnimations.wixAnimationsStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typings.wixAnimations.wixAnimationsStrings.bottom = "bottom".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.bottom]
    
    inline def left: typings.wixAnimations.wixAnimationsStrings.left = "left".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.left]
    
    inline def right: typings.wixAnimations.wixAnimationsStrings.right = "right".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.right]
    
    inline def top: typings.wixAnimations.wixAnimationsStrings.top = "top".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.top]
  }
  
  trait Segment extends StObject {
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object Segment {
    
    inline def apply(): Segment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segment]
    }
    
    extension [Self <: Segment](x: Self) {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixAnimations.wixAnimationsStrings.default
    - typings.wixAnimations.wixAnimationsStrings.flip
    - typings.wixAnimations.wixAnimationsStrings.reverse
    - typings.wixAnimations.wixAnimationsStrings.`reverse-flip`
  */
  trait Sequence extends StObject
  object Sequence {
    
    inline def default: typings.wixAnimations.wixAnimationsStrings.default = "default".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.default]
    
    inline def flip: typings.wixAnimations.wixAnimationsStrings.flip = "flip".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.flip]
    
    inline def reverse: typings.wixAnimations.wixAnimationsStrings.reverse = "reverse".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.reverse]
    
    inline def `reverse-flip`: typings.wixAnimations.wixAnimationsStrings.`reverse-flip` = "reverse-flip".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.`reverse-flip`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixAnimations.wixAnimationsStrings.micro
    - typings.wixAnimations.wixAnimationsStrings.small
    - typings.wixAnimations.wixAnimationsStrings.medium
    - typings.wixAnimations.wixAnimationsStrings.large
  */
  trait Timing extends StObject
  object Timing {
    
    inline def large: typings.wixAnimations.wixAnimationsStrings.large = "large".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.large]
    
    inline def medium: typings.wixAnimations.wixAnimationsStrings.medium = "medium".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.medium]
    
    inline def micro: typings.wixAnimations.wixAnimationsStrings.micro = "micro".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.micro]
    
    inline def small: typings.wixAnimations.wixAnimationsStrings.small = "small".asInstanceOf[typings.wixAnimations.wixAnimationsStrings.small]
  }
  
  trait Translate extends StObject {
    
    var enter: js.UndefOr[Direction | Segment] = js.undefined
    
    var exit: js.UndefOr[Direction | Segment] = js.undefined
  }
  object Translate {
    
    inline def apply(): Translate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translate]
    }
    
    extension [Self <: Translate](x: Self) {
      
      inline def setEnter(value: Direction | Segment): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Direction | Segment): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
}
