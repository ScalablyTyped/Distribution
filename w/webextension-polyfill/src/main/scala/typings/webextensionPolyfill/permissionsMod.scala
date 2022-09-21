package typings.webextensionPolyfill

import typings.webextensionPolyfill.eventsMod.Events.Event
import typings.webextensionPolyfill.manifestMod.Manifest.MatchPattern
import typings.webextensionPolyfill.manifestMod.Manifest.OptionalPermission
import typings.webextensionPolyfill.manifestMod.Manifest.Permission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsMod {
  
  object Permissions {
    
    trait AnyPermissions extends StObject {
      
      /**
        * Optional.
        */
      var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
      
      /**
        * Optional.
        */
      var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
    }
    object AnyPermissions {
      
      inline def apply(): AnyPermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnyPermissions]
      }
      
      extension [Self <: AnyPermissions](x: Self) {
        
        inline def setOrigins(value: js.Array[MatchPattern]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
        
        inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
        
        inline def setOriginsVarargs(value: MatchPattern*): Self = StObject.set(x, "origins", js.Array(value*))
        
        inline def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
      }
    }
    
    trait Permissions extends StObject {
      
      /**
        * Optional.
        */
      var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
      
      /**
        * Optional.
        */
      var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.undefined
    }
    object Permissions {
      
      inline def apply(): typings.webextensionPolyfill.permissionsMod.Permissions.Permissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.webextensionPolyfill.permissionsMod.Permissions.Permissions]
      }
      
      extension [Self <: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions](x: Self) {
        
        inline def setOrigins(value: js.Array[MatchPattern]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
        
        inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
        
        inline def setOriginsVarargs(value: MatchPattern*): Self = StObject.set(x, "origins", js.Array(value*))
        
        inline def setPermissions(value: js.Array[OptionalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: OptionalPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Check if the extension has the given permissions.
        *
        * @param permissions
        */
      def contains(permissions: AnyPermissions): js.Promise[Boolean]
      
      /**
        * Get a list of all the extension's permissions.
        */
      def getAll(): js.Promise[AnyPermissions]
      
      /**
        * Fired when the extension acquires new permissions.
        *
        * @param permissions
        */
      var onAdded: Event[
            js.Function1[
              /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
              Unit
            ]
          ]
      
      /**
        * Fired when permissions are removed from the extension.
        *
        * @param permissions
        */
      var onRemoved: Event[
            js.Function1[
              /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
              Unit
            ]
          ]
      
      /**
        * Relinquish the given permissions.
        *
        * @param permissions
        */
      def remove(permissions: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions): js.Promise[Boolean]
      
      /**
        * Request the given permissions.
        *
        * @param permissions
        */
      def request(permissions: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions): js.Promise[Boolean]
    }
    object Static {
      
      inline def apply(
        contains: AnyPermissions => js.Promise[Boolean],
        getAll: () => js.Promise[AnyPermissions],
        onAdded: Event[
              js.Function1[
                /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
                Unit
              ]
            ],
        onRemoved: Event[
              js.Function1[
                /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
                Unit
              ]
            ],
        remove: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions => js.Promise[Boolean],
        request: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions => js.Promise[Boolean]
      ): Static = {
        val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAll = js.Any.fromFunction0(getAll), onAdded = onAdded.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setContains(value: AnyPermissions => js.Promise[Boolean]): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
        
        inline def setGetAll(value: () => js.Promise[AnyPermissions]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
        
        inline def setOnAdded(
          value: Event[
                  js.Function1[
                    /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
                    Unit
                  ]
                ]
        ): Self = StObject.set(x, "onAdded", value.asInstanceOf[js.Any])
        
        inline def setOnRemoved(
          value: Event[
                  js.Function1[
                    /* permissions */ typings.webextensionPolyfill.permissionsMod.Permissions.Permissions, 
                    Unit
                  ]
                ]
        ): Self = StObject.set(x, "onRemoved", value.asInstanceOf[js.Any])
        
        inline def setRemove(value: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions => js.Promise[Boolean]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setRequest(value: typings.webextensionPolyfill.permissionsMod.Permissions.Permissions => js.Promise[Boolean]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      }
    }
  }
}
