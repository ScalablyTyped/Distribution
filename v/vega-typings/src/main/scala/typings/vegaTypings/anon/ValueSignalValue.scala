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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSignalValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
