package typings.w3cWebHid

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidconnectionevent-interface */
@js.native
trait HIDConnectionEvent
  extends StObject
     with Event {
  
  val device: HIDDevice = js.native
}
