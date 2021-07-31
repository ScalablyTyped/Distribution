package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var comment: String
  
  var content: String
  
  var contentLeft: String
  
  var description: String
  
  var descriptionUnderInput: String
  
  var flowRoot: String
  
  var formGroup: String
  
  var hasError: String
  
  var header: String
  
  var headerLeft: String
  
  var indent: Double
  
  var mainRoot: String
  
  var number: String
  
  var required: String
  
  var requiredText: String
  
  var title: String
  
  var titleLeftRoot: String
  
  var titleRequired: String
}
object Comment {
  
  @scala.inline
  def apply(
    comment: String,
    content: String,
    contentLeft: String,
    description: String,
    descriptionUnderInput: String,
    flowRoot: String,
    formGroup: String,
    hasError: String,
    header: String,
    headerLeft: String,
    indent: Double,
    mainRoot: String,
    number: String,
    required: String,
    requiredText: String,
    title: String,
    titleLeftRoot: String,
    titleRequired: String
  ): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentLeft = contentLeft.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionUnderInput = descriptionUnderInput.asInstanceOf[js.Any], flowRoot = flowRoot.asInstanceOf[js.Any], formGroup = formGroup.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerLeft = headerLeft.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], mainRoot = mainRoot.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleLeftRoot = titleLeftRoot.asInstanceOf[js.Any], titleRequired = titleRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLeft(value: String): Self = StObject.set(x, "contentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUnderInput(value: String): Self = StObject.set(x, "descriptionUnderInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowRoot(value: String): Self = StObject.set(x, "flowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormGroup(value: String): Self = StObject.set(x, "formGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasError(value: String): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeft(value: String): Self = StObject.set(x, "headerLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainRoot(value: String): Self = StObject.set(x, "mainRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredText(value: String): Self = StObject.set(x, "requiredText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLeftRoot(value: String): Self = StObject.set(x, "titleLeftRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRequired(value: String): Self = StObject.set(x, "titleRequired", value.asInstanceOf[js.Any])
  }
}
