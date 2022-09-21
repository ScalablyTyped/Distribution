package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var paths: StringDictionary[js.Array[String]]
}
object BaseUrl {
  
  inline def apply(paths: StringDictionary[js.Array[String]]): BaseUrl = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  extension [Self <: BaseUrl](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
