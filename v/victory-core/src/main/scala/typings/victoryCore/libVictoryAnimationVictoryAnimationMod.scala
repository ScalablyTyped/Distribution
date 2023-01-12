package typings.victoryCore

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.ReactNode
import typings.victoryCore.anon.AnimationTimer
import typings.victoryCore.anon.Children
import typings.victoryCore.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryAnimationVictoryAnimationMod {
  
  @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation")
  @js.native
  open class VictoryAnimation protected () extends Component[VictoryAnimationProps, VictoryAnimationState, Any] {
    def this(props: Any, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryAnimation(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVictoryAnimation(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryAnimation(): Unit = js.native
    
    @JSName("context")
    var context_VictoryAnimation: ContextType[Context[AnimationTimer]] = js.native
    
    /* private */ var ease: Any = js.native
    
    def functionToBeRunEachFrame(elapsed: Any, duration: Any): Unit = js.native
    
    /* private */ var interpolator: Any = js.native
    
    /* private */ var loopID: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var timer: Any = js.native
    
    def toNewName(ease: Any): String = js.native
    
    def traverseQueue(): Unit = js.native
  }
  /* static members */
  object VictoryAnimation {
    
    @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation.contextType")
    @js.native
    def contextType: Context[AnimationTimer] = js.native
    inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-animation/victory-animation", "VictoryAnimation.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type AnimationData = AnimationStyle | js.Array[AnimationStyle]
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.back
    - typings.victoryCore.victoryCoreStrings.backIn
    - typings.victoryCore.victoryCoreStrings.backOut
    - typings.victoryCore.victoryCoreStrings.backInOut
    - typings.victoryCore.victoryCoreStrings.bounce
    - typings.victoryCore.victoryCoreStrings.bounceIn
    - typings.victoryCore.victoryCoreStrings.bounceOut
    - typings.victoryCore.victoryCoreStrings.bounceInOut
    - typings.victoryCore.victoryCoreStrings.circle
    - typings.victoryCore.victoryCoreStrings.circleIn
    - typings.victoryCore.victoryCoreStrings.circleOut
    - typings.victoryCore.victoryCoreStrings.circleInOut
    - typings.victoryCore.victoryCoreStrings.linear
    - typings.victoryCore.victoryCoreStrings.linearIn
    - typings.victoryCore.victoryCoreStrings.linearOut
    - typings.victoryCore.victoryCoreStrings.linearInOut
    - typings.victoryCore.victoryCoreStrings.cubic
    - typings.victoryCore.victoryCoreStrings.cubicIn
    - typings.victoryCore.victoryCoreStrings.cubicOut
    - typings.victoryCore.victoryCoreStrings.cubicInOut
    - typings.victoryCore.victoryCoreStrings.elastic
    - typings.victoryCore.victoryCoreStrings.elasticIn
    - typings.victoryCore.victoryCoreStrings.elasticOut
    - typings.victoryCore.victoryCoreStrings.elasticInOut
    - typings.victoryCore.victoryCoreStrings.exp
    - typings.victoryCore.victoryCoreStrings.expIn
    - typings.victoryCore.victoryCoreStrings.expOut
    - typings.victoryCore.victoryCoreStrings.expInOut
    - typings.victoryCore.victoryCoreStrings.poly
    - typings.victoryCore.victoryCoreStrings.polyIn
    - typings.victoryCore.victoryCoreStrings.polyOut
    - typings.victoryCore.victoryCoreStrings.polyInOut
    - typings.victoryCore.victoryCoreStrings.quad
    - typings.victoryCore.victoryCoreStrings.quadIn
    - typings.victoryCore.victoryCoreStrings.quadOut
    - typings.victoryCore.victoryCoreStrings.quadInOut
    - typings.victoryCore.victoryCoreStrings.sin
    - typings.victoryCore.victoryCoreStrings.sinIn
    - typings.victoryCore.victoryCoreStrings.sinOut
    - typings.victoryCore.victoryCoreStrings.sinInOut
  */
  trait AnimationEasing extends StObject
  object AnimationEasing {
    
    inline def back: typings.victoryCore.victoryCoreStrings.back = "back".asInstanceOf[typings.victoryCore.victoryCoreStrings.back]
    
    inline def backIn: typings.victoryCore.victoryCoreStrings.backIn = "backIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.backIn]
    
    inline def backInOut: typings.victoryCore.victoryCoreStrings.backInOut = "backInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.backInOut]
    
    inline def backOut: typings.victoryCore.victoryCoreStrings.backOut = "backOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.backOut]
    
    inline def bounce: typings.victoryCore.victoryCoreStrings.bounce = "bounce".asInstanceOf[typings.victoryCore.victoryCoreStrings.bounce]
    
    inline def bounceIn: typings.victoryCore.victoryCoreStrings.bounceIn = "bounceIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.bounceIn]
    
    inline def bounceInOut: typings.victoryCore.victoryCoreStrings.bounceInOut = "bounceInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.bounceInOut]
    
    inline def bounceOut: typings.victoryCore.victoryCoreStrings.bounceOut = "bounceOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.bounceOut]
    
    inline def circle: typings.victoryCore.victoryCoreStrings.circle = "circle".asInstanceOf[typings.victoryCore.victoryCoreStrings.circle]
    
    inline def circleIn: typings.victoryCore.victoryCoreStrings.circleIn = "circleIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.circleIn]
    
    inline def circleInOut: typings.victoryCore.victoryCoreStrings.circleInOut = "circleInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.circleInOut]
    
    inline def circleOut: typings.victoryCore.victoryCoreStrings.circleOut = "circleOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.circleOut]
    
    inline def cubic: typings.victoryCore.victoryCoreStrings.cubic = "cubic".asInstanceOf[typings.victoryCore.victoryCoreStrings.cubic]
    
    inline def cubicIn: typings.victoryCore.victoryCoreStrings.cubicIn = "cubicIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.cubicIn]
    
    inline def cubicInOut: typings.victoryCore.victoryCoreStrings.cubicInOut = "cubicInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.cubicInOut]
    
    inline def cubicOut: typings.victoryCore.victoryCoreStrings.cubicOut = "cubicOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.cubicOut]
    
    inline def elastic: typings.victoryCore.victoryCoreStrings.elastic = "elastic".asInstanceOf[typings.victoryCore.victoryCoreStrings.elastic]
    
    inline def elasticIn: typings.victoryCore.victoryCoreStrings.elasticIn = "elasticIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.elasticIn]
    
    inline def elasticInOut: typings.victoryCore.victoryCoreStrings.elasticInOut = "elasticInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.elasticInOut]
    
    inline def elasticOut: typings.victoryCore.victoryCoreStrings.elasticOut = "elasticOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.elasticOut]
    
    inline def exp: typings.victoryCore.victoryCoreStrings.exp = "exp".asInstanceOf[typings.victoryCore.victoryCoreStrings.exp]
    
    inline def expIn: typings.victoryCore.victoryCoreStrings.expIn = "expIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.expIn]
    
    inline def expInOut: typings.victoryCore.victoryCoreStrings.expInOut = "expInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.expInOut]
    
    inline def expOut: typings.victoryCore.victoryCoreStrings.expOut = "expOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.expOut]
    
    inline def linear: typings.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typings.victoryCore.victoryCoreStrings.linear]
    
    inline def linearIn: typings.victoryCore.victoryCoreStrings.linearIn = "linearIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.linearIn]
    
    inline def linearInOut: typings.victoryCore.victoryCoreStrings.linearInOut = "linearInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.linearInOut]
    
    inline def linearOut: typings.victoryCore.victoryCoreStrings.linearOut = "linearOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.linearOut]
    
    inline def poly: typings.victoryCore.victoryCoreStrings.poly = "poly".asInstanceOf[typings.victoryCore.victoryCoreStrings.poly]
    
    inline def polyIn: typings.victoryCore.victoryCoreStrings.polyIn = "polyIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.polyIn]
    
    inline def polyInOut: typings.victoryCore.victoryCoreStrings.polyInOut = "polyInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.polyInOut]
    
    inline def polyOut: typings.victoryCore.victoryCoreStrings.polyOut = "polyOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.polyOut]
    
    inline def quad: typings.victoryCore.victoryCoreStrings.quad = "quad".asInstanceOf[typings.victoryCore.victoryCoreStrings.quad]
    
    inline def quadIn: typings.victoryCore.victoryCoreStrings.quadIn = "quadIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.quadIn]
    
    inline def quadInOut: typings.victoryCore.victoryCoreStrings.quadInOut = "quadInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.quadInOut]
    
    inline def quadOut: typings.victoryCore.victoryCoreStrings.quadOut = "quadOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.quadOut]
    
    inline def sin: typings.victoryCore.victoryCoreStrings.sin = "sin".asInstanceOf[typings.victoryCore.victoryCoreStrings.sin]
    
    inline def sinIn: typings.victoryCore.victoryCoreStrings.sinIn = "sinIn".asInstanceOf[typings.victoryCore.victoryCoreStrings.sinIn]
    
    inline def sinInOut: typings.victoryCore.victoryCoreStrings.sinInOut = "sinInOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.sinInOut]
    
    inline def sinOut: typings.victoryCore.victoryCoreStrings.sinOut = "sinOut".asInstanceOf[typings.victoryCore.victoryCoreStrings.sinOut]
  }
  
  trait AnimationInfo extends StObject {
    
    var animating: Boolean
    
    var progress: Double
    
    var terminating: js.UndefOr[Boolean] = js.undefined
  }
  object AnimationInfo {
    
    inline def apply(animating: Boolean, progress: Double): AnimationInfo = {
      val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationInfo] (val x: Self) extends AnyVal {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
      
      inline def setTerminatingUndefined: Self = StObject.set(x, "terminating", js.undefined)
    }
  }
  
  type AnimationStyle = StringDictionary[String | Double]
  
  trait VictoryAnimationProps extends StObject {
    
    def children(style: AnimationStyle, info: AnimationInfo): ReactNode
    
    var data: AnimationData
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[AnimationEasing] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object VictoryAnimationProps {
    
    inline def apply(children: (AnimationStyle, AnimationInfo) => ReactNode, data: AnimationData): VictoryAnimationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictoryAnimationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryAnimationProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: (AnimationStyle, AnimationInfo) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setData(value: AnimationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: AnimationStyle*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    }
  }
  
  trait VictoryAnimationState extends StObject {
    
    var animationInfo: AnimationInfo
    
    var data: AnimationStyle
  }
  object VictoryAnimationState {
    
    inline def apply(animationInfo: AnimationInfo, data: AnimationStyle): VictoryAnimationState = {
      val __obj = js.Dynamic.literal(animationInfo = animationInfo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictoryAnimationState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryAnimationState] (val x: Self) extends AnyVal {
      
      inline def setAnimationInfo(value: AnimationInfo): Self = StObject.set(x, "animationInfo", value.asInstanceOf[js.Any])
      
      inline def setData(value: AnimationStyle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
