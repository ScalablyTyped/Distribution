package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLinkDestination extends StObject {
  
  var parseLinkDestination: scala.Any
  
  var parseLinkLabel: scala.Any
  
  var parseLinkTitle: scala.Any
}
object ParseLinkDestination {
  
  inline def apply(parseLinkDestination: scala.Any, parseLinkLabel: scala.Any, parseLinkTitle: scala.Any): ParseLinkDestination = {
    val __obj = js.Dynamic.literal(parseLinkDestination = parseLinkDestination.asInstanceOf[js.Any], parseLinkLabel = parseLinkLabel.asInstanceOf[js.Any], parseLinkTitle = parseLinkTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLinkDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseLinkDestination] (val x: Self) extends AnyVal {
    
    inline def setParseLinkDestination(value: scala.Any): Self = StObject.set(x, "parseLinkDestination", value.asInstanceOf[js.Any])
    
    inline def setParseLinkLabel(value: scala.Any): Self = StObject.set(x, "parseLinkLabel", value.asInstanceOf[js.Any])
    
    inline def setParseLinkTitle(value: scala.Any): Self = StObject.set(x, "parseLinkTitle", value.asInstanceOf[js.Any])
  }
}
