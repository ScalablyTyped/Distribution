package typings.testingLibraryDom

import typings.std.Element
import typings.testingLibraryDom.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@testing-library/dom/types/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Config]
  
  @js.native
  trait Config extends StObject {
    
    var asyncUtilTimeout: Double = js.native
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    def asyncWrapper(cb: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = js.native
    
    var computedStyleSupportsPseudoElements: Boolean = js.native
    
    var defaultHidden: Boolean = js.native
    
    /** default value for the `ignore` option in `ByText` queries */
    var defaultIgnore: String = js.native
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    def eventWrapper(cb: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    def getElementError(message: String, container: Element): js.Error = js.native
    def getElementError(message: Null, container: Element): js.Error = js.native
    
    var showOriginalStackTrace: Boolean = js.native
    
    var testIdAttribute: String = js.native
    
    var throwSuggestions: Boolean = js.native
    
    /**
      * WARNING: `unstable` prefix means this API may change in patch and minor releases.
      * @param cb
      */
    def unstable_advanceTimersWrapper(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
  }
  
  type ConfigFn = js.Function1[/* existingConfig */ Config, PartialConfig]
}
