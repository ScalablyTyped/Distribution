package typings.tweenjs

import typings.createjsLib.createjs.Event
import typings.tweenjs.createjs.TimelineProps
import typings.tweenjs.createjs.TweenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs.AbstractTween")
    @js.native
    class AbstractTween ()
      extends StObject
         with typings.tweenjs.createjs.AbstractTween {
      def this(props: TweenProps) = this()
    }
    
    @JSGlobal("createjs.Ease")
    @js.native
    class Ease ()
      extends StObject
         with typings.tweenjs.createjs.Ease
    /* static members */
    object Ease {
      
      @JSGlobal("createjs.Ease")
      @js.native
      val ^ : js.Any = js.native
      
      // methods
      inline def backIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def backInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def backOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def bounceIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def bounceInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def bounceOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def circIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("circIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def circInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("circInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def circOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("circOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def cubicIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def cubicInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def cubicOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def elasticIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elasticIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def elasticInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elasticInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def elasticOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elasticOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def get(amount: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getBackIn(amount: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackIn")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getBackInOut(amount: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getBackOut(amount: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackOut")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getElasticIn(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElasticIn")(amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getElasticInOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElasticInOut")(amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getElasticOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElasticOut")(amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getPowIn(pow: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPowIn")(pow.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getPowInOut(pow: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPowInOut")(pow.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def getPowOut(pow: Double): js.Function1[/* amount */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPowOut")(pow.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* amount */ Double, Double]]
      
      inline def linear(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def none(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      // same as linear
      inline def quadIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quadIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quadInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quadInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quadOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quadOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quartIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quartInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quartOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quintIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quintIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quintInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quintInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def quintOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quintOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def sineIn(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sineIn")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def sineInOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sineInOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def sineOut(amount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sineOut")(amount.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    @JSGlobal("createjs.MotionGuidePlugin")
    @js.native
    class MotionGuidePlugin ()
      extends StObject
         with typings.tweenjs.createjs.MotionGuidePlugin
    /* static members */
    object MotionGuidePlugin {
      
      @JSGlobal("createjs.MotionGuidePlugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.MotionGuidePlugin.ID")
      @js.native
      def ID: String = js.native
      inline def ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ID")(x.asInstanceOf[js.Any])
      
      inline def change(
        tween: typings.tweenjs.createjs.Tween,
        step: typings.tweenjs.createjs.TweenStep,
        prop: String,
        value: js.Any,
        ratio: Double,
        end: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(tween.asInstanceOf[js.Any], step.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(guideData.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], higlight.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def init(tween: typings.tweenjs.createjs.Tween, prop: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(tween.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      //methods
      inline def install(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[js.Object]
      
      //properties
      @JSGlobal("createjs.MotionGuidePlugin.priority")
      @js.native
      def priority: Double = js.native
      inline def priority_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
      
      inline def step(tween: typings.tweenjs.createjs.Tween, step: typings.tweenjs.createjs.TweenStep, props: TweenProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("step")(tween.asInstanceOf[js.Any], step.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("createjs.Timeline")
    @js.native
    class Timeline ()
      extends StObject
         with typings.tweenjs.createjs.Timeline {
      def this(props: TimelineProps) = this()
    }
    
    @JSGlobal("createjs.Tween")
    @js.native
    class Tween protected ()
      extends StObject
         with typings.tweenjs.createjs.Tween {
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
      inline def IGNORE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
      
      // methods
      inline def get(target: js.Any): typings.tweenjs.createjs.Tween = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any]).asInstanceOf[typings.tweenjs.createjs.Tween]
      inline def get(target: js.Any, props: TweenProps): typings.tweenjs.createjs.Tween = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.tweenjs.createjs.Tween]
      
      inline def handleEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def hasActiveTweens(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasActiveTweens")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def removeAllTweens(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllTweens")().asInstanceOf[Unit]
      
      inline def removeTweens(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTweens")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def tick(delta: Double, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(delta.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("createjs.TweenAction")
    @js.native
    class TweenAction protected ()
      extends StObject
         with typings.tweenjs.createjs.TweenAction {
      def this(
        prev: typings.tweenjs.createjs.TweenAction,
        t: Double,
        scope: js.Any,
        funct: js.Function,
        params: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      var d: Double = js.native
      
      /* CompleteClass */
      var funct: js.Function = js.native
      
      /* CompleteClass */
      var next: typings.tweenjs.createjs.TweenAction = js.native
      
      /* CompleteClass */
      var params: js.Array[js.Any] = js.native
      
      /* CompleteClass */
      var prev: typings.tweenjs.createjs.TweenAction = js.native
      
      /* CompleteClass */
      var scope: js.Any = js.native
      
      /* CompleteClass */
      var t: Double = js.native
    }
    
    @JSGlobal("createjs.TweenJS")
    @js.native
    class TweenJS ()
      extends StObject
         with typings.tweenjs.createjs.TweenJS
    /* static members */
    object TweenJS {
      
      @JSGlobal("createjs.TweenJS")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.TweenJS.buildDate")
      @js.native
      def buildDate: String = js.native
      inline def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.TweenJS.version")
      @js.native
      def version: String = js.native
      inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.TweenStep")
    @js.native
    class TweenStep protected ()
      extends StObject
         with typings.tweenjs.createjs.TweenStep {
      def this(
        prev: typings.tweenjs.createjs.TweenStep,
        t: Double,
        d: Double,
        props: TweenProps,
        ease: js.Function,
        passive: Boolean
      ) = this()
      
      /* CompleteClass */
      var d: Double = js.native
      
      /* CompleteClass */
      var ease: js.Function = js.native
      
      /* CompleteClass */
      var index: Double = js.native
      
      /* CompleteClass */
      var next: typings.tweenjs.createjs.TweenStep = js.native
      
      /* CompleteClass */
      var passive: Boolean = js.native
      
      /* CompleteClass */
      var prev: typings.tweenjs.createjs.TweenStep = js.native
      
      /* CompleteClass */
      var props: TweenProps = js.native
      
      /* CompleteClass */
      var t: Double = js.native
    }
  }
}
