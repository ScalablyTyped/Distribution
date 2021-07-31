package typings.typeorm

import typings.typeorm.entitySchemaOptionsMod.EntitySchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaMod {
  
  @JSImport("typeorm/browser/entity-schema/EntitySchema", "EntitySchema")
  @js.native
  class EntitySchema[T] protected () extends StObject {
    def this(options: EntitySchemaOptions[T]) = this()
    
    var options: EntitySchemaOptions[T] = js.native
  }
}
