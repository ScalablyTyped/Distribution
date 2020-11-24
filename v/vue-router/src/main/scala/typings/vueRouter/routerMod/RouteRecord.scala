package typings.vueRouter.routerMod

import typings.std.RegExp
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteRecord extends js.Object {
  
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
  implicit class RouteRecordOps[Self <: RouteRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponents(value: Dictionary[Component]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: Dictionary[Vue]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsFunction1(value: /* route */ Route => js.Object): Self = this.set("props", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProps(
      value: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction])
    ): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeEnter(
      value: (/* route */ Route, /* redirect */ js.Function1[/* location */ RawLocation, Unit], /* next */ js.Function0[Unit]) => _
    ): Self = this.set("beforeEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeEnter: Self = this.set("beforeEnter", js.undefined)
    
    @scala.inline
    def setMatchAs(value: String): Self = this.set("matchAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchAs: Self = this.set("matchAs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: RouteRecord): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRedirectFunction1(value: /* to */ Route => RawLocation): Self = this.set("redirect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedirect(value: RedirectOption): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
}
