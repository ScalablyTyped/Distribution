package typings.tweenjs

import org.scalablytyped.runtime.StringDictionary
import typings.createjsLib.createjs.Event
import typings.createjsLib.createjs.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait AbstractTween
    extends StObject
       with EventDispatcher {
    
    def addLabel(label: String, position: Double): Unit = js.native
    
    // methods
    def advance(delta: Double): Unit = js.native
    def advance(delta: Double, ignoreActions: Boolean): Unit = js.native
    
    var bounce: Boolean = js.native
    
    def calculatePosition(rawPosition: Double): Unit = js.native
    
    val currentLabel: String = js.native
    
    var duration: Double = js.native
    
    def getLabels(): js.Array[String] = js.native
    
    def gotoAndPlay(positionOrLabel: String): Unit = js.native
    def gotoAndPlay(positionOrLabel: Double): Unit = js.native
    
    def gotoAndStop(positionOrLabel: String): Unit = js.native
    def gotoAndStop(positionOrLabel: Double): Unit = js.native
    
    // properties
    var ignoreGlobalPause: Boolean = js.native
    
    var loop: Double = js.native
    
    var paused: Boolean = js.native
    
    var position: Double = js.native
    
    var rawPosition: Double = js.native
    
    def resolve(positionOrLabel: String): Double = js.native
    def resolve(positionOrLabel: Double): Double = js.native
    
    var reversed: Boolean = js.native
    
    def setLabels(labels: js.Array[StringDictionary[Double]]): Unit = js.native
    
    def setPosition(rawPosition: Double): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: Boolean): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: Boolean, jump: Boolean): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Boolean,
      jump: Boolean,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Boolean,
      jump: Unit,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: Unit, jump: Boolean): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Unit,
      jump: Boolean,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Unit,
      jump: Unit,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    
    var timeScale: Double = js.native
    
    var useTicks: Boolean = js.native
  }
  
  trait Ease extends StObject
  
  trait MotionGuidePlugin extends StObject
  
  @js.native
  trait Timeline
    extends StObject
       with AbstractTween {
    
    // method
    def addTween(tween: Tween): Tween = js.native
    
    def removeTween(tween: Tween): Boolean = js.native
    
    // properties
    var tweens: js.Array[Tween] = js.native
    
    def updateDuration(): Unit = js.native
  }
  
  trait TimelineProps extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.undefined
    
    var ignoreGlobalPause: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var timeScale: js.UndefOr[Double] = js.undefined
    
    var useTicks: js.UndefOr[Boolean] = js.undefined
  }
  object TimelineProps {
    
    inline def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setIgnoreGlobalPause(value: Boolean): Self = StObject.set(x, "ignoreGlobalPause", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGlobalPauseUndefined: Self = StObject.set(x, "ignoreGlobalPause", js.undefined)
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnChange(value: /* e */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnComplete(value: /* e */ Event => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      inline def setUseTicks(value: Boolean): Self = StObject.set(x, "useTicks", value.asInstanceOf[js.Any])
      
      inline def setUseTicksUndefined: Self = StObject.set(x, "useTicks", js.undefined)
    }
  }
  
  @js.native
  trait Tween
    extends StObject
       with AbstractTween {
    
    def call(callback: js.Function1[/* repeated */ js.Any, Unit]): Tween = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): Tween = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any], scope: js.Any): Tween = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): Tween = js.native
    
    def label(name: String): Tween = js.native
    
    var passive: Boolean = js.native
    
    def pause(): Tween = js.native
    def pause(tween: Tween): Tween = js.native
    
    def play(): Tween = js.native
    def play(tween: Tween): Tween = js.native
    
    var pluginData: js.Any = js.native
    
    def set(props: js.Any): Tween = js.native
    def set(props: js.Any, target: js.Any): Tween = js.native
    
    // properties
    var target: js.Any = js.native
    
    def to(props: js.Any): Tween = js.native
    def to(props: js.Any, duration: Double): Tween = js.native
    def to(props: js.Any, duration: Double, ease: js.Function): Tween = js.native
    def to(props: js.Any, duration: Unit, ease: js.Function): Tween = js.native
    
    def wait(duration: Double): Tween = js.native
    def wait(duration: Double, passive: Boolean): Tween = js.native
  }
  
  trait TweenAction extends StObject {
    
    var d: Double
    
    var funct: js.Function
    
    var next: TweenAction
    
    var params: js.Array[js.Any]
    
    var prev: TweenAction
    
    var scope: js.Any
    
    var t: Double
  }
  object TweenAction {
    
    inline def apply(
      d: Double,
      funct: js.Function,
      next: TweenAction,
      params: js.Array[js.Any],
      prev: TweenAction,
      scope: js.Any,
      t: Double
    ): TweenAction = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], funct = funct.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenAction]
    }
    
    extension [Self <: TweenAction](x: Self) {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setFunct(value: js.Function): Self = StObject.set(x, "funct", value.asInstanceOf[js.Any])
      
      inline def setNext(value: TweenAction): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      inline def setPrev(value: TweenAction): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait TweenJS extends StObject
  
  trait TweenProps extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.undefined
    
    var ignoreGlobalPause: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
    
    var pluginData: js.UndefOr[js.Any] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var timeScale: js.UndefOr[Double] = js.undefined
    
    var useTicks: js.UndefOr[Boolean] = js.undefined
  }
  object TweenProps {
    
    inline def apply(): TweenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TweenProps]
    }
    
    extension [Self <: TweenProps](x: Self) {
      
      inline def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setIgnoreGlobalPause(value: Boolean): Self = StObject.set(x, "ignoreGlobalPause", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGlobalPauseUndefined: Self = StObject.set(x, "ignoreGlobalPause", js.undefined)
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnChange(value: /* e */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnComplete(value: /* e */ Event => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setPluginData(value: js.Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
      
      inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      inline def setUseTicks(value: Boolean): Self = StObject.set(x, "useTicks", value.asInstanceOf[js.Any])
      
      inline def setUseTicksUndefined: Self = StObject.set(x, "useTicks", js.undefined)
    }
  }
  
  trait TweenStep extends StObject {
    
    var d: Double
    
    var ease: js.Function
    
    var index: Double
    
    var next: TweenStep
    
    var passive: Boolean
    
    var prev: TweenStep
    
    var props: TweenProps
    
    var t: Double
  }
  object TweenStep {
    
    inline def apply(
      d: Double,
      ease: js.Function,
      index: Double,
      next: TweenStep,
      passive: Boolean,
      prev: TweenStep,
      props: TweenProps,
      t: Double
    ): TweenStep = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenStep]
    }
    
    extension [Self <: TweenStep](x: Self) {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setEase(value: js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNext(value: TweenStep): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: TweenStep): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setProps(value: TweenProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
