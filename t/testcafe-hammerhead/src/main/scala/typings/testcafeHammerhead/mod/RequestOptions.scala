package typings.testcafeHammerhead.mod

import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "RequestOptions")
@js.native
open class RequestOptions protected () extends StObject {
  /** Creates a RequestOptions instance **/
  def this(params: RequestOptionsParams) = this()
  
  /** Request headers **/
  var headers: OutgoingHttpHeaders = js.native
  
  /** Request method **/
  var method: String = js.native
  
  /** Request url **/
  var url: String = js.native
}
