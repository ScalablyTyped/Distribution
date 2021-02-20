package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`aurora-data-api-pg`
import typings.typeorm.typeormStrings.`uuid-ossp`
import typings.typeorm.typeormStrings.pgcrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod {
  
  @js.native
  trait AuroraDataApiPostgresConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    val database: String = js.native
    
    val formatOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
    
    val region: String = js.native
    
    val resourceArn: String = js.native
    
    val secretArn: String = js.native
    
    val serviceConfigOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_AuroraDataApiPostgresConnectionOptions: `aurora-data-api-pg` = js.native
    
    /**
      * The Postgres extension to use to generate UUID columns. Defaults to uuid-ossp.
      * If pgcrypto is selected, TypeORM will use the gen_random_uuid() function from this extension.
      * If uuid-ossp is selected, TypeORM will use the uuid_generate_v4() function from this extension.
      */
    val uuidExtension: js.UndefOr[pgcrypto | `uuid-ossp`] = js.native
  }
  object AuroraDataApiPostgresConnectionOptions {
    
    @scala.inline
    def apply(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api-pg`
    ): AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    implicit class AuroraDataApiPostgresConnectionOptionsMutableBuilder[Self <: AuroraDataApiPostgresConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      @scala.inline
      def setPoolErrorHandler(value: /* err */ js.Any => _): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArn(value: String): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceConfigOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "serviceConfigOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceConfigOptionsUndefined: Self = StObject.set(x, "serviceConfigOptions", js.undefined)
      
      @scala.inline
      def setType(value: `aurora-data-api-pg`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidExtension(value: pgcrypto | `uuid-ossp`): Self = StObject.set(x, "uuidExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidExtensionUndefined: Self = StObject.set(x, "uuidExtension", js.undefined)
    }
  }
}
