package typings.wdioTypes.buildOptionsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSConfigPathsOptions extends StObject {
  
  var addMatchAll: js.UndefOr[Boolean] = js.undefined
  
  var baseUrl: String
  
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var paths: Record[String, js.Array[String]]
}
object TSConfigPathsOptions {
  
  inline def apply(baseUrl: String, paths: Record[String, js.Array[String]]): TSConfigPathsOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConfigPathsOptions]
  }
  
  extension [Self <: TSConfigPathsOptions](x: Self) {
    
    inline def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
    
    inline def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setPaths(value: Record[String, js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
