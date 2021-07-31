package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntrinsicType, 'type' | 'name'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait IntrinsicType
  extends StObject
     with SomeType {
  
  var name: ModelToObject[String] | String
  
  var `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
}
object IntrinsicType {
  
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
  ): IntrinsicType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicType]
  }
  
  @scala.inline
  implicit class IntrinsicTypeMutableBuilder[Self <: IntrinsicType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
