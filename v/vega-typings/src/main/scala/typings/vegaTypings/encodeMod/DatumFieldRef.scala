package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatumFieldRef extends _Field {
  
  var datum: Field = js.native
}
object DatumFieldRef {
  
  @scala.inline
  def apply(datum: Field): DatumFieldRef = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumFieldRef]
  }
  
  @scala.inline
  implicit class DatumFieldRefMutableBuilder[Self <: DatumFieldRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatum(value: Field): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
  }
}
