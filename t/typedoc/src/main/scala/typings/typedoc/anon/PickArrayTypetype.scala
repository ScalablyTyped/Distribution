package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ArrayType, 'type'> */
trait PickArrayTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
}
object PickArrayTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)): PickArrayTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArrayTypetype]
  }
  
  @scala.inline
  implicit class PickArrayTypetypeMutableBuilder[Self <: PickArrayTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
