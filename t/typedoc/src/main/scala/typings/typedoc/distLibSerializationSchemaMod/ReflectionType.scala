package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionType, 'type'> */
trait ReflectionType extends StObject {
  
  var declaration: js.UndefOr[
    ModelToObject[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
  ] = js.undefined
  
  var `type`: ToSerialized[/* "reflection" */ String]
}
object ReflectionType {
  
  inline def apply(`type`: ToSerialized[/* "reflection" */ String]): ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionType]
  }
  
  extension [Self <: ReflectionType](x: Self) {
    
    inline def setDeclaration(value: ModelToObject[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setType(value: ToSerialized[/* "reflection" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
