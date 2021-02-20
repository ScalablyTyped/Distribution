package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowNodeBase extends StObject {
  
  var flags: FlowFlags = js.native
  
  var id: js.UndefOr[Double] = js.native
}
object FlowNodeBase {
  
  @scala.inline
  def apply(flags: FlowFlags): FlowNodeBase = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNodeBase]
  }
  
  @scala.inline
  implicit class FlowNodeBaseMutableBuilder[Self <: FlowNodeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: FlowFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
