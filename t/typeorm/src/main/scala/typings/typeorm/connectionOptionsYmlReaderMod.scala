package typings.typeorm

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionOptionsYmlReaderMod {
  
  @JSImport("typeorm/browser/connection/options-reader/ConnectionOptionsYmlReader", "ConnectionOptionsYmlReader")
  @js.native
  class ConnectionOptionsYmlReader () extends StObject {
    
    /**
      * Reads connection options from given yml file.
      */
    def read(path: String): js.Promise[js.Array[ConnectionOptions]] = js.native
  }
}
