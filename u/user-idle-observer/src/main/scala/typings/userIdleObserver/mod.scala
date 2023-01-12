package typings.userIdleObserver

import typings.userIdleObserver.userIdleObserverStrings.DOMContentLoaded
import typings.userIdleObserver.userIdleObserverStrings.devicemotion
import typings.userIdleObserver.userIdleObserverStrings.deviceorientation
import typings.userIdleObserver.userIdleObserverStrings.gamepadconnected
import typings.userIdleObserver.userIdleObserverStrings.gamepaddisconnected
import typings.userIdleObserver.userIdleObserverStrings.orientationchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This lib allows you to track user inactivity time.
    */
  inline def apply(): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[UserIDLEObserver]
  inline def apply(opts: Options): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[UserIDLEObserver]
  
  @JSImport("user-idle-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* time */ Double, Unit]
  
  /**
    * observer options
    */
  trait Options extends StObject {
    
    /**
      * callback that will triger after opts.idleTime of user's IDLE
      * @default console.log
      */
    var cb: js.UndefOr[Callback] = js.undefined
    
    /**
      * fire callback on user inactivity time in ms
      * @default 3_000
      */
    var idleTime: js.UndefOr[Double] = js.undefined
    
    /**
      * @default ["mousemove", "mousedown", "keydown", "scroll", "touchstart", "resize", "visibilitychange"]
      */
    var listeners: js.UndefOr[
        js.Array[
          DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCb(value: /* time */ Double => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      inline def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeUndefined: Self = StObject.set(x, "idleTime", js.undefined)
      
      inline def setListeners(
        value: js.Array[
              DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange
            ]
      ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setListenersVarargs(
        value: (DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange)*
      ): Self = StObject.set(x, "listeners", js.Array(value*))
    }
  }
  
  trait UserIDLEObserver extends StObject {
    
    /**
      * destroy observer instance
      */
    def destroy(): Unit
  }
  object UserIDLEObserver {
    
    inline def apply(destroy: () => Unit): UserIDLEObserver = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[UserIDLEObserver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserIDLEObserver] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
