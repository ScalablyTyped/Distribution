package typings.tweenjsTweenJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.Record
import typings.tweenjsTweenJs.anon.Back
import typings.tweenjsTweenJs.anon.Bernstein
import typings.tweenjsTweenJs.anon.Bezier
import typings.tweenjsTweenJs.anon.In
import typings.tweenjsTweenJs.anon.None
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
    def Easing: Back = js.native
    inline def Easing_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easing")(x.asInstanceOf[js.Any])
    
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
    open class SequenceCls ()
      extends StObject
         with Sequence
    
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
    
    inline def add(tween: Tween[Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAll(): js.Array[Tween[Record[String, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[Tween[Record[String, Any]]]]
    
    inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
    @JSImport("@tweenjs/tween.js", "default.nextId")
    @js.native
    def nextId_Fdefault: js.Function0[Double] = js.native
    
    inline def nextId_Fdefault_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def remove(tween: Tween[Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
    
    inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
    inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * The Ease class provides a collection of easing functions for use with tween.js.
    */
  object Easing {
    
    @JSImport("@tweenjs/tween.js", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tweenjs/tween.js", "Easing.Back")
    @js.native
    def Back: In = js.native
    inline def Back_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Back")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Bounce")
    @js.native
    def Bounce: In = js.native
    inline def Bounce_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Circular")
    @js.native
    def Circular: In = js.native
    inline def Circular_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circular")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Cubic")
    @js.native
    def Cubic: In = js.native
    inline def Cubic_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cubic")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Elastic")
    @js.native
    def Elastic: In = js.native
    inline def Elastic_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Elastic")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Exponential")
    @js.native
    def Exponential: In = js.native
    inline def Exponential_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Exponential")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Linear")
    @js.native
    def Linear: None = js.native
    inline def Linear_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Linear")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Quadratic")
    @js.native
    def Quadratic: In = js.native
    inline def Quadratic_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quadratic")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Quartic")
    @js.native
    def Quartic: In = js.native
    inline def Quartic_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quartic")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Quintic")
    @js.native
    def Quintic: In = js.native
    inline def Quintic_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quintic")(x.asInstanceOf[js.Any])
    
    @JSImport("@tweenjs/tween.js", "Easing.Sinusoidal")
    @js.native
    def Sinusoidal: In = js.native
    inline def Sinusoidal_=(x: In): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sinusoidal")(x.asInstanceOf[js.Any])
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
    
    /* private */ var _isPaused: Any = js.native
    
    /* private */ var _isPlaying: Any = js.native
    
    /* private */ var _object: Any = js.native
    
    /* private */ var _onCompleteCallback: Any = js.native
    
    /* private */ var _onRepeatCallback: Any = js.native
    
    /* private */ var _onStartCallback: Any = js.native
    
    /* private */ var _onStartCallbackFired: Any = js.native
    
    /* private */ var _onStopCallback: Any = js.native
    
    /* private */ var _onUpdateCallback: Any = js.native
    
    /* private */ var _pauseStart: Any = js.native
    
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
    
    def chain(tweens: Tween[UnknownProps]*): this.type = js.native
    
    def delay(amount: Double): this.type = js.native
    
    def duration(d: Double): this.type = js.native
    
    def easing(easingFunction: EasingFunction): this.type = js.native
    
    def end(): this.type = js.native
    
    def getId(): Double = js.native
    
    def group(group: Group): this.type = js.native
    
    def interpolation(interpolationFunction: InterpolationFunction): this.type = js.native
    
    def isPaused(): Boolean = js.native
    
    def isPlaying(): Boolean = js.native
    
    def onComplete(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onRepeat(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onStart(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onStop(callback: js.Function1[/* object */ T, Unit]): this.type = js.native
    
    def onUpdate(callback: js.Function2[/* object */ T, /* elapsed */ Double, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    def pause(time: Double): this.type = js.native
    
    def repeat(times: Double): this.type = js.native
    
    def repeatDelay(amount: Double): this.type = js.native
    
    def resume(): this.type = js.native
    def resume(time: Double): this.type = js.native
    
    def start(): this.type = js.native
    def start(time: Double): this.type = js.native
    
    def stop(): this.type = js.native
    
    def stopChainedTweens(): this.type = js.native
    
    def to(properties: UnknownProps): this.type = js.native
    def to(properties: UnknownProps, duration: Double): this.type = js.native
    
    /**
      * @returns true if the tween is still playing after the update, false
      * otherwise (calling update on a paused tween still returns true because
      * it is still playing, just paused).
      */
    def update(): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, autoStart: Boolean): Boolean = js.native
    def update(time: Unit, autoStart: Boolean): Boolean = js.native
    
    def yoyo(yoyo: Boolean): this.type = js.native
  }
  
  @JSImport("@tweenjs/tween.js", "VERSION")
  @js.native
  val VERSION: /* "18.6.4" */ String = js.native
  
  inline def add(tween: Tween[Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAll(): js.Array[Tween[Record[String, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[Tween[Record[String, Any]]]]
  
  /* static member */
  /* was `typeof Sequence.nextId` */
  inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  
  @JSImport("@tweenjs/tween.js", "now")
  @js.native
  def now: js.Function0[Double] = js.native
  inline def now_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])
  
  inline def remove(tween: Tween[Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
  inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type EasingFunction = js.Function1[/* amount */ Double, Double]
  
  /**
    *
    */
  type InterpolationFunction = js.Function2[/* v */ js.Array[Double], /* k */ Double, Double]
  
  /**
    * Utils
    */
  trait Sequence extends StObject
  
  type UnknownProps = Record[String, Any]
}
