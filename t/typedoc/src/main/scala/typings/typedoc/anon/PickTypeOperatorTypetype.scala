package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TypeOperatorType, 'type'> */
trait PickTypeOperatorTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
}
object PickTypeOperatorTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): PickTypeOperatorTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTypeOperatorTypetype]
  }
  
  @scala.inline
  implicit class PickTypeOperatorTypetypeMutableBuilder[Self <: PickTypeOperatorTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
