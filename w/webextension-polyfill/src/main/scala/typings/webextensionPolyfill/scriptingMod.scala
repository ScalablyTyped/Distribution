package typings.webextensionPolyfill

import typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.RunAt
import typings.webextensionPolyfill.manifestMod.Manifest.ExtensionURL
import typings.webextensionPolyfill.webextensionPolyfillStrings.ISOLATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptingMod {
  
  object Scripting {
    
    /**
      * Details of the css to insert.
      */
    trait CSSInjection extends StObject {
      
      /**
        * A string containing the CSS to inject. Exactly one of <code>files</code> and <code>css</code> must be specified.
        * Optional.
        */
      /**
        * A string containing the CSS to inject. Exactly one of files and css must be specified.
        * Optional.
        */
      var css: js.UndefOr[String] = js.undefined
      
      /**
        * The path of the CSS files to inject, relative to the extension's root directory. Exactly one of <code>files</code>
        * and <code>css</code> must be specified.
        * Optional.
        */
      /**
        * The path of the CSS files to inject, relative to the extension's root directory. NOTE: Currently a maximum of one file
        * is supported. Exactly one of files and css must be specified.
        * Optional.
        */
      var files: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The style origin for the injection. Defaults to <code>'AUTHOR'</code>.
        * Optional.
        */
      /**
        * The style origin for the injection. Defaults to 'AUTHOR'.
        * Optional.
        */
      var origin: js.UndefOr[CSSInjectionOriginEnum] & js.UndefOr[StyleOrigin]
      
      /**
        * Details specifying the target into which to inject the CSS.
        */
      /**
        * Details specifying the target into which to insert the CSS.
        */
      var target: InjectionTarget
    }
    object CSSInjection {
      
      inline def apply(target: InjectionTarget): CSSInjection = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSInjection]
      }
      
      extension [Self <: CSSInjection](x: Self) {
        
        inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
        
        inline def setOrigin(value: js.UndefOr[CSSInjectionOriginEnum] & js.UndefOr[StyleOrigin]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
        
        inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The style origin for the injection. Defaults to <code>'AUTHOR'</code>.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.USER
      - typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR
    */
    trait CSSInjectionOriginEnum extends StObject
    object CSSInjectionOriginEnum {
      
      inline def AUTHOR: typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR = "AUTHOR".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR]
      
      inline def USER: typings.webextensionPolyfill.webextensionPolyfillStrings.USER = "USER".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.USER]
    }
    
    trait ContentScriptFilter extends StObject {
      
      /**
        * The IDs of specific scripts to retrieve with <code>getRegisteredContentScripts()</code> or to unregister with <code>
        * unregisterContentScripts()</code>.
        * Optional.
        */
      var ids: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ContentScriptFilter {
      
      inline def apply(): ContentScriptFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContentScriptFilter]
      }
      
      extension [Self <: ContentScriptFilter](x: Self) {
        
        inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      }
    }
    
    /**
      * The JavaScript world for a script to execute within. We currently only support the <code>'ISOLATED'</code> world.
      */
    type ExecutionWorld = ISOLATED
    
    /**
      * Result of a script injection.
      */
    trait InjectionResult extends StObject {
      
      /**
        * Whether the script should inject into all frames within the tab. Defaults to false.
        * This must not be true if frameIds is specified.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * When the injection has failed, the error is exposed to the caller with this property.
        * Optional.
        */
      var error: js.UndefOr[InjectionResultErrorType] = js.undefined
      
      /**
        * The frame ID associated with the injection.
        */
      var frameId: Double
      
      /**
        * The result of the script execution.
        * Optional.
        */
      var result: js.UndefOr[Any] = js.undefined
    }
    object InjectionResult {
      
      inline def apply(frameId: Double): InjectionResult = {
        val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
        __obj.asInstanceOf[InjectionResult]
      }
      
      extension [Self <: InjectionResult](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setError(value: InjectionResultErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
        
        inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      }
    }
    
    /**
      * When the injection has failed, the error is exposed to the caller with this property.
      */
    trait InjectionResultErrorType extends StObject {
      
      /**
        * A message explaining why the injection has failed.
        */
      var message: String
    }
    object InjectionResultErrorType {
      
      inline def apply(message: String): InjectionResultErrorType = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[InjectionResultErrorType]
      }
      
      extension [Self <: InjectionResultErrorType](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Details of the script to insert.
      */
    trait InjectionTarget extends StObject {
      
      /**
        * Whether the script should inject into all frames within the tab. Defaults to false.
        * This must not be true if frameIds is specified.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The IDs of specific frames to inject into.
        * Optional.
        */
      var frameIds: js.UndefOr[js.Array[Double]] = js.undefined
      
      /**
        * The ID of the tab into which to inject.
        */
      var tabId: Double
    }
    object InjectionTarget {
      
      inline def apply(tabId: Double): InjectionTarget = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
        __obj.asInstanceOf[InjectionTarget]
      }
      
      extension [Self <: InjectionTarget](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setFrameIds(value: js.Array[Double]): Self = StObject.set(x, "frameIds", value.asInstanceOf[js.Any])
        
        inline def setFrameIdsUndefined: Self = StObject.set(x, "frameIds", js.undefined)
        
        inline def setFrameIdsVarargs(value: Double*): Self = StObject.set(x, "frameIds", js.Array(value*))
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    trait RegisteredContentScript extends StObject {
      
      /**
        * If specified true, it will inject into all frames, even if the frame is not the top-most frame in the tab.
        * Each frame is checked independently for URL requirements; it will not inject into child frames if the URL requirements
        * are not met. Defaults to false, meaning that only the top frame is matched.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The list of CSS files to be injected into matching pages. These are injected in the order they appear in this array.
        * Optional.
        */
      var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
      
      /**
        * Excludes pages that this content script would otherwise be injected into.
        * Optional.
        */
      var excludeMatches: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The id of the content script, specified in the API call.
        */
      var id: String
      
      /**
        * The list of JavaScript files to be injected into matching pages. These are injected in the order they appear in this
        * array.
        * Optional.
        */
      @JSName("js")
      var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.undefined
      
      /**
        * Specifies which pages this content script will be injected into. Must be specified for <code>registerContentScripts()
        * </code>.
        * Optional.
        */
      var matches: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Specifies if this content script will persist into future sessions. This is currently NOT supported.
        * Optional.
        */
      var persistAcrossSessions: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Specifies when JavaScript files are injected into the web page. The preferred and default value is <code>
        * document_idle</code>.
        * Optional.
        */
      var runAt: js.UndefOr[RunAt] = js.undefined
    }
    object RegisteredContentScript {
      
      inline def apply(id: String): RegisteredContentScript = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisteredContentScript]
      }
      
      extension [Self <: RegisteredContentScript](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCss(value: js.Array[ExtensionURL]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setCssVarargs(value: ExtensionURL*): Self = StObject.set(x, "css", js.Array(value*))
        
        inline def setExcludeMatches(value: js.Array[String]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
        
        inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
        
        inline def setExcludeMatchesVarargs(value: String*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setJs_(value: js.Array[ExtensionURL]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
        
        inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
        
        inline def setJs_Varargs(value: ExtensionURL*): Self = StObject.set(x, "js", js.Array(value*))
        
        inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
        
        inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
        
        inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
        
        inline def setPersistAcrossSessions(value: Boolean): Self = StObject.set(x, "persistAcrossSessions", value.asInstanceOf[js.Any])
        
        inline def setPersistAcrossSessionsUndefined: Self = StObject.set(x, "persistAcrossSessions", js.undefined)
        
        inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
        
        inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      }
    }
    
    /**
      * Details of a script injection
      */
    trait ScriptInjection extends StObject {
      
      /**
        * The arguments to curry into a provided function. This is only valid if the <code>func</code> parameter is specified.
        * These arguments must be JSON-serializable.
        * Optional.
        */
      var args: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * The path of the JS files to inject, relative to the extension's root directory. Exactly one of <code>files</code>
        * and <code>func</code> must be specified.
        * Optional.
        */
      var files: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A JavaScript function to inject. This function will be serialized, and then deserialized for injection.
        * This means that any bound parameters and execution context will be lost. Exactly one of <code>files</code> and <code>
        * func</code> must be specified.
        *
        * @param ...args The arguments
        * @returns The return value
        */
      var func: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
      
      /**
        * Whether the injection should be triggered in the target as soon as possible (but not necessarily prior to page load).
        * Optional.
        */
      var injectImmediately: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Details specifying the target into which to inject the script.
        */
      var target: InjectionTarget
      
      /**
        * Optional.
        */
      var world: js.UndefOr[ExecutionWorld] = js.undefined
    }
    object ScriptInjection {
      
      inline def apply(target: InjectionTarget): ScriptInjection = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ScriptInjection]
      }
      
      extension [Self <: ScriptInjection](x: Self) {
        
        inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
        
        inline def setFunc(value: /* repeated */ Any => Any): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
        
        inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
        
        inline def setInjectImmediately(value: Boolean): Self = StObject.set(x, "injectImmediately", value.asInstanceOf[js.Any])
        
        inline def setInjectImmediatelyUndefined: Self = StObject.set(x, "injectImmediately", js.undefined)
        
        inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
        
        inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Injects a script into a target context. The script will be run at <code>document_idle</code>.
        *
        * @param injection The details of the script which to inject.
        * @returns Invoked upon completion of the injection. The resulting array contains the result of execution for each frame
        * where the injection succeeded.
        */
      def executeScript(injection: ScriptInjection): js.Promise[js.Array[InjectionResult]] = js.native
      
      /**
        * Returns all dynamically registered content scripts for this extension that match the given filter.
        *
        * @param filter Optional. An object to filter the extension's dynamically registered scripts.
        * @returns The resulting array contains the registered content scripts.
        */
      def getRegisteredContentScripts(): js.Promise[js.Array[RegisteredContentScript]] = js.native
      def getRegisteredContentScripts(filter: ContentScriptFilter): js.Promise[js.Array[RegisteredContentScript]] = js.native
      
      /**
        * Inserts a CSS stylesheet into a target context. If multiple frames are specified, unsuccessful injections are ignored.
        *
        * @param injection The details of the styles to insert.
        * @returns Invoked upon completion of the injection.
        */
      def insertCSS(injection: CSSInjection): js.Promise[Unit] = js.native
      
      /**
        * Registers one or more content scripts for this extension.
        *
        * @param scripts Contains a list of scripts to be registered. If there are errors during script parsing/file validation,
        * or if the IDs specified already exist, then no scripts are registered.
        * @returns Invoked upon completion of the registration.
        */
      def registerContentScripts(scripts: js.Array[RegisteredContentScript]): js.Promise[Unit] = js.native
      
      /**
        * Removes a CSS stylesheet that was previously inserted by this extension from a target context.
        *
        * @param injection The details of the styles to remove. Note that the <code>css</code>, <code>files</code>, and <code>
        * origin</code> properties must exactly match the stylesheet inserted through <code>insertCSS</code>.
        * Attempting to remove a non-existent stylesheet is a no-op.
        * @returns Invoked upon completion of the injection.
        */
      def removeCSS(injection: CSSInjection): js.Promise[Unit] = js.native
      
      /**
        * Unregisters one or more content scripts for this extension.
        *
        * @param filter Optional. If specified, only unregisters dynamic content scripts which match the filter. Otherwise,
        * all of the extension's dynamic content scripts are unregistered.
        * @returns Invoked upon completion of the unregistration.
        */
      def unregisterContentScripts(): js.Promise[Unit] = js.native
      def unregisterContentScripts(filter: ContentScriptFilter): js.Promise[Unit] = js.native
      
      /**
        * Updates one or more content scripts for this extension.
        *
        * @param scripts Contains a list of scripts to be updated. If there are errors during script parsing/file validation,
        * or if the IDs specified do not already exist, then no scripts are updated.
        * @returns Invoked when scripts have been updated.
        */
      def updateContentScripts(scripts: js.Array[UpdateContentScriptsScriptsItemType]): js.Promise[Unit] = js.native
    }
    
    /**
      * The origin for a style change. See style origins for more info.
      *
      * "AUTHOR": The author origin is the style origin which contains all of the styles which are part of the document,
      * whether embedded within the HTML or loaded from an external stylesheet file.
      * "USER": The user origin is the style origin containing any CSS that the user of the web browser has added.
      * These may be from adding styles using a developer tool or from a browser extension that automatically applies custom
      * styles to content, such as Stylus or Stylish.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR
      - typings.webextensionPolyfill.webextensionPolyfillStrings.USER
    */
    trait StyleOrigin extends StObject
    object StyleOrigin {
      
      inline def AUTHOR: typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR = "AUTHOR".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.AUTHOR]
      
      inline def USER: typings.webextensionPolyfill.webextensionPolyfillStrings.USER = "USER".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.USER]
    }
    
    trait UpdateContentScriptsScriptsItemType
      extends StObject
         with RegisteredContentScript
    object UpdateContentScriptsScriptsItemType {
      
      inline def apply(id: String): UpdateContentScriptsScriptsItemType = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateContentScriptsScriptsItemType]
      }
    }
  }
}
