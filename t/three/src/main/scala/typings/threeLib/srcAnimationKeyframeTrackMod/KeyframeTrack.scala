package typings
package threeLib.srcAnimationKeyframeTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack")
@js.native
class KeyframeTrack protected () extends js.Object {
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_], interpolation: threeLib.srcConstantsMod.InterpolationModes) = this()
  var DefaultInterpolation: threeLib.srcConstantsMod.InterpolationModes = js.native
  var TimeBufferType: stdLib.Float32Array = js.native
  var ValueBufferType: stdLib.Float32Array = js.native
  var ValueTypeName: java.lang.String = js.native
  var name: java.lang.String = js.native
  var times: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def InterpolantFactoryMethodDiscrete(result: js.Any): threeLib.srcMathInterpolantsDiscreteInterpolantMod.DiscreteInterpolant = js.native
  def InterpolantFactoryMethodLinear(result: js.Any): threeLib.srcMathInterpolantsLinearInterpolantMod.LinearInterpolant = js.native
  def InterpolantFactoryMethodSmooth(result: js.Any): threeLib.srcMathInterpolantsCubicInterpolantMod.CubicInterpolant = js.native
  def getInterpolation(): threeLib.srcConstantsMod.InterpolationModes = js.native
  def getValuesize(): scala.Double = js.native
  def optimize(): KeyframeTrack = js.native
  def scale(timeScale: scala.Double): KeyframeTrack = js.native
  def setInterpolation(interpolation: threeLib.srcConstantsMod.InterpolationModes): scala.Unit = js.native
  def shift(timeOffset: scala.Double): KeyframeTrack = js.native
  def trim(startTime: scala.Double, endTime: scala.Double): KeyframeTrack = js.native
  def validate(): scala.Boolean = js.native
}

/* static members */
@JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def parse(json: js.Any): threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack): js.Any = js.native
}

