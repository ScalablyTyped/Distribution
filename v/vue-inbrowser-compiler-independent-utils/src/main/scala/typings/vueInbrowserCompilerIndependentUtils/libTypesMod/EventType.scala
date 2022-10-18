package typings.vueInbrowserCompilerIndependentUtils.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  var names: js.Array[String]
}
object EventType {
  
  inline def apply(names: js.Array[String]): EventType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
  
  extension [Self <: EventType](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
