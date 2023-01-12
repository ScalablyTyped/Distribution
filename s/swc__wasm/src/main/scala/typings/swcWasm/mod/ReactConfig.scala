package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.automatic
import typings.swcWasm.swcWasmStrings.classic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactConfig extends StObject {
  
  /**
    * Toggles plugins that aid in development, such as @swc/plugin-transform-react-jsx-self
    * and @swc/plugin-transform-react-jsx-source.
    *
    * Defaults to `false`,
    *
    */
  var development: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Declares the module specifier to be used for importing the `jsx` and `jsxs` factory functions when using `runtime` 'automatic'
    */
  var importSource: js.UndefOr[String] = js.undefined
  
  /**
    * Replace the function used when compiling JSX expressions.
    *
    * Defaults to `React.createElement`.
    */
  var pragma: js.UndefOr[String] = js.undefined
  
  /**
    * Replace the component used when compiling JSX fragments.
    *
    * Defaults to `React.Fragment`
    */
  var pragmaFrag: js.UndefOr[String] = js.undefined
  
  /**
    * Enable fast refresh feature for React app
    */
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * jsx runtime
    */
  var runtime: js.UndefOr[automatic | classic] = js.undefined
  
  /**
    * Toggles whether or not to throw an error if a XML namespaced tag name is used. For example:
    * `<f:image />`
    *
    * Though the JSX spec allows this, it is disabled by default since React's
    * JSX does not currently have support for it.
    *
    */
  var throwIfNamespace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use `Object.assign()` instead of `_extends`. Defaults to false.
    */
  var useBuiltins: js.UndefOr[Boolean] = js.undefined
}
object ReactConfig {
  
  inline def apply(): ReactConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactConfig] (val x: Self) extends AnyVal {
    
    inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
    
    inline def setImportSource(value: String): Self = StObject.set(x, "importSource", value.asInstanceOf[js.Any])
    
    inline def setImportSourceUndefined: Self = StObject.set(x, "importSource", js.undefined)
    
    inline def setPragma(value: String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
    
    inline def setPragmaFrag(value: String): Self = StObject.set(x, "pragmaFrag", value.asInstanceOf[js.Any])
    
    inline def setPragmaFragUndefined: Self = StObject.set(x, "pragmaFrag", js.undefined)
    
    inline def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRuntime(value: automatic | classic): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setThrowIfNamespace(value: Boolean): Self = StObject.set(x, "throwIfNamespace", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNamespaceUndefined: Self = StObject.set(x, "throwIfNamespace", js.undefined)
    
    inline def setUseBuiltins(value: Boolean): Self = StObject.set(x, "useBuiltins", value.asInstanceOf[js.Any])
    
    inline def setUseBuiltinsUndefined: Self = StObject.set(x, "useBuiltins", js.undefined)
  }
}
