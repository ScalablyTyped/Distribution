package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITitleOwner extends StObject {
  
  var isRequireTextAfterTitle: Boolean
  
  var isRequireTextBeforeTitle: Boolean
  
  var isRequireTextOnStart: Boolean
  
  var locTitle: LocalizableString
  
  var name: String
  
  var no: String
  
  var requiredText: String
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
  implicit class ITitleOwnerMutableBuilder[Self <: ITitleOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequireTextAfterTitle(value: Boolean): Self = StObject.set(x, "isRequireTextAfterTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequireTextBeforeTitle(value: Boolean): Self = StObject.set(x, "isRequireTextBeforeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequireTextOnStart(value: Boolean): Self = StObject.set(x, "isRequireTextOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocTitle(value: LocalizableString): Self = StObject.set(x, "locTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo(value: String): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredText(value: String): Self = StObject.set(x, "requiredText", value.asInstanceOf[js.Any])
  }
}
