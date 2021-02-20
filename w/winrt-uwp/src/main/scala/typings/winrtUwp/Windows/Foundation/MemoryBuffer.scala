package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference counted memory buffer. */
@js.native
trait MemoryBuffer extends StObject {
  
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit = js.native
  
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference = js.native
}
object MemoryBuffer {
  
  @scala.inline
  def apply(close: () => Unit, createReference: () => IMemoryBufferReference): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[MemoryBuffer]
  }
  
  @scala.inline
  implicit class MemoryBufferMutableBuilder[Self <: MemoryBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateReference(value: () => IMemoryBufferReference): Self = StObject.set(x, "createReference", js.Any.fromFunction0(value))
  }
}
