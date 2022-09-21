package typings.tensorflowTfjsBackendWasm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateAllThreads extends StObject {
  
  // Terminates all webworkers
  def terminateAllThreads(): Unit
}
object TerminateAllThreads {
  
  inline def apply(terminateAllThreads: () => Unit): TerminateAllThreads = {
    val __obj = js.Dynamic.literal(terminateAllThreads = js.Any.fromFunction0(terminateAllThreads))
    __obj.asInstanceOf[TerminateAllThreads]
  }
  
  extension [Self <: TerminateAllThreads](x: Self) {
    
    inline def setTerminateAllThreads(value: () => Unit): Self = StObject.set(x, "terminateAllThreads", js.Any.fromFunction0(value))
  }
}
