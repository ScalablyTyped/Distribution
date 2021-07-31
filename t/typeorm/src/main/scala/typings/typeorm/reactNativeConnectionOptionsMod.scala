package typings.typeorm

import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`react-native`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeConnectionOptionsMod {
  
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
    
    @scala.inline
    def apply(database: String, location: String): ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("react-native")
      __obj.asInstanceOf[ReactNativeConnectionOptions]
    }
    
    @scala.inline
    implicit class ReactNativeConnectionOptionsMutableBuilder[Self <: ReactNativeConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `react-native`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
