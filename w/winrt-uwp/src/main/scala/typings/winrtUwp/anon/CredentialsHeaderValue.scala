package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialsHeaderValue extends StObject {
  
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: HttpCredentialsHeaderValue
  
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object CredentialsHeaderValue {
  
  inline def apply(credentialsHeaderValue: HttpCredentialsHeaderValue, returnValue: Boolean): CredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(credentialsHeaderValue = credentialsHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHeaderValue]
  }
  
  extension [Self <: CredentialsHeaderValue](x: Self) {
    
    inline def setCredentialsHeaderValue(value: HttpCredentialsHeaderValue): Self = StObject.set(x, "credentialsHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
