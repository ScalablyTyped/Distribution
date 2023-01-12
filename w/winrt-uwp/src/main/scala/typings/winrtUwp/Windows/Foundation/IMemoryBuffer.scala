package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference counted memory buffer. */
trait IMemoryBuffer
  extends StObject
     with IClosable {
  
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}
object IMemoryBuffer {
  
  inline def apply(close: () => Unit, createReference: () => IMemoryBufferReference): IMemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[IMemoryBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMemoryBuffer] (val x: Self) extends AnyVal {
    
    inline def setCreateReference(value: () => IMemoryBufferReference): Self = StObject.set(x, "createReference", js.Any.fromFunction0(value))
  }
}
