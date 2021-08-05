package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAlign extends StObject {
  
  var value: typings.vegaTypings.encodeMod.Align
}
object ValueAlign {
  
  inline def apply(value: typings.vegaTypings.encodeMod.Align): ValueAlign = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAlign]
  }
  
  extension [Self <: ValueAlign](x: Self) {
    
    inline def setValue(value: typings.vegaTypings.encodeMod.Align): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
