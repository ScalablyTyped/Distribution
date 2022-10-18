package typings.xstate.anon

import typings.xstate.libTypesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var id: String
  
  var src: String | InvokeSourceDefinition
}
object Src {
  
  inline def apply(id: String, src: String | InvokeSourceDefinition): Src = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String | InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
