package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverMod {
  
  @JSImport("webdriverio/build/utils/interception/webdriver", JSImport.Default)
  @js.native
  class default () extends WebDriverInterception
  
  @js.native
  trait WebDriverInterception
    extends typings.webdriverio.interceptionMod.default {
    
    def abort(errorReason: String): js.Promise[Unit] = js.native
    def abort(errorReason: String, sticky: Boolean): js.Promise[Unit] = js.native
    
    def abortOnce(errorReason: String): js.Promise[Unit] = js.native
    
    @JSName("calls")
    def calls_MWebDriverInterception: js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.ProtocolCommandResponse */ js.Any
      ] = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    var mockId: js.UndefOr[String] = js.native
    
    def respond(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
    ): js.Promise[Unit] = js.native
    def respond(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
    ): js.Promise[Unit] = js.native
    
    def respondOnce(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
    ): js.Promise[Unit] = js.native
    def respondOnce(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
    ): js.Promise[Unit] = js.native
    
    def restore(): js.Promise[Unit] = js.native
  }
}
