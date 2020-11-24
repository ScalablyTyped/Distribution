package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference to an IMemoryBuffer object. */
@js.native
trait IMemoryBufferReference extends IClosable {
  
  /** Gets the size of the memory buffer in bytes. */
  var capacity: Double = js.native
}
object IMemoryBufferReference {
  
  @scala.inline
  def apply(capacity: Double, close: () => Unit): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[IMemoryBufferReference]
  }
  
  @scala.inline
  implicit class IMemoryBufferReferenceOps[Self <: IMemoryBufferReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
  }
}
