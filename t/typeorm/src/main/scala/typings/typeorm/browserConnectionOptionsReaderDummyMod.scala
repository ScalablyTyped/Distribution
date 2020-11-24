package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/platform/BrowserConnectionOptionsReaderDummy", JSImport.Namespace)
@js.native
object browserConnectionOptionsReaderDummyMod extends js.Object {
  
  @js.native
  class ConnectionOptionsEnvReader () extends js.Object {
    
    def read(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ConnectionOptionsReader () extends js.Object {
    
    def all(): js.Promise[Unit] = js.native
    
    def get(): js.Promise[Unit] = js.native
    
    def has(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ConnectionOptionsXmlReader () extends js.Object {
    
    def read(path: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ConnectionOptionsYmlReader () extends js.Object {
    
    def read(path: String): js.Promise[Unit] = js.native
  }
}
