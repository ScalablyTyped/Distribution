package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmotionLabel
  extends StObject
     with _SystemStyleObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object EmotionLabel {
  
  @scala.inline
  def apply(): EmotionLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionLabel]
  }
  
  @scala.inline
  implicit class EmotionLabelMutableBuilder[Self <: EmotionLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
