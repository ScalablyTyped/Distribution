package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
  var container: String = js.native
  
  var description: String = js.native
  
  var footer: String = js.native
  
  var icon: String = js.native
  
  var iconExpanded: String = js.native
  
  var number: String = js.native
  
  var requiredText: String = js.native
  
  var title: String = js.native
  
  var titleExpandable: String = js.native
  
  var titleOnError: String = js.native
}
object Container {
  
  @scala.inline
  def apply(
    container: String,
    description: String,
    footer: String,
    icon: String,
    iconExpanded: String,
    number: String,
    requiredText: String,
    title: String,
    titleExpandable: String,
    titleOnError: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any], titleOnError = titleOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconExpanded(value: String): Self = StObject.set(x, "iconExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredText(value: String): Self = StObject.set(x, "requiredText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleExpandable(value: String): Self = StObject.set(x, "titleExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOnError(value: String): Self = StObject.set(x, "titleOnError", value.asInstanceOf[js.Any])
  }
}
