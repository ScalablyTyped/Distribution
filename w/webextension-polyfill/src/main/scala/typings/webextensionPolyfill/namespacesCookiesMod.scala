package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesCookiesMod {
  
  object Cookies {
    
    /**
      * Represents information about an HTTP cookie.
      */
    trait Cookie extends StObject {
      
      /**
        * The domain of the cookie (e.g. "www.google.com", "example.com").
        */
      var domain: String
      
      /**
        * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
        * Optional.
        */
      var expirationDate: js.UndefOr[Double] = js.undefined
      
      /**
        * The first-party domain of the cookie.
        */
      var firstPartyDomain: String
      
      /**
        * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
        */
      var hostOnly: Boolean
      
      /**
        * True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts).
        */
      var httpOnly: Boolean
      
      /**
        * The name of the cookie.
        */
      var name: String
      
      /**
        * The cookie's storage partition, if any. null if not partitioned.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * The path of the cookie.
        */
      var path: String
      
      /**
        * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
        */
      var sameSite: SameSiteStatus
      
      /**
        * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
        */
      var secure: Boolean
      
      /**
        * True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date.
        */
      var session: Boolean
      
      /**
        * The ID of the cookie store containing this cookie, as provided in getAllCookieStores().
        */
      var storeId: String
      
      /**
        * The value of the cookie.
        */
      var value: String
    }
    object Cookie {
      
      inline def apply(
        domain: String,
        firstPartyDomain: String,
        hostOnly: Boolean,
        httpOnly: Boolean,
        name: String,
        path: String,
        sameSite: SameSiteStatus,
        secure: Boolean,
        session: Boolean,
        storeId: String,
        value: String
      ): Cookie = {
        val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Cookie]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
        
        inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
        
        inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Represents a cookie store in the browser. An incognito mode window, for instance, uses a separate cookie store from a
      * non-incognito window.
      */
    trait CookieStore extends StObject {
      
      /**
        * The unique identifier for the cookie store.
        */
      var id: String
      
      /**
        * Indicates if this is an incognito cookie store
        */
      var incognito: Boolean
      
      /**
        * Identifiers of all the browser tabs that share this cookie store.
        */
      var tabIds: js.Array[Double]
    }
    object CookieStore {
      
      inline def apply(id: String, incognito: Boolean, tabIds: js.Array[Double]): CookieStore = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
        __obj.asInstanceOf[CookieStore]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CookieStore] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
        
        inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
      }
    }
    
    /**
      * Information to filter the cookies being retrieved.
      */
    trait GetAllDetailsType extends StObject {
      
      /**
        * Restricts the retrieved cookies to those whose domains match or are subdomains of this one.
        * Optional.
        */
      var domain: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts the retrieved cookies to those whose first-party domains match this one.
        * This attribute is required if First-Party Isolation is enabled. To not filter by a specific first-party domain,
        * use `null` or `undefined`.
        * Optional.
        */
      var firstPartyDomain: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Filters the cookies by name.
        * Optional.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Selects a specific storage partition to look up cookies. Defaults to null, in which case only non-partitioned cookies
        * are retrieved. If an object iis passed, partitioned cookies are also included, and filtered based on the keys present in
        * the given PartitionKey description. An empty object ({}) returns all cookies (partitioned + unpartitioned),
        * a non-empty object (e.g. {topLevelSite: '...'}) only returns cookies whose partition match all given attributes.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * Restricts the retrieved cookies to those whose path exactly matches this string.
        * Optional.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * Filters the cookies by their Secure property.
        * Optional.
        */
      var secure: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Filters out session vs. persistent cookies.
        * Optional.
        */
      var session: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.
        * Optional.
        */
      var storeId: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts the retrieved cookies to those that would match the given URL.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object GetAllDetailsType {
      
      inline def apply(): GetAllDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetAllDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetAllDetailsType] (val x: Self) extends AnyVal {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setFirstPartyDomainNull: Self = StObject.set(x, "firstPartyDomain", null)
        
        inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
        
        inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * Details to identify the cookie being retrieved.
      */
    trait GetDetailsType extends StObject {
      
      /**
        * The first-party domain which the cookie to retrieve is associated. This attribute is required if First-Party Isolation
        * is enabled.
        * Optional.
        */
      var firstPartyDomain: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the cookie to retrieve.
        */
      var name: String
      
      /**
        * The storage partition, if the cookie is part of partitioned storage. By default, only non-partitioned cookies are
        * returned.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * The ID of the cookie store in which to look for the cookie. By default, the current execution context's cookie store
        * will be used.
        * Optional.
        */
      var storeId: js.UndefOr[String] = js.undefined
      
      /**
        * The URL with which the cookie to retrieve is associated. This argument may be a full URL,
        * in which case any data following the URL path (e.g. the query string) is simply ignored.
        * If host permissions for this URL are not specified in the manifest file, the API call will fail.
        */
      var url: String
    }
    object GetDetailsType {
      
      inline def apply(name: String, url: String): GetDetailsType = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[GetDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetDetailsType] (val x: Self) extends AnyVal {
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an explicit call to
      * $(ref:cookies.remove), "cause" will be "explicit". If a cookie was automatically removed due to expiry,
      * "cause" will be "expired". If a cookie was removed due to being overwritten with an already-expired expiration date,
      * "cause" will be set to "expired_overwrite".  If a cookie was automatically removed due to garbage collection,
      * "cause" will be "evicted".  If a cookie was automatically removed due to a "set" call that overwrote it,
      * "cause" will be "overwrite". Plan your response accordingly.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.evicted
      - typings.webextensionPolyfill.webextensionPolyfillStrings.expired
      - typings.webextensionPolyfill.webextensionPolyfillStrings.explicit
      - typings.webextensionPolyfill.webextensionPolyfillStrings.expired_overwrite
      - typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite
    */
    trait OnChangedCause extends StObject
    object OnChangedCause {
      
      inline def evicted: typings.webextensionPolyfill.webextensionPolyfillStrings.evicted = "evicted".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.evicted]
      
      inline def expired: typings.webextensionPolyfill.webextensionPolyfillStrings.expired = "expired".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.expired]
      
      inline def expired_overwrite: typings.webextensionPolyfill.webextensionPolyfillStrings.expired_overwrite = "expired_overwrite".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.expired_overwrite]
      
      inline def explicit: typings.webextensionPolyfill.webextensionPolyfillStrings.explicit = "explicit".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.explicit]
      
      inline def overwrite: typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite = "overwrite".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite]
    }
    
    trait OnChangedChangeInfoType extends StObject {
      
      /**
        * The underlying reason behind the cookie's change.
        */
      var cause: OnChangedCause
      
      /**
        * Information about the cookie that was set or removed.
        */
      var cookie: Cookie
      
      /**
        * True if a cookie was removed.
        */
      var removed: Boolean
    }
    object OnChangedChangeInfoType {
      
      inline def apply(cause: OnChangedCause, cookie: Cookie, removed: Boolean): OnChangedChangeInfoType = {
        val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnChangedChangeInfoType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnChangedChangeInfoType] (val x: Self) extends AnyVal {
        
        inline def setCause(value: OnChangedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
        
        inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
        
        inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The description of the storage partition of a cookie. This object may be omitted (null) if a cookie is not partitioned.
      */
    trait PartitionKey extends StObject {
      
      /**
        * The first-party URL of the cookie, if the cookie is in storage partitioned by the top-level site.
        * Optional.
        */
      var topLevelSite: js.UndefOr[String] = js.undefined
    }
    object PartitionKey {
      
      inline def apply(): PartitionKey = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PartitionKey]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PartitionKey] (val x: Self) extends AnyVal {
        
        inline def setTopLevelSite(value: String): Self = StObject.set(x, "topLevelSite", value.asInstanceOf[js.Any])
        
        inline def setTopLevelSiteUndefined: Self = StObject.set(x, "topLevelSite", js.undefined)
      }
    }
    
    /**
      * Contains details about the cookie that's been removed.  If removal failed for any reason, this will be "null",
      * and $(ref:runtime.lastError) will be set.
      */
    trait RemoveCallbackDetailsType extends StObject {
      
      /**
        * The first-party domain associated with the cookie that's been removed.
        */
      var firstPartyDomain: String
      
      /**
        * The name of the cookie that's been removed.
        */
      var name: String
      
      /**
        * The storage partition, if the cookie is part of partitioned storage. null if not partitioned.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * The ID of the cookie store from which the cookie was removed.
        */
      var storeId: String
      
      /**
        * The URL associated with the cookie that's been removed.
        */
      var url: String
    }
    object RemoveCallbackDetailsType {
      
      inline def apply(firstPartyDomain: String, name: String, storeId: String, url: String): RemoveCallbackDetailsType = {
        val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoveCallbackDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RemoveCallbackDetailsType] (val x: Self) extends AnyVal {
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Information to identify the cookie to remove.
      */
    trait RemoveDetailsType extends StObject {
      
      /**
        * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is enabled.
        * Optional.
        */
      var firstPartyDomain: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the cookie to remove.
        */
      var name: String
      
      /**
        * The storage partition, if the cookie is part of partitioned storage. By default, non-partitioned storage is used.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in the current
        * execution context's cookie store.
        * Optional.
        */
      var storeId: js.UndefOr[String] = js.undefined
      
      /**
        * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file,
        * the API call will fail.
        */
      var url: String
    }
    object RemoveDetailsType {
      
      inline def apply(name: String, url: String): RemoveDetailsType = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoveDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RemoveDetailsType] (val x: Self) extends AnyVal {
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies).
      * 'no_restriction' corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax',
      * and 'strict' to 'SameSite=Strict'.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.no_restriction
      - typings.webextensionPolyfill.webextensionPolyfillStrings.lax
      - typings.webextensionPolyfill.webextensionPolyfillStrings.strict
    */
    trait SameSiteStatus extends StObject
    object SameSiteStatus {
      
      inline def lax: typings.webextensionPolyfill.webextensionPolyfillStrings.lax = "lax".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.lax]
      
      inline def no_restriction: typings.webextensionPolyfill.webextensionPolyfillStrings.no_restriction = "no_restriction".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.no_restriction]
      
      inline def strict: typings.webextensionPolyfill.webextensionPolyfillStrings.strict = "strict".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.strict]
    }
    
    /**
      * Details about the cookie being set.
      */
    trait SetDetailsType extends StObject {
      
      /**
        * The domain of the cookie. If omitted, the cookie becomes a host-only cookie.
        * Optional.
        */
      var domain: js.UndefOr[String] = js.undefined
      
      /**
        * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted,
        * the cookie becomes a session cookie.
        * Optional.
        */
      var expirationDate: js.UndefOr[Double] = js.undefined
      
      /**
        * The first-party domain of the cookie. This attribute is required if First-Party Isolation is enabled.
        * Optional.
        */
      var firstPartyDomain: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the cookie should be marked as HttpOnly. Defaults to false.
        * Optional.
        */
      var httpOnly: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The name of the cookie. Empty by default if omitted.
        * Optional.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The storage partition, if the cookie is part of partitioned storage. By default, non-partitioned storage is used.
        * Optional.
        */
      var partitionKey: js.UndefOr[PartitionKey] = js.undefined
      
      /**
        * The path of the cookie. Defaults to the path portion of the url parameter.
        * Optional.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * The cookie's same-site status.
        * Optional.
        */
      var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
      
      /**
        * Whether the cookie should be marked as Secure. Defaults to false.
        * Optional.
        */
      var secure: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's
        * cookie store.
        * Optional.
        */
      var storeId: js.UndefOr[String] = js.undefined
      
      /**
        * The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of
        * the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail.
        */
      var url: String
      
      /**
        * The value of the cookie. Empty by default if omitted.
        * Optional.
        */
      var value: js.UndefOr[String] = js.undefined
    }
    object SetDetailsType {
      
      inline def apply(url: String): SetDetailsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[SetDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SetDetailsType] (val x: Self) extends AnyVal {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
        
        inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
        
        inline def setFirstPartyDomain(value: String): Self = StObject.set(x, "firstPartyDomain", value.asInstanceOf[js.Any])
        
        inline def setFirstPartyDomainUndefined: Self = StObject.set(x, "firstPartyDomain", js.undefined)
        
        inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
        
        inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
        
        inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
        * the one with the longest path will be returned. For cookies with the same path length,
        * the cookie with the earliest creation time will be returned.
        *
        * @param details Details to identify the cookie being retrieved.
        */
      def get(details: GetDetailsType): js.Promise[Cookie | Null]
      
      /**
        * Retrieves all cookies from a single cookie store that match the given information.  The cookies returned will be sorted,
        * with those with the longest path first.  If multiple cookies have the same path length,
        * those with the earliest creation time will be first.
        *
        * @param details Information to filter the cookies being retrieved.
        */
      def getAll(details: GetAllDetailsType): js.Promise[js.Array[Cookie]]
      
      /**
        * Lists all existing cookie stores.
        */
      def getAllCookieStores(): js.Promise[js.Array[CookieStore]]
      
      /**
        * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is implemented as a
        * two step process: the cookie to be updated is first removed entirely, generating a notification with "cause" of
        * "overwrite" .  Afterwards, a new cookie is written with the updated values, generating a second notification with
        * "cause" "explicit".
        *
        * @param changeInfo
        */
      var onChanged: Event[js.Function1[/* changeInfo */ OnChangedChangeInfoType, Unit]]
      
      /**
        * Deletes a cookie by name.
        *
        * @param details Information to identify the cookie to remove.
        */
      def remove(details: RemoveDetailsType): js.Promise[RemoveCallbackDetailsType | Null]
      
      /**
        * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
        *
        * @param details Details about the cookie being set.
        */
      def set(details: SetDetailsType): js.Promise[Cookie]
    }
    object Static {
      
      inline def apply(
        get: GetDetailsType => js.Promise[Cookie | Null],
        getAll: GetAllDetailsType => js.Promise[js.Array[Cookie]],
        getAllCookieStores: () => js.Promise[js.Array[CookieStore]],
        onChanged: Event[js.Function1[/* changeInfo */ OnChangedChangeInfoType, Unit]],
        remove: RemoveDetailsType => js.Promise[RemoveCallbackDetailsType | Null],
        set: SetDetailsType => js.Promise[Cookie]
      ): Static = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), getAllCookieStores = js.Any.fromFunction0(getAllCookieStores), onChanged = onChanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setGet(value: GetDetailsType => js.Promise[Cookie | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setGetAll(value: GetAllDetailsType => js.Promise[js.Array[Cookie]]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
        
        inline def setGetAllCookieStores(value: () => js.Promise[js.Array[CookieStore]]): Self = StObject.set(x, "getAllCookieStores", js.Any.fromFunction0(value))
        
        inline def setOnChanged(value: Event[js.Function1[/* changeInfo */ OnChangedChangeInfoType, Unit]]): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
        
        inline def setRemove(value: RemoveDetailsType => js.Promise[RemoveCallbackDetailsType | Null]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setSet(value: SetDetailsType => js.Promise[Cookie]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
  }
}
