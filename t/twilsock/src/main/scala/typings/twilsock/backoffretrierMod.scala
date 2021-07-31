package typings.twilsock

import typings.node.eventsMod.EventEmitter
import typings.twilsock.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backoffretrierMod {
  
  /**
    * Retrier with backoff override capability
  */
  @JSImport("twilsock/lib/backoffretrier", "BackoffRetrier")
  @js.native
  class BackoffRetrier protected () extends EventEmitter {
    def this(options: Initial) = this()
    
    /**
      * Mark last emmited attempt as failed, initiating either next of fail if limits were hit.
      */
    def attemptFailed(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    var cleanRetrier: js.Any = js.native
    
    var createRetrier: js.Any = js.native
    
    var getRetryPolicy: js.Any = js.native
    
    def inProgress: Boolean = js.native
    
    /**
      * Modifies backoff for next attempt.
      * Expected behavior:
      * - If there was no backoff passed previously reschedulling next attempt to given backoff
      * - If previous backoff was longer then ignoring this one.
      * - If previous backoff was shorter then reschedulling with this one.
      * With or without backoff retrier will keep growing normally.
      * @param delay delay of next attempts in ms.
      */
    def modifyBackoff(delay: Double): Unit = js.native
    
    var newBackoff: js.Any = js.native
    
    val options: js.Any = js.native
    
    var retrier: js.Any = js.native
    
    /**
      * Should be called once per attempt series to start retrier.
      */
    def start(): Unit = js.native
    
    /**
      * Should be called to stop retrier entirely.
      */
    def stop(): Unit = js.native
    
    var usedBackoff: js.Any = js.native
  }
}
