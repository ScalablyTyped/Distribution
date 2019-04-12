package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack {
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
  def this(name: java.lang.String, times: js.Array[_], values: js.Array[_], interpolation: threeLib.srcConstantsMod.InterpolationModes) = this()
}

/* static members */
@JSImport("three", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def parse(json: js.Any): threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack): js.Any = js.native
}

