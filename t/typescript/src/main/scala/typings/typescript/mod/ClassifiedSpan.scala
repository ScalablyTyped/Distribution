package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifiedSpan extends js.Object {
  
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
  implicit class ClassifiedSpanOps[Self <: ClassifiedSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassificationType(value: ClassificationTypeNames): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
  }
}
