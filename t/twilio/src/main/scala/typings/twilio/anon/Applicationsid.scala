package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationsid extends StObject {
  
  var application_sid: String
  
  var params: js.UndefOr[js.Object] = js.undefined
}
object Applicationsid {
  
  inline def apply(application_sid: String): Applicationsid = {
    val __obj = js.Dynamic.literal(application_sid = application_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationsid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationsid] (val x: Self) extends AnyVal {
    
    inline def setApplication_sid(value: String): Self = StObject.set(x, "application_sid", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
