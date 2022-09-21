package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /*~ https://wicg.github.io/webhid/#hid-interface */
  @JSGlobal("HID")
  @js.native
  open class HID ()
    extends StObject
       with typings.w3cWebHid.HID
  
  /*~ https://wicg.github.io/webhid/#hidconnectionevent-interface */
  @JSGlobal("HIDConnectionEvent")
  @js.native
  open class HIDConnectionEvent protected ()
    extends StObject
       with typings.w3cWebHid.HIDConnectionEvent {
    def this(`type`: String, eventInitDict: HIDConnectionEventInit) = this()
  }
  
  /*~ https://wicg.github.io/webhid/#hiddevice-interface */
  @JSGlobal("HIDDevice")
  @js.native
  open class HIDDevice ()
    extends StObject
       with typings.w3cWebHid.HIDDevice
  
  /*~ https://wicg.github.io/webhid/#hidinputreportevent-interface */
  @JSGlobal("HIDInputReportEvent")
  @js.native
  open class HIDInputReportEvent protected ()
    extends StObject
       with typings.w3cWebHid.HIDInputReportEvent {
    def this(`type`: String, eventInitDict: HIDInputReportEventInit) = this()
  }
}
