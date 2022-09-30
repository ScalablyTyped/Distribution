package typings.uapiJson

import typings.uapiJson.uapiJsonInts.`0`
import typings.uapiJson.uapiJsonInts.`1`
import typings.uapiJson.uapiJsonInts.`2`
import typings.uapiJson.uapiJsonInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  trait Auth extends StObject {
    
    var emulatePcc: js.UndefOr[String | Boolean] = js.undefined
    
    var password: String
    
    var provider: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var targetBranch: String
    
    var username: String
  }
  object Auth {
    
    inline def apply(password: String, targetBranch: String, username: String): Auth = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setEmulatePcc(value: String | Boolean): Self = StObject.set(x, "emulatePcc", value.asInstanceOf[js.Any])
      
      inline def setEmulatePccUndefined: Self = StObject.set(x, "emulatePcc", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTargetBranch(value: String): Self = StObject.set(x, "targetBranch", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    def logFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
  }
  object Options {
    
    inline def apply(logFunction: Any => Any): Options = {
      val __obj = js.Dynamic.literal(logFunction = js.Any.fromFunction1(logFunction))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLogFunction(value: Any => Any): Self = StObject.set(x, "logFunction", js.Any.fromFunction1(value))
    }
  }
  
  trait Settings extends StObject {
    
    var auth: Auth
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(auth: Auth): Settings = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setDebug(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
