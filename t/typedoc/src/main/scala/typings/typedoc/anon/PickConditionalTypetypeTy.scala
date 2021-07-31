package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ConditionalType, 'type'> & typedoc.typedoc/dist/lib/serialization/schema.Type */
trait PickConditionalTypetypeTy extends StObject {
  
  var `type`: ModelToObject[String] | String
}
object PickConditionalTypetypeTy {
  
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): PickConditionalTypetypeTy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConditionalTypetypeTy]
  }
  
  @scala.inline
  implicit class PickConditionalTypetypeTyMutableBuilder[Self <: PickConditionalTypetypeTy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
