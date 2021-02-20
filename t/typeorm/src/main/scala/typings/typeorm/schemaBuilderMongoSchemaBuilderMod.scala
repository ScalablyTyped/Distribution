package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaBuilderMongoSchemaBuilderMod {
  
  @JSImport("typeorm/schema-builder/MongoSchemaBuilder", "MongoSchemaBuilder")
  @js.native
  class MongoSchemaBuilder protected () extends SchemaBuilder {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
  }
}
