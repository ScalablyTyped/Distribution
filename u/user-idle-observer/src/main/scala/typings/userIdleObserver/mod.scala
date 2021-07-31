package typings.userIdleObserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This lib allows you to track user inactivity time.
    */
  @scala.inline
  def apply(): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[UserIDLEObserver]
  @scala.inline
  def apply(opts: Options): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[UserIDLEObserver]
  
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
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any
        ]
      ] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCb(value: /* time */ Double => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      @scala.inline
      def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeUndefined: Self = StObject.set(x, "idleTime", js.undefined)
      
      @scala.inline
      def setListeners(
        value: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any
            ]
      ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setListenersVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any)*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    }
  }
  
  trait UserIDLEObserver extends StObject {
    
    /**
      * destroy observer instance
      */
    def destroy(): Unit
  }
  object UserIDLEObserver {
    
    @scala.inline
    def apply(destroy: () => Unit): UserIDLEObserver = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[UserIDLEObserver]
    }
    
    @scala.inline
    implicit class UserIDLEObserverMutableBuilder[Self <: UserIDLEObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
