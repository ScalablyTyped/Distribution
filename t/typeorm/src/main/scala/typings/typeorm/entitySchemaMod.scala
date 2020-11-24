package typings.typeorm

import typings.typeorm.entitySchemaOptionsMod.EntitySchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/entity-schema/EntitySchema", JSImport.Namespace)
@js.native
object entitySchemaMod extends js.Object {
  
  @js.native
  class EntitySchema[T] protected () extends js.Object {
    def this(options: EntitySchemaOptions[T]) = this()
    
    var options: EntitySchemaOptions[T] = js.native
  }
}
