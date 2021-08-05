package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterType, 'type' | 'name' | 'constraint' | 'default'> */
trait TypeParameterType
  extends StObject
     with SomeType {
  
  var default: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.undefined
  
  var constraint: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.undefined
  
  var name: ModelToObject[String] | String
  
  var `type`: ModelToObject[String] | String
}
object TypeParameterType {
  
  inline def apply(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): TypeParameterType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterType]
  }
  
  extension [Self <: TypeParameterType](x: Self) {
    
    inline def setConstraint(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setConstraintVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "constraint", js.Array(value :_*))
    
    inline def setDefault(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    inline def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    inline def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
