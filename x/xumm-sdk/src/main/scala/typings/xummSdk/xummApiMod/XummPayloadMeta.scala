package typings.xummSdk.xummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummPayloadMeta extends StObject {
  
  var app_opened: Boolean
  
  var cancelled: Boolean
  
  var destination: String
  
  var exists: Boolean
  
  var expired: Boolean
  
  var forceAccount: js.UndefOr[Boolean] = js.undefined
  
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  var is_xapp: Boolean
  
  var multisign: Boolean
  
  var opened_by_deeplink: Boolean | Null
  
  var pathfinding: Boolean | Null
  
  var pushed: Boolean
  
  var resolved: Boolean
  
  var resolved_destination: String
  
  var return_url_app: String | Null
  
  var return_url_web: String | Null
  
  var signed: Boolean
  
  var signers: js.Array[String] | Null
  
  var submit: Boolean
  
  var uuid: String
}
object XummPayloadMeta {
  
  inline def apply(
    app_opened: Boolean,
    cancelled: Boolean,
    destination: String,
    exists: Boolean,
    expired: Boolean,
    is_xapp: Boolean,
    multisign: Boolean,
    pushed: Boolean,
    resolved: Boolean,
    resolved_destination: String,
    signed: Boolean,
    submit: Boolean,
    uuid: String
  ): XummPayloadMeta = {
    val __obj = js.Dynamic.literal(app_opened = app_opened.asInstanceOf[js.Any], cancelled = cancelled.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], is_xapp = is_xapp.asInstanceOf[js.Any], multisign = multisign.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], resolved_destination = resolved_destination.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], opened_by_deeplink = null, pathfinding = null, return_url_app = null, return_url_web = null, signers = null)
    __obj.asInstanceOf[XummPayloadMeta]
  }
  
  extension [Self <: XummPayloadMeta](x: Self) {
    
    inline def setApp_opened(value: Boolean): Self = StObject.set(x, "app_opened", value.asInstanceOf[js.Any])
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setForceAccount(value: Boolean): Self = StObject.set(x, "forceAccount", value.asInstanceOf[js.Any])
    
    inline def setForceAccountUndefined: Self = StObject.set(x, "forceAccount", js.undefined)
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setIs_xapp(value: Boolean): Self = StObject.set(x, "is_xapp", value.asInstanceOf[js.Any])
    
    inline def setMultisign(value: Boolean): Self = StObject.set(x, "multisign", value.asInstanceOf[js.Any])
    
    inline def setOpened_by_deeplink(value: Boolean): Self = StObject.set(x, "opened_by_deeplink", value.asInstanceOf[js.Any])
    
    inline def setOpened_by_deeplinkNull: Self = StObject.set(x, "opened_by_deeplink", null)
    
    inline def setPathfinding(value: Boolean): Self = StObject.set(x, "pathfinding", value.asInstanceOf[js.Any])
    
    inline def setPathfindingNull: Self = StObject.set(x, "pathfinding", null)
    
    inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolved_destination(value: String): Self = StObject.set(x, "resolved_destination", value.asInstanceOf[js.Any])
    
    inline def setReturn_url_app(value: String): Self = StObject.set(x, "return_url_app", value.asInstanceOf[js.Any])
    
    inline def setReturn_url_appNull: Self = StObject.set(x, "return_url_app", null)
    
    inline def setReturn_url_web(value: String): Self = StObject.set(x, "return_url_web", value.asInstanceOf[js.Any])
    
    inline def setReturn_url_webNull: Self = StObject.set(x, "return_url_web", null)
    
    inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSigners(value: js.Array[String]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersNull: Self = StObject.set(x, "signers", null)
    
    inline def setSignersVarargs(value: String*): Self = StObject.set(x, "signers", js.Array(value*))
    
    inline def setSubmit(value: Boolean): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
