package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterTransform extends StObject {
  
  var afterTransform: js.Any
  
  var runtimeStylesheetId: module | namespace
}
object AfterTransform {
  
  inline def apply(afterTransform: js.Any, runtimeStylesheetId: module | namespace): AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = afterTransform.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterTransform]
  }
  
  extension [Self <: AfterTransform](x: Self) {
    
    inline def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    inline def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
  }
}
