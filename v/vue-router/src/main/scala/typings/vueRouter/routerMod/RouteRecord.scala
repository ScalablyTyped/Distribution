package typings.vueRouter.routerMod

import typings.std.RegExp
import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteRecord extends StObject {
  
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, Unit], 
      /* next */ js.Function0[Unit], 
      _
    ]
  ] = js.native
  
  var components: Dictionary[Component] = js.native
  
  var instances: Dictionary[Vue] = js.native
  
  var matchAs: js.UndefOr[String] = js.native
  
  var meta: js.Any = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[RouteRecord] = js.native
  
  var path: String = js.native
  
  var props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]) = js.native
  
  var redirect: js.UndefOr[RedirectOption] = js.native
  
  var regex: RegExp = js.native
}
object RouteRecord {
  
  @scala.inline
  def apply(
    components: Dictionary[Component],
    instances: Dictionary[Vue],
    meta: js.Any,
    path: String,
    props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]),
    regex: RegExp
  ): RouteRecord = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
  
  @scala.inline
  implicit class RouteRecordMutableBuilder[Self <: RouteRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeEnter(
      value: (/* route */ Route, /* redirect */ js.Function1[/* location */ RawLocation, Unit], /* next */ js.Function0[Unit]) => _
    ): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    @scala.inline
    def setComponents(value: Dictionary[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: Dictionary[Vue]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAs(value: String): Self = StObject.set(x, "matchAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAsUndefined: Self = StObject.set(x, "matchAs", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: RouteRecord): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(
      value: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction])
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsFunction1(value: /* route */ Route => js.Object): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedirect(value: RedirectOption): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectFunction1(value: /* to */ Route => RawLocation): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
