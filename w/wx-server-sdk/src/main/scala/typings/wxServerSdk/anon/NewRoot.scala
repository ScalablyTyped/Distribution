package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRoot extends StObject {
  
  var newRoot: js.Any
}
object NewRoot {
  
  @scala.inline
  def apply(newRoot: js.Any): NewRoot = {
    val __obj = js.Dynamic.literal(newRoot = newRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRoot]
  }
  
  @scala.inline
  implicit class NewRootMutableBuilder[Self <: NewRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewRoot(value: js.Any): Self = StObject.set(x, "newRoot", value.asInstanceOf[js.Any])
  }
}
