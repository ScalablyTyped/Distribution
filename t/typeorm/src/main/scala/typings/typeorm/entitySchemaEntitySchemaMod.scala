package typings.typeorm

import typings.typeorm.entitySchemaEntitySchemaOptionsMod.EntitySchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/entity-schema/EntitySchema", JSImport.Namespace)
@js.native
object entitySchemaEntitySchemaMod extends js.Object {
  
  @js.native
  class EntitySchema[T] protected () extends js.Object {
    def this(options: EntitySchemaOptions[T]) = this()
    
    var options: EntitySchemaOptions[T] = js.native
  }
}
