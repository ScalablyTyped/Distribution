package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The action to take if this rule is matched.
  */
trait RuleActionType extends StObject {
  
  /**
    * Describes how the redirect should be performed. Only valid when type is 'redirect'.
    * Optional.
    */
  var redirect: js.UndefOr[RuleActionRedirectType] = js.undefined
  
  /**
    * The request headers to modify for the request. Only valid when type is 'modifyHeaders'.
    * Optional.
    */
  var requestHeaders: js.UndefOr[js.Array[RuleActionRequestHeadersItemType]] = js.undefined
  
  /**
    * The response headers to modify for the request. Only valid when type is 'modifyHeaders'.
    * Optional.
    */
  var responseHeaders: js.UndefOr[js.Array[RuleActionResponseHeadersItemType]] = js.undefined
  
  var `type`: RuleActionTypeEnum
}
object RuleActionType {
  
  inline def apply(`type`: RuleActionTypeEnum): RuleActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionType] (val x: Self) extends AnyVal {
    
    inline def setRedirect(value: RuleActionRedirectType): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[RuleActionRequestHeadersItemType]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: RuleActionRequestHeadersItemType*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResponseHeaders(value: js.Array[RuleActionResponseHeadersItemType]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: RuleActionResponseHeadersItemType*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setType(value: RuleActionTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
