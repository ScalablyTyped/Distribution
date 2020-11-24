package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITitleOwner extends js.Object {
  
  var isRequireTextAfterTitle: Boolean = js.native
  
  var isRequireTextBeforeTitle: Boolean = js.native
  
  var isRequireTextOnStart: Boolean = js.native
  
  var locTitle: LocalizableString = js.native
  
  var name: String = js.native
  
  var no: String = js.native
  
  var requiredText: String = js.native
}
object ITitleOwner {
  
  @scala.inline
  def apply(
    isRequireTextAfterTitle: Boolean,
    isRequireTextBeforeTitle: Boolean,
    isRequireTextOnStart: Boolean,
    locTitle: LocalizableString,
    name: String,
    no: String,
    requiredText: String
  ): ITitleOwner = {
    val __obj = js.Dynamic.literal(isRequireTextAfterTitle = isRequireTextAfterTitle.asInstanceOf[js.Any], isRequireTextBeforeTitle = isRequireTextBeforeTitle.asInstanceOf[js.Any], isRequireTextOnStart = isRequireTextOnStart.asInstanceOf[js.Any], locTitle = locTitle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITitleOwner]
  }
  
  @scala.inline
  implicit class ITitleOwnerOps[Self <: ITitleOwner] (val x: Self) extends AnyVal {
    
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
    def setIsRequireTextAfterTitle(value: Boolean): Self = this.set("isRequireTextAfterTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequireTextBeforeTitle(value: Boolean): Self = this.set("isRequireTextBeforeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequireTextOnStart(value: Boolean): Self = this.set("isRequireTextOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocTitle(value: LocalizableString): Self = this.set("locTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo(value: String): Self = this.set("no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredText(value: String): Self = this.set("requiredText", value.asInstanceOf[js.Any])
  }
}
