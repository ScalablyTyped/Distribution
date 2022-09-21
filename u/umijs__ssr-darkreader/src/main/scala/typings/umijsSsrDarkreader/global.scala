package typings.umijsSsrDarkreader

import typings.std.Response
import typings.umijsSsrDarkreader.anon.PartialTheme
import typings.umijsSsrDarkreader.mod.DynamicThemeFix
import typings.umijsSsrDarkreader.umijsSsrDarkreaderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DarkReader {
    
    @JSGlobal("DarkReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enables dark mode when system color scheme is dark.
      * @param theme Theme options.
      * @param fixes Fixes for the generated theme.
      */
    inline def auto(theme: PartialTheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def auto(theme: PartialTheme, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Stops watching for system color scheme.
      * @param isEnabled Boolean `false` value.
      */
    inline def auto_false(theme: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def auto_false(theme: `false`, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Disables dark mode for current web page.
      */
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    /**
      * Enables dark mode for current web page.
      * @param theme Theme options.
      * @param fixes Fixes for the generated theme.
      */
    inline def enable(theme: PartialTheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def enable(theme: PartialTheme, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns the generated CSS by Dark Reader as a string.
      */
    inline def exportGeneratedCSS(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportGeneratedCSS")().asInstanceOf[js.Promise[String]]
    
    /**
      * Returns if darkreader is enabled.
      */
    inline def isEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[Boolean]
    
    /**
      * Sets a function for making CORS requests.
      * @param fetch A fetch function.
      */
    inline def setFetchMethod(fetch: js.Function1[/* url */ String, js.Promise[Response]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFetchMethod")(fetch.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
