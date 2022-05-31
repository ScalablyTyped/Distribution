package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends typings.three.mod.KeyframeTrack {
  /**
  	 * @param name
  	 * @param times
  	 * @param values
  	 * @param [interpolation=THREE.InterpolateLinear]
  	 */
  def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any]) = this()
  def this(
    name: String,
    times: js.Array[js.Any],
    values: js.Array[js.Any],
    interpolation: typings.three.constantsMod.InterpolationModes
  ) = this()
}
/* static members */
object KeyframeTrack {
  
  @JSGlobal("THREE.KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJSON(track: typings.three.keyframeTrackMod.KeyframeTrack): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
