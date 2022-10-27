package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOptimizationResult extends StObject {
  
  def cancel(): Unit
  
  /**
    * When doing a re-run, if there are newly discovered dependencies
    * the page reload will be delayed until the next rerun so we need
    * to be able to discard the result
    */
  def commit(): js.Promise[Unit]
  
  var metadata: DepOptimizationMetadata
}
object DepOptimizationResult {
  
  inline def apply(cancel: () => Unit, commit: () => js.Promise[Unit], metadata: DepOptimizationMetadata): DepOptimizationResult = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), commit = js.Any.fromFunction0(commit), metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepOptimizationResult]
  }
  
  extension [Self <: DepOptimizationResult](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setMetadata(value: DepOptimizationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
