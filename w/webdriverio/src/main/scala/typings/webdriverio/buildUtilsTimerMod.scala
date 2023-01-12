package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsTimerMod {
  
  @JSImport("webdriverio/build/utils/Timer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timer {
    def this(_delay: Double, _timeout: Double, _fn: js.Function) = this()
    def this(_delay: Double, _timeout: Double, _fn: js.Function, _leading: Boolean) = this()
    
    /* private */ /* CompleteClass */
    var _checkCondition: Any = js.native
    
    /* private */ /* CompleteClass */
    var _conditionExecutedCnt: Any = js.native
    
    /* private */ /* CompleteClass */
    var _delay: Any = js.native
    
    /* private */ /* CompleteClass */
    var _fn: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hasTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastError: Any = js.native
    
    /* private */ /* CompleteClass */
    var _leading: Any = js.native
    
    /* private */ /* CompleteClass */
    var _mainTimeoutId: Any = js.native
    
    /* private */ /* CompleteClass */
    var _reject: Any = js.native
    
    /* private */ /* CompleteClass */
    var _resolve: Any = js.native
    
    /* private */ /* CompleteClass */
    var _start: Any = js.native
    
    /* private */ /* CompleteClass */
    var _startTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var _stop: Any = js.native
    
    /* private */ /* CompleteClass */
    var _stopMain: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tick: Any = js.native
    
    /* private */ /* CompleteClass */
    var _ticks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _timeout: Any = js.native
    
    /* private */ /* CompleteClass */
    var _timeoutId: Any = js.native
    
    /* private */ /* CompleteClass */
    var _wasConditionExecuted: Any = js.native
  }
  
  trait Timer extends StObject {
    
    /* private */ var _checkCondition: Any
    
    /* private */ var _conditionExecutedCnt: Any
    
    /* private */ var _delay: Any
    
    /* private */ var _fn: Any
    
    /* private */ var _hasTime: Any
    
    /* private */ var _lastError: Any
    
    /* private */ var _leading: Any
    
    /* private */ var _mainTimeoutId: Any
    
    /* private */ var _reject: Any
    
    /* private */ var _resolve: Any
    
    /* private */ var _start: Any
    
    /* private */ var _startTime: Any
    
    /* private */ var _stop: Any
    
    /* private */ var _stopMain: Any
    
    /* private */ var _tick: Any
    
    /* private */ var _ticks: Any
    
    /* private */ var _timeout: Any
    
    /* private */ var _timeoutId: Any
    
    /* private */ var _wasConditionExecuted: Any
  }
  object Timer {
    
    inline def apply(
      _checkCondition: Any,
      _conditionExecutedCnt: Any,
      _delay: Any,
      _fn: Any,
      _hasTime: Any,
      _lastError: Any,
      _leading: Any,
      _mainTimeoutId: Any,
      _reject: Any,
      _resolve: Any,
      _start: Any,
      _startTime: Any,
      _stop: Any,
      _stopMain: Any,
      _tick: Any,
      _ticks: Any,
      _timeout: Any,
      _timeoutId: Any,
      _wasConditionExecuted: Any
    ): Timer = {
      val __obj = js.Dynamic.literal(_checkCondition = _checkCondition.asInstanceOf[js.Any], _conditionExecutedCnt = _conditionExecutedCnt.asInstanceOf[js.Any], _delay = _delay.asInstanceOf[js.Any], _fn = _fn.asInstanceOf[js.Any], _hasTime = _hasTime.asInstanceOf[js.Any], _lastError = _lastError.asInstanceOf[js.Any], _leading = _leading.asInstanceOf[js.Any], _mainTimeoutId = _mainTimeoutId.asInstanceOf[js.Any], _reject = _reject.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _startTime = _startTime.asInstanceOf[js.Any], _stop = _stop.asInstanceOf[js.Any], _stopMain = _stopMain.asInstanceOf[js.Any], _tick = _tick.asInstanceOf[js.Any], _ticks = _ticks.asInstanceOf[js.Any], _timeout = _timeout.asInstanceOf[js.Any], _timeoutId = _timeoutId.asInstanceOf[js.Any], _wasConditionExecuted = _wasConditionExecuted.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def set_checkCondition(value: Any): Self = StObject.set(x, "_checkCondition", value.asInstanceOf[js.Any])
      
      inline def set_conditionExecutedCnt(value: Any): Self = StObject.set(x, "_conditionExecutedCnt", value.asInstanceOf[js.Any])
      
      inline def set_delay(value: Any): Self = StObject.set(x, "_delay", value.asInstanceOf[js.Any])
      
      inline def set_fn(value: Any): Self = StObject.set(x, "_fn", value.asInstanceOf[js.Any])
      
      inline def set_hasTime(value: Any): Self = StObject.set(x, "_hasTime", value.asInstanceOf[js.Any])
      
      inline def set_lastError(value: Any): Self = StObject.set(x, "_lastError", value.asInstanceOf[js.Any])
      
      inline def set_leading(value: Any): Self = StObject.set(x, "_leading", value.asInstanceOf[js.Any])
      
      inline def set_mainTimeoutId(value: Any): Self = StObject.set(x, "_mainTimeoutId", value.asInstanceOf[js.Any])
      
      inline def set_reject(value: Any): Self = StObject.set(x, "_reject", value.asInstanceOf[js.Any])
      
      inline def set_resolve(value: Any): Self = StObject.set(x, "_resolve", value.asInstanceOf[js.Any])
      
      inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
      
      inline def set_startTime(value: Any): Self = StObject.set(x, "_startTime", value.asInstanceOf[js.Any])
      
      inline def set_stop(value: Any): Self = StObject.set(x, "_stop", value.asInstanceOf[js.Any])
      
      inline def set_stopMain(value: Any): Self = StObject.set(x, "_stopMain", value.asInstanceOf[js.Any])
      
      inline def set_tick(value: Any): Self = StObject.set(x, "_tick", value.asInstanceOf[js.Any])
      
      inline def set_ticks(value: Any): Self = StObject.set(x, "_ticks", value.asInstanceOf[js.Any])
      
      inline def set_timeout(value: Any): Self = StObject.set(x, "_timeout", value.asInstanceOf[js.Any])
      
      inline def set_timeoutId(value: Any): Self = StObject.set(x, "_timeoutId", value.asInstanceOf[js.Any])
      
      inline def set_wasConditionExecuted(value: Any): Self = StObject.set(x, "_wasConditionExecuted", value.asInstanceOf[js.Any])
    }
  }
}
