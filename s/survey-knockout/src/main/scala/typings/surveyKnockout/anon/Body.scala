package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: String
  
  var header: ButtonCollapsed
  
  var root: String
}
object Body {
  
  @scala.inline
  def apply(body: String, header: ButtonCollapsed, root: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ButtonCollapsed): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
