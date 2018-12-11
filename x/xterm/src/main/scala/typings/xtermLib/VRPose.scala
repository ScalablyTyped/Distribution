package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VRPose extends js.Object {
  val angularAcceleration: stdLib.Float32Array | scala.Null
  val angularVelocity: stdLib.Float32Array | scala.Null
  val linearAcceleration: stdLib.Float32Array | scala.Null
  val linearVelocity: stdLib.Float32Array | scala.Null
  val orientation: stdLib.Float32Array | scala.Null
  val position: stdLib.Float32Array | scala.Null
  val timestamp: scala.Double
}

@JSGlobal("VRPose")
@js.native
object VRPose
  extends ScalablyTyped.runtime.Instantiable0[VRPose]

