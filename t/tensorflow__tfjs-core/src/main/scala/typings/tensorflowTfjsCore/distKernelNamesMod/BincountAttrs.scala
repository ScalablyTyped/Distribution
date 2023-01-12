package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BincountAttrs extends StObject {
  
  var size: Double
}
object BincountAttrs {
  
  inline def apply(size: Double): BincountAttrs = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BincountAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BincountAttrs] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
