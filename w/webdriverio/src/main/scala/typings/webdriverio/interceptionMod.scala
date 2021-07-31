package typings.webdriverio

import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.anon.ErrorReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptionMod {
  
  @JSImport("webdriverio/build/utils/interception", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Interception {
    def this(url: String, filterOptions: js.Object, browser: BrowserObject) = this()
    def this(url: String, filterOptions: Unit, browser: BrowserObject) = this()
  }
  
  @js.native
  trait Interception extends StObject {
    
    var browser: BrowserObject = js.native
    
    var calls: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Matches */ js.Any
        ]
      ] = js.native
    
    var filterOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockFilterOptions */ js.Any = js.native
    
    var matches: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Matches */ js.Any
      ] = js.native
    
    var respondOverwrites: js.Array[ErrorReason] = js.native
    
    var url: String = js.native
    
    def waitForResponse(): js.Promise[Unit] = js.native
    def waitForResponse(
      hasTimeoutIntervalTimeoutMsg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.WaitForOptions */ js.Any
    ): js.Promise[Unit] = js.native
  }
}
