package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IntrinsicType, 'type'> */
@js.native
trait PickIntrinsicTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String) = js.native
}
object PickIntrinsicTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)): PickIntrinsicTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntrinsicTypetype]
  }
  
  @scala.inline
  implicit class PickIntrinsicTypetypeMutableBuilder[Self <: PickIntrinsicTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
