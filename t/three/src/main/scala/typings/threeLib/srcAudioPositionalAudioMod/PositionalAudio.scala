package typings
package threeLib.srcAudioPositionalAudioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/PositionalAudio", "PositionalAudio")
@js.native
class PositionalAudio protected ()
  extends threeLib.srcAudioAudioMod.Audio {
  def this(listener: threeLib.srcAudioAudioListenerMod.AudioListener) = this()
  var panner: stdLib.PannerNode = js.native
  def getDistanceModel(): java.lang.String = js.native
  def getMaxDistance(): scala.Double = js.native
  def getRefDistance(): scala.Double = js.native
  def getRolloffFactor(): scala.Double = js.native
  def setDirectionalCone(coneInnerAngle: scala.Double, coneOuterAngle: scala.Double, coneOuterGain: scala.Double): this.type = js.native
  def setDistanceModel(value: java.lang.String): this.type = js.native
  def setMaxDistance(value: scala.Double): this.type = js.native
  def setRefDistance(value: scala.Double): this.type = js.native
  def setRolloffFactor(value: scala.Double): this.type = js.native
}

