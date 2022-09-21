package typings.twilioOperationRetrier

import typings.node.eventsMod.EventEmitter
import typings.twilioOperationRetrier.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Run retrier as an async function with possibility to await for it.
    * Example:
    * ```
    * const result = AsyncRetrier.run(async () => somePromise);
    * ```
    */
  @JSImport("@twilio/operation-retrier", "AsyncRetrier")
  @js.native
  open class AsyncRetrier protected () extends EventEmitter {
    def this(options: Initial) = this()
    
    def cancel(): Unit = js.native
    
    /* private */ var reject: Any = js.native
    
    // This any must be T typed directly on the AsyncRetrier
    // eslint-disable-next-line
    /* private */ var resolve: Any = js.native
    
    /* private */ var retrier: Any = js.native
    
    def run[T](handler: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  }
  
  @JSImport("@twilio/operation-retrier", "Backoff")
  @js.native
  open class Backoff protected () extends EventEmitter {
    def this(options: BackoffOptions) = this()
    
    def backoff(): Unit = js.native
    def backoff(err: js.Error): Unit = js.native
    
    /* private */ var backoffDelay: Any = js.native
    
    /* private */ var backoffNumber: Any = js.native
    
    /* private */ val factor: Any = js.native
    
    def failAfter(maxNumberOfRetry: Double): Unit = js.native
    
    /* private */ val initialDelay: Any = js.native
    
    /* private */ val maxDelay: Any = js.native
    
    /* private */ var maxNumberOfRetry: Any = js.native
    
    def next(): Double = js.native
    
    /* private */ var nextBackoffDelay: Any = js.native
    
    def onBackoff(): Unit = js.native
    
    /* private */ val randomisationFactor: Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var timeoutID: Any = js.native
  }
  object Backoff {
    
    @JSImport("@twilio/operation-retrier", "Backoff")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def exponential(options: BackoffOptions): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(options.asInstanceOf[js.Any]).asInstanceOf[Backoff]
  }
  
  /**
    * Provides retrier service
    */
  @JSImport("@twilio/operation-retrier", "Retrier")
  @js.native
  open class Retrier protected () extends EventEmitter {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
    
    /* private */ var attempt: Any = js.native
    
    /* private */ var attemptNum: Any = js.native
    
    def cancel(): Unit = js.native
    
    /* private */ var cleanup: Any = js.native
    
    /* private */ var currDelay: Any = js.native
    
    def failed(err: js.Error): Unit = js.native
    def failed(err: js.Error, nextAttemptDelayOverride: Double): Unit = js.native
    
    /* private */ var inProgress: Any = js.native
    
    /* private */ val initialDelay: Any = js.native
    
    /* private */ val maxAttemptsCount: Any = js.native
    
    /* private */ val maxAttemptsTime: Any = js.native
    
    /* private */ var maxDelay: Any = js.native
    
    /* private */ val minDelay: Any = js.native
    
    /* private */ var nextDelay: Any = js.native
    
    // fibonacci strategy
    /* private */ var prevDelay: Any = js.native
    
    /* private */ var randomize: Any = js.native
    
    /* private */ val randomness: Any = js.native
    
    /* private */ var scheduleAttempt: Any = js.native
    
    def start(): Unit = js.native
    
    /* private */ var startTimestamp: Any = js.native
    
    // @todo Must be a T here, so the entire Retrier must be typed on this value type.
    // eslint-disable-next-line
    def succeeded(): Unit = js.native
    def succeeded(arg: Any): Unit = js.native
    
    /* private */ var timeout: Any = js.native
  }
  
  trait BackoffOptions extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var randomisationFactor: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    inline def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    extension [Self <: BackoffOptions](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setRandomisationFactor(value: Double): Self = StObject.set(x, "randomisationFactor", value.asInstanceOf[js.Any])
      
      inline def setRandomisationFactorUndefined: Self = StObject.set(x, "randomisationFactor", js.undefined)
    }
  }
}
