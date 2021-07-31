package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  var definition: scala.Double
  
  var draft: scala.Double
}
object Definition {
  
  @scala.inline
  def apply(definition: scala.Double, draft: scala.Double): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: scala.Double): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraft(value: scala.Double): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
  }
}
