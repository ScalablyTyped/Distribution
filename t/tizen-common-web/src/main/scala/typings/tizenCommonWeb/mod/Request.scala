package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * Connectivity type of connection.
    */
  val connectivityType: ConnectivityType
  
  /**
    * The address of host of the request.
    */
  val hostAddress: String
  
  /**
    * The option which was sent from client.
    *
    * @remark Options can have up to 2 IotconOption.
    */
  val options: js.Array[IotconOption]
  
  /**
    * The query parameters from the request.
    */
  val query: Query
  
  /**
    * The request representation.
    */
  val representation: Representation | Null
}
object Request {
  
  inline def apply(
    connectivityType: ConnectivityType,
    hostAddress: String,
    options: js.Array[IotconOption],
    query: Query
  ): Request = {
    val __obj = js.Dynamic.literal(connectivityType = connectivityType.asInstanceOf[js.Any], hostAddress = hostAddress.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], representation = null)
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    inline def setConnectivityType(value: ConnectivityType): Self = StObject.set(x, "connectivityType", value.asInstanceOf[js.Any])
    
    inline def setHostAddress(value: String): Self = StObject.set(x, "hostAddress", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[IotconOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: IotconOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRepresentation(value: Representation): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationNull: Self = StObject.set(x, "representation", null)
  }
}
