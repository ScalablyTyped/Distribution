package typings.three

import typings.std.Float32Array
import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import typings.three.srcMathInterpolantsCubicInterpolantMod.CubicInterpolant
import typings.three.srcMathInterpolantsDiscreteInterpolantMod.DiscreteInterpolant
import typings.three.srcMathInterpolantsLinearInterpolantMod.LinearInterpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/KeyframeTrack", JSImport.Namespace)
@js.native
object srcAnimationKeyframeTrackMod extends js.Object {
  @js.native
  class KeyframeTrack protected () extends js.Object {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
    var DefaultInterpolation: InterpolationModes = js.native
    var TimeBufferType: Float32Array = js.native
    var ValueBufferType: Float32Array = js.native
    var ValueTypeName: String = js.native
    var name: String = js.native
    var times: Float32Array = js.native
    var values: Float32Array = js.native
    def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
    def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
    def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
    def getInterpolation(): InterpolationModes = js.native
    def getValuesize(): Double = js.native
    def optimize(): KeyframeTrack = js.native
    def scale(timeScale: Double): KeyframeTrack = js.native
    def setInterpolation(interpolation: InterpolationModes): Unit = js.native
    def shift(timeOffset: Double): KeyframeTrack = js.native
    def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
    def validate(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyframeTrack extends js.Object {
    def parse(json: js.Any): KeyframeTrack = js.native
    def toJSON(track: KeyframeTrack): js.Any = js.native
  }
  
}

