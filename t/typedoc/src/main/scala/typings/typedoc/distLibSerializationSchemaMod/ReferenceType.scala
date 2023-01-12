package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReferenceType, 'type' | 'name' | 'typeArguments' | 'package' | 'externalUrl'> */
trait ReferenceType extends StObject {
  
  @JSName("package")
  var _package: ToSerialized[js.UndefOr[String]]
  
  var externalUrl: ToSerialized[js.UndefOr[String]]
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: ToSerialized[String]
  
  var qualifiedName: js.UndefOr[String] = js.undefined
  
  var `type`: ToSerialized[/* "reference" */ String]
  
  var typeArguments: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]
}
object ReferenceType {
  
  inline def apply(name: ToSerialized[String], `type`: ToSerialized[/* "reference" */ String]): ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceType] (val x: Self) extends AnyVal {
    
    inline def setExternalUrl(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "externalUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalUrlUndefined: Self = StObject.set(x, "externalUrl", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQualifiedName(value: String): Self = StObject.set(x, "qualifiedName", value.asInstanceOf[js.Any])
    
    inline def setQualifiedNameUndefined: Self = StObject.set(x, "qualifiedName", js.undefined)
    
    inline def setType(value: ToSerialized[/* "reference" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    inline def setTypeArgumentsVarargs(value: typings.typedoc.distLibModelsTypesMod.SomeType*): Self = StObject.set(x, "typeArguments", js.Array(value*))
    
    inline def set_package(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
