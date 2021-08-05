package typings.typeorm

import typings.typeorm.driverSqlInMemoryMod.SqlInMemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaBuilderSchemaBuilderMod {
  
  trait SchemaBuilder extends StObject {
    
    /**
      * Creates complete schemas for the given entity metadatas.
      */
    def build(): js.Promise[Unit]
    
    /**
      * Returns queries to be executed by schema builder.
      */
    def log(): js.Promise[SqlInMemory]
  }
  object SchemaBuilder {
    
    inline def apply(build: () => js.Promise[Unit], log: () => js.Promise[SqlInMemory]): SchemaBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), log = js.Any.fromFunction0(log))
      __obj.asInstanceOf[SchemaBuilder]
    }
    
    extension [Self <: SchemaBuilder](x: Self) {
      
      inline def setBuild(value: () => js.Promise[Unit]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setLog(value: () => js.Promise[SqlInMemory]): Self = StObject.set(x, "log", js.Any.fromFunction0(value))
    }
  }
}
