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
  
  inline def apply(): EmotionLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmotionLabel] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
