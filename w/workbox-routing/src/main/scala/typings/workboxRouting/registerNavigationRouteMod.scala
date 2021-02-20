package typings.workboxRouting

import typings.workboxRouting.navigationRouteMod.NavigationRoute
import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerNavigationRouteMod {
  
  @JSImport("workbox-routing/registerNavigationRoute", "registerNavigationRoute")
  @js.native
  def registerNavigationRoute(cachedAssetUrl: String): NavigationRoute = js.native
  @JSImport("workbox-routing/registerNavigationRoute", "registerNavigationRoute")
  @js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): NavigationRoute = js.native
  
  @js.native
  trait RegisterNavigationRouteOptions extends NavigationRouteOptions {
    
    var cacheName: js.UndefOr[String] = js.native
  }
  object RegisterNavigationRouteOptions {
    
    @scala.inline
    def apply(): RegisterNavigationRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterNavigationRouteOptions]
    }
    
    @scala.inline
    implicit class RegisterNavigationRouteOptionsMutableBuilder[Self <: RegisterNavigationRouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
    }
  }
}
