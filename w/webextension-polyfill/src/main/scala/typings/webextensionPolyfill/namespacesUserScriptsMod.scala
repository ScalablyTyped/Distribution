package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCode
import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.PlainJSONValue
import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.RunAt
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.MatchPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesUserScriptsMod {
  
  object UserScripts {
    
    /**
      * An object that represents a user script registered programmatically
      */
    trait RegisteredUserScript extends StObject {
      
      /**
        * Unregister a user script registered programmatically
        */
      def unregister(): Unit
    }
    object RegisteredUserScript {
      
      inline def apply(unregister: () => Unit): RegisteredUserScript = {
        val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
        __obj.asInstanceOf[RegisteredUserScript]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RegisteredUserScript] (val x: Self) extends AnyVal {
        
        inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Register a user script programmatically given its $(ref:userScripts.UserScriptOptions),
        * and resolves to a $(ref:userScripts.RegisteredUserScript) instance
        *
        * @param userScriptOptions
        */
      def register(userScriptOptions: UserScriptOptions): Unit
    }
    object Static {
      
      inline def apply(register: UserScriptOptions => Unit): Static = {
        val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setRegister(value: UserScriptOptions => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Details of a user script
      */
    trait UserScriptOptions extends StObject {
      
      /**
        * If allFrames is <code>true</code>, implies that the JavaScript should be injected into all frames of current page.
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
        */
      @JSName("js")
      var js_ : js.Array[ExtensionFileOrCode]
      
      /**
        * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has
        * access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is <code>false</code>.
        * Optional.
        */
      var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
      
      var matches: js.Array[MatchPattern]
      
      /**
        * The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle".
        * Optional.
        */
      var runAt: js.UndefOr[RunAt] = js.undefined
      
      /**
        * An opaque user script metadata value
        * Optional.
        */
      var scriptMetadata: js.UndefOr[PlainJSONValue] = js.undefined
    }
    object UserScriptOptions {
      
      inline def apply(js_ : js.Array[ExtensionFileOrCode], matches: js.Array[MatchPattern]): UserScriptOptions = {
        val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
        __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserScriptOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UserScriptOptions] (val x: Self) extends AnyVal {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCookieStoreId(value: js.Array[String] | String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setCookieStoreIdVarargs(value: String*): Self = StObject.set(x, "cookieStoreId", js.Array(value*))
        
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
        
        inline def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value*))
        
        inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
        
        inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
        
        inline def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
        
        inline def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value*))
        
        inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
        
        inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
        
        inline def setScriptMetadata(value: PlainJSONValue): Self = StObject.set(x, "scriptMetadata", value.asInstanceOf[js.Any])
        
        inline def setScriptMetadataUndefined: Self = StObject.set(x, "scriptMetadata", js.undefined)
      }
    }
  }
}
