package typings.xummSdk

import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesPushEventPushPostBodyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait EventPushPostBody extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[AnyJson] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var user_account: js.UndefOr[String] = js.undefined
    
    var user_token: js.UndefOr[String] = js.undefined
    
    var user_uuid: js.UndefOr[String] = js.undefined
  }
  object EventPushPostBody {
    
    inline def apply(): EventPushPostBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventPushPostBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventPushPostBody] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setData(value: AnyJson): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setUser_account(value: String): Self = StObject.set(x, "user_account", value.asInstanceOf[js.Any])
      
      inline def setUser_accountUndefined: Self = StObject.set(x, "user_account", js.undefined)
      
      inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
      
      inline def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
      
      inline def setUser_uuid(value: String): Self = StObject.set(x, "user_uuid", value.asInstanceOf[js.Any])
      
      inline def setUser_uuidUndefined: Self = StObject.set(x, "user_uuid", js.undefined)
    }
  }
}
