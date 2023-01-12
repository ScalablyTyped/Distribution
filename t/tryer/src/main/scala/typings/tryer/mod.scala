package typings.tryer

import org.scalablytyped.runtime.Shortcut
import typings.tryer.anon.ReadonlyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tryer", JSImport.Namespace)
  @js.native
  val ^ : TryerStatic = js.native
  
  trait Options extends StObject {
    
    /**
      * The function that you want to invoke.
      * If action returns a promise, iterations will not end until the promise is resolved or rejected.
      * Alternatively, action may take a callback argument, done, to signal that it is asynchronous. In that case, you are responsible for calling done when the action is finished.
      *
      * If action is not set, it defaults to an empty function.
      */
    var action: js.UndefOr[
        js.Function0[js.Promise[Any]] | (js.Function1[/* done */ js.Function0[Unit], Any])
      ] = js.undefined
    
    /**
      * fail: The error handler.
      * A function that will be called if limit falsey values are returned by when or until.
      * Defaults to an empty function.
      */
    var fail: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    /**
      * interval: The retry interval, in milliseconds.
      * A negative number indicates that each subsequent retry should wait for twice the interval from the preceding iteration (i.e. exponential backoff).
      * The default value is -1000, signifying that the initial retry interval should be one second and that each subsequent attempt should wait for double the length of the previous interval.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * limit: Failure limit, representing the maximum number of falsey returns from when or until that will be permitted before invocation is deemed to have failed.
      * A negative number indicates that the attempt should never fail, instead continuing for as long as when and until have returned truthy values.
      * Defaults to -1.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * pass: Success handler.
      * A function that will be called after until has returned truthily.
      * Defaults to an empty function.
      */
    var pass: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * until: A predicate that tests the post-condition for invoking action.
      * After until returns true (or a truthy value), action will no longer be called.
      * Defaults to a function that immediately returns true.
      */
    var until: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * when: A predicate that tests the pre-condition for invoking action.
      * Until when returns true (or a truthy value), action will not be called.
      * Defaults to a function that immediately returns true.
      */
    var when: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAction(value: js.Function0[js.Promise[Any]] | (js.Function1[/* done */ js.Function0[Unit], Any])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction0(value: () => js.Promise[Any]): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
      
      inline def setActionFunction1(value: /* done */ js.Function0[Unit] => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setFail(value: /* err */ js.Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPass(value: () => Unit): Self = StObject.set(x, "pass", js.Any.fromFunction0(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUntil(value: () => Boolean): Self = StObject.set(x, "until", js.Any.fromFunction0(value))
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      inline def setWhen(value: () => Boolean): Self = StObject.set(x, "when", js.Any.fromFunction0(value))
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  type TryerStatic = js.Function1[/* options */ ReadonlyOptions, Unit]
  
  type _To = TryerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TryerStatic = ^
}
