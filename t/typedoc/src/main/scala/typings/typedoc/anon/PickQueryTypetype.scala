package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.QueryType, 'type'> */
@js.native
trait PickQueryTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String) = js.native
}
object PickQueryTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)): PickQueryTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickQueryTypetype]
  }
  
  @scala.inline
  implicit class PickQueryTypetypeMutableBuilder[Self <: PickQueryTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
