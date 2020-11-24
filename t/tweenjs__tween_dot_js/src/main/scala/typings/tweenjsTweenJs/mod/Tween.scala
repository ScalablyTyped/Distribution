package typings.tweenjsTweenJs.mod

import typings.tweenjsTweenJs.tweenjsTweenJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tweenjs/tween.js", "Tween")
@js.native
class Tween[T /* <: UnknownProps */] protected () extends js.Object {
  def this(_object: T) = this()
  def this(_object: T, _group: Group) = this()
  def this(_object: T, _group: `false`) = this()
  
  var _chainedTweens: js.Any = js.native
  
  var _delayTime: js.Any = js.native
  
  var _duration: js.Any = js.native
  
  var _easingFunction: js.Any = js.native
  
  var _goToEnd: js.Any = js.native
  
  var _group: js.Any = js.native
  
  var _handleRelativeValue: js.Any = js.native
  
  var _id: js.Any = js.native
  
  var _initialRepeat: js.Any = js.native
  
  var _interpolationFunction: js.Any = js.native
  
  var _isChainStopped: js.Any = js.native
  
  var _isPaused: js.Any = js.native
  
  var _isPlaying: js.Any = js.native
  
  var _object: js.Any = js.native
  
  var _onCompleteCallback: js.Any = js.native
  
  var _onRepeatCallback: js.Any = js.native
  
  var _onStartCallback: js.Any = js.native
  
  var _onStartCallbackFired: js.Any = js.native
  
  var _onStopCallback: js.Any = js.native
  
  var _onUpdateCallback: js.Any = js.native
  
  var _pauseStart: js.Any = js.native
  
  var _repeat: js.Any = js.native
  
  var _repeatDelayTime: js.Any = js.native
  
  var _reversed: js.Any = js.native
  
  var _setupProperties: js.Any = js.native
  
  var _startTime: js.Any = js.native
  
  var _swapEndStartRepeatValues: js.Any = js.native
  
  var _updateProperties: js.Any = js.native
  
  var _valuesEnd: js.Any = js.native
  
  var _valuesStart: js.Any = js.native
  
  var _valuesStartRepeat: js.Any = js.native
  
  var _yoyo: js.Any = js.native
  
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
  def update(time: js.UndefOr[scala.Nothing], autoStart: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, autoStart: Boolean): Boolean = js.native
  
  def yoyo(yoyo: Boolean): this.type = js.native
}
