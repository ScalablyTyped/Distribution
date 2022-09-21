package typings.webextensionPolyfill

import typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.ExtensionFileOrCode
import typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.RunAt
import typings.webextensionPolyfill.manifestMod.Manifest.MatchPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentScriptsMod {
  
  object ContentScripts {
    
    /**
      * An object that represents a content script registered programmatically
      */
    trait RegisteredContentScript extends StObject {
      
      /**
        * Unregister a content script registered programmatically
        */
      def unregister(): js.Promise[Unit]
    }
    object RegisteredContentScript {
      
      inline def apply(unregister: () => js.Promise[Unit]): RegisteredContentScript = {
        val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
        __obj.asInstanceOf[RegisteredContentScript]
      }
      
      extension [Self <: RegisteredContentScript](x: Self) {
        
        inline def setUnregister(value: () => js.Promise[Unit]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * Details of a content script registered programmatically
      */
    trait RegisteredContentScriptOptions extends StObject {
      
      /**
        * If allFrames is <code>true</code>, implies that the JavaScript or CSS should be injected into all frames of current page.
        * By default, it's <code>false</code> and is only injected into the top frame.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * limit the set of matched tabs to those that belong to the given cookie store id
        * Optional.
        */
      var cookieStoreId: js.UndefOr[js.Array[String] | String] = js.undefined
      
      /**
        * The list of CSS files to inject
        * Optional.
        */
      var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
      
      /**
        * Optional.
        */
      var excludeGlobs: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Optional.
        */
      var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
      
      /**
        * Optional.
        */
      var includeGlobs: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The list of JS files to inject
        * Optional.
        */
      @JSName("js")
      var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
      
      /**
        * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has
        * access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is <code>false</code>.
        * Optional.
        */
      var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
      
      var matches: js.Array[MatchPattern]
      
      /**
        * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle".
        * Optional.
        */
      var runAt: js.UndefOr[RunAt] = js.undefined
    }
    object RegisteredContentScriptOptions {
      
      inline def apply(matches: js.Array[MatchPattern]): RegisteredContentScriptOptions = {
        val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisteredContentScriptOptions]
      }
      
      extension [Self <: RegisteredContentScriptOptions](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCookieStoreId(value: js.Array[String] | String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setCookieStoreIdVarargs(value: String*): Self = StObject.set(x, "cookieStoreId", js.Array(value*))
        
        inline def setCss(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setCssVarargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "css", js.Array(value*))
        
        inline def setExcludeGlobs(value: js.Array[String]): Self = StObject.set(x, "excludeGlobs", value.asInstanceOf[js.Any])
        
        inline def setExcludeGlobsUndefined: Self = StObject.set(x, "excludeGlobs", js.undefined)
        
        inline def setExcludeGlobsVarargs(value: String*): Self = StObject.set(x, "excludeGlobs", js.Array(value*))
        
        inline def setExcludeMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
        
        inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
        
        inline def setExcludeMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
        
        inline def setIncludeGlobs(value: js.Array[String]): Self = StObject.set(x, "includeGlobs", value.asInstanceOf[js.Any])
        
        inline def setIncludeGlobsUndefined: Self = StObject.set(x, "includeGlobs", js.undefined)
        
        inline def setIncludeGlobsVarargs(value: String*): Self = StObject.set(x, "includeGlobs", js.Array(value*))
        
        inline def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
        
        inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
        
        inline def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value*))
        
        inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
        
        inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
        
        inline def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
        
        inline def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value*))
        
        inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
        
        inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Register a content script programmatically
        *
        * @param contentScriptOptions
        */
      def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript]
    }
    object Static {
      
      inline def apply(register: RegisteredContentScriptOptions => js.Promise[RegisteredContentScript]): Static = {
        val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setRegister(value: RegisteredContentScriptOptions => js.Promise[RegisteredContentScript]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      }
    }
  }
}
