package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeEventTypeInformation extends StObject {
  
  var includeEventTypeInformation: scala.Double = js.native
  
  var includeGroup: scala.Double = js.native
  
  var includeUser: scala.Double = js.native
  
  var includeUserAndGroup: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object IncludeEventTypeInformation {
  
  @scala.inline
  def apply(
    includeEventTypeInformation: scala.Double,
    includeGroup: scala.Double,
    includeUser: scala.Double,
    includeUserAndGroup: scala.Double,
    none: scala.Double
  ): IncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation.asInstanceOf[js.Any], includeGroup = includeGroup.asInstanceOf[js.Any], includeUser = includeUser.asInstanceOf[js.Any], includeUserAndGroup = includeUserAndGroup.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEventTypeInformation]
  }
  
  @scala.inline
  implicit class IncludeEventTypeInformationMutableBuilder[Self <: IncludeEventTypeInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeEventTypeInformation(value: scala.Double): Self = StObject.set(x, "includeEventTypeInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGroup(value: scala.Double): Self = StObject.set(x, "includeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUser(value: scala.Double): Self = StObject.set(x, "includeUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserAndGroup(value: scala.Double): Self = StObject.set(x, "includeUserAndGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
