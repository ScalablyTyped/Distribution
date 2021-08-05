package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference counted memory buffer. */
trait MemoryBuffer extends StObject {
  
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit
  
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}
object MemoryBuffer {
  
  inline def apply(close: () => Unit, createReference: () => IMemoryBufferReference): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[MemoryBuffer]
  }
  
  extension [Self <: MemoryBuffer](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCreateReference(value: () => IMemoryBufferReference): Self = StObject.set(x, "createReference", js.Any.fromFunction0(value))
  }
}
