package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.schemaBuilderMod.SchemaBuilder
import typings.typeorm.sqlInMemoryMod.SqlInMemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoSchemaBuilderMod {
  
  @JSImport("typeorm/browser/schema-builder/MongoSchemaBuilder", "MongoSchemaBuilder")
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
    
    var connection: Connection = js.native
    
    /**
      * Returns queries to be executed by schema builder.
      */
    /* CompleteClass */
    override def log(): js.Promise[SqlInMemory] = js.native
  }
}
