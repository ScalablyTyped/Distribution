package typings
package threeLib.srcHelpersPositionalAudioHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PositionalAudioHelper", "PositionalAudioHelper")
@js.native
class PositionalAudioHelper protected ()
  extends threeLib.srcObjectsLineMod.Line {
  def this(audio: threeLib.srcAudioPositionalAudioMod.PositionalAudio) = this()
  def this(audio: threeLib.srcAudioPositionalAudioMod.PositionalAudio, range: scala.Double) = this()
  def this(audio: threeLib.srcAudioPositionalAudioMod.PositionalAudio, range: scala.Double, divisionsInnerAngle: scala.Double) = this()
  def this(audio: threeLib.srcAudioPositionalAudioMod.PositionalAudio, range: scala.Double, divisionsInnerAngle: scala.Double, divisionsOuterAngle: scala.Double) = this()
  var audio: threeLib.srcAudioPositionalAudioMod.PositionalAudio = js.native
  var divisionsInnerAngle: scala.Double = js.native
  var divisionsOuterAngle: scala.Double = js.native
  var range: scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

