package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecOnEventsMod._Update
import typings.vegaTypings.typesSpecSignalMod.SignalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSignalValue
  extends StObject
     with _Update {
  
  var value: SignalValue
}
object ValueSignalValue {
  
  inline def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
  
  extension [Self <: ValueSignalValue](x: Self) {
    
    inline def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
