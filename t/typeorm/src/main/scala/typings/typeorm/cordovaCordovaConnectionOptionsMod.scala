package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cordova
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaCordovaConnectionOptionsMod {
  
  @js.native
  trait CordovaConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Database name.
      */
    val database: String = js.native
    
    /**
      * Storage Location
      */
    val location: String = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_CordovaConnectionOptions: cordova = js.native
  }
  object CordovaConnectionOptions {
    
    @scala.inline
    def apply(database: String, location: String, `type`: cordova): CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
