package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
@js.native
trait Buffer extends StObject {
  
  var byteLength: js.Any = js.native
  
  /* unmapped type */
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double = js.native
  
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double = js.native
}
object Buffer {
  
  @scala.inline
  def apply(byteLength: js.Any, capacity: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteLength(value: js.Any): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
