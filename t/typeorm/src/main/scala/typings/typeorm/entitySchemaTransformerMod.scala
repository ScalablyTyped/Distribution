package typings.typeorm

import typings.typeorm.entitySchemaMod.EntitySchema
import typings.typeorm.metadataArgsStorageMod.MetadataArgsStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaTransformerMod {
  
  @JSImport("typeorm/browser/entity-schema/EntitySchemaTransformer", "EntitySchemaTransformer")
  @js.native
  class EntitySchemaTransformer () extends StObject {
    
    /**
      * Transforms entity schema into new metadata args storage object.
      */
    def transform(schemas: js.Array[EntitySchema[_]]): MetadataArgsStorage = js.native
  }
}
