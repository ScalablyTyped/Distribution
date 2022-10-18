package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesContextualIdentitiesMod {
  
  object ContextualIdentities {
    
    /**
      * Represents information about a contextual identity.
      */
    trait ContextualIdentity extends StObject {
      
      /**
        * The color name of the contextual identity.
        */
      var color: String
      
      /**
        * The color hash of the contextual identity.
        */
      var colorCode: String
      
      /**
        * The cookie store ID of the contextual identity.
        */
      var cookieStoreId: String
      
      /**
        * The icon name of the contextual identity.
        */
      var icon: String
      
      /**
        * The icon url of the contextual identity.
        */
      var iconUrl: String
      
      /**
        * The name of the contextual identity.
        */
      var name: String
    }
    object ContextualIdentity {
      
      inline def apply(
        color: String,
        colorCode: String,
        cookieStoreId: String,
        icon: String,
        iconUrl: String,
        name: String
      ): ContextualIdentity = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorCode = colorCode.asInstanceOf[js.Any], cookieStoreId = cookieStoreId.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ContextualIdentity]
      }
      
      extension [Self <: ContextualIdentity](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorCode(value: String): Self = StObject.set(x, "colorCode", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Details about the contextual identity being created.
      */
    trait CreateDetailsType extends StObject {
      
      /**
        * The color of the contextual identity.
        */
      var color: String
      
      /**
        * The icon of the contextual identity.
        */
      var icon: String
      
      /**
        * The name of the contextual identity.
        */
      var name: String
    }
    object CreateDetailsType {
      
      inline def apply(color: String, icon: String, name: String): CreateDetailsType = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateDetailsType]
      }
      
      extension [Self <: CreateDetailsType](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait OnCreatedChangeInfoType extends StObject {
      
      /**
        * Contextual identity that has been created
        */
      var contextualIdentity: ContextualIdentity
    }
    object OnCreatedChangeInfoType {
      
      inline def apply(contextualIdentity: ContextualIdentity): OnCreatedChangeInfoType = {
        val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnCreatedChangeInfoType]
      }
      
      extension [Self <: OnCreatedChangeInfoType](x: Self) {
        
        inline def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
      }
    }
    
    trait OnRemovedChangeInfoType extends StObject {
      
      /**
        * Contextual identity that has been removed
        */
      var contextualIdentity: ContextualIdentity
    }
    object OnRemovedChangeInfoType {
      
      inline def apply(contextualIdentity: ContextualIdentity): OnRemovedChangeInfoType = {
        val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnRemovedChangeInfoType]
      }
      
      extension [Self <: OnRemovedChangeInfoType](x: Self) {
        
        inline def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
      }
    }
    
    trait OnUpdatedChangeInfoType extends StObject {
      
      /**
        * Contextual identity that has been updated
        */
      var contextualIdentity: ContextualIdentity
    }
    object OnUpdatedChangeInfoType {
      
      inline def apply(contextualIdentity: ContextualIdentity): OnUpdatedChangeInfoType = {
        val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnUpdatedChangeInfoType]
      }
      
      extension [Self <: OnUpdatedChangeInfoType](x: Self) {
        
        inline def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Information to filter the contextual identities being retrieved.
      */
    trait QueryDetailsType extends StObject {
      
      /**
        * Filters the contextual identity by name.
        * Optional.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object QueryDetailsType {
      
      inline def apply(): QueryDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryDetailsType]
      }
      
      extension [Self <: QueryDetailsType](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Creates a contextual identity with the given data.
        *
        * @param details Details about the contextual identity being created.
        */
      def create(details: CreateDetailsType): js.Promise[ContextualIdentity]
      
      /**
        * Retrieves information about a single contextual identity.
        *
        * @param cookieStoreId The ID of the contextual identity cookie store.
        */
      def get(cookieStoreId: String): js.Promise[ContextualIdentity]
      
      /**
        * Fired when a new container is created.
        *
        * @param changeInfo
        */
      var onCreated: Event[js.Function1[/* changeInfo */ OnCreatedChangeInfoType, Unit]]
      
      /**
        * Fired when a container is removed.
        *
        * @param changeInfo
        */
      var onRemoved: Event[js.Function1[/* changeInfo */ OnRemovedChangeInfoType, Unit]]
      
      /**
        * Fired when a container is updated.
        *
        * @param changeInfo
        */
      var onUpdated: Event[js.Function1[/* changeInfo */ OnUpdatedChangeInfoType, Unit]]
      
      /**
        * Retrieves all contextual identities
        *
        * @param details Information to filter the contextual identities being retrieved.
        */
      def query(details: QueryDetailsType): js.Promise[js.Array[ContextualIdentity]]
      
      /**
        * Deletes a contetual identity by its cookie Store ID.
        *
        * @param cookieStoreId The ID of the contextual identity cookie store.
        */
      def remove(cookieStoreId: String): js.Promise[ContextualIdentity]
      
      /**
        * Updates a contextual identity with the given data.
        *
        * @param cookieStoreId The ID of the contextual identity cookie store.
        * @param details Details about the contextual identity being created.
        */
      def update(cookieStoreId: String, details: UpdateDetailsType): js.Promise[ContextualIdentity]
    }
    object Static {
      
      inline def apply(
        create: CreateDetailsType => js.Promise[ContextualIdentity],
        get: String => js.Promise[ContextualIdentity],
        onCreated: Event[js.Function1[/* changeInfo */ OnCreatedChangeInfoType, Unit]],
        onRemoved: Event[js.Function1[/* changeInfo */ OnRemovedChangeInfoType, Unit]],
        onUpdated: Event[js.Function1[/* changeInfo */ OnUpdatedChangeInfoType, Unit]],
        query: QueryDetailsType => js.Promise[js.Array[ContextualIdentity]],
        remove: String => js.Promise[ContextualIdentity],
        update: (String, UpdateDetailsType) => js.Promise[ContextualIdentity]
      ): Static = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], onUpdated = onUpdated.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setCreate(value: CreateDetailsType => js.Promise[ContextualIdentity]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setGet(value: String => js.Promise[ContextualIdentity]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setOnCreated(value: Event[js.Function1[/* changeInfo */ OnCreatedChangeInfoType, Unit]]): Self = StObject.set(x, "onCreated", value.asInstanceOf[js.Any])
        
        inline def setOnRemoved(value: Event[js.Function1[/* changeInfo */ OnRemovedChangeInfoType, Unit]]): Self = StObject.set(x, "onRemoved", value.asInstanceOf[js.Any])
        
        inline def setOnUpdated(value: Event[js.Function1[/* changeInfo */ OnUpdatedChangeInfoType, Unit]]): Self = StObject.set(x, "onUpdated", value.asInstanceOf[js.Any])
        
        inline def setQuery(value: QueryDetailsType => js.Promise[js.Array[ContextualIdentity]]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
        
        inline def setRemove(value: String => js.Promise[ContextualIdentity]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setUpdate(value: (String, UpdateDetailsType) => js.Promise[ContextualIdentity]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * Details about the contextual identity being created.
      */
    trait UpdateDetailsType extends StObject {
      
      /**
        * The color of the contextual identity.
        * Optional.
        */
      var color: js.UndefOr[String] = js.undefined
      
      /**
        * The icon of the contextual identity.
        * Optional.
        */
      var icon: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the contextual identity.
        * Optional.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object UpdateDetailsType {
      
      inline def apply(): UpdateDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDetailsType]
      }
      
      extension [Self <: UpdateDetailsType](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
