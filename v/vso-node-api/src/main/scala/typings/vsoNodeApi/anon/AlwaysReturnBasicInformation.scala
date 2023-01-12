package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysReturnBasicInformation extends StObject {
  
  var alwaysReturnBasicInformation: scala.Double
  
  var includeDeletedSubscriptions: scala.Double
  
  var includeFilterDetails: scala.Double
  
  var includeInvalidSubscriptions: scala.Double
  
  var none: scala.Double
}
object AlwaysReturnBasicInformation {
  
  inline def apply(
    alwaysReturnBasicInformation: scala.Double,
    includeDeletedSubscriptions: scala.Double,
    includeFilterDetails: scala.Double,
    includeInvalidSubscriptions: scala.Double,
    none: scala.Double
  ): AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation.asInstanceOf[js.Any], includeDeletedSubscriptions = includeDeletedSubscriptions.asInstanceOf[js.Any], includeFilterDetails = includeFilterDetails.asInstanceOf[js.Any], includeInvalidSubscriptions = includeInvalidSubscriptions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysReturnBasicInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    
    inline def setAlwaysReturnBasicInformation(value: scala.Double): Self = StObject.set(x, "alwaysReturnBasicInformation", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedSubscriptions(value: scala.Double): Self = StObject.set(x, "includeDeletedSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setIncludeFilterDetails(value: scala.Double): Self = StObject.set(x, "includeFilterDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeInvalidSubscriptions(value: scala.Double): Self = StObject.set(x, "includeInvalidSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
