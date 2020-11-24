package typings.tstl

import typings.std.Date
import typings.tstl.conditionVariableMod.ConditionVariable.Predicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/ConditionVariable", JSImport.Namespace)
@js.native
object conditionVariableMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable () extends js.Object {
    
    var _Wait: js.Any = js.native
    
    var _Wait_until: js.Any = js.native
    
    /**
      * Notify, wake all up.
      */
    def notify_all(): js.Promise[Unit] = js.native
    
    /**
      * Notify, wake only one up.
      */
    def notify_one(): js.Promise[Unit] = js.native
    
    var resolvers_ : js.Any = js.native
    
    /**
      * Wait until predicator returns true.
      *
      * This method is equivalent to:
      *
      ```typescript
      while (!await predicator())
      await this.wait();
      ```
      *
      * @param predicator A predicator function determines completion.
      */
    def wait(predicator: Predicator): js.Promise[Unit] = js.native
    
    /**
      * Wait for timeout or until notified.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether awaken by notification or timeout.
      */
    def wait_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * Wait until timeout or predicator returns true.
      *
      * This method is equivalent to:
      ```typescript
      const at: Date = new Date(Date.now() + ms);
      while (!await predicator())
      {
      if (!await this.wait_until(at))
      return await predicator();
      }
      return true;
      ```
      *
      * @param ms The maximum miliseconds for waiting.
      * @param predicator A predicator function determines the completion.
      * @return Returned value of the *predicator*.
      */
    def wait_for(ms: Double, predicator: Predicator): js.Promise[Boolean] = js.native
    
    /**
      * Wait until notified or time expiration.
      *
      * @param at The maximum time point to wait.
      * @return Whether awaken by notification or time expiration.
      */
    def wait_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * Wait until time expiration or predicator returns true.
      *
      * This method is equivalent to:
      ```typescript
      while (!await predicator())
      {
      if (!await this.wait_until(at))
      return await predicator();
      }
      return true;
      ```
      *
      * @param at The maximum time point to wait.
      * @param predicator A predicator function determines the completion.
      * @return Returned value of the *predicator*.
      */
    def wait_until(at: Date, predicator: Predicator): js.Promise[Boolean] = js.native
  }
  @js.native
  object ConditionVariable extends js.Object {
    
    /**
      * Type of predicator function who determines the completion.
      */
    type Predicator = js.Function0[Boolean | js.Promise[Boolean]]
  }
}
