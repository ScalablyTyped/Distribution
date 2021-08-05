package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverSqlInMemoryMod.SqlInMemory
import typings.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaBuilderMongoSchemaBuilderMod {
  
  @JSImport("typeorm/schema-builder/MongoSchemaBuilder", "MongoSchemaBuilder")
  @js.native
  class MongoSchemaBuilder protected ()
    extends StObject
       with SchemaBuilder {
    def this(connection: Connection) = this()
    
    /**
      * Creates complete schemas for the given entity metadatas.
      */
    /* CompleteClass */
    override def build(): js.Promise[Unit] = js.native
    
    /* protected */ var connection: Connection = js.native
    
    /**
      * Returns queries to be executed by schema builder.
      */
    /* CompleteClass */
    override def log(): js.Promise[SqlInMemory] = js.native
  }
}
