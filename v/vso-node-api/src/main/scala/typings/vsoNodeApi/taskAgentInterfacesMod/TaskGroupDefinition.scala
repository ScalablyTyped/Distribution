package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskGroupDefinition extends StObject {
  
  var displayName: String
  
  var isExpanded: Boolean
  
  var name: String
  
  var tags: js.Array[String]
  
  var visibleRule: String
}
object TaskGroupDefinition {
  
  @scala.inline
  def apply(
    displayName: String,
    isExpanded: Boolean,
    name: String,
    tags: js.Array[String],
    visibleRule: String
  ): TaskGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroupDefinition]
  }
  
  @scala.inline
  implicit class TaskGroupDefinitionMutableBuilder[Self <: TaskGroupDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVisibleRule(value: String): Self = StObject.set(x, "visibleRule", value.asInstanceOf[js.Any])
  }
}
