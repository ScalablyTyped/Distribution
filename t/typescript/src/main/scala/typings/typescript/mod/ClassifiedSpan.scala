package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifiedSpan extends StObject {
  
  var classificationType: ClassificationTypeNames = js.native
  
  var textSpan: TextSpan = js.native
}
object ClassifiedSpan {
  
  @scala.inline
  def apply(classificationType: ClassificationTypeNames, textSpan: TextSpan): ClassifiedSpan = {
    val __obj = js.Dynamic.literal(classificationType = classificationType.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedSpan]
  }
  
  @scala.inline
  implicit class ClassifiedSpanMutableBuilder[Self <: ClassifiedSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassificationType(value: ClassificationTypeNames): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
