package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference to an IMemoryBuffer object. */
trait IMemoryBufferReference
  extends StObject
     with IClosable {
  
  /** Gets the size of the memory buffer in bytes. */
  var capacity: Double
}
object IMemoryBufferReference {
  
  inline def apply(capacity: Double, close: () => Unit): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[IMemoryBufferReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMemoryBufferReference] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
