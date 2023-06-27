package typings.tweenjsTweenJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.Record
import typings.tweenjsTweenJs.anon.Bernstein
import typings.tweenjsTweenJs.anon.Bezier
import typings.tweenjsTweenJs.anon.ReadonlyEasingFunctionGro
import typings.tweenjsTweenJs.anon.ReadonlyEasingFunctionGroIn
import typings.tweenjsTweenJs.anon.ReadonlyLinearReadonlyEas
import typings.tweenjsTweenJs.anon.TypeofSequence
import typings.tweenjsTweenJs.tweenjsTweenJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tweenjs/tween.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@tweenjs/tween.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tweenjs/tween.js", "default.Easing")
    @js.native
    def Easing: ReadonlyLinearReadonlyEas = js.native
    inline def Easing_=(x: ReadonlyLinearReadonlyEas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easing")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "default.Group")
    @js.native
    def Group: Instantiable0[typings.tweenjsTweenJs.mod.Group] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@tweenjs/tween.js", "default.Group")
    @js.native
    open class GroupCls () extends Group
    
    inline def Group_=(x: Instantiable0[Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "default.Interpolation")
    @js.native
    def Interpolation: Bezier = js.native
    inline def Interpolation_=(x: Bezier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Interpolation")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "default.Sequence")
    @js.native
    def Sequence: TypeofSequence & Instantiable0[typings.tweenjsTweenJs.mod.Sequence] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@tweenjs/tween.js", "default.Sequence")
    @js.native
    open class SequenceCls () extends Sequence
    
    inline def Sequence_=(x: TypeofSequence & Instantiable0[Sequence]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "default.Tween")
    @js.native
    def Tween: Instantiable2[
        /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ Any, 
        /* _group */ js.UndefOr[Group | `false`], 
        typings.tweenjsTweenJs.mod.Tween[UnknownProps]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@tweenjs/tween.js", "default.Tween")
    @js.native
    open class TweenCls[T /* <: UnknownProps */] protected () extends Tween[T] {
      def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any) = this()
      def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any, _group: Group) = this()
      def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any, _group: `false`) = this()
    }
    
    inline def Tween_=(
      x: Instantiable2[
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ Any, 
          /* _group */ js.UndefOr[Group | `false`], 
          Tween[UnknownProps]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def add(tween: Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAll(): js.Array[Tween[UnknownProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[Tween[UnknownProps]]]
    
    inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
    @JSImport("@tweenjs/tween.js", "default.nextId")
    @js.native
    def nextId_Fdefault: js.Function0[Double] = js.native
    
    inline def nextId_Fdefault_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def remove(tween: Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
    
    inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
    inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * The Ease class provides a collection of easing functions for use with tween.js.
    */
  /* Inlined std.Readonly<{  Linear :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup & {  None :@tweenjs/tween.js.@tweenjs/tween.js.EasingFunction}>,   Quadratic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Cubic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quartic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quintic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Sinusoidal :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Exponential :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Circular :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Elastic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Back :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Bounce :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>, generatePow (power : number | undefined): @tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup}> */
  object Easing {
    
    @JSImport("@tweenjs/tween.js", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Back")
    @js.native
    val Back: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Bounce")
    @js.native
    val Bounce: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Circular")
    @js.native
    val Circular: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Cubic")
    @js.native
    val Cubic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Elastic")
    @js.native
    val Elastic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Exponential")
    @js.native
    val Exponential: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Linear")
    @js.native
    val Linear: ReadonlyEasingFunctionGroIn = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Quadratic")
    @js.native
    val Quadratic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Quartic")
    @js.native
    val Quartic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Quintic")
    @js.native
    val Quintic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Sinusoidal")
    @js.native
    val Sinusoidal: ReadonlyEasingFunctionGro = js.native
    
    inline def generatePow(): EasingFunctionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePow")().asInstanceOf[EasingFunctionGroup]
    inline def generatePow(power: Double): EasingFunctionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePow")(power.asInstanceOf[js.Any]).asInstanceOf[EasingFunctionGroup]
  }
  
  /**
    * Controlling groups of tweens
    *
    * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
    * In these cases, you may want to create your own smaller groups of tween
    */
  @JSImport("@tweenjs/tween.js", "Group")
  @js.native
  open class Group () extends StObject {
    
    /* private */ var _tweens: Any = js.native
    
    /* private */ var _tweensAddedDuringUpdate: Any = js.native
    
    def add(tween: Tween[UnknownProps]): Unit = js.native
    
    def getAll(): js.Array[Tween[UnknownProps]] = js.native
    
    def remove(tween: Tween[UnknownProps]): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def update(): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, preserve: Boolean): Boolean = js.native
    def update(time: Unit, preserve: Boolean): Boolean = js.native
  }
  
  /**
    *
    */
  object Interpolation {
    
    @JSImport("@tweenjs/tween.js", "Interpolation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Bezier(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Bezier")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def CatmullRom(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def Linear(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("@tweenjs/tween.js", "Interpolation.Utils")
    @js.native
    def Utils: Bernstein = js.native
    inline def Utils_=(x: Bernstein): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Utils")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Utils
    */
  @JSImport("@tweenjs/tween.js", "Sequence")
  @js.native
  open class Sequence () extends StObject
  object Sequence {
    
    @JSImport("@tweenjs/tween.js", "Sequence")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@tweenjs/tween.js", "Sequence._nextId")
    @js.native
    def _nextId: Any = js.native
    inline def _nextId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_nextId")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  }
  
  /**
    * Tween.js - Licensed under the MIT license
    * https://github.com/tweenjs/tween.js
    * ----------------------------------------------
    *
    * See https://github.com/tweenjs/tween.js/graphs/contributors for the full list of contributors.
    * Thank you all, you're awesome!
    */
  @JSImport("@tweenjs/tween.js", "Tween")
  @js.native
  open class Tween[T /* <: UnknownProps */] protected () extends StObject {
    def this(_object: T) = this()
    def this(_object: T, _group: Group) = this()
    def this(_object: T, _group: `false`) = this()
    
    /* private */ var _chainedTweens: Any = js.native
    
    /* private */ var _delayTime: Any = js.native
    
    /* private */ var _duration: Any = js.native
    
    /* private */ var _easingFunction: Any = js.native
    
    /* private */ var _goToEnd: Any = js.native
    
    /* private */ var _group: Any = js.native
    
    /* private */ var _handleRelativeValue: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _initialRepeat: Any = js.native
    
    /* private */ var _interpolationFunction: Any = js.native
    
    /* private */ var _isChainStopped: Any = js.native
    
    /* private */ var _isDynamic: Any = js.native
    
    /* private */ var _isPaused: Any = js.native
    
    /* private */ var _isPlaying: Any = js.native
    
    /* private */ var _object: Any = js.native
    
    /* private */ var _onCompleteCallback: Any = js.native
    
    /* private */ var _onEveryStartCallback: Any = js.native
    
    /* private */ var _onEveryStartCallbackFired: Any = js.native
    
    /* private */ var _onRepeatCallback: Any = js.native
    
    /* private */ var _onStartCallback: Any = js.native
    
    /* private */ var _onStartCallbackFired: Any = js.native
    
    /* private */ var _onStopCallback: Any = js.native
    
    /* private */ var _onUpdateCallback: Any = js.native
    
    /* private */ var _pauseStart: Any = js.native
    
    /* private */ var _propertiesAreSetUp: Any = js.native
    
    /* private */ var _repeat: Any = js.native
    
    /* private */ var _repeatDelayTime: Any = js.native
    
    /* private */ var _reversed: Any = js.native
    
    /* private */ var _setupProperties: Any = js.native
    
    /* private */ var _startTime: Any = js.native
    
    /* private */ var _swapEndStartRepeatValues: Any = js.native
    
    /* private */ var _updateProperties: Any = js.native
    
    /* private */ var _valuesEnd: Any = js.native
    
    /* private */ var _valuesStart: Any = js.native
    
    /* private */ var _valuesStartRepeat: Any = js.native
    
    /* private */ var _yoyo: Any = js.native
    
    def chain(tweens: Tween[Any]*): this.type = js.native
    
    def delay(): this.type = js.native
    def delay(amount: Double): this.type = js.native
    
    def duration(): this.type = js.native
    def duration(duration: Double): this.type = js.native
    
    def dynamic(): this.type = js.native
    def dynamic(dynamic: Boolean): this.type = js.native
    
    def easing(): this.type = js.native
    def easing(easingFunction: EasingFunction): this.type = js.native
    
    def end(): this.type = js.native
    
    def getId(): Double = js.native
    
    def group(): this.type = js.native
    def group(group: Group): this.type = js.native
    
    def interpolation(): this.type = js.native
    def interpolation(interpolationFunction: InterpolationFunction): this.type = js.native
    
    def isPaused(): Boolean = js.native
    
    def isPlaying(): Boolean = js.native
    
    def onComplete(): this.type = js.native
    def onComplete(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onEveryStart(): this.type = js.native
    def onEveryStart(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onRepeat(): this.type = js.native
    def onRepeat(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onStart(): this.type = js.native
    def onStart(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onStop(): this.type = js.native
    def onStop(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onUpdate(): this.type = js.native
    def onUpdate(callback: js.Function2[/* object */ T, /* elapsed */ Double, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    def pause(time: Double): this.type = js.native
    
    def repeat(): this.type = js.native
    def repeat(times: Double): this.type = js.native
    
    def repeatDelay(): this.type = js.native
    def repeatDelay(amount: Double): this.type = js.native
    
    def resume(): this.type = js.native
    def resume(time: Double): this.type = js.native
    
    def start(): this.type = js.native
    def start(time: Double): this.type = js.native
    def start(time: Double, overrideStartingValues: Boolean): this.type = js.native
    def start(time: Unit, overrideStartingValues: Boolean): this.type = js.native
    
    def startFromCurrentValues(): this.type = js.native
    def startFromCurrentValues(time: Double): this.type = js.native
    
    def stop(): this.type = js.native
    
    def stopChainedTweens(): this.type = js.native
    
    def to(target: UnknownProps): this.type = js.native
    def to(target: UnknownProps, duration: Double): this.type = js.native
    
    /**
      * @returns true if the tween is still playing after the update, false
      * otherwise (calling update on a paused tween still returns true because
      * it is still playing, just paused).
      */
    def update(): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, autoStart: Boolean): Boolean = js.native
    def update(time: Unit, autoStart: Boolean): Boolean = js.native
    
    def yoyo(): this.type = js.native
    def yoyo(yoyo: Boolean): this.type = js.native
  }
  
  @JSImport("@tweenjs/tween.js", "VERSION")
  @js.native
  val VERSION: /* "21.0.0" */ String = js.native
  
  inline def add(tween: Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAll(): js.Array[Tween[UnknownProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[Tween[UnknownProps]]]
  
  /* static member */
  /* was `typeof Sequence.nextId` */
  inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def remove(tween: Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
  inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type EasingFunction = js.Function1[/* amount */ Double, Double]
  
  trait EasingFunctionGroup extends StObject {
    
    def In(amount: Double): Double
    
    def InOut(amount: Double): Double
    @JSName("InOut")
    var InOut_Original: EasingFunction
    
    @JSName("In")
    var In_Original: EasingFunction
    
    def Out(amount: Double): Double
    @JSName("Out")
    var Out_Original: EasingFunction
  }
  object EasingFunctionGroup {
    
    inline def apply(
      In: /* amount */ Double => Double,
      InOut: /* amount */ Double => Double,
      Out: /* amount */ Double => Double
    ): EasingFunctionGroup = {
      val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
      __obj.asInstanceOf[EasingFunctionGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EasingFunctionGroup] (val x: Self) extends AnyVal {
      
      inline def setIn(value: /* amount */ Double => Double): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
      
      inline def setInOut(value: /* amount */ Double => Double): Self = StObject.set(x, "InOut", js.Any.fromFunction1(value))
      
      inline def setOut(value: /* amount */ Double => Double): Self = StObject.set(x, "Out", js.Any.fromFunction1(value))
    }
  }
  
  /**
    *
    */
  type InterpolationFunction = js.Function2[/* v */ js.Array[Double], /* k */ Double, Double]
  
  type UnknownProps = Record[String, Any]
}
