package typings.w3cWebNfc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NDEFReadingEvent
  extends StObject
     with Event {
  
  var message: NDEFMessage = js.native
  
  var serialNumber: String = js.native
}
