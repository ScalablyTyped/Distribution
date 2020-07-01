package typings.tstl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Barrier", JSImport.Namespace)
@js.native
object barrierMod extends js.Object {
  @js.native
  class Barrier protected () extends js.Object {
    /**
      * Initializer Constructor
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
    var count_ : js.Any = js.native
    var cv_ : js.Any = js.native
    var size_ : js.Any = js.native
    /**
      * Derecements the counter.
      *
      * Decrements the counter by *n* without blocking.
      *
      * If the parametric value *n* is equal to or greater than internal counter, so that the
      * internal counter be equal to or less than zero, everyone who are {@link wait waiting} for
      * the {@link Latch} would continue their executions.
      *
      * @param n Value of the decrement. Default is 1.
      */
    def arrive(): js.Promise[Unit] = js.native
    def arrive(n: Double): js.Promise[Unit] = js.native
    /**
      * Decrements the counter and initial size at the same time.
      *
      * Decrements not only internal counter, but also initialize size of the counter at the same
      * time. If the remained counter be zero by the decrement, everyone who are
      * {@link wait waiting} for the {@link Barrier} would continue their executions.
      */
    def arrive_and_drop(): js.Promise[Unit] = js.native
    /**
      * Decrements the counter and waits until the counter to be zero.
      *
      * Decrements the counter by one and blocks the section until internal counter to be zero.
      *
      * If the the remained counter be zero by this decrement, everyone who are
      * {@link wait waiting} for the {@link Barrier} would continue their executions including
      * this one.
      *
      * @param n Value of the decrement. Default is 1.
      */
    def arrive_and_wait(): js.Promise[Unit] = js.native
    /**
      * Tries to wait until the counter to be zero in timeout.
      *
      * Attempts to block the function calling until internal counter to be reached to the zero
      * in timeout. If succeeded to waiting the counter to be reached to the zero, it returns
      * `true`. Otherwise, the {@link Barrier} fails to reach to the zero in the given time, the
      * function gives up the waiting and returns `false`.
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
      * returns `true`. Otherwise, the {@link Barrier} fails to reach to the zero in the given
      * time, the function gives up the waiting and returns `false`.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeeded to waiting in the given time.
      */
    def wait_until(at: Date): js.Promise[Boolean] = js.native
  }
  
}

