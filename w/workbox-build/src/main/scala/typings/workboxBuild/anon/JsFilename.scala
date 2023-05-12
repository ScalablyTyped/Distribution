package typings.workboxBuild.anon

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsFilename extends StObject {
  
  var jsFilename: String
  
  var originalMap: RawSourceMap
  
  var originalSource: String
  
  var replaceString: String
  
  var searchString: String
}
object JsFilename {
  
  inline def apply(
    jsFilename: String,
    originalMap: RawSourceMap,
    originalSource: String,
    replaceString: String,
    searchString: String
  ): JsFilename = {
    val __obj = js.Dynamic.literal(jsFilename = jsFilename.asInstanceOf[js.Any], originalMap = originalMap.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any], replaceString = replaceString.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsFilename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsFilename] (val x: Self) extends AnyVal {
    
    inline def setJsFilename(value: String): Self = StObject.set(x, "jsFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalMap(value: RawSourceMap): Self = StObject.set(x, "originalMap", value.asInstanceOf[js.Any])
    
    inline def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    
    inline def setReplaceString(value: String): Self = StObject.set(x, "replaceString", value.asInstanceOf[js.Any])
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
  }
}
