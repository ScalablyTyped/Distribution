package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUObjectBase extends StObject {
  
  var label: String
}
object GPUObjectBase {
  
  inline def apply(label: String): GPUObjectBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUObjectBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUObjectBase] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
