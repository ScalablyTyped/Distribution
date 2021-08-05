package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var complete: js.Any
}
object Complete {
  
  inline def apply(complete: js.Any): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setComplete(value: js.Any): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
  }
}
