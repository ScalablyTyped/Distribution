package typings.three

import typings.std.ArrayLike
import typings.three.srcConstantsMod.InterpolationModes
import typings.three.srcMathInterpolantsCubicInterpolantMod.CubicInterpolant
import typings.three.srcMathInterpolantsDiscreteInterpolantMod.DiscreteInterpolant
import typings.three.srcMathInterpolantsLinearInterpolantMod.LinearInterpolant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimationKeyframeTrackMod {
  
  @JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack")
  @js.native
  open class KeyframeTrack protected () extends StObject {
    /**
      * @param name
      * @param times
      * @param values
      * @param [interpolation=THREE.InterpolateLinear]
      */
    def this(name: String, times: ArrayLike[Any], values: ArrayLike[Any]) = this()
    def this(name: String, times: ArrayLike[Any], values: ArrayLike[Any], interpolation: InterpolationModes) = this()
    
    /**
      * @default THREE.InterpolateLinear
      */
    var DefaultInterpolation: InterpolationModes = js.native
    
    def InterpolantFactoryMethodDiscrete(result: Any): DiscreteInterpolant = js.native
    
    def InterpolantFactoryMethodLinear(result: Any): LinearInterpolant = js.native
    
    def InterpolantFactoryMethodSmooth(result: Any): CubicInterpolant = js.native
    
    var TimeBufferType: js.typedarray.Float32Array = js.native
    
    var ValueBufferType: js.typedarray.Float32Array = js.native
    
    var ValueTypeName: String = js.native
    
    def getInterpolation(): InterpolationModes = js.native
    
    def getValueSize(): Double = js.native
    
    var name: String = js.native
    
    def optimize(): KeyframeTrack = js.native
    
    def scale(timeScale: Double): KeyframeTrack = js.native
    
    def setInterpolation(interpolation: InterpolationModes): KeyframeTrack = js.native
    
    def shift(timeOffset: Double): KeyframeTrack = js.native
    
    var times: js.typedarray.Float32Array = js.native
    
    def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
    
    def validate(): Boolean = js.native
    
    var values: js.typedarray.Float32Array = js.native
  }
  /* static members */
  object KeyframeTrack {
    
    @JSImport("three/src/animation/KeyframeTrack", "KeyframeTrack")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toJSON(track: KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
