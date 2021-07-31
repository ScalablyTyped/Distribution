package typings.webdriverio

import typings.node.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("webdriverio/build/utils/Timer", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Timer {
    def this(delay: js.Any, timeout: js.Any, fn: js.Any, leading: js.Any) = this()
  }
  
  @js.native
  trait Timer extends StObject {
    
    var _conditionExecutedCnt: Double = js.native
    
    var _delay: js.Any = js.native
    
    var _fn: js.Any = js.native
    
    var _leading: js.Any = js.native
    
    var _mainTimeoutId: js.UndefOr[Timeout] = js.native
    
    def _reject(): Unit = js.native
    def _reject(reason: js.Any): Unit = js.native
    
    def _resolve(): Unit = js.native
    def _resolve(value: js.Any): Unit = js.native
    
    var _start: js.UndefOr[Double] = js.native
    
    var _ticks: js.UndefOr[Double] = js.native
    
    var _timeout: js.Any = js.native
    
    var _timeoutId: js.UndefOr[Timeout | Null] = js.native
    
    def checkCondition(err: js.Any, res: js.Any): Unit = js.native
    
    def hasTime(delay: js.Any): Boolean = js.native
    
    var lastError: js.Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopMain(): Unit = js.native
    
    def tick(): Unit = js.native
    
    def wasConditionExecuted(): Boolean = js.native
  }
}
