package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserConnectionOptionsReaderDummyMod {
  
  @JSImport("typeorm/browser/platform/BrowserConnectionOptionsReaderDummy", "ConnectionOptionsEnvReader")
  @js.native
  class ConnectionOptionsEnvReader () extends StObject {
    
    def read(): js.Promise[Unit] = js.native
  }
  
  @JSImport("typeorm/browser/platform/BrowserConnectionOptionsReaderDummy", "ConnectionOptionsReader")
  @js.native
  class ConnectionOptionsReader () extends StObject {
    
    def all(): js.Promise[Unit] = js.native
    
    def get(): js.Promise[Unit] = js.native
    
    def has(): js.Promise[Unit] = js.native
  }
  
  @JSImport("typeorm/browser/platform/BrowserConnectionOptionsReaderDummy", "ConnectionOptionsXmlReader")
  @js.native
  class ConnectionOptionsXmlReader () extends StObject {
    
    def read(path: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("typeorm/browser/platform/BrowserConnectionOptionsReaderDummy", "ConnectionOptionsYmlReader")
  @js.native
  class ConnectionOptionsYmlReader () extends StObject {
    
    def read(path: String): js.Promise[Unit] = js.native
  }
}
