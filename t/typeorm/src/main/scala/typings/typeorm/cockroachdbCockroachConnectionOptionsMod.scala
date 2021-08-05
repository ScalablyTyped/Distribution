package typings.typeorm

import typings.typeorm.anon.MasterCockroachConnectionCredentialsOptions
import typings.typeorm.cockroachdbCockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cockroachdb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cockroachdbCockroachConnectionOptionsMod {
  
  trait CockroachConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with CockroachConnectionCredentialsOptions
       with ConnectionOptions {
    
    val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, js.Any]] = js.undefined
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[MasterCockroachConnectionCredentialsOptions] = js.undefined
    
    /**
      * Schema name.
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_CockroachConnectionOptions: cockroachdb
  }
  object CockroachConnectionOptions {
    
    inline def apply(): CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("cockroachdb")
      __obj.asInstanceOf[CockroachConnectionOptions]
    }
    
    extension [Self <: CockroachConnectionOptions](x: Self) {
      
      inline def setPoolErrorHandler(value: /* err */ js.Any => js.Any): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
      
      inline def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
      
      inline def setReplication(value: MasterCockroachConnectionCredentialsOptions): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      inline def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setType(value: cockroachdb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
