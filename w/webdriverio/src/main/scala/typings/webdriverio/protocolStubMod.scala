package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolStubMod {
  
  @JSImport("webdriverio/build/protocol-stub", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ProtocolStub
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/protocol-stub", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachToSession(options: js.Any, modifier: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def newSession(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[js.Object]]
    inline def newSession(options: js.Object): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    
    inline def reloadSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")().asInstanceOf[Unit]
  }
  
  trait ProtocolStub extends StObject
}
