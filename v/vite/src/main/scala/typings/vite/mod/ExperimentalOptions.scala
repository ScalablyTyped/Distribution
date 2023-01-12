package typings.vite.mod

import typings.vite.anon.HostId
import typings.vite.anon.Relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentalOptions extends StObject {
  
  /**
    * Enables support of HMR partial accept via `import.meta.hot.acceptExports`.
    *
    * @experimental
    * @default false
    */
  var hmrPartialAccept: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Append fake `&lang.(ext)` when queries are specified, to preserve the file extension for following plugins to process.
    *
    * @experimental
    * @default false
    */
  var importGlobRestoreExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow finegrain control over assets and public files paths
    *
    * @experimental
    */
  var renderBuiltUrl: js.UndefOr[RenderBuiltAssetUrl] = js.undefined
}
object ExperimentalOptions {
  
  inline def apply(): ExperimentalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentalOptions] (val x: Self) extends AnyVal {
    
    inline def setHmrPartialAccept(value: Boolean): Self = StObject.set(x, "hmrPartialAccept", value.asInstanceOf[js.Any])
    
    inline def setHmrPartialAcceptUndefined: Self = StObject.set(x, "hmrPartialAccept", js.undefined)
    
    inline def setImportGlobRestoreExtension(value: Boolean): Self = StObject.set(x, "importGlobRestoreExtension", value.asInstanceOf[js.Any])
    
    inline def setImportGlobRestoreExtensionUndefined: Self = StObject.set(x, "importGlobRestoreExtension", js.undefined)
    
    inline def setRenderBuiltUrl(value: (/* filename */ String, /* type */ HostId) => js.UndefOr[String | Relative]): Self = StObject.set(x, "renderBuiltUrl", js.Any.fromFunction2(value))
    
    inline def setRenderBuiltUrlUndefined: Self = StObject.set(x, "renderBuiltUrl", js.undefined)
  }
}
