package typings.throttleDebounce

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait debounce[T /* <: js.Function1[/* repeated */ Any, Any] */]
    extends NoReturn[T]
       with Cancel {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* args */ Parameters[T]): Unit = js.native
  }
  object debounce {
    
    @JSImport("throttle-debounce", "debounce")
    @js.native
    def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](delay: Double, callback: T): debounce[T] = js.native
    @JSImport("throttle-debounce", "debounce")
    @js.native
    def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](delay: Double, callback: T, options: DebounceOptions): debounce[T] = js.native
  }
  
  @js.native
  trait throttle[T /* <: js.Function1[/* repeated */ Any, Any] */]
    extends NoReturn[T]
       with Cancel {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* args */ Parameters[T]): Unit = js.native
  }
  object throttle {
    
    @JSImport("throttle-debounce", "throttle")
    @js.native
    def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](delay: Double, callback: T): throttle[T] = js.native
    @JSImport("throttle-debounce", "throttle")
    @js.native
    def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](delay: Double, callback: T, options: ThrottleOptions): throttle[T] = js.native
  }
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(options: CancelOptions): Unit = js.native
  }
  
  trait CancelOptions extends StObject {
    
    var upcomingOnly: js.UndefOr[Boolean] = js.undefined
  }
  object CancelOptions {
    
    inline def apply(): CancelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelOptions] (val x: Self) extends AnyVal {
      
      inline def setUpcomingOnly(value: Boolean): Self = StObject.set(x, "upcomingOnly", value.asInstanceOf[js.Any])
      
      inline def setUpcomingOnlyUndefined: Self = StObject.set(x, "upcomingOnly", js.undefined)
    }
  }
  
  trait DebounceOptions extends StObject {
    
    var atBegin: js.UndefOr[Boolean] = js.undefined
  }
  object DebounceOptions {
    
    inline def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      inline def setAtBegin(value: Boolean): Self = StObject.set(x, "atBegin", value.asInstanceOf[js.Any])
      
      inline def setAtBeginUndefined: Self = StObject.set(x, "atBegin", js.undefined)
    }
  }
  
  type NoReturn[T /* <: js.Function1[/* repeated */ Any, Any] */] = js.Function1[/* args */ Parameters[T], Unit]
  
  trait ThrottleOptions extends StObject {
    
    var debounceMode: js.UndefOr[Boolean] = js.undefined
    
    var noLeading: js.UndefOr[Boolean] = js.undefined
    
    var noTrailing: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleOptions {
    
    inline def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
      
      inline def setDebounceMode(value: Boolean): Self = StObject.set(x, "debounceMode", value.asInstanceOf[js.Any])
      
      inline def setDebounceModeUndefined: Self = StObject.set(x, "debounceMode", js.undefined)
      
      inline def setNoLeading(value: Boolean): Self = StObject.set(x, "noLeading", value.asInstanceOf[js.Any])
      
      inline def setNoLeadingUndefined: Self = StObject.set(x, "noLeading", js.undefined)
      
      inline def setNoTrailing(value: Boolean): Self = StObject.set(x, "noTrailing", value.asInstanceOf[js.Any])
      
      inline def setNoTrailingUndefined: Self = StObject.set(x, "noTrailing", js.undefined)
    }
  }
}
