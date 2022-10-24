package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueUndefined extends StObject {
  
  var value: Unit
}
object ValueUndefined {
  
  inline def apply(value: Unit): ValueUndefined = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUndefined]
  }
  
  extension [Self <: ValueUndefined](x: Self) {
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
