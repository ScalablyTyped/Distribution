package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeMeta extends StObject {
  
  var data: js.Any = js.native
  
  var src: InvokeSourceDefinition = js.native
}
object InvokeMeta {
  
  @scala.inline
  def apply(data: js.Any, src: InvokeSourceDefinition): InvokeMeta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeMeta]
  }
  
  @scala.inline
  implicit class InvokeMetaMutableBuilder[Self <: InvokeMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
