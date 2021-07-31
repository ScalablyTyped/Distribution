package typings.typeorm

import typings.typeorm.anon.AbortTransactionOnError
import typings.typeorm.anon.AcquireTimeoutMillis
import typings.typeorm.anon.SlavesArray
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.sqlserverSqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import typings.typeorm.typeormStrings.mssql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlserverSqlServerConnectionOptionsMod {
  
  trait SqlServerConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with SqlServerConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * Connection timeout in ms (default: 15000).
      */
    val connectionTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Extra options
      */
    val options: js.UndefOr[AbortTransactionOnError] = js.undefined
    
    /**
      * An optional object/dictionary with the any of the properties
      */
    val pool: js.UndefOr[AcquireTimeoutMillis] = js.undefined
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[SlavesArray] = js.undefined
    
    /**
      * Request timeout in ms (default: 15000). NOTE: msnodesqlv8 driver doesn't support timeouts < 1 second.
      */
    val requestTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Database schema.
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Stream recordsets/rows instead of returning them all at once as an argument of callback (default: false).
      * You can also enable streaming for each request independently (request.stream = true).
      * Always set to true if you plan to work with large amount of rows.
      */
    val stream: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SqlServerConnectionOptions: mssql
  }
  object SqlServerConnectionOptions {
    
    @scala.inline
    def apply(): SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mssql")
      __obj.asInstanceOf[SqlServerConnectionOptions]
    }
    
    @scala.inline
    implicit class SqlServerConnectionOptionsMutableBuilder[Self <: SqlServerConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setOptions(value: AbortTransactionOnError): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPool(value: AcquireTimeoutMillis): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setReplication(value: SlavesArray): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setType(value: mssql): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
