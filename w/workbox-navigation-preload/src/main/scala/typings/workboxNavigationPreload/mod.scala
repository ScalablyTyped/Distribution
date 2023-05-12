package typings.workboxNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-navigation-preload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If the browser supports Navigation Preload, then this will disable it.
    *
    * @memberof workbox-navigation-preload
    */
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  /**
    * If the browser supports Navigation Preload, then this will enable it.
    *
    * @param {string} [headerValue] Optionally, allows developers to
    * [override](https://developers.google.com/web/updates/2017/02/navigation-preload#changing_the_header)
    * the value of the `Service-Worker-Navigation-Preload` header which will be
    * sent to the server when making the navigation request.
    *
    * @memberof workbox-navigation-preload
    */
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(headerValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(headerValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @return {boolean} Whether or not the current browser supports enabling
    * navigation preload.
    *
    * @memberof workbox-navigation-preload
    */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  trait NavigationPreloadManager extends StObject {
    
    def disable(): js.Promise[Unit]
    
    def enable(): js.Promise[Unit]
    
    def getState(): js.Promise[NavigationPreloadState]
    
    def setHeaderValue(value: String): js.Promise[Unit]
  }
  object NavigationPreloadManager {
    
    inline def apply(
      disable: () => js.Promise[Unit],
      enable: () => js.Promise[Unit],
      getState: () => js.Promise[NavigationPreloadState],
      setHeaderValue: String => js.Promise[Unit]
    ): NavigationPreloadManager = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
      __obj.asInstanceOf[NavigationPreloadManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationPreloadManager] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => js.Promise[NavigationPreloadState]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSetHeaderValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
    }
  }
  
  trait NavigationPreloadState extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var headerValue: js.UndefOr[String] = js.undefined
  }
  object NavigationPreloadState {
    
    inline def apply(): NavigationPreloadState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationPreloadState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationPreloadState] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
      
      inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
    }
  }
  
  object global {
    
    trait ServiceWorkerRegistration extends StObject {
      
      val navigationPreload: NavigationPreloadManager
    }
    object ServiceWorkerRegistration {
      
      inline def apply(navigationPreload: NavigationPreloadManager): ServiceWorkerRegistration = {
        val __obj = js.Dynamic.literal(navigationPreload = navigationPreload.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceWorkerRegistration]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
        
        inline def setNavigationPreload(value: NavigationPreloadManager): Self = StObject.set(x, "navigationPreload", value.asInstanceOf[js.Any])
      }
    }
  }
}
