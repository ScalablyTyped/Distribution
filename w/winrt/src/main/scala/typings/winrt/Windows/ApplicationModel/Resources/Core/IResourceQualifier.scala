package typings.winrt.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceQualifier extends js.Object {
  
  var isDefault: Boolean = js.native
  
  var isMatch: Boolean = js.native
  
  var qualifierName: String = js.native
  
  var qualifierValue: String = js.native
  
  var score: Double = js.native
}
object IResourceQualifier {
  
  @scala.inline
  def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): IResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceQualifier]
  }
  
  @scala.inline
  implicit class IResourceQualifierOps[Self <: IResourceQualifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMatch(value: Boolean): Self = this.set("isMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierName(value: String): Self = this.set("qualifierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierValue(value: String): Self = this.set("qualifierValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
