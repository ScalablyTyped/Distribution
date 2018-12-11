package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionEvent extends Event {
  val acceleration: DeviceAcceleration | scala.Null = js.native
  val accelerationIncludingGravity: DeviceAcceleration | scala.Null = js.native
  val interval: scala.Double | scala.Null = js.native
  val rotationRate: DeviceRotationRate | scala.Null = js.native
  def initDeviceMotionEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: scala.Null,
    rotationRate: scala.Null,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: scala.Null,
    rotationRate: DeviceRotationRateDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: scala.Null,
    rotationRate: DeviceRotationRateDict,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: DeviceAccelerationDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: scala.Null,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: scala.Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: scala.Null,
    rotationRate: scala.Null,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: scala.Null,
    rotationRate: DeviceRotationRateDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: scala.Null,
    rotationRate: DeviceRotationRateDict,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: scala.Null,
    interval: scala.Double
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict
  ): scala.Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict,
    interval: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("DeviceMotionEvent")
@js.native
object DeviceMotionEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, DeviceMotionEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceMotionEventInit, 
      DeviceMotionEvent
    ]

