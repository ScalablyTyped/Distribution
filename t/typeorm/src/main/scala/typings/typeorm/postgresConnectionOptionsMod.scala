package typings.typeorm

import typings.typeorm.anon.MasterSlaves
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.postgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import typings.typeorm.typeormStrings.`uuid-ossp`
import typings.typeorm.typeormStrings.pgcrypto
import typings.typeorm.typeormStrings.postgres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postgresConnectionOptionsMod {
  
  trait PostgresConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with PostgresConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * The milliseconds before a timeout occurs during the initial connection to the postgres
      * server. If undefined, or set to 0, there is no timeout. Defaults to undefined.
      */
    val connectTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /**
      * Include notification messages from Postgres server in client logs
      */
    val logNotifications: js.UndefOr[Boolean] = js.undefined
    
    val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, js.Any]] = js.undefined
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[MasterSlaves] = js.undefined
    
    /**
      * Schema name.
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_PostgresConnectionOptions: postgres
    
    /**
      * The Postgres extension to use to generate UUID columns. Defaults to uuid-ossp.
      * If pgcrypto is selected, TypeORM will use the gen_random_uuid() function from this extension.
      * If uuid-ossp is selected, TypeORM will use the uuid_generate_v4() function from this extension.
      */
    val uuidExtension: js.UndefOr[pgcrypto | `uuid-ossp`] = js.undefined
  }
  object PostgresConnectionOptions {
    
    @scala.inline
    def apply(): PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("postgres")
      __obj.asInstanceOf[PostgresConnectionOptions]
    }
    
    @scala.inline
    implicit class PostgresConnectionOptionsMutableBuilder[Self <: PostgresConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectTimeoutMS(value: Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
      
      @scala.inline
      def setLogNotifications(value: Boolean): Self = StObject.set(x, "logNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogNotificationsUndefined: Self = StObject.set(x, "logNotifications", js.undefined)
      
      @scala.inline
      def setPoolErrorHandler(value: /* err */ js.Any => js.Any): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
      
      @scala.inline
      def setReplication(value: MasterSlaves): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setType(value: postgres): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidExtension(value: pgcrypto | `uuid-ossp`): Self = StObject.set(x, "uuidExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidExtensionUndefined: Self = StObject.set(x, "uuidExtension", js.undefined)
    }
  }
}
