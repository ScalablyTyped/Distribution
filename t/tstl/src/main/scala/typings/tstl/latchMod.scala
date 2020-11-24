package typings.tstl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/Latch", JSImport.Namespace)
@js.native
object latchMod extends js.Object {
  
  @js.native
  class Latch protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
    
    var _Try_wait: js.Any = js.native
    
    /**
      * Decrements the counter and waits until the counter to be zero.
      *
      * Decrements the counter by *n* and blocks the section until internal counter to be zero.
      *
      * If the parametric value *n* is equal to or greater than internal counter, so that the
      * internal counter be equal to or less than zero, everyone who are {@link wait waiting} for
      * the {@link Latch} would continue their execution including this one.
      *
      * @param n Value of the decrement. Default is 1.
      */
    def arrive_and_wait(): js.Promise[Unit] = js.native
    def arrive_and_wait(n: Double): js.Promise[Unit] = js.native
    
    var count_ : js.Any = js.native
    
    /**
      * Derecements the counter.
      *
      * Decrements the counter by *n* without blocking.
      *
      * If the parametric value *n* is equal to or greater than internal counter, so that the
      * internal counter be equal to or less than zero, everyone who are {@link wait waiting} for
      * the {@link Latch} would continue their execution.
      *
      * @param n Value of the decrement. Default is 1.
      */
    def count_down(): js.Promise[Unit] = js.native
    def count_down(n: Double): js.Promise[Unit] = js.native
    
    var cv_ : js.Any = js.native
    
    /**
      * Test whether the counter has been reached to the zero.
      *
      * The {@link try_wait} function tests whether the internal counter has been reached to the
      * zero.
      *
      * @return Whether reached to zero or not.
      */
    def try_wait(): js.Promise[Boolean] = js.native
    
    /**
      * Tries to wait until the counter to be zero in timeout.
      *
      * Attempts to block the function calling until internal counter to be reached to the zero
      * in timeout. If succeeded to waiting the counter to be reached to the zero, it returns
      * `true`. Otherwise, the {@link Latch} fails to reach to the zero in the given time, the
      * function gives up the waiting and returns `false`.
      *
      * If the {@link Latch} already has been reached to the zero, it would return `true` directly.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether succeeded to waiting in the given time.
      */
    def wait_for(ms: Double): js.Promise[Boolean] = js.native
    
    /**
      * Tries to wait until the counter to be zero in time expiration.
      *
      * Attempts to block the function calling until internal counter to be reached to the zero
      * in time expiration. If succeeded to waiting the counter to be reached to the zero, it
      * returns `true`. Otherwise, the {@link Latch} fails to reach to the zero in the given time,
      * the function gives up the waiting and returns `false`.
      *
      * If the {@link Latch} already has been reached to the zero, it would return `true` directly.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeeded to waiting in the given time.
      */
    def wait_until(at: Date): js.Promise[Boolean] = js.native
  }
}
