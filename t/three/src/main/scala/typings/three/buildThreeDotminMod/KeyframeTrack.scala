package typings.three.buildThreeDotminMod

import typings.std.ArrayLike
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "KeyframeTrack")
@js.native
open class KeyframeTrack protected ()
  extends typings.three.srcThreeMod.KeyframeTrack {
  /**
    * @param name
    * @param times
    * @param values
    * @param [interpolation=THREE.InterpolateLinear]
    */
  def this(name: String, times: ArrayLike[Double], values: ArrayLike[Any]) = this()
  def this(name: String, times: ArrayLike[Double], values: ArrayLike[Any], interpolation: InterpolationModes) = this()
}
/* static members */
object KeyframeTrack {
  
  @JSImport("three/build/three.min", "KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJSON(track: typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
}
