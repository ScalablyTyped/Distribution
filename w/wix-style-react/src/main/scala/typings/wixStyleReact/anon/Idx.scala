package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idx extends StObject {
  
  var idx: Any
  
  var option: Any
}
object Idx {
  
  inline def apply(idx: Any, option: Any): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  
  extension [Self <: Idx](x: Self) {
    
    inline def setIdx(value: Any): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setOption(value: Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
