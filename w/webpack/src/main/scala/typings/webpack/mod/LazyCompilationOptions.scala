package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for compiling entrypoints and import()s only when they are accessed.
  */
trait LazyCompilationOptions extends StObject {
  
  /**
  	 * Specifies the backend that should be used for handling client keep alive.
  	 */
  var backend: js.UndefOr[
    (js.Function2[
      /* compiler */ Compiler, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* api */ js.UndefOr[BackendApi], Unit], 
      Unit
    ]) | (js.Function1[/* compiler */ Compiler, js.Promise[BackendApi]]) | LazyCompilationDefaultBackendOptions
  ] = js.undefined
  
  /**
  	 * Enable/disable lazy compilation for entries.
  	 */
  var entries: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable lazy compilation for import() modules.
  	 */
  var imports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Specify which entrypoints or import()ed modules should be lazily compiled. This is matched with the imported module and not the entrypoint name.
  	 */
  var test: js.UndefOr[String | js.RegExp | (js.Function1[/* module */ Module, Boolean])] = js.undefined
}
object LazyCompilationOptions {
  
  inline def apply(): LazyCompilationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyCompilationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LazyCompilationOptions] (val x: Self) extends AnyVal {
    
    inline def setBackend(
      value: (js.Function2[
          /* compiler */ Compiler, 
          /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* api */ js.UndefOr[BackendApi], Unit], 
          Unit
        ]) | (js.Function1[/* compiler */ Compiler, js.Promise[BackendApi]]) | LazyCompilationDefaultBackendOptions
    ): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendFunction1(value: /* compiler */ Compiler => js.Promise[BackendApi]): Self = StObject.set(x, "backend", js.Any.fromFunction1(value))
    
    inline def setBackendFunction2(
      value: (/* compiler */ Compiler, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* api */ js.UndefOr[BackendApi], Unit]) => Unit
    ): Self = StObject.set(x, "backend", js.Any.fromFunction2(value))
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setImports(value: Boolean): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setTest(value: String | js.RegExp | (js.Function1[/* module */ Module, Boolean])): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestFunction1(value: /* module */ Module => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
