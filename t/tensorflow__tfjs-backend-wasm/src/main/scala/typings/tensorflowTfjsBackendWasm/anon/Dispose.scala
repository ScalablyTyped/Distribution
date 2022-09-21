package typings.tensorflowTfjsBackendWasm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  // Disposes the backend and all of its associated data.
  def dispose(): Unit
  
  // Disposes the data behind the data bucket.
  def disposeData(id: Double): Unit
  
  def getThreadsCount(): Double
  
  def init(): Unit
  
  def initWithThreadsCount(threadsCount: Double): Unit
  
  def registerTensor(id: Double, size: Double, memoryOffset: Double): Unit
}
object Dispose {
  
  inline def apply(
    dispose: () => Unit,
    disposeData: Double => Unit,
    getThreadsCount: () => Double,
    init: () => Unit,
    initWithThreadsCount: Double => Unit,
    registerTensor: (Double, Double, Double) => Unit
  ): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeData = js.Any.fromFunction1(disposeData), getThreadsCount = js.Any.fromFunction0(getThreadsCount), init = js.Any.fromFunction0(init), initWithThreadsCount = js.Any.fromFunction1(initWithThreadsCount), registerTensor = js.Any.fromFunction3(registerTensor))
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeData(value: Double => Unit): Self = StObject.set(x, "disposeData", js.Any.fromFunction1(value))
    
    inline def setGetThreadsCount(value: () => Double): Self = StObject.set(x, "getThreadsCount", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitWithThreadsCount(value: Double => Unit): Self = StObject.set(x, "initWithThreadsCount", js.Any.fromFunction1(value))
    
    inline def setRegisterTensor(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "registerTensor", js.Any.fromFunction3(value))
  }
}
