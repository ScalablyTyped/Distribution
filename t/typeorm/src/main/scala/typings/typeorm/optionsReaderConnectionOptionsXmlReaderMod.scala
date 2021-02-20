package typings.typeorm

import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsReaderConnectionOptionsXmlReaderMod {
  
  @JSImport("typeorm/connection/options-reader/ConnectionOptionsXmlReader", "ConnectionOptionsXmlReader")
  @js.native
  class ConnectionOptionsXmlReader () extends StObject {
    
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
