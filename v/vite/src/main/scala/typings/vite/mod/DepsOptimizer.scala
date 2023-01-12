package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepsOptimizer extends StObject {
  
  def close(): js.Promise[Unit]
  
  def delayDepsOptimizerUntil(id: String, done: js.Function0[js.Promise[Any]]): Unit
  
  def ensureFirstRun(): Unit
  
  def getOptimizedDepId(depInfo: OptimizedDepInfo): String
  
  def isOptimizedDepFile(id: String): Boolean
  
  def isOptimizedDepUrl(url: String): Boolean
  
  var metadata: DepOptimizationMetadata
  
  var options: DepOptimizationOptions
  
  def registerMissingImport(id: String, resolved: String): OptimizedDepInfo
  
  def registerWorkersSource(id: String): Unit
  
  def resetRegisteredIds(): Unit
  
  def run(): Unit
  
  var scanProcessing: js.UndefOr[js.Promise[Unit]] = js.undefined
}
object DepsOptimizer {
  
  inline def apply(
    close: () => js.Promise[Unit],
    delayDepsOptimizerUntil: (String, js.Function0[js.Promise[Any]]) => Unit,
    ensureFirstRun: () => Unit,
    getOptimizedDepId: OptimizedDepInfo => String,
    isOptimizedDepFile: String => Boolean,
    isOptimizedDepUrl: String => Boolean,
    metadata: DepOptimizationMetadata,
    options: DepOptimizationOptions,
    registerMissingImport: (String, String) => OptimizedDepInfo,
    registerWorkersSource: String => Unit,
    resetRegisteredIds: () => Unit,
    run: () => Unit
  ): DepsOptimizer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), delayDepsOptimizerUntil = js.Any.fromFunction2(delayDepsOptimizerUntil), ensureFirstRun = js.Any.fromFunction0(ensureFirstRun), getOptimizedDepId = js.Any.fromFunction1(getOptimizedDepId), isOptimizedDepFile = js.Any.fromFunction1(isOptimizedDepFile), isOptimizedDepUrl = js.Any.fromFunction1(isOptimizedDepUrl), metadata = metadata.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], registerMissingImport = js.Any.fromFunction2(registerMissingImport), registerWorkersSource = js.Any.fromFunction1(registerWorkersSource), resetRegisteredIds = js.Any.fromFunction0(resetRegisteredIds), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[DepsOptimizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepsOptimizer] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDelayDepsOptimizerUntil(value: (String, js.Function0[js.Promise[Any]]) => Unit): Self = StObject.set(x, "delayDepsOptimizerUntil", js.Any.fromFunction2(value))
    
    inline def setEnsureFirstRun(value: () => Unit): Self = StObject.set(x, "ensureFirstRun", js.Any.fromFunction0(value))
    
    inline def setGetOptimizedDepId(value: OptimizedDepInfo => String): Self = StObject.set(x, "getOptimizedDepId", js.Any.fromFunction1(value))
    
    inline def setIsOptimizedDepFile(value: String => Boolean): Self = StObject.set(x, "isOptimizedDepFile", js.Any.fromFunction1(value))
    
    inline def setIsOptimizedDepUrl(value: String => Boolean): Self = StObject.set(x, "isOptimizedDepUrl", js.Any.fromFunction1(value))
    
    inline def setMetadata(value: DepOptimizationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DepOptimizationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegisterMissingImport(value: (String, String) => OptimizedDepInfo): Self = StObject.set(x, "registerMissingImport", js.Any.fromFunction2(value))
    
    inline def setRegisterWorkersSource(value: String => Unit): Self = StObject.set(x, "registerWorkersSource", js.Any.fromFunction1(value))
    
    inline def setResetRegisteredIds(value: () => Unit): Self = StObject.set(x, "resetRegisteredIds", js.Any.fromFunction0(value))
    
    inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    inline def setScanProcessing(value: js.Promise[Unit]): Self = StObject.set(x, "scanProcessing", value.asInstanceOf[js.Any])
    
    inline def setScanProcessingUndefined: Self = StObject.set(x, "scanProcessing", js.undefined)
  }
}
