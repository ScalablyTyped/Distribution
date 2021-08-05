package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformFunction extends StObject {
  
  var transform: js.Function
}
object TransformFunction {
  
  inline def apply(transform: js.Function): TransformFunction = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformFunction]
  }
  
  extension [Self <: TransformFunction](x: Self) {
    
    inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
