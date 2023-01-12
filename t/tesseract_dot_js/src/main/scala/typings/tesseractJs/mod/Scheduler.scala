package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheduler extends StObject {
  
  def addJob(action: String, args: Any*): js.Promise[ConfigResult | RecognizeResult | DetectResult]
  
  def addWorker(worker: Worker): String
  
  def getNumWorkers(): Double
  
  def getQueueLen(): Double
  
  def terminate(): js.Promise[Any]
}
object Scheduler {
  
  inline def apply(
    addJob: (String, /* repeated */ Any) => js.Promise[ConfigResult | RecognizeResult | DetectResult],
    addWorker: Worker => String,
    getNumWorkers: () => Double,
    getQueueLen: () => Double,
    terminate: () => js.Promise[Any]
  ): Scheduler = {
    val __obj = js.Dynamic.literal(addJob = js.Any.fromFunction2(addJob), addWorker = js.Any.fromFunction1(addWorker), getNumWorkers = js.Any.fromFunction0(getNumWorkers), getQueueLen = js.Any.fromFunction0(getQueueLen), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Scheduler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scheduler] (val x: Self) extends AnyVal {
    
    inline def setAddJob(value: (String, /* repeated */ Any) => js.Promise[ConfigResult | RecognizeResult | DetectResult]): Self = StObject.set(x, "addJob", js.Any.fromFunction2(value))
    
    inline def setAddWorker(value: Worker => String): Self = StObject.set(x, "addWorker", js.Any.fromFunction1(value))
    
    inline def setGetNumWorkers(value: () => Double): Self = StObject.set(x, "getNumWorkers", js.Any.fromFunction0(value))
    
    inline def setGetQueueLen(value: () => Double): Self = StObject.set(x, "getQueueLen", js.Any.fromFunction0(value))
    
    inline def setTerminate(value: () => js.Promise[Any]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
