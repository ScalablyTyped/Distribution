package typings.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PrivateClass: Strophe.TimedHandler
  *  _Private_ helper class for managing timed handlers.
  *
  *  A Strophe.TimedHandler encapsulates a user provided callback that
  *  should be called after a certain period of time or at regular
  *  intervals.  The return value of the callback determines whether the
  *  Strophe.TimedHandler will continue to fire.
  *
  *  Users will not use Strophe.TimedHandler objects directly, but instead
  *  they will use Strophe.Connection.addTimedHandler() and
  *  Strophe.Connection.deleteTimedHandler().
  */
@JSGlobal("Strophe.TimedHandler")
@js.native
open class TimedHandler protected () extends StObject {
  /** PrivateConstructor: Strophe.TimedHandler
    *  Create and initialize a new Strophe.TimedHandler object.
    *
    *  Parameters:
    *    @param period - The number of milliseconds to wait before the
    *      handler is called.
    *    @param handler - The callback to run when the handler fires.  This
    *      function should take no arguments.
    *
    *  Returns:
    *    @returns A new Strophe.TimedHandler object.
    */
  /* private */ def this(period: Double, handler: js.Function0[Boolean]) = this()
  
  /** PrivateFunction: reset
    *  Reset the last called time for the Strophe.TimedHandler.
    */
  /* private */ def reset(): Any = js.native
  
  /** PrivateFunction: run
    *  Run the callback for the Strophe.TimedHandler.
    *
    *  Returns:
    *   @returns true if the Strophe.TimedHandler should be called again, and false
    *      otherwise.
    */
  /* private */ def run(): Any = js.native
}
