package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a referenced array of bytes used by byte stream read and write interfaces. Buffer is the class implementation of this interface. */
trait IBuffer extends StObject {
  
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double
}
object IBuffer {
  
  @scala.inline
  def apply(capacity: Double, length: Double): IBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
  
  @scala.inline
  implicit class IBufferMutableBuilder[Self <: IBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
