package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseLinkDestination extends StObject {
  
  var parseLinkDestination: js.Any = js.native
  
  var parseLinkLabel: js.Any = js.native
  
  var parseLinkTitle: js.Any = js.native
}
object ParseLinkDestination {
  
  @scala.inline
  def apply(parseLinkDestination: js.Any, parseLinkLabel: js.Any, parseLinkTitle: js.Any): ParseLinkDestination = {
    val __obj = js.Dynamic.literal(parseLinkDestination = parseLinkDestination.asInstanceOf[js.Any], parseLinkLabel = parseLinkLabel.asInstanceOf[js.Any], parseLinkTitle = parseLinkTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLinkDestination]
  }
  
  @scala.inline
  implicit class ParseLinkDestinationMutableBuilder[Self <: ParseLinkDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParseLinkDestination(value: js.Any): Self = StObject.set(x, "parseLinkDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseLinkLabel(value: js.Any): Self = StObject.set(x, "parseLinkLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseLinkTitle(value: js.Any): Self = StObject.set(x, "parseLinkTitle", value.asInstanceOf[js.Any])
  }
}
