package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.auroraDataApiConnectionCredentialsOptionsMod.AuroraDataApiConnectionCredentialsOptions
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`aurora-data-api`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiConnectionOptionsMod {
  
  trait AuroraDataApiConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with AuroraDataApiConnectionCredentialsOptions
       with ConnectionOptions {
    
    @JSName("database")
    val database_AuroraDataApiConnectionOptions: String
    
    val formatOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
      * Use spatial functions like GeomFromText and AsText which are removed in MySQL 8.
      * (Default: true)
      */
    val legacySpatialSupport: js.UndefOr[Boolean] = js.undefined
    
    val region: String
    
    val resourceArn: String
    
    val secretArn: String
    
    val serviceConfigOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_AuroraDataApiConnectionOptions: `aurora-data-api`
  }
  object AuroraDataApiConnectionOptions {
    
    @scala.inline
    def apply(database: String, region: String, resourceArn: String, secretArn: String): AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("aurora-data-api")
      __obj.asInstanceOf[AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    implicit class AuroraDataApiConnectionOptionsMutableBuilder[Self <: AuroraDataApiConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      @scala.inline
      def setLegacySpatialSupport(value: Boolean): Self = StObject.set(x, "legacySpatialSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacySpatialSupportUndefined: Self = StObject.set(x, "legacySpatialSupport", js.undefined)
      
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
      def setType(value: `aurora-data-api`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
