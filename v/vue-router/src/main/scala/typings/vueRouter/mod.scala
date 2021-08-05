package typings.vueRouter

import org.scalablytyped.runtime.TopLevel
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRouter.routerMod.RouterOptions
import typings.vueRouter.routerMod.VueRouter
import typings.vueRouter.vueRouterStrings.NavigationFailureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-router", JSImport.Default)
  @js.native
  class default () extends VueRouter {
    def this(options: RouterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("vue-router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vue-router", "default.NavigationFailureType")
    @js.native
    def NavigationFailureType: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
      */ typings.vueRouter.vueRouterStrings.NavigationFailureType & TopLevel[js.Any] = js.native
    inline def NavigationFailureType_=(
      x: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
      */ NavigationFailureType & TopLevel[js.Any]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationFailureType")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-router", "default.install")
    @js.native
    def install: PluginFunction[scala.Nothing] = js.native
    inline def install(Vue: VueConstructor[Vue]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def install_=(x: PluginFunction[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
    
    inline def isNavigationFailure(error: js.Any): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any]).asInstanceOf[/* is vue-router.vue-router/types/router.NavigationFailure */ Boolean]
    inline def isNavigationFailure(error: js.Any, `type`: Double): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is vue-router.vue-router/types/router.NavigationFailure */ Boolean]
    
    @JSImport("vue-router", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vue-router", "NavigationFailureType")
  @js.native
  object NavigationFailureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vueRouter.routerMod.NavigationFailureType & Double] = js.native
    
    /* 4 */ val aborted: typings.vueRouter.routerMod.NavigationFailureType.aborted & Double = js.native
    
    /* 8 */ val cancelled: typings.vueRouter.routerMod.NavigationFailureType.cancelled & Double = js.native
    
    /* 16 */ val duplicated: typings.vueRouter.routerMod.NavigationFailureType.duplicated & Double = js.native
    
    /* 2 */ val redirected: typings.vueRouter.routerMod.NavigationFailureType.redirected & Double = js.native
  }
}
