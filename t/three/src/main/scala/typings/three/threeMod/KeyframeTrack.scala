package typings.three.threeMod

import typings.three.srcConstantsMod.InterpolationModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack {
  def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
}

/* static members */
@JSImport("three", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def parse(json: js.Any): typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack): js.Any = js.native
}

