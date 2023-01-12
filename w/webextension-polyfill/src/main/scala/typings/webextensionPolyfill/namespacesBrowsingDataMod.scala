package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.DateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesBrowsingDataMod {
  
  object BrowsingData {
    
    /**
      * A set of data types. Missing data types are interpreted as <code>false</code>.
      */
    trait DataTypeSet extends StObject {
      
      /**
        * The browser's cache. Note: when removing data, this clears the <em>entire</em> cache: it is not limited to the range you
        * specify.
        * Optional.
        */
      var cache: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The browser's cookies.
        * Optional.
        */
      var cookies: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The browser's download list.
        * Optional.
        */
      var downloads: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The browser's stored form data.
        * Optional.
        */
      var formData: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The browser's history.
        * Optional.
        */
      var history: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Websites' IndexedDB data.
        * Optional.
        */
      var indexedDB: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Websites' local storage data.
        * Optional.
        */
      var localStorage: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Stored passwords.
        * Optional.
        */
      var passwords: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Plugins' data.
        * Optional.
        */
      var pluginData: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Server-bound certificates.
        * Optional.
        */
      var serverBoundCertificates: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Service Workers.
        * Optional.
        */
      var serviceWorkers: js.UndefOr[Boolean] = js.undefined
    }
    object DataTypeSet {
      
      inline def apply(): DataTypeSet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataTypeSet]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DataTypeSet] (val x: Self) extends AnyVal {
        
        inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
        
        inline def setDownloads(value: Boolean): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
        
        inline def setDownloadsUndefined: Self = StObject.set(x, "downloads", js.undefined)
        
        inline def setFormData(value: Boolean): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
        
        inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
        
        inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
        
        inline def setIndexedDB(value: Boolean): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBUndefined: Self = StObject.set(x, "indexedDB", js.undefined)
        
        inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
        
        inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
        
        inline def setPasswords(value: Boolean): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
        
        inline def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
        
        inline def setPluginData(value: Boolean): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
        
        inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
        
        inline def setServerBoundCertificates(value: Boolean): Self = StObject.set(x, "serverBoundCertificates", value.asInstanceOf[js.Any])
        
        inline def setServerBoundCertificatesUndefined: Self = StObject.set(x, "serverBoundCertificates", js.undefined)
        
        inline def setServiceWorkers(value: Boolean): Self = StObject.set(x, "serviceWorkers", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkersUndefined: Self = StObject.set(x, "serviceWorkers", js.undefined)
      }
    }
    
    /**
      * Options that determine exactly what data will be removed.
      */
    trait RemovalOptions extends StObject {
      
      /**
        * Only remove data associated with this specific cookieStoreId.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * Only remove data associated with these hostnames (only applies to cookies and localStorage).
        * Optional.
        */
      var hostnames: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * An object whose properties specify which origin types ought to be cleared. If this object isn't specified,
        * it defaults to clearing only "unprotected" origins. Please ensure that you <em>really</em>
        * want to remove application data before adding 'protectedWeb' or 'extensions'.
        * Optional.
        */
      var originTypes: js.UndefOr[RemovalOptionsOriginTypesType] = js.undefined
      
      /**
        * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the <code>
        * getTime</code> method of the JavaScript <code>Date</code> object). If absent, defaults to 0 (which would remove all
        * browsing data).
        * Optional.
        */
      var since: js.UndefOr[DateType] = js.undefined
    }
    object RemovalOptions {
      
      inline def apply(): RemovalOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemovalOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RemovalOptions] (val x: Self) extends AnyVal {
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setHostnames(value: js.Array[String]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
        
        inline def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
        
        inline def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value*))
        
        inline def setOriginTypes(value: RemovalOptionsOriginTypesType): Self = StObject.set(x, "originTypes", value.asInstanceOf[js.Any])
        
        inline def setOriginTypesUndefined: Self = StObject.set(x, "originTypes", js.undefined)
        
        inline def setSince(value: DateType): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
        
        inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      }
    }
    
    /**
      * An object whose properties specify which origin types ought to be cleared. If this object isn't specified,
      * it defaults to clearing only "unprotected" origins. Please ensure that you <em>really</em>
      * want to remove application data before adding 'protectedWeb' or 'extensions'.
      */
    trait RemovalOptionsOriginTypesType extends StObject {
      
      /**
        * Extensions and packaged applications a user has installed (be _really_ careful!).
        * Optional.
        */
      var `extension`: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Websites that have been installed as hosted applications (be careful!).
        * Optional.
        */
      var protectedWeb: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Normal websites.
        * Optional.
        */
      var unprotectedWeb: js.UndefOr[Boolean] = js.undefined
    }
    object RemovalOptionsOriginTypesType {
      
      inline def apply(): RemovalOptionsOriginTypesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemovalOptionsOriginTypesType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RemovalOptionsOriginTypesType] (val x: Self) extends AnyVal {
        
        inline def setExtension(value: Boolean): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
        
        inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
        
        inline def setProtectedWeb(value: Boolean): Self = StObject.set(x, "protectedWeb", value.asInstanceOf[js.Any])
        
        inline def setProtectedWebUndefined: Self = StObject.set(x, "protectedWeb", js.undefined)
        
        inline def setUnprotectedWeb(value: Boolean): Self = StObject.set(x, "unprotectedWeb", value.asInstanceOf[js.Any])
        
        inline def setUnprotectedWebUndefined: Self = StObject.set(x, "unprotectedWeb", js.undefined)
      }
    }
    
    trait SettingsCallbackResultType extends StObject {
      
      /**
        * All of the types will be present in the result, with values of <code>true</code> if they are permitted to be removed (e.
        * g., by enterprise policy) and <code>false</code> if not.
        */
      var dataRemovalPermitted: DataTypeSet
      
      /**
        * All of the types will be present in the result, with values of <code>true</code> if they are both selected to be removed
        * and permitted to be removed, otherwise <code>false</code>.
        */
      var dataToRemove: DataTypeSet
      
      var options: RemovalOptions
    }
    object SettingsCallbackResultType {
      
      inline def apply(dataRemovalPermitted: DataTypeSet, dataToRemove: DataTypeSet, options: RemovalOptions): SettingsCallbackResultType = {
        val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[SettingsCallbackResultType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SettingsCallbackResultType] (val x: Self) extends AnyVal {
        
        inline def setDataRemovalPermitted(value: DataTypeSet): Self = StObject.set(x, "dataRemovalPermitted", value.asInstanceOf[js.Any])
        
        inline def setDataToRemove(value: DataTypeSet): Self = StObject.set(x, "dataToRemove", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: RemovalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Clears various types of browsing data stored in a user's profile.
        *
        * @param options
        * @param dataToRemove The set of data types to remove.
        * @returns Called when deletion has completed.
        */
      def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit]
      
      /**
        * Clears the browser's cache.
        *
        * @param options
        * @returns Called when the browser's cache has been cleared.
        */
      def removeCache(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears the browser's cookies and server-bound certificates modified within a particular timeframe.
        *
        * @param options
        * @returns Called when the browser's cookies and server-bound certificates have been cleared.
        */
      def removeCookies(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears the browser's list of downloaded files (<em>not</em> the downloaded files themselves).
        *
        * @param options
        * @returns Called when the browser's list of downloaded files has been cleared.
        */
      def removeDownloads(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears the browser's stored form data (autofill).
        *
        * @param options
        * @returns Called when the browser's form data has been cleared.
        */
      def removeFormData(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears the browser's history.
        *
        * @param options
        * @returns Called when the browser's history has cleared.
        */
      def removeHistory(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears websites' local storage data.
        *
        * @param options
        * @returns Called when websites' local storage has been cleared.
        */
      def removeLocalStorage(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears the browser's stored passwords.
        *
        * @param options
        * @returns Called when the browser's passwords have been cleared.
        */
      def removePasswords(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Clears plugins' data.
        *
        * @param options
        * @returns Called when plugins' data has been cleared.
        */
      def removePluginData(options: RemovalOptions): js.Promise[Unit]
      
      /**
        * Reports which types of data are currently selected in the 'Clear browsing data' settings UI.
        * Note: some of the data types included in this API are not available in the settings UI,
        * and some UI settings control more than one data type listed here.
        */
      def settings(): js.Promise[SettingsCallbackResultType]
    }
    object Static {
      
      inline def apply(
        remove: (RemovalOptions, DataTypeSet) => js.Promise[Unit],
        removeCache: RemovalOptions => js.Promise[Unit],
        removeCookies: RemovalOptions => js.Promise[Unit],
        removeDownloads: RemovalOptions => js.Promise[Unit],
        removeFormData: RemovalOptions => js.Promise[Unit],
        removeHistory: RemovalOptions => js.Promise[Unit],
        removeLocalStorage: RemovalOptions => js.Promise[Unit],
        removePasswords: RemovalOptions => js.Promise[Unit],
        removePluginData: RemovalOptions => js.Promise[Unit],
        settings: () => js.Promise[SettingsCallbackResultType]
      ): Static = {
        val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), removeCache = js.Any.fromFunction1(removeCache), removeCookies = js.Any.fromFunction1(removeCookies), removeDownloads = js.Any.fromFunction1(removeDownloads), removeFormData = js.Any.fromFunction1(removeFormData), removeHistory = js.Any.fromFunction1(removeHistory), removeLocalStorage = js.Any.fromFunction1(removeLocalStorage), removePasswords = js.Any.fromFunction1(removePasswords), removePluginData = js.Any.fromFunction1(removePluginData), settings = js.Any.fromFunction0(settings))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setRemove(value: (RemovalOptions, DataTypeSet) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
        
        inline def setRemoveCache(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeCache", js.Any.fromFunction1(value))
        
        inline def setRemoveCookies(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeCookies", js.Any.fromFunction1(value))
        
        inline def setRemoveDownloads(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeDownloads", js.Any.fromFunction1(value))
        
        inline def setRemoveFormData(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeFormData", js.Any.fromFunction1(value))
        
        inline def setRemoveHistory(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeHistory", js.Any.fromFunction1(value))
        
        inline def setRemoveLocalStorage(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removeLocalStorage", js.Any.fromFunction1(value))
        
        inline def setRemovePasswords(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removePasswords", js.Any.fromFunction1(value))
        
        inline def setRemovePluginData(value: RemovalOptions => js.Promise[Unit]): Self = StObject.set(x, "removePluginData", js.Any.fromFunction1(value))
        
        inline def setSettings(value: () => js.Promise[SettingsCallbackResultType]): Self = StObject.set(x, "settings", js.Any.fromFunction0(value))
      }
    }
  }
}
