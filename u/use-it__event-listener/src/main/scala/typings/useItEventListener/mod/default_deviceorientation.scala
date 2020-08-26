package typings.useItEventListener.mod

import typings.std.DeviceOrientationEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.deviceorientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_deviceorientation extends js.Object {
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent): Unit = js.native
  def apply(
    eventName: deviceorientation,
    handler: DeviceOrientationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window): Unit = js.native
  def apply(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window, options: Options): Unit = js.native
}

