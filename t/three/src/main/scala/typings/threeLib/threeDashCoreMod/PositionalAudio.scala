package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PositionalAudio")
@js.native
class PositionalAudio protected () extends Audio {
  def this(listener: AudioListener) = this()
  var panner: stdLib.PannerNode = js.native
  def getDistanceModel(): scala.Double = js.native
  def getMaxDistance(): scala.Double = js.native
  def getRefDistance(): scala.Double = js.native
  def getRolloffFactor(): scala.Double = js.native
  def setDistanceModel(value: scala.Double): scala.Unit = js.native
  def setMaxDistance(value: scala.Double): scala.Unit = js.native
  def setRefDistance(value: scala.Double): scala.Unit = js.native
  def setRolloffFactor(value: scala.Double): scala.Unit = js.native
}

