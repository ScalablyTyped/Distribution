package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Singleton", JSImport.Namespace)
@js.native
object singletonMod extends js.Object {
  @js.native
  class Singleton[T] protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * Create a new `Singleton` instance with the *lazy consturctor*.
      *
      * @param lazyConstructor Lazy constructor function returning the promised value.
      */
    def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
    /**
      * @hidden
      */
    var lazy_constructor: js.Any = js.native
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    /**
      * @hidden
      */
    var value_ : js.Any = js.native
    /**
      * Get promised value.
      *
      * `Singleton.get()` method returns the *lazy constructed value*. It guarantees the *lazy
      * constructor* to be called *"only one at time"*. It ensures the *"only one at time"*, even
      * in the race condition.
      *
      * If the promised value is not constructed yet (call this method at the first time), the
      * *lazy constructor* would be called and returns the promised value. Otherwise, the promised
      * value has been already constructed by the *lazy constructor* (this method already had been
      * called), returns the pre-generated value.
      *
      * Also, you don't need to worry anything even race condition has been occured, calling
      * `Singleton.get()` simultaneously when the *lazy construction* is not completed but on
      * going. The `Singleton` guarantees the *lazy constructor* to be called only one at time by
      * using the *unique-lock* on a *mutex*.
      *
      * @return The *lazy constructed* value.
      */
    def get(): js.Promise[T] = js.native
    /**
      * Reload value.
      *
      * The `Singleton.reload()` method enforces to call the *lazy constructor*, regardless of
      * whether the *lazy construction* has been completed or not. Therefore, even if the *lazy
      * construction* has been completed in sometime, the `Singleton.reload()` will call the *lazy
      * constructor* again.
      *
      * However, unlike {@link Singleton.get}(), `Singleton.reload()` does not ensure the safety
      * in the race condition. Therefore, you've to be careful by yourself when using this
      * `Singleton.reload()` method. Try not to call this method simultaneously.
      *
      * @return Re-constructed value.
      */
    def reload(): js.Promise[T] = js.native
  }
  
}

