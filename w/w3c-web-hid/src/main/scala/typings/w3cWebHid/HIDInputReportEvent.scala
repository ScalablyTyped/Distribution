package typings.w3cWebHid

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidinputreportevent-interface */
@js.native
trait HIDInputReportEvent
  extends StObject
     with Event {
  
  val data: js.typedarray.DataView = js.native
  
  val device: HIDDevice = js.native
  
  val reportId: Double = js.native
}
