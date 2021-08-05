package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNeedRender extends StObject {
  
  var isNeedRender: Boolean
}
object IsNeedRender {
  
  inline def apply(isNeedRender: Boolean): IsNeedRender = {
    val __obj = js.Dynamic.literal(isNeedRender = isNeedRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNeedRender]
  }
  
  extension [Self <: IsNeedRender](x: Self) {
    
    inline def setIsNeedRender(value: Boolean): Self = StObject.set(x, "isNeedRender", value.asInstanceOf[js.Any])
  }
}
