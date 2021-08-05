package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`react-native`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeReactNativeConnectionOptionsMod {
  
  trait ReactNativeConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Database name.
      */
    val database: String
    
    /**
      * Storage Location
      */
    val location: String
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_ReactNativeConnectionOptions: `react-native`
  }
  object ReactNativeConnectionOptions {
    
    inline def apply(database: String, location: String): ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("react-native")
      __obj.asInstanceOf[ReactNativeConnectionOptions]
    }
    
    extension [Self <: ReactNativeConnectionOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setType(value: `react-native`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
