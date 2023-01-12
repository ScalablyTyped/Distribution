package typings.xummSdk

import typings.xummSdk.distSrcTypesXAppXAppOttDataMod.xAppOttData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesXAppXAppJwtOttMod {
  
  trait xAppJwtOtt extends StObject {
    
    var app: xAppJwtOttApp
    
    var jwt: String
    
    var ott: xAppOttData
  }
  object xAppJwtOtt {
    
    inline def apply(app: xAppJwtOttApp, jwt: String, ott: xAppOttData): xAppJwtOtt = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], ott = ott.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppJwtOtt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppJwtOtt] (val x: Self) extends AnyVal {
      
      inline def setApp(value: xAppJwtOttApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setOtt(value: xAppOttData): Self = StObject.set(x, "ott", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppJwtOttApp extends StObject {
    
    var name: String
  }
  object xAppJwtOttApp {
    
    inline def apply(name: String): xAppJwtOttApp = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppJwtOttApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppJwtOttApp] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
