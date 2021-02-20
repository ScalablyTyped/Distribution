package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.expo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoExpoConnectionOptionsMod {
  
  @js.native
  trait ExpoConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Database name.
      */
    val database: String = js.native
    
    /**
      * Driver module
      */
    val driver: js.Any = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_ExpoConnectionOptions: expo = js.native
  }
  object ExpoConnectionOptions {
    
    @scala.inline
    def apply(database: String, driver: js.Any, `type`: expo): ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpoConnectionOptions]
    }
    
    @scala.inline
    implicit class ExpoConnectionOptionsMutableBuilder[Self <: ExpoConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: expo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
