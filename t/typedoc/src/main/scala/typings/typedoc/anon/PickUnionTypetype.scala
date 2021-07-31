package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnionType, 'type'> */
trait PickUnionTypetype extends StObject {
  
  var `type`: ModelToObject[String] | String
}
object PickUnionTypetype {
  
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): PickUnionTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnionTypetype]
  }
  
  @scala.inline
  implicit class PickUnionTypetypeMutableBuilder[Self <: PickUnionTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
