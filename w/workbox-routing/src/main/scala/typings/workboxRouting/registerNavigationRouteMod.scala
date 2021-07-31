package typings.workboxRouting

import typings.workboxRouting.navigationRouteMod.NavigationRoute
import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerNavigationRouteMod {
  
  @JSImport("workbox-routing/registerNavigationRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerNavigationRoute(cachedAssetUrl: String): NavigationRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any]).asInstanceOf[NavigationRoute]
  @scala.inline
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): NavigationRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NavigationRoute]
  
  trait RegisterNavigationRouteOptions
    extends StObject
       with NavigationRouteOptions {
    
    var cacheName: js.UndefOr[String] = js.undefined
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
