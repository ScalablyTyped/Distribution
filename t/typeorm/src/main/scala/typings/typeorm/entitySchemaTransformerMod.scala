package typings.typeorm

import typings.typeorm.entitySchemaMod.EntitySchema
import typings.typeorm.metadataArgsStorageMod.MetadataArgsStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/entity-schema/EntitySchemaTransformer", JSImport.Namespace)
@js.native
object entitySchemaTransformerMod extends js.Object {
  
  @js.native
  class EntitySchemaTransformer () extends js.Object {
    
    /**
      * Transforms entity schema into new metadata args storage object.
      */
    def transform(schemas: js.Array[EntitySchema[_]]): MetadataArgsStorage = js.native
  }
}
