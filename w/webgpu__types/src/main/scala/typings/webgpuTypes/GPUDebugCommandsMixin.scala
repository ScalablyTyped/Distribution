package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDebugCommandsMixin extends StObject {
  
  /**
    * Marks a point in a stream of commands with a label.
    * @param markerLabel - The label to insert.
    */
  def insertDebugMarker(markerLabel: String): Unit
  
  /**
    * Ends the labeled debug group most recently started by {@link GPUDebugCommandsMixin#pushDebugGroup}.
    */
  def popDebugGroup(): Unit
  
  /**
    * Begins a labeled debug group containing subsequent commands.
    * @param groupLabel - The label for the command group.
    */
  def pushDebugGroup(groupLabel: String): Unit
}
object GPUDebugCommandsMixin {
  
  inline def apply(insertDebugMarker: String => Unit, popDebugGroup: () => Unit, pushDebugGroup: String => Unit): GPUDebugCommandsMixin = {
    val __obj = js.Dynamic.literal(insertDebugMarker = js.Any.fromFunction1(insertDebugMarker), popDebugGroup = js.Any.fromFunction0(popDebugGroup), pushDebugGroup = js.Any.fromFunction1(pushDebugGroup))
    __obj.asInstanceOf[GPUDebugCommandsMixin]
  }
  
  extension [Self <: GPUDebugCommandsMixin](x: Self) {
    
    inline def setInsertDebugMarker(value: String => Unit): Self = StObject.set(x, "insertDebugMarker", js.Any.fromFunction1(value))
    
    inline def setPopDebugGroup(value: () => Unit): Self = StObject.set(x, "popDebugGroup", js.Any.fromFunction0(value))
    
    inline def setPushDebugGroup(value: String => Unit): Self = StObject.set(x, "pushDebugGroup", js.Any.fromFunction1(value))
  }
}
