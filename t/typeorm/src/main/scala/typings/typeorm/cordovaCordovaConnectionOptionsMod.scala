package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cordova
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaCordovaConnectionOptionsMod {
  
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
    
    @scala.inline
    def apply(database: String, location: String): CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cordova")
      __obj.asInstanceOf[CordovaConnectionOptions]
    }
    
    @scala.inline
    implicit class CordovaConnectionOptionsMutableBuilder[Self <: CordovaConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: cordova): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
