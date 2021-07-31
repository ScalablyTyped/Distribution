package typings.twilioSync

import typings.twilioSync.subscriptionsMod.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("twilio-sync/lib/interfaces/services", "Router")
  @js.native
  class Router protected ()
    extends typings.twilioSync.routerMod.Router {
    def this(params: js.Any) = this()
  }
  
  /**
    * @alias Twilsock
    * @classdesc Client library for the Twilsock service
    * It allows to recevie service-generated updates as well as bi-directional transport
    * @fires Twilsock#message
    * @fires Twilsock#connected
    * @fires Twilsock#disconnected
    * @fires Twilsock#tokenAboutToExpire
    * @fires Twilsock#stateChanged
    * @fires Twilsock#connectionError
    */
  @JSImport("twilio-sync/lib/interfaces/services", "Twilsock")
  @js.native
  class Twilsock protected ()
    extends typings.twilsock.mod.Twilsock {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
  }
  
  trait Configuration extends StObject {
    
    var backoffConfig: js.Any
    
    var documentsUri: String
    
    var insightsUri: String
    
    var listsUri: String
    
    var mapsUri: String
    
    var sessionStorageEnabled: Boolean
    
    var streamsUri: String
    
    var subscriptionsUri: String
  }
  object Configuration {
    
    @scala.inline
    def apply(
      backoffConfig: js.Any,
      documentsUri: String,
      insightsUri: String,
      listsUri: String,
      mapsUri: String,
      sessionStorageEnabled: Boolean,
      streamsUri: String,
      subscriptionsUri: String
    ): Configuration = {
      val __obj = js.Dynamic.literal(backoffConfig = backoffConfig.asInstanceOf[js.Any], documentsUri = documentsUri.asInstanceOf[js.Any], insightsUri = insightsUri.asInstanceOf[js.Any], listsUri = listsUri.asInstanceOf[js.Any], mapsUri = mapsUri.asInstanceOf[js.Any], sessionStorageEnabled = sessionStorageEnabled.asInstanceOf[js.Any], streamsUri = streamsUri.asInstanceOf[js.Any], subscriptionsUri = subscriptionsUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffConfig(value: js.Any): Self = StObject.set(x, "backoffConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentsUri(value: String): Self = StObject.set(x, "documentsUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsightsUri(value: String): Self = StObject.set(x, "insightsUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListsUri(value: String): Self = StObject.set(x, "listsUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapsUri(value: String): Self = StObject.set(x, "mapsUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionStorageEnabled(value: Boolean): Self = StObject.set(x, "sessionStorageEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUri(value: String): Self = StObject.set(x, "streamsUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionsUri(value: String): Self = StObject.set(x, "subscriptionsUri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Network extends StObject {
    
    def delete(uri: String): js.Any = js.native
    
    def get(uri: String): js.Any = js.native
    
    def post(uri: String, body: js.Object): js.Any = js.native
    def post(uri: String, body: js.Object, revision: String): js.Any = js.native
    def post(uri: String, body: js.Object, revision: String, retryWhenThrottled: Boolean): js.Any = js.native
    def post(uri: String, body: js.Object, revision: Unit, retryWhenThrottled: Boolean): js.Any = js.native
    
    def put(uri: String, body: js.Object, revision: String): js.Any = js.native
  }
  
  trait Notifications extends StObject {
    
    var connectionState: js.Any
    
    def updateToken(token: String): js.Promise[Notifications]
  }
  object Notifications {
    
    @scala.inline
    def apply(connectionState: js.Any, updateToken: String => js.Promise[Notifications]): Notifications = {
      val __obj = js.Dynamic.literal(connectionState = connectionState.asInstanceOf[js.Any], updateToken = js.Any.fromFunction1(updateToken))
      __obj.asInstanceOf[Notifications]
    }
    
    @scala.inline
    implicit class NotificationsMutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionState(value: js.Any): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateToken(value: String => js.Promise[Notifications]): Self = StObject.set(x, "updateToken", js.Any.fromFunction1(value))
    }
  }
  
  trait Services extends StObject {
    
    var config: Configuration
    
    var network: Network
    
    var notifications: Notifications
    
    var router: typings.twilioSync.routerMod.Router
    
    var storage: Storage
    
    var subscriptions: Subscriptions
    
    var twilsock: typings.twilsock.mod.Twilsock
  }
  object Services {
    
    @scala.inline
    def apply(
      config: Configuration,
      network: Network,
      notifications: Notifications,
      router: typings.twilioSync.routerMod.Router,
      storage: Storage,
      subscriptions: Subscriptions,
      twilsock: typings.twilsock.mod.Twilsock
    ): Services = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], twilsock = twilsock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Services]
    }
    
    @scala.inline
    implicit class ServicesMutableBuilder[Self <: Services] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifications(value: Notifications): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: typings.twilioSync.routerMod.Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwilsock(value: typings.twilsock.mod.Twilsock): Self = StObject.set(x, "twilsock", value.asInstanceOf[js.Any])
    }
  }
  
  trait Storage extends StObject {
    
    def read(`type`: String, id: String): js.Object
    
    def remove(`type`: String, sid: String, uniqueName: String): js.Any
    
    def store(`type`: String, id: String, value: js.Object): js.Any
    
    def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any
    
    def updateStorageId(storageId: String): js.Any
  }
  object Storage {
    
    @scala.inline
    def apply(
      read: (String, String) => js.Object,
      remove: (String, String, String) => js.Any,
      store: (String, String, js.Object) => js.Any,
      update: (String, String, String, js.Object) => js.Any,
      updateStorageId: String => js.Any
    ): Storage = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
      __obj.asInstanceOf[Storage]
    }
    
    @scala.inline
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: (String, String) => js.Object): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: (String, String, String) => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStore(value: (String, String, js.Object) => js.Any): Self = StObject.set(x, "store", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdate(value: (String, String, String, js.Object) => js.Any): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateStorageId(value: String => js.Any): Self = StObject.set(x, "updateStorageId", js.Any.fromFunction1(value))
    }
  }
}
