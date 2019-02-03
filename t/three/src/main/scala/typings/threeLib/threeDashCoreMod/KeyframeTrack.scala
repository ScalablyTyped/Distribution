package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "KeyframeTrack")
@js.native
class KeyframeTrack protected () extends js.Object {
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  var DefaultInterpolation: InterpolationModes = js.native
  var TimeBufferType: stdLib.Float32Array = js.native
  var ValueBufferType: stdLib.Float32Array = js.native
  var ValueTypeName: java.lang.String = js.native
  var name: java.lang.String = js.native
  var times: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
  def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
  def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
  def getInterpolation(): InterpolationModes = js.native
  def getValuesize(): scala.Double = js.native
  def optimize(): KeyframeTrack = js.native
  def scale(timeScale: scala.Double): KeyframeTrack = js.native
  def setInterpolation(interpolation: InterpolationModes): scala.Unit = js.native
  def shift(timeOffset: scala.Double): KeyframeTrack = js.native
  def trim(startTime: scala.Double, endTime: scala.Double): KeyframeTrack = js.native
  def validate(): scala.Boolean = js.native
}

/* static members */
@JSImport("three/three-core", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def parse(json: js.Any): threeLib.threeDashCoreMod.KeyframeTrack = js.native
  def toJSON(track: threeLib.threeDashCoreMod.KeyframeTrack): js.Any = js.native
}

