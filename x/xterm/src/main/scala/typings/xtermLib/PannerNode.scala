package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PannerNode extends AudioNode {
  var coneInnerAngle: scala.Double = js.native
  var coneOuterAngle: scala.Double = js.native
  var coneOuterGain: scala.Double = js.native
  var distanceModel: DistanceModelType = js.native
  var maxDistance: scala.Double = js.native
  val orientationX: AudioParam = js.native
  val orientationY: AudioParam = js.native
  val orientationZ: AudioParam = js.native
  var panningModel: PanningModelType = js.native
  val positionX: AudioParam = js.native
  val positionY: AudioParam = js.native
  val positionZ: AudioParam = js.native
  var refDistance: scala.Double = js.native
  var rolloffFactor: scala.Double = js.native
  /** @deprecated */
  def setOrientation(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
}

@JSGlobal("PannerNode")
@js.native
object PannerNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ BaseAudioContext, PannerNode]
     with ScalablyTyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ PannerOptions, PannerNode]

