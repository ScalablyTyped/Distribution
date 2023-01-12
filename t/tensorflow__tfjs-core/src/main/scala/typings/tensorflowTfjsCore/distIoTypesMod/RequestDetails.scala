package typings.tensorflowTfjsCore.distIoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDetails extends StObject {
  
  /**
    * Is this request for a binary file (as opposed to a json file)
    */
  var isBinary: js.UndefOr[Boolean] = js.undefined
}
object RequestDetails {
  
  inline def apply(): RequestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestDetails] (val x: Self) extends AnyVal {
    
    inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
    
    inline def setIsBinaryUndefined: Self = StObject.set(x, "isBinary", js.undefined)
  }
}
