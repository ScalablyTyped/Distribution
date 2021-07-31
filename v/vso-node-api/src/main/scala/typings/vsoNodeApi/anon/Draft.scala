package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draft extends StObject {
  
  var abandoned: scala.Double
  
  var active: scala.Double
  
  var draft: scala.Double
  
  var undefined: scala.Double
}
object Draft {
  
  @scala.inline
  def apply(abandoned: scala.Double, active: scala.Double, draft: scala.Double, undefined: scala.Double): Draft = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
  
  @scala.inline
  implicit class DraftMutableBuilder[Self <: Draft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandoned(value: scala.Double): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraft(value: scala.Double): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
