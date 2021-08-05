package typings.webdriverio

import typings.std.Error
import typings.webdriverio.WebdriverIO.BrowserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webdriverio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Error to be thrown when a severe error was encountered when a Service is being ran.
    */
  @JSImport("webdriverio", "SevereServiceError")
  @js.native
  class SevereServiceError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def attach(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.AttachSessionOptions */ js.Any
  ): BrowserObject = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserObject]
  
  inline def multiremote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteBrowserObject */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteBrowserObject */ js.Any
  ]]
  
  inline def remote(): js.Promise[BrowserObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")().asInstanceOf[js.Promise[BrowserObject]]
  inline def remote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any
  ): js.Promise[BrowserObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrowserObject]]
  inline def remote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any,
    modifier: js.Function1[/* repeated */ js.Any, js.Any]
  ): js.Promise[BrowserObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrowserObject]]
  inline def remote(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[BrowserObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrowserObject]]
}
