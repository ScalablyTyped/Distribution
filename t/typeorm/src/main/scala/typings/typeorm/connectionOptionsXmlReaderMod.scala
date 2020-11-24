package typings.typeorm

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/connection/options-reader/ConnectionOptionsXmlReader", JSImport.Namespace)
@js.native
object connectionOptionsXmlReaderMod extends js.Object {
  
  @js.native
  class ConnectionOptionsXmlReader () extends js.Object {
    
    /**
      * Reads connection options from given xml file.
      */
    def read(path: String): js.Promise[js.Array[ConnectionOptions]] = js.native
    
    /**
      * Reads xml file contents and returns them in a promise.
      */
    /* protected */ def readXml(path: String): js.Promise[_] = js.native
  }
}
