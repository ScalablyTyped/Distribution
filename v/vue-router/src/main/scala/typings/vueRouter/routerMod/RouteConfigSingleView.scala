package typings.vueRouter.routerMod

import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.EsModuleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteConfigSingleView
  extends RouteConfigBase
     with RouteConfig {
  
  var component: js.UndefOr[Component] = js.native
  
  var props: js.UndefOr[Boolean | js.Object | RoutePropsFunction] = js.native
}
object RouteConfigSingleView {
  
  @scala.inline
  def apply(path: String): RouteConfigSingleView = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigSingleView]
  }
  
  @scala.inline
  implicit class RouteConfigSingleViewOps[Self <: RouteConfigSingleView] (val x: Self) extends AnyVal {
    
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
    def setComponentFunction2(
      value: (/* resolve */ js.Function1[
          /* component */ typings.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ], 
          Unit
        ], /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => (js.Promise[
          (typings.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | EsModuleComponent
        ]) | Unit
    ): Self = this.set("component", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComponentFunction0(
      value: () => typings.vue.anon.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
    ): Self = this.set("component", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponent(value: Component): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setPropsFunction1(value: /* route */ Route => js.Object): Self = this.set("props", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProps(value: Boolean | js.Object | RoutePropsFunction): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
