package typings.xummSdk

import typings.std.Record
import typings.xummSdk.anon.Disabled
import typings.xummSdk.anon.Uuidv4
import typings.xummSdk.jwtPongMod.JwtPong
import typings.xummSdk.xAppJwtPongMod.xAppJwtPong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationDetailsMod {
  
  trait ApplicationDetails extends StObject {
    
    var application: Disabled
    
    var call: js.UndefOr[Uuidv4] = js.undefined
    
    var jwtData: js.UndefOr[xAppJwtPong | JwtPong] = js.undefined
    
    var quota: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object ApplicationDetails {
    
    inline def apply(application: Disabled): ApplicationDetails = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationDetails]
    }
    
    extension [Self <: ApplicationDetails](x: Self) {
      
      inline def setApplication(value: Disabled): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setCall(value: Uuidv4): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setJwtData(value: xAppJwtPong | JwtPong): Self = StObject.set(x, "jwtData", value.asInstanceOf[js.Any])
      
      inline def setJwtDataUndefined: Self = StObject.set(x, "jwtData", js.undefined)
      
      inline def setQuota(value: Record[String, Any]): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
      
      inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    }
  }
}
