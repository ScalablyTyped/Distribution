package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewId extends StObject {
  
  var viewId: String
}
object ViewId {
  
  @scala.inline
  def apply(viewId: String): ViewId = {
    val __obj = js.Dynamic.literal(viewId = viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewId]
  }
  
  @scala.inline
  implicit class ViewIdMutableBuilder[Self <: ViewId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
  }
}
