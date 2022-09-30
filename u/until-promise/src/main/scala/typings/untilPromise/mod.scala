package typings.untilPromise

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("until-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Executes executionFunction until conditionFunction returns true or retries or timeout are reached.
    * @param executionFunction The function to execute. First successful result will be returned.
    * @param conditionFunction The function to check for a successful poll.
    * @param options The options that modify the polling behaviour.
    */
  inline def default[ReturnType](executionFunction: ExecutionFunction[ReturnType], conditionFunction: ConditionFunction[ReturnType]): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(executionFunction.asInstanceOf[js.Any], conditionFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ReturnType](
    executionFunction: ExecutionFunction[ReturnType],
    conditionFunction: ConditionFunction[ReturnType],
    options: Options
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(executionFunction.asInstanceOf[js.Any], conditionFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  
  /**
    * The type of the condition function.
    * Returns TRUE if the condition is met. This will result in the polling loop to end.
    * RETURNS FALSE if the condition is not met. This will result in the polling loop to end immediately, only if the
    * maximum amount of attempts is reached. Polling will still end if other failure conditions are met.
    */
  type ConditionFunction[InputType] = js.Function1[/* inputObject */ InputType, Boolean]
  
  trait ErrorParameters extends StObject {
    
    var capturedResults: Any
    
    var errorType: Any
    
    var nbAttempts: Any
    
    var reject: Any
    
    var startedAt: Any
  }
  object ErrorParameters {
    
    inline def apply(capturedResults: Any, errorType: Any, nbAttempts: Any, reject: Any, startedAt: Any): ErrorParameters = {
      val __obj = js.Dynamic.literal(capturedResults = capturedResults.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], nbAttempts = nbAttempts.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorParameters]
    }
    
    extension [Self <: ErrorParameters](x: Self) {
      
      inline def setCapturedResults(value: Any): Self = StObject.set(x, "capturedResults", value.asInstanceOf[js.Any])
      
      inline def setErrorType(value: Any): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setNbAttempts(value: Any): Self = StObject.set(x, "nbAttempts", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      inline def setStartedAt(value: Any): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    }
  }
  
  type ExecutionFunction[ReturnType] = js.Function0[js.Promise[ReturnType] | ReturnType]
  
  /**
    * Optional settings that modify the polling behaviour and control the failure modes.
    */
  trait Options extends StObject {
    
    /**
      * The Promise library to use. Defaults to global.Promise.
      */
    var Promise: js.UndefOr[PromiseLike[Any]] = js.undefined
    
    /**
      * If not falsy and > 0, until will capture the last X results and pass them to onError. Defaults to 0.
      */
    var captureResults: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum duration in MS before rejecting. Defaults to Infinity.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The error handler to use. Defaults to
      * let err = new Error(`condition not satisfied after ${Date.now() - startedAt}ms / nbAttempts: ${nbAttempts}`);
      * // note that you can attach properties to error if needed. For example:
      * err.duration = Date.now() - startedAt;
      * Object.assign(err, { nbAttempts, errorType, startedAt, capturedResults, options });
      * reject(err);
      */
    var onError: js.UndefOr[errorCallback] = js.undefined
    
    /**
      * The amount of time the execution function should be called. If this amount is exhausted, polling will fail.
      * Defaults to Infinity.
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in MS to wait in between calling the execution function. Defaults to 0.
      */
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCaptureResults(value: Double): Self = StObject.set(x, "captureResults", value.asInstanceOf[js.Any])
      
      inline def setCaptureResultsUndefined: Self = StObject.set(x, "captureResults", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnError(value: (/* errorParam */ ErrorParameters, /* options */ Options) => scala.Nothing): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setPromise(value: PromiseLike[Any]): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  type errorCallback = js.Function2[/* errorParam */ ErrorParameters, /* options */ Options, scala.Nothing]
}
