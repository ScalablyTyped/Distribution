package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysReturnBasicInformation extends StObject {
  
  var alwaysReturnBasicInformation: scala.Double = js.native
  
  var includeDeletedSubscriptions: scala.Double = js.native
  
  var includeFilterDetails: scala.Double = js.native
  
  var includeInvalidSubscriptions: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object AlwaysReturnBasicInformation {
  
  @scala.inline
  def apply(
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
  implicit class AlwaysReturnBasicInformationMutableBuilder[Self <: AlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysReturnBasicInformation(value: scala.Double): Self = StObject.set(x, "alwaysReturnBasicInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedSubscriptions(value: scala.Double): Self = StObject.set(x, "includeDeletedSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFilterDetails(value: scala.Double): Self = StObject.set(x, "includeFilterDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInvalidSubscriptions(value: scala.Double): Self = StObject.set(x, "includeInvalidSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
