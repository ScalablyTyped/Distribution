package typings.webdriverio

import typings.std.Record
import typings.wdioTypes.buildOptionsMod.WebDriver
import typings.webdriver.buildTypesMod.AttachOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolStubMod {
  
  @JSImport("webdriverio/build/protocol-stub", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ProtocolStub
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/protocol-stub", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachToSession(options: AttachOptions): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
    inline def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ Any, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
    
    inline def newSession(options: WebDriver): js.Promise[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Record[String, Any]]]
    
    /**
      * added just in case user wants to somehow reload webdriver or devtools session
      * before it was started.
      */
    inline def reloadSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")().asInstanceOf[Unit]
  }
  
  trait ProtocolStub extends StObject
}
