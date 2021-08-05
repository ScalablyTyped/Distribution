package typings.typeorm

import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cordova
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaConnectionOptionsMod {
  
  trait CordovaConnectionOptions
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
    val type_CordovaConnectionOptions: cordova
  }
  object CordovaConnectionOptions {
    
    inline def apply(database: String, location: String): CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cordova")
      __obj.asInstanceOf[CordovaConnectionOptions]
    }
    
    extension [Self <: CordovaConnectionOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setType(value: cordova): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
