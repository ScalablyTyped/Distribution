package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteRecordBase
  extends StObject
     with PathParserOptions {
  
  /**
    * Aliases for the record. Allows defining extra paths that will behave like a
    * copy of the record. Allows having paths shorthands like `/users/:id` and
    * `/u/:id`. All `alias` and `path` values must share the same params.
    */
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Before Enter guard specific to this record. Note `beforeEnter` has no
    * effect if the record has a `redirect` property.
    */
  var beforeEnter: js.UndefOr[NavigationGuardWithThis[Unit] | js.Array[NavigationGuardWithThis[Unit]]] = js.undefined
  
  /**
    * Array of nested routes.
    */
  var children: js.UndefOr[js.Array[RouteRecordRaw]] = js.undefined
  
  /**
    * Arbitrary data attached to the record.
    */
  var meta: js.UndefOr[RouteMeta] = js.undefined
  
  /**
    * Name for the route record.
    */
  var name: js.UndefOr[RouteRecordName] = js.undefined
  
  /**
    * Path of the record. Should start with `/` unless the record is the child of
    * another record.
    *
    * @example `/users/:id` matches `/users/1` as well as `/users/posva`.
    */
  var path: String
  
  /**
    * Allow passing down params as props to the component rendered by `router-view`.
    */
  var props: js.UndefOr[RouteRecordProps | (Record[String, RouteRecordProps])] = js.undefined
  
  /**
    * Where to redirect if the route is directly matched. The redirection happens
    * before any navigation guard and triggers a new navigation with the new
    * target location.
    */
  var redirect: js.UndefOr[RouteRecordRedirectOption] = js.undefined
}
object RouteRecordBase {
  
  inline def apply(path: String): RouteRecordBase = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteRecordBase] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setBeforeEnter(value: NavigationGuardWithThis[Unit] | js.Array[NavigationGuardWithThis[Unit]]): Self = StObject.set(x, "beforeEnter", value.asInstanceOf[js.Any])
    
    inline def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    inline def setBeforeEnterVarargs(value: NavigationGuardWithThis[Unit]*): Self = StObject.set(x, "beforeEnter", js.Array(value*))
    
    inline def setChildren(value: js.Array[RouteRecordRaw]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: RouteRecordRaw*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setMeta(value: RouteMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProps(value: RouteRecordProps | (Record[String, RouteRecordProps])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsFunction1(value: /* to */ RouteLocationNormalized => Record[String, Any]): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setRedirect(value: RouteRecordRedirectOption): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectFunction1(value: /* to */ RouteLocation => RouteLocationRaw): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
