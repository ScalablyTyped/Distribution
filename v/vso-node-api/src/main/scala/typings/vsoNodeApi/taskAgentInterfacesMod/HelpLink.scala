package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelpLink extends StObject {
  
  var text: String
  
  var url: String
}
object HelpLink {
  
  @scala.inline
  def apply(text: String, url: String): HelpLink = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelpLink]
  }
  
  @scala.inline
  implicit class HelpLinkMutableBuilder[Self <: HelpLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
