package typings.testcafeHammerhead.mod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "ResponseEvent")
@js.native
open class ResponseEvent () extends StObject {
  
  /** The body of the query response **/
  var body: Buffer = js.native
  
  /** The headers of the query response **/
  var headers: IncomingHttpHeaders = js.native
  
  /** The unique identifier of the event **/
  var id: String = js.native
  
  /** The same origin policy check **/
  var isSameOriginPolicyFailed: Boolean = js.native
  
  /** The filter rule for the query **/
  var requestFilterRule: RequestFilterRule = js.native
  
  /** Request unique identifier **/
  var requestId: String = js.native
  
  /** The status code of the query **/
  var statusCode: Double = js.native
}
/* static members */
object ResponseEvent {
  
  @JSImport("testcafe-hammerhead", "ResponseEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a new ResponseEvent using the passed data **/
  inline def from(data: Any): ResponseEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[ResponseEvent]
}
