package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milliseconds extends StObject {
  
  var id: js.Any
  
  var milliseconds: Double
}
object Milliseconds {
  
  inline def apply(id: js.Any, milliseconds: Double): Milliseconds = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milliseconds]
  }
  
  extension [Self <: Milliseconds](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
  }
}
