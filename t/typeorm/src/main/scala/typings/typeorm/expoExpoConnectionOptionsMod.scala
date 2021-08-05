package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.expo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoExpoConnectionOptionsMod {
  
  trait ExpoConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Database name.
      */
    val database: String
    
    /**
      * Driver module
      */
    val driver: js.Any
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_ExpoConnectionOptions: expo
  }
  object ExpoConnectionOptions {
    
    inline def apply(database: String, driver: js.Any): ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("expo")
      __obj.asInstanceOf[ExpoConnectionOptions]
    }
    
    extension [Self <: ExpoConnectionOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setType(value: expo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
