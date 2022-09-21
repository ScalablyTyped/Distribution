package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagInfo extends StObject {
  
  var data: Any
  
  var next: js.UndefOr[TagInfo] = js.undefined
  
  var tag: Any
}
object TagInfo {
  
  inline def apply(data: Any, tag: Any): TagInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagInfo]
  }
  
  extension [Self <: TagInfo](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNext(value: TagInfo): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
