package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/schema-builder/MongoSchemaBuilder", JSImport.Namespace)
@js.native
object schemaBuilderMongoSchemaBuilderMod extends js.Object {
  
  @js.native
  class MongoSchemaBuilder protected () extends SchemaBuilder {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
  }
}
