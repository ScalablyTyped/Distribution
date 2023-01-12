package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDevtoolsInspectedWindowMod {
  
  object DevtoolsInspectedWindow {
    
    /**
      * An object providing details if an exception occurred while evaluating the expression.
      */
    trait EvalCallbackExceptionInfoType extends StObject {
      
      /**
        * Set if the error occurred on the DevTools side before the expression is evaluated.
        */
      var code: String
      
      /**
        * Set if the error occurred on the DevTools side before the expression is evaluated.
        */
      var description: String
      
      /**
        * Set if the error occurred on the DevTools side before the expression is evaluated,
        * contains the array of the values that may be substituted into the description string to provide more information about
        * the cause of the error.
        */
      var details: js.Array[Any]
      
      /**
        * Set if the error occurred on the DevTools side before the expression is evaluated.
        */
      var isError: Boolean
      
      /**
        * Set if the evaluated code produces an unhandled exception.
        */
      var isException: Boolean
      
      /**
        * Set if the evaluated code produces an unhandled exception.
        */
      var value: String
    }
    object EvalCallbackExceptionInfoType {
      
      inline def apply(
        code: String,
        description: String,
        details: js.Array[Any],
        isError: Boolean,
        isException: Boolean,
        value: String
      ): EvalCallbackExceptionInfoType = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isException = isException.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[EvalCallbackExceptionInfoType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EvalCallbackExceptionInfoType] (val x: Self) extends AnyVal {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: js.Array[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsVarargs(value: Any*): Self = StObject.set(x, "details", js.Array(value*))
        
        inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
        
        inline def setIsException(value: Boolean): Self = StObject.set(x, "isException", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options parameter can contain one or more options.
      */
    type EvalOptionsType = StringDictionary[Any]
    
    trait ReloadReloadOptionsType extends StObject {
      
      /**
        * When true, the loader will bypass the cache for all inspected page resources loaded before the <code>load</code>
        * event is fired. The effect is similar to pressing Ctrl+Shift+R in the inspected window or within the Developer Tools
        * window.
        * Optional.
        */
      var ignoreCache: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If specified, the script will be injected into every frame of the inspected page immediately upon load,
        * before any of the frame's scripts. The script will not be injected after subsequent reloads&mdash;for example,
        * if the user presses Ctrl+R.
        * Optional.
        */
      var injectedScript: js.UndefOr[String] = js.undefined
      
      /**
        * If specified, the string will override the value of the <code>User-Agent</code> HTTP header that's sent while loading
        * the resources of the inspected page. The string will also override the value of the <code>navigator.userAgent</code>
        * property that's returned to any scripts that are running within the inspected page.
        * Optional.
        */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object ReloadReloadOptionsType {
      
      inline def apply(): ReloadReloadOptionsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReloadReloadOptionsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ReloadReloadOptionsType] (val x: Self) extends AnyVal {
        
        inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
        
        inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
        
        inline def setInjectedScript(value: String): Self = StObject.set(x, "injectedScript", value.asInstanceOf[js.Any])
        
        inline def setInjectedScriptUndefined: Self = StObject.set(x, "injectedScript", js.undefined)
        
        inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    /**
      * A resource within the inspected page, such as a document, a script, or an image.
      */
    trait Resource extends StObject {
      
      /**
        * The URL of the resource.
        */
      var url: String
    }
    object Resource {
      
      inline def apply(url: String): Resource = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Resource]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Evaluates a JavaScript expression in the context of the main frame of the inspected page.
        * The expression must evaluate to a JSON-compliant object, otherwise an exception is thrown.
        * The eval function can report either a DevTools-side error or a JavaScript exception that occurs during evaluation.
        * In either case, the <code>result</code> parameter of the callback is <code>undefined</code>.
        * In the case of a DevTools-side error, the <code>isException</code> parameter is non-null and has <code>isError</code>
        * set to true and <code>code</code> set to an error code. In the case of a JavaScript error, <code>isException</code>
        * is set to true and <code>value</code> is set to the string value of thrown object.
        *
        * @param expression An expression to evaluate.
        * @param options Optional. The options parameter can contain one or more options.
        * @returns A function called when evaluation completes.
        */
      def eval(expression: String): js.Promise[js.Tuple2[Any, EvalCallbackExceptionInfoType]] = js.native
      def eval(expression: String, options: EvalOptionsType): js.Promise[js.Tuple2[Any, EvalCallbackExceptionInfoType]] = js.native
      
      /**
        * Reloads the inspected page.
        *
        * @param reloadOptions Optional.
        */
      def reload(): Unit = js.native
      def reload(reloadOptions: ReloadReloadOptionsType): Unit = js.native
      
      /**
        * The ID of the tab being inspected. This ID may be used with chrome.tabs.* API.
        */
      var tabId: Double = js.native
    }
  }
}
