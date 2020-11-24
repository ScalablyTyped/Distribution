package typings.typeorm

import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/connection/options-reader/ConnectionOptionsYmlReader", JSImport.Namespace)
@js.native
object optionsReaderConnectionOptionsYmlReaderMod extends js.Object {
  
  @js.native
  class ConnectionOptionsYmlReader () extends js.Object {
    
    /**
      * Reads connection options from given yml file.
      */
    def read(path: String): js.Promise[js.Array[ConnectionOptions]] = js.native
  }
}
