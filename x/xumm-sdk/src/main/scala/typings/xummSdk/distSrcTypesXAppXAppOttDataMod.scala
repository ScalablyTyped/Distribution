package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesXAppXAppOttDataMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppAccountInfo extends StObject {
    
    var account: String
    
    var blocked: Boolean
    
    var domain: js.UndefOr[String] = js.undefined
    
    var kycApproved: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    var proSubscription: Boolean
    
    var source: String
  }
  object xAppAccountInfo {
    
    inline def apply(account: String, blocked: Boolean, kycApproved: Boolean, proSubscription: Boolean, source: String): xAppAccountInfo = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], kycApproved = kycApproved.asInstanceOf[js.Any], proSubscription = proSubscription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppAccountInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppAccountInfo] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setKycApproved(value: Boolean): Self = StObject.set(x, "kycApproved", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProSubscription(value: Boolean): Self = StObject.set(x, "proSubscription", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppOrigin extends StObject {
    
    var data: js.UndefOr[xAppOriginData] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object xAppOrigin {
    
    inline def apply(): xAppOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[xAppOrigin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppOrigin] (val x: Self) extends AnyVal {
      
      inline def setData(value: xAppOriginData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppOriginData extends StObject {
    
    var payload: js.UndefOr[String] = js.undefined
  }
  object xAppOriginData {
    
    inline def apply(): xAppOriginData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[xAppOriginData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppOriginData] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppOttData extends StObject {
    
    var account: js.UndefOr[String] = js.undefined
    
    var account_info: xAppAccountInfo
    
    var accountaccess: js.UndefOr[String] = js.undefined
    
    var accounttype: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var nodetype: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[xAppOrigin] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var subscriptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var user: String
    
    var user_device: js.UndefOr[xAppUserDeviceData] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object xAppOttData {
    
    inline def apply(account_info: xAppAccountInfo, user: String): xAppOttData = {
      val __obj = js.Dynamic.literal(account_info = account_info.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppOttData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppOttData] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAccount_info(value: xAppAccountInfo): Self = StObject.set(x, "account_info", value.asInstanceOf[js.Any])
      
      inline def setAccountaccess(value: String): Self = StObject.set(x, "accountaccess", value.asInstanceOf[js.Any])
      
      inline def setAccountaccessUndefined: Self = StObject.set(x, "accountaccess", js.undefined)
      
      inline def setAccounttype(value: String): Self = StObject.set(x, "accounttype", value.asInstanceOf[js.Any])
      
      inline def setAccounttypeUndefined: Self = StObject.set(x, "accounttype", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNodetype(value: String): Self = StObject.set(x, "nodetype", value.asInstanceOf[js.Any])
      
      inline def setNodetypeUndefined: Self = StObject.set(x, "nodetype", js.undefined)
      
      inline def setOrigin(value: xAppOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      
      inline def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUser_device(value: xAppUserDeviceData): Self = StObject.set(x, "user_device", value.asInstanceOf[js.Any])
      
      inline def setUser_deviceUndefined: Self = StObject.set(x, "user_device", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppUserDeviceData extends StObject {
    
    var currency: String
    
    var platform: String
  }
  object xAppUserDeviceData {
    
    inline def apply(currency: String, platform: String): xAppUserDeviceData = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppUserDeviceData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppUserDeviceData] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
