package typings.tweenjs

import typings.createjsLib.createjs.Event
import typings.tweenjs.createjs.TimelineProps
import typings.tweenjs.createjs.TweenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs.AbstractTween")
    @js.native
    class AbstractTween ()
      extends typings.tweenjs.createjs.AbstractTween {
      def this(props: TweenProps) = this()
    }
    
    @JSGlobal("createjs.Ease")
    @js.native
    class Ease ()
      extends typings.tweenjs.createjs.Ease
    /* static members */
    object Ease {
      
      // methods
      @JSGlobal("createjs.Ease.backIn")
      @js.native
      def backIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.backInOut")
      @js.native
      def backInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.backOut")
      @js.native
      def backOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.bounceIn")
      @js.native
      def bounceIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.bounceInOut")
      @js.native
      def bounceInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.bounceOut")
      @js.native
      def bounceOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.circIn")
      @js.native
      def circIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.circInOut")
      @js.native
      def circInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.circOut")
      @js.native
      def circOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.cubicIn")
      @js.native
      def cubicIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.cubicInOut")
      @js.native
      def cubicInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.cubicOut")
      @js.native
      def cubicOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.elasticIn")
      @js.native
      def elasticIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.elasticInOut")
      @js.native
      def elasticInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.elasticOut")
      @js.native
      def elasticOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.get")
      @js.native
      def get(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getBackIn")
      @js.native
      def getBackIn(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getBackInOut")
      @js.native
      def getBackInOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getBackOut")
      @js.native
      def getBackOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getElasticIn")
      @js.native
      def getElasticIn(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getElasticInOut")
      @js.native
      def getElasticInOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getElasticOut")
      @js.native
      def getElasticOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getPowIn")
      @js.native
      def getPowIn(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getPowInOut")
      @js.native
      def getPowInOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.getPowOut")
      @js.native
      def getPowOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      
      @JSGlobal("createjs.Ease.linear")
      @js.native
      def linear(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.none")
      @js.native
      def none(amount: Double): Double = js.native
      
      // same as linear
      @JSGlobal("createjs.Ease.quadIn")
      @js.native
      def quadIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quadInOut")
      @js.native
      def quadInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quadOut")
      @js.native
      def quadOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quartIn")
      @js.native
      def quartIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quartInOut")
      @js.native
      def quartInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quartOut")
      @js.native
      def quartOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quintIn")
      @js.native
      def quintIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quintInOut")
      @js.native
      def quintInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.quintOut")
      @js.native
      def quintOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.sineIn")
      @js.native
      def sineIn(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.sineInOut")
      @js.native
      def sineInOut(amount: Double): Double = js.native
      
      @JSGlobal("createjs.Ease.sineOut")
      @js.native
      def sineOut(amount: Double): Double = js.native
    }
    
    @JSGlobal("createjs.MotionGuidePlugin")
    @js.native
    class MotionGuidePlugin ()
      extends typings.tweenjs.createjs.MotionGuidePlugin
    /* static members */
    object MotionGuidePlugin {
      
      @JSGlobal("createjs.MotionGuidePlugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.MotionGuidePlugin.ID")
      @js.native
      def ID: String = js.native
      @scala.inline
      def ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.MotionGuidePlugin.change")
      @js.native
      def change(
        tween: typings.tweenjs.createjs.Tween,
        step: typings.tweenjs.createjs.TweenStep,
        prop: String,
        value: js.Any,
        ratio: Double,
        end: Boolean
      ): Unit = js.native
      
      @JSGlobal("createjs.MotionGuidePlugin.debug")
      @js.native
      def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[Double]): Unit = js.native
      
      @JSGlobal("createjs.MotionGuidePlugin.init")
      @js.native
      def init(tween: typings.tweenjs.createjs.Tween, prop: String, value: js.Any): Unit = js.native
      
      //methods
      @JSGlobal("createjs.MotionGuidePlugin.install")
      @js.native
      def install(): js.Object = js.native
      
      //properties
      @JSGlobal("createjs.MotionGuidePlugin.priority")
      @js.native
      def priority: Double = js.native
      @scala.inline
      def priority_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.MotionGuidePlugin.step")
      @js.native
      def step(tween: typings.tweenjs.createjs.Tween, step: typings.tweenjs.createjs.TweenStep, props: TweenProps): Unit = js.native
    }
    
    @JSGlobal("createjs.Timeline")
    @js.native
    class Timeline ()
      extends typings.tweenjs.createjs.Timeline {
      def this(props: TimelineProps) = this()
    }
    
    @JSGlobal("createjs.Tween")
    @js.native
    class Tween protected ()
      extends typings.tweenjs.createjs.Tween {
      def this(target: js.Any) = this()
      def this(target: js.Any, props: TweenProps) = this()
    }
    /* static members */
    object Tween {
      
      @JSGlobal("createjs.Tween")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.Tween.IGNORE")
      @js.native
      def IGNORE: js.Any = js.native
      @scala.inline
      def IGNORE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
      
      // methods
      @JSGlobal("createjs.Tween.get")
      @js.native
      def get(target: js.Any): typings.tweenjs.createjs.Tween = js.native
      @JSGlobal("createjs.Tween.get")
      @js.native
      def get(target: js.Any, props: TweenProps): typings.tweenjs.createjs.Tween = js.native
      
      @JSGlobal("createjs.Tween.handleEvent")
      @js.native
      def handleEvent(e: Event): Unit = js.native
      
      @JSGlobal("createjs.Tween.hasActiveTweens")
      @js.native
      def hasActiveTweens(target: js.Any): Boolean = js.native
      
      @JSGlobal("createjs.Tween.removeAllTweens")
      @js.native
      def removeAllTweens(): Unit = js.native
      
      @JSGlobal("createjs.Tween.removeTweens")
      @js.native
      def removeTweens(target: js.Any): Unit = js.native
      
      @JSGlobal("createjs.Tween.tick")
      @js.native
      def tick(delta: Double, paused: Boolean): Unit = js.native
    }
    
    @JSGlobal("createjs.TweenAction")
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
    
    @JSGlobal("createjs.TweenJS")
    @js.native
    class TweenJS ()
      extends typings.tweenjs.createjs.TweenJS
    /* static members */
    object TweenJS {
      
      @JSGlobal("createjs.TweenJS")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.TweenJS.buildDate")
      @js.native
      def buildDate: String = js.native
      @scala.inline
      def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.TweenJS.version")
      @js.native
      def version: String = js.native
      @scala.inline
      def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.TweenStep")
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
