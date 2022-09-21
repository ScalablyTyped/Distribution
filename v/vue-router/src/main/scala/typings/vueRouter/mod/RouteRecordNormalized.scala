package typings.vueRouter.mod

import typings.std.Exclude
import typings.std.Record
import typings.std.Set
import typings.vueRouter.vueRouterBooleans.`false`
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteRecordNormalized extends StObject {
  
  /**
    * Defines if this record is the alias of another one. This property is
    * `undefined` if the record is the original one.
    */
  var aliasOf: js.UndefOr[RouteRecordNormalized] = js.undefined
  
  /**
    * Registered beforeEnter guards
    */
  var beforeEnter: js.UndefOr[NavigationGuardWithThis[Unit] | js.Array[NavigationGuardWithThis[Unit]]] = js.undefined
  
  /**
    * Nested route records.
    */
  var children: js.Array[RouteRecordRaw]
  
  /**
    * {@inheritDoc RouteRecordMultipleViews.components}
    */
  var components: js.UndefOr[(Record[String, RawRouteComponent]) | Null] = js.undefined
  
  /**
    * Registered beforeRouteEnter callbacks passed to `next` or returned in guards
    *
    * @internal
    */
  var enterCallbacks: Record[String, js.Array[NavigationGuardNextCallback]]
  
  /**
    * Mounted route component instances
    * Having the instances on the record mean beforeRouteUpdate and
    * beforeRouteLeave guards can only be invoked with the latest mounted app
    * instance if there are multiple application instances rendering the same
    * view, basically duplicating the content on the page, which shouldn't happen
    * in practice. It will work if multiple apps are rendering different named
    * views.
    */
  var instances: Record[
    String, 
    js.UndefOr[
      (ComponentPublicInstance[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        `false`, 
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
      ]) | Null
    ]
  ]
  
  /**
    * Registered leave guards
    *
    * @internal
    */
  var leaveGuards: Set[NavigationGuard]
  
  /**
    * {@inheritDoc _RouteRecordBase.meta}
    */
  var meta: Exclude[js.UndefOr[RouteMeta], Unit]
  
  /**
    * {@inheritDoc _RouteRecordBase.name}
    */
  var name: js.UndefOr[RouteRecordName] = js.undefined
  
  /**
    * {@inheritDoc _RouteRecordBase.path}
    */
  var path: String
  
  /**
    * {@inheritDoc RouteRecordMultipleViews.props}
    */
  var props: Record[String, RouteRecordProps]
  
  /**
    * {@inheritDoc _RouteRecordBase.redirect}
    */
  var redirect: js.UndefOr[RouteRecordRedirectOption] = js.undefined
  
  /**
    * Registered update guards
    *
    * @internal
    */
  var updateGuards: Set[NavigationGuard]
}
object RouteRecordNormalized {
  
  inline def apply(
    children: js.Array[RouteRecordRaw],
    enterCallbacks: Record[String, js.Array[NavigationGuardNextCallback]],
    instances: Record[
      String, 
      js.UndefOr[
        (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null
      ]
    ],
    leaveGuards: Set[NavigationGuard],
    path: String,
    props: Record[String, RouteRecordProps],
    updateGuards: Set[NavigationGuard]
  ): RouteRecordNormalized = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], enterCallbacks = enterCallbacks.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], leaveGuards = leaveGuards.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], updateGuards = updateGuards.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordNormalized]
  }
  
  extension [Self <: RouteRecordNormalized](x: Self) {
    
    inline def setAliasOf(value: RouteRecordNormalized): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
    
    inline def setAliasOfUndefined: Self = StObject.set(x, "aliasOf", js.undefined)
    
    inline def setBeforeEnter(value: NavigationGuardWithThis[Unit] | js.Array[NavigationGuardWithThis[Unit]]): Self = StObject.set(x, "beforeEnter", value.asInstanceOf[js.Any])
    
    inline def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    inline def setBeforeEnterVarargs(value: NavigationGuardWithThis[Unit]*): Self = StObject.set(x, "beforeEnter", js.Array(value*))
    
    inline def setChildren(value: js.Array[RouteRecordRaw]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: RouteRecordRaw*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComponents(value: Record[String, RawRouteComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsNull: Self = StObject.set(x, "components", null)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setEnterCallbacks(value: Record[String, js.Array[NavigationGuardNextCallback]]): Self = StObject.set(x, "enterCallbacks", value.asInstanceOf[js.Any])
    
    inline def setInstances(
      value: Record[
          String, 
          js.UndefOr[
            (ComponentPublicInstance[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              `false`, 
              ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setLeaveGuards(value: Set[NavigationGuard]): Self = StObject.set(x, "leaveGuards", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Exclude[js.UndefOr[RouteMeta], Unit]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, RouteRecordProps]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: RouteRecordRedirectOption): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectFunction1(value: /* to */ RouteLocation => RouteLocationRaw): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setUpdateGuards(value: Set[NavigationGuard]): Self = StObject.set(x, "updateGuards", value.asInstanceOf[js.Any])
  }
}
