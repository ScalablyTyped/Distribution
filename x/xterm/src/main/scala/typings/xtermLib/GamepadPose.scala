package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GamepadPose extends js.Object {
  val angularAcceleration: stdLib.Float32Array | scala.Null
  val angularVelocity: stdLib.Float32Array | scala.Null
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val linearAcceleration: stdLib.Float32Array | scala.Null
  val linearVelocity: stdLib.Float32Array | scala.Null
  val orientation: stdLib.Float32Array | scala.Null
  val position: stdLib.Float32Array | scala.Null
}

@JSGlobal("GamepadPose")
@js.native
object GamepadPose
  extends org.scalablytyped.runtime.Instantiable0[GamepadPose]

