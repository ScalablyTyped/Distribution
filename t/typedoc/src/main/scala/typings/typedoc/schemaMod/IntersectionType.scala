package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntersectionType, 'type' | 'types'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait IntersectionType extends SomeType {
  
  var `type`: ModelToObject[String] | String = js.native
  
  var types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type] = js.native
}
object IntersectionType {
  
  @scala.inline
  def apply(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): IntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionType]
  }
  
  @scala.inline
  implicit class IntersectionTypeMutableBuilder[Self <: IntersectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setTypes(
      value: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: (typings.typedoc.typesAbstractMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
