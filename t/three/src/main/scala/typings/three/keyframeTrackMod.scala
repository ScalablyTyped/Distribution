package typings.three

import typings.std.Float32Array
import typings.three.constantsMod.InterpolationModes
import typings.three.cubicInterpolantMod.CubicInterpolant
import typings.three.discreteInterpolantMod.DiscreteInterpolant
import typings.three.linearInterpolantMod.LinearInterpolant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframeTrackMod {
  
  @JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack")
  @js.native
  class KeyframeTrack protected () extends StObject {
    /**
    	 * @param name
    	 * @param times
    	 * @param values
    	 * @param [interpolation=THREE.InterpolateLinear]
    	 */
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
    
    /**
    	 * @default THREE.InterpolateLinear
    	 */
    var DefaultInterpolation: InterpolationModes = js.native
    
    def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
    
    def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
    
    def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
    
    var TimeBufferType: Float32Array = js.native
    
    var ValueBufferType: Float32Array = js.native
    
    var ValueTypeName: String = js.native
    
    def getInterpolation(): InterpolationModes = js.native
    
    def getValueSize(): Double = js.native
    
    var name: String = js.native
    
    def optimize(): KeyframeTrack = js.native
    
    def scale(timeScale: Double): KeyframeTrack = js.native
    
    def setInterpolation(interpolation: InterpolationModes): KeyframeTrack = js.native
    
    def shift(timeOffset: Double): KeyframeTrack = js.native
    
    var times: Float32Array = js.native
    
    def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
    
    def validate(): Boolean = js.native
    
    var values: Float32Array = js.native
  }
  /* static members */
  object KeyframeTrack {
    
    @JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack.toJSON")
    @js.native
    def toJSON(track: KeyframeTrack): js.Any = js.native
  }
}
