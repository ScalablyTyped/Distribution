package typings.useItEventListener.mod

import typings.std.DeviceOrientationEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.deviceorientationabsolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_deviceorientationabsolute extends js.Object {
  
  def apply(eventName: deviceorientationabsolute, handler: DeviceOrientationEvent): Unit = js.native
  def apply(
    eventName: deviceorientationabsolute,
    handler: DeviceOrientationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: deviceorientationabsolute, handler: DeviceOrientationEvent, element: Window): Unit = js.native
  def apply(
    eventName: deviceorientationabsolute,
    handler: DeviceOrientationEvent,
    element: Window,
    options: Options
  ): Unit = js.native
}
