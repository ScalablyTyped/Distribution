package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReferenceType, 'type' | 'name' | 'typeArguments'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReferenceType
  extends StObject
     with SomeType {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: ModelToObject[String] | String
  
  var `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  
  var typeArguments: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ] = js.undefined
}
object ReferenceType {
  
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceType]
  }
  
  @scala.inline
  implicit class ReferenceTypeMutableBuilder[Self <: ReferenceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArguments(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    @scala.inline
    def setTypeArgumentsVarargs(value: (typings.typedoc.typesAbstractMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "typeArguments", js.Array(value :_*))
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
