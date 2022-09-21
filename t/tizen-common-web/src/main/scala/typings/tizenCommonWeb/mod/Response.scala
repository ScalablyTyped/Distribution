package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "Response")
@js.native
open class Response protected () extends StObject {
  def this(request: Request) = this()
  
  /**
    * The options indicates the vendor specific options of COAP packet.
    *
    * @remark Options can have up to 2 IotconOption.
    */
  var options: js.Array[IotconOption] | Null = js.native
  
  /**
    * The representation indicates the information of the resource.
    */
  var representation: Representation = js.native
  
  /**
    * The request, that server responded.
    */
  val request: Request = js.native
  
  /**
    * The result indicates the detailed information about the result of the response to request.
    */
  var result: ResponseResult = js.native
  
  /**
    * Sends the response.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def send(): Unit = js.native
}
