package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleIndex extends StObject {
  
  var handleIndex: Double
}
object HandleIndex {
  
  @scala.inline
  def apply(handleIndex: Double): HandleIndex = {
    val __obj = js.Dynamic.literal(handleIndex = handleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleIndex]
  }
  
  @scala.inline
  implicit class HandleIndexMutableBuilder[Self <: HandleIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleIndex(value: Double): Self = StObject.set(x, "handleIndex", value.asInstanceOf[js.Any])
  }
}
