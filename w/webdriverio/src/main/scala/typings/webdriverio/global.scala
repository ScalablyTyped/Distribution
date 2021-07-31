package typings.webdriverio

import typings.std.Element
import typings.std.Error
import typings.webdriverio.WebdriverIO.BrowserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * find multiple elements on the page.
    */
  @JSGlobal("$$")
  @js.native
  def $: js.Function1[
    /* selector */ String | js.Function, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementArray */ js.Any
    ]
  ] = js.native
  
  @scala.inline
  def $_=(
    x: js.Function1[
      /* selector */ String | js.Function, 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementArray */ js.Any
      ]
    ]
  ): Unit = js.Dynamic.global.updateDynamic("$$")(x.asInstanceOf[js.Any])
  
  object WebdriverIO {
    
    @JSGlobal("WebdriverIO")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Error to be thrown when a severe error was encountered when a Service is being ran.
      */
    @JSGlobal("WebdriverIO.SevereServiceError")
    @js.native
    class SevereServiceError ()
      extends StObject
         with Error {
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    @scala.inline
    def attach(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.AttachSessionOptions */ js.Any
    ): BrowserObject = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserObject]
    
    @scala.inline
    def multiremote(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteOptions */ js.Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteBrowserObject */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteBrowserObject */ js.Any
      ]]
    
    @scala.inline
    def remote(): js.Promise[BrowserObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")().asInstanceOf[js.Promise[BrowserObject]]
    @scala.inline
    def remote(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any
    ): js.Promise[BrowserObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrowserObject]]
    @scala.inline
    def remote(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any,
      modifier: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[BrowserObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrowserObject]]
    @scala.inline
    def remote(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[BrowserObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrowserObject]]
  }
  
  /**
    * find a single element on the page.
    */
  @JSGlobal("$")
  @js.native
  def _empty: js.Function1[/* selector */ String | js.Function, js.Promise[Element]] = js.native
  
  @scala.inline
  def _empty_=(x: js.Function1[/* selector */ String | js.Function, js.Promise[Element]]): Unit = js.Dynamic.global.updateDynamic("$")(x.asInstanceOf[js.Any])
  
  @JSGlobal("browser")
  @js.native
  def browser: BrowserObject | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteBrowserObject */ js.Any) = js.native
  @scala.inline
  def browser_=(
    x: BrowserObject | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteBrowserObject */ js.Any)
  ): Unit = js.Dynamic.global.updateDynamic("browser")(x.asInstanceOf[js.Any])
  
  @JSGlobal("driver")
  @js.native
  def driver: BrowserObject = js.native
  @scala.inline
  def driver_=(x: BrowserObject): Unit = js.Dynamic.global.updateDynamic("driver")(x.asInstanceOf[js.Any])
}
