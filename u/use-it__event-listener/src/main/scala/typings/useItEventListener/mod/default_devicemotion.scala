package typings.useItEventListener.mod

import typings.std.DeviceMotionEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_devicemotion extends js.Object {
  
  def apply(eventName: devicemotion, handler: DeviceMotionEvent): Unit = js.native
  def apply(
    eventName: devicemotion,
    handler: DeviceMotionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: devicemotion, handler: DeviceMotionEvent, element: Window): Unit = js.native
  def apply(eventName: devicemotion, handler: DeviceMotionEvent, element: Window, options: Options): Unit = js.native
}
