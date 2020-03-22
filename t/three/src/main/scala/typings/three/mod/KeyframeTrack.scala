package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends typings.three.keyframeTrackMod.KeyframeTrack {
  def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  def this(
    name: String,
    times: js.Array[_],
    values: js.Array[_],
    interpolation: typings.three.constantsMod.InterpolationModes
  ) = this()
}

/* static members */
@JSImport("three", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def toJSON(track: typings.three.keyframeTrackMod.KeyframeTrack): js.Any = js.native
}

