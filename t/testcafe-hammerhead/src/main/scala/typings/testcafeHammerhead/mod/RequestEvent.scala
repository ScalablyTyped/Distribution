package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "RequestEvent")
@js.native
open class RequestEvent () extends StObject {
  
  /** The information of the query request **/
  var _requestInfo: RequestInfo = js.native
  
  /** The unique identifier of the event **/
  var id: String = js.native
  
  /** The filter rule for the query **/
  var requestFilterRule: RequestFilterRule = js.native
  
  /** Set up the mock for the query response **/
  def setMock(mock: ResponseMock): js.Promise[Unit] = js.native
}
/* static members */
object RequestEvent {
  
  @JSImport("testcafe-hammerhead", "RequestEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a new RequestEvent using the passed data **/
  inline def from(data: Any): RequestEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[RequestEvent]
}
