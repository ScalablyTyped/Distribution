package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("twilio/lib/http/response", JSImport.Namespace)
  @js.native
  open class ^[TPayload] protected ()
    extends StObject
       with Response[TPayload] {
    def this(statusCode: Double, body: TPayload, headers: Any) = this()
  }
  
  trait Response[TPayload] extends StObject
}
