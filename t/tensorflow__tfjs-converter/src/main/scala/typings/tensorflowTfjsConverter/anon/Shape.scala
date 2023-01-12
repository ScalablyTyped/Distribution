package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var shape: Dim
}
object Shape {
  
  inline def apply(shape: Dim): Shape = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    inline def setShape(value: Dim): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
