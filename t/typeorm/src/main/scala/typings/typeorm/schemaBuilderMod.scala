package typings.typeorm

import typings.typeorm.sqlInMemoryMod.SqlInMemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaBuilderMod {
  
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
    
    @scala.inline
    def apply(build: () => js.Promise[Unit], log: () => js.Promise[SqlInMemory]): SchemaBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), log = js.Any.fromFunction0(log))
      __obj.asInstanceOf[SchemaBuilder]
    }
    
    @scala.inline
    implicit class SchemaBuilderMutableBuilder[Self <: SchemaBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: () => js.Promise[Unit]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLog(value: () => js.Promise[SqlInMemory]): Self = StObject.set(x, "log", js.Any.fromFunction0(value))
    }
  }
}
