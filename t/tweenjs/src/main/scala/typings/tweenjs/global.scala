package typings.tweenjs

import typings.createjsLib.createjs.Event
import typings.tweenjs.createjs.TimelineProps
import typings.tweenjs.createjs.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object createjs extends js.Object {
    
    @js.native
    class AbstractTween ()
      extends typings.tweenjs.createjs.AbstractTween {
      def this(props: TweenProps) = this()
    }
    
    @js.native
    class Ease ()
      extends typings.tweenjs.createjs.Ease
    /* static members */
    @js.native
    object Ease extends js.Object {
      
      // methods
      def backIn(amount: Double): Double = js.native
      
      def backInOut(amount: Double): Double = js.native
      
      def backOut(amount: Double): Double = js.native
      
      def bounceIn(amount: Double): Double = js.native
      
      def bounceInOut(amount: Double): Double = js.native
      
      def bounceOut(amount: Double): Double = js.native
      
      def circIn(amount: Double): Double = js.native
      
      def circInOut(amount: Double): Double = js.native
      
      def circOut(amount: Double): Double = js.native
      
      def cubicIn(amount: Double): Double = js.native
      
      def cubicInOut(amount: Double): Double = js.native
      
      def cubicOut(amount: Double): Double = js.native
      
      def elasticIn(amount: Double): Double = js.native
      
      def elasticInOut(amount: Double): Double = js.native
      
      def elasticOut(amount: Double): Double = js.native
      
      def get(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getBackIn(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getBackInOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getBackOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getElasticIn(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getElasticInOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getElasticOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getPowIn(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getPowInOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def getPowOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      def linear(amount: Double): Double = js.native
      
      def none(amount: Double): Double = js.native
      
          // same as linear
      def quadIn(amount: Double): Double = js.native
      
      def quadInOut(amount: Double): Double = js.native
      
      def quadOut(amount: Double): Double = js.native
      
      def quartIn(amount: Double): Double = js.native
      
      def quartInOut(amount: Double): Double = js.native
      
      def quartOut(amount: Double): Double = js.native
      
      def quintIn(amount: Double): Double = js.native
      
      def quintInOut(amount: Double): Double = js.native
      
      def quintOut(amount: Double): Double = js.native
      
      def sineIn(amount: Double): Double = js.native
      
      def sineInOut(amount: Double): Double = js.native
      
      def sineOut(amount: Double): Double = js.native
    }
    
    @js.native
    class MotionGuidePlugin ()
      extends typings.tweenjs.createjs.MotionGuidePlugin
    /* static members */
    @js.native
    object MotionGuidePlugin extends js.Object {
      
      var ID: String = js.native
      
      def change(
        tween: typings.tweenjs.createjs.Tween,
        step: typings.tweenjs.createjs.TweenStep,
        prop: String,
        value: js.Any,
        ratio: Double,
        end: Boolean
      ): Unit = js.native
      
      def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[Double]): Unit = js.native
      
      def init(tween: typings.tweenjs.createjs.Tween, prop: String, value: js.Any): Unit = js.native
      
      //methods
      def install(): js.Object = js.native
      
      //properties
      var priority: Double = js.native
      
      def step(tween: typings.tweenjs.createjs.Tween, step: typings.tweenjs.createjs.TweenStep, props: TweenProps): Unit = js.native
    }
    
    @js.native
    class Timeline ()
      extends typings.tweenjs.createjs.Timeline {
      def this(props: TimelineProps) = this()
    }
    
    @js.native
    class Tween protected ()
      extends typings.tweenjs.createjs.Tween {
      def this(target: js.Any) = this()
      def this(target: js.Any, props: TweenProps) = this()
    }
    /* static members */
    @js.native
    object Tween extends js.Object {
      
      var IGNORE: js.Any = js.native
      
      // methods
      def get(target: js.Any): typings.tweenjs.createjs.Tween = js.native
      def get(target: js.Any, props: TweenProps): typings.tweenjs.createjs.Tween = js.native
      
      def handleEvent(e: Event): Unit = js.native
      
      def hasActiveTweens(target: js.Any): Boolean = js.native
      
      def removeAllTweens(): Unit = js.native
      
      def removeTweens(target: js.Any): Unit = js.native
      
      def tick(delta: Double, paused: Boolean): Unit = js.native
    }
    
    @js.native
    class TweenAction protected ()
      extends typings.tweenjs.createjs.TweenAction {
      def this(
        prev: typings.tweenjs.createjs.TweenAction,
        t: Double,
        scope: js.Any,
        funct: js.Function,
        params: js.Array[_]
      ) = this()
    }
    
    @js.native
    class TweenJS ()
      extends typings.tweenjs.createjs.TweenJS
    /* static members */
    @js.native
    object TweenJS extends js.Object {
      
      // properties
      var buildDate: String = js.native
      
      var version: String = js.native
    }
    
    @js.native
    class TweenStep protected ()
      extends typings.tweenjs.createjs.TweenStep {
      def this(
        prev: typings.tweenjs.createjs.TweenStep,
        t: Double,
        d: Double,
        props: TweenProps,
        ease: js.Function,
        passive: Boolean
      ) = this()
    }
  }
}
