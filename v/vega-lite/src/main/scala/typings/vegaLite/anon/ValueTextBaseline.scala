package typings.vegaLite.anon

import typings.vegaTypings.encodeMod.TextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTextBaseline extends StObject {
  
  var value: TextBaseline
}
object ValueTextBaseline {
  
  inline def apply(value: TextBaseline): ValueTextBaseline = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextBaseline]
  }
  
  extension [Self <: ValueTextBaseline](x: Self) {
    
    inline def setValue(value: TextBaseline): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
