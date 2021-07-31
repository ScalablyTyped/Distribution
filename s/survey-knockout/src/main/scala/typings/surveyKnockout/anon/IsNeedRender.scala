package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNeedRender extends StObject {
  
  var isNeedRender: Boolean
}
object IsNeedRender {
  
  @scala.inline
  def apply(isNeedRender: Boolean): IsNeedRender = {
    val __obj = js.Dynamic.literal(isNeedRender = isNeedRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNeedRender]
  }
  
  @scala.inline
  implicit class IsNeedRenderMutableBuilder[Self <: IsNeedRender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNeedRender(value: Boolean): Self = StObject.set(x, "isNeedRender", value.asInstanceOf[js.Any])
  }
}
