package typings.typeorm

import typings.typeorm.anon.MasterOracleConnectionCredentialsOptions
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.oracleOracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import typings.typeorm.typeormStrings.oracle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oracleOracleConnectionOptionsMod {
  
  trait OracleConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with OracleConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[MasterOracleConnectionCredentialsOptions] = js.undefined
    
    /**
      * Schema name. By default is "public".
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_OracleConnectionOptions: oracle
  }
  object OracleConnectionOptions {
    
    inline def apply(): OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("oracle")
      __obj.asInstanceOf[OracleConnectionOptions]
    }
    
    extension [Self <: OracleConnectionOptions](x: Self) {
      
      inline def setReplication(value: MasterOracleConnectionCredentialsOptions): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      inline def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setType(value: oracle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
