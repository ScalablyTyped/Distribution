package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The condition under which this rule is triggered.
  */
trait RuleConditionType extends StObject {
  
  /**
    * Specifies whether the network request is first-party or third-party to the domain from which it originated. If omitted,
    * all requests are matched.
    * Optional.
    */
  var domainType: js.UndefOr[RuleConditionDomainTypeEnum] = js.undefined
  
  /**
    * The rule will not match network requests originating from the list of 'initiatorDomains'.
    * If the list is empty or omitted, no domains are excluded. This takes precedence over 'initiatorDomains'.
    * Optional.
    */
  var excludedInitiatorDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The rule will not match network requests when the domains matches one from the list of 'excludedRequestDomains'.
    * If the list is empty or omitted, no domains are excluded. This takes precedence over 'requestDomains'.
    * Optional.
    */
  var excludedRequestDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of request methods which the rule won't match. Cannot be specified if 'requestMethods' is specified.
    * If neither of them is specified, all request methods are matched.
    * Optional.
    */
  var excludedRequestMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of resource types which the rule won't match. Cannot be specified if 'resourceTypes' is specified.
    * If neither of them is specified, all resource types except 'main_frame' are matched.
    * Optional.
    */
  var excludedResourceTypes: js.UndefOr[js.Array[ResourceType]] = js.undefined
  
  /**
    * List of tabIds which the rule should not match. An ID of -1 excludes requests which don't originate from a tab.
    * Only supported for session-scoped rules.
    * Optional.
    */
  var excludedTabIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The rule will only match network requests originating from the list of 'initiatorDomains'. If the list is omitted,
    * the rule is applied to requests from all domains.
    * Optional.
    */
  var initiatorDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether 'urlFilter' or 'regexFilter' is case-sensitive. Defaults to true.
    * Optional.
    */
  var isUrlFilterCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Regular expression to match against the network request url. Only one of 'urlFilter' or 'regexFilter' can be specified.
    * Optional.
    */
  var regexFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The rule will only match network requests when the domain matches one from the list of 'requestDomains'.
    * If the list is omitted, the rule is applied to requests from all domains.
    * Optional.
    */
  var requestDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of HTTP request methods which the rule can match. Should be a lower-case method such as 'connect', 'delete', 'get',
    * 'head', 'options', 'patch', 'post', 'put'.'
    * Optional.
    */
  var requestMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of resource types which the rule can match. When the rule action is 'allowAllRequests',
    * this must be specified and may only contain 'main_frame' or 'sub_frame'. Cannot be specified if 'excludedResourceTypes'
    * is specified. If neither of them is specified, all resource types except 'main_frame' are matched.
    * Optional.
    */
  var resourceTypes: js.UndefOr[js.Array[ResourceType]] = js.undefined
  
  /**
    * List of tabIds which the rule should match. An ID of -1 matches requests which don't originate from a tab.
    * Only supported for session-scoped rules.
    * Optional.
    */
  var tabIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * TODO: link to doc explaining supported pattern. The pattern which is matched against the network request url.
    * Only one of 'urlFilter' or 'regexFilter' can be specified.
    * Optional.
    */
  var urlFilter: js.UndefOr[String] = js.undefined
}
object RuleConditionType {
  
  inline def apply(): RuleConditionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleConditionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleConditionType] (val x: Self) extends AnyVal {
    
    inline def setDomainType(value: RuleConditionDomainTypeEnum): Self = StObject.set(x, "domainType", value.asInstanceOf[js.Any])
    
    inline def setDomainTypeUndefined: Self = StObject.set(x, "domainType", js.undefined)
    
    inline def setExcludedInitiatorDomains(value: js.Array[String]): Self = StObject.set(x, "excludedInitiatorDomains", value.asInstanceOf[js.Any])
    
    inline def setExcludedInitiatorDomainsUndefined: Self = StObject.set(x, "excludedInitiatorDomains", js.undefined)
    
    inline def setExcludedInitiatorDomainsVarargs(value: String*): Self = StObject.set(x, "excludedInitiatorDomains", js.Array(value*))
    
    inline def setExcludedRequestDomains(value: js.Array[String]): Self = StObject.set(x, "excludedRequestDomains", value.asInstanceOf[js.Any])
    
    inline def setExcludedRequestDomainsUndefined: Self = StObject.set(x, "excludedRequestDomains", js.undefined)
    
    inline def setExcludedRequestDomainsVarargs(value: String*): Self = StObject.set(x, "excludedRequestDomains", js.Array(value*))
    
    inline def setExcludedRequestMethods(value: js.Array[String]): Self = StObject.set(x, "excludedRequestMethods", value.asInstanceOf[js.Any])
    
    inline def setExcludedRequestMethodsUndefined: Self = StObject.set(x, "excludedRequestMethods", js.undefined)
    
    inline def setExcludedRequestMethodsVarargs(value: String*): Self = StObject.set(x, "excludedRequestMethods", js.Array(value*))
    
    inline def setExcludedResourceTypes(value: js.Array[ResourceType]): Self = StObject.set(x, "excludedResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedResourceTypesUndefined: Self = StObject.set(x, "excludedResourceTypes", js.undefined)
    
    inline def setExcludedResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "excludedResourceTypes", js.Array(value*))
    
    inline def setExcludedTabIds(value: js.Array[Double]): Self = StObject.set(x, "excludedTabIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedTabIdsUndefined: Self = StObject.set(x, "excludedTabIds", js.undefined)
    
    inline def setExcludedTabIdsVarargs(value: Double*): Self = StObject.set(x, "excludedTabIds", js.Array(value*))
    
    inline def setInitiatorDomains(value: js.Array[String]): Self = StObject.set(x, "initiatorDomains", value.asInstanceOf[js.Any])
    
    inline def setInitiatorDomainsUndefined: Self = StObject.set(x, "initiatorDomains", js.undefined)
    
    inline def setInitiatorDomainsVarargs(value: String*): Self = StObject.set(x, "initiatorDomains", js.Array(value*))
    
    inline def setIsUrlFilterCaseSensitive(value: Boolean): Self = StObject.set(x, "isUrlFilterCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setIsUrlFilterCaseSensitiveUndefined: Self = StObject.set(x, "isUrlFilterCaseSensitive", js.undefined)
    
    inline def setRegexFilter(value: String): Self = StObject.set(x, "regexFilter", value.asInstanceOf[js.Any])
    
    inline def setRegexFilterUndefined: Self = StObject.set(x, "regexFilter", js.undefined)
    
    inline def setRequestDomains(value: js.Array[String]): Self = StObject.set(x, "requestDomains", value.asInstanceOf[js.Any])
    
    inline def setRequestDomainsUndefined: Self = StObject.set(x, "requestDomains", js.undefined)
    
    inline def setRequestDomainsVarargs(value: String*): Self = StObject.set(x, "requestDomains", js.Array(value*))
    
    inline def setRequestMethods(value: js.Array[String]): Self = StObject.set(x, "requestMethods", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodsUndefined: Self = StObject.set(x, "requestMethods", js.undefined)
    
    inline def setRequestMethodsVarargs(value: String*): Self = StObject.set(x, "requestMethods", js.Array(value*))
    
    inline def setResourceTypes(value: js.Array[ResourceType]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
    
    inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    inline def setTabIdsUndefined: Self = StObject.set(x, "tabIds", js.undefined)
    
    inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
    
    inline def setUrlFilter(value: String): Self = StObject.set(x, "urlFilter", value.asInstanceOf[js.Any])
    
    inline def setUrlFilterUndefined: Self = StObject.set(x, "urlFilter", js.undefined)
  }
}
