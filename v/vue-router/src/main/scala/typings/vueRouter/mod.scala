package typings.vueRouter

import org.scalablytyped.runtime.TopLevel
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRouter.routerMod.RouterOptions
import typings.vueRouter.routerMod.VueRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object NavigationFailureType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vueRouter.routerMod.NavigationFailureType with Double] = js.native
    
    /* 4 */ val aborted: typings.vueRouter.routerMod.NavigationFailureType.aborted with Double = js.native
    
    /* 8 */ val cancelled: typings.vueRouter.routerMod.NavigationFailureType.cancelled with Double = js.native
    
    /* 16 */ val duplicated: typings.vueRouter.routerMod.NavigationFailureType.duplicated with Double = js.native
    
    /* 2 */ val redirected: typings.vueRouter.routerMod.NavigationFailureType.redirected with Double = js.native
  }
  
  @js.native
  class default () extends VueRouter {
    def this(options: RouterOptions) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var NavigationFailureType: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
      */ typings.vueRouter.vueRouterStrings.default with TopLevel[js.Any] = js.native
    
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
    @JSName("install")
    var install_Original: PluginFunction[scala.Nothing] = js.native
    
    def isNavigationFailure(error: js.Any): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
    def isNavigationFailure(error: js.Any, `type`: Double): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
    
    var version: String = js.native
  }
}
