package typings.testcafeHammerhead.mod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "RequestInfo")
@js.native
open class RequestInfo () extends StObject {
  
  /** The body of the query request **/
  var body: Buffer = js.native
  
  /** The headers of the query request **/
  var headers: IncomingHttpHeaders = js.native
  
  /** The method of the query request **/
  var method: String = js.native
  
  /** Request unique identifier **/
  var requestId: String = js.native
  
  /** Session unique identifier **/
  var sessionId: String = js.native
  
  /** The url of the query request **/
  var url: String = js.native
  
  /** The user agent of the query request **/
  var userAgent: String = js.native
}
