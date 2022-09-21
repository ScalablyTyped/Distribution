package typings.three.threeMod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "KeyframeTrack")
@js.native
open class KeyframeTrack protected ()
  extends typings.three.keyframeTrackMod.KeyframeTrack {
  /**
    * @param name
    * @param times
    * @param values
    * @param [interpolation=THREE.InterpolateLinear]
    */
  def this(name: String, times: ArrayLike[Any], values: ArrayLike[Any]) = this()
  def this(
    name: String,
    times: ArrayLike[Any],
    values: ArrayLike[Any],
    interpolation: typings.three.srcConstantsMod.InterpolationModes
  ) = this()
}
/* static members */
object KeyframeTrack {
  
  @JSImport("three/src/Three", "KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJSON(track: typings.three.keyframeTrackMod.KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
}
