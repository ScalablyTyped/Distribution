package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  var organization: scala.Double
  
  var `private`: scala.Double
  
  var public: scala.Double
  
  var unchanged: scala.Double
}
object Organization {
  
  inline def apply(organization: scala.Double, `private`: scala.Double, public: scala.Double, unchanged: scala.Double): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setOrganization(value: scala.Double): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: scala.Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: scala.Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setUnchanged(value: scala.Double): Self = StObject.set(x, "unchanged", value.asInstanceOf[js.Any])
  }
}
