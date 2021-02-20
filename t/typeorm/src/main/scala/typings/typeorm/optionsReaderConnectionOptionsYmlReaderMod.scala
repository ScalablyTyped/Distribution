package typings.typeorm

import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsReaderConnectionOptionsYmlReaderMod {
  
  @JSImport("typeorm/connection/options-reader/ConnectionOptionsYmlReader", "ConnectionOptionsYmlReader")
  @js.native
  class ConnectionOptionsYmlReader () extends StObject {
    
    /**
      * Reads connection options from given yml file.
      */
    def read(path: String): js.Promise[js.Array[ConnectionOptions]] = js.native
  }
}
