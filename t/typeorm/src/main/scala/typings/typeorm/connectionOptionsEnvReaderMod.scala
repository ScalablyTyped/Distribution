package typings.typeorm

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/connection/options-reader/ConnectionOptionsEnvReader", JSImport.Namespace)
@js.native
object connectionOptionsEnvReaderMod extends js.Object {
  
  @js.native
  class ConnectionOptionsEnvReader () extends js.Object {
    
    /**
      * Reads connection options from environment variables.
      */
    def read(): js.Promise[js.Array[ConnectionOptions]] = js.native
    
    /**
      * Converts a string which contains multiple elements split by comma into a string array of strings.
      */
    /* protected */ def stringToArray(): js.Array[String] = js.native
    /* protected */ def stringToArray(variable: String): js.Array[String] = js.native
    
    /**
      * Converts a string which contains a number into a javascript number
      */
    var stringToNumber: js.Any = js.native
    
    /**
      * Transforms caching option into real caching value option requires.
      */
    /* protected */ def transformCaching(): js.UndefOr[Boolean | js.Object] = js.native
    
    /**
      * Transforms logging string into real logging value connection requires.
      */
    /* protected */ def transformLogging(logging: String): js.Any = js.native
  }
}
