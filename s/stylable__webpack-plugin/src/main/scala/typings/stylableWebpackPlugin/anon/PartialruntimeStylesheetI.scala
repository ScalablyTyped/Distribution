package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  runtimeStylesheetId :'module' | 'namespace',   afterTransform :any}> */
trait PartialruntimeStylesheetI extends StObject {
  
  var afterTransform: js.UndefOr[js.Any] = js.undefined
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.undefined
}
object PartialruntimeStylesheetI {
  
  inline def apply(): PartialruntimeStylesheetI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialruntimeStylesheetI]
  }
  
  extension [Self <: PartialruntimeStylesheetI](x: Self) {
    
    inline def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    inline def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    inline def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
  }
}
