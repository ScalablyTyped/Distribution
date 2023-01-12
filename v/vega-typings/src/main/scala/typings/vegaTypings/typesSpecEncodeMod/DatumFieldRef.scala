package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatumFieldRef
  extends StObject
     with _Field {
  
  var datum: Field
}
object DatumFieldRef {
  
  inline def apply(datum: Field): DatumFieldRef = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumFieldRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatumFieldRef] (val x: Self) extends AnyVal {
    
    inline def setDatum(value: Field): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
  }
}
