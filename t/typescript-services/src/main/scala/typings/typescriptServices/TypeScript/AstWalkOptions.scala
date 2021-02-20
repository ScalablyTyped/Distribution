package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstWalkOptions extends StObject {
  
  var goChildren: Boolean = js.native
  
  var stopWalking: Boolean = js.native
}
object AstWalkOptions {
  
  @scala.inline
  def apply(goChildren: Boolean, stopWalking: Boolean): AstWalkOptions = {
    val __obj = js.Dynamic.literal(goChildren = goChildren.asInstanceOf[js.Any], stopWalking = stopWalking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstWalkOptions]
  }
  
  @scala.inline
  implicit class AstWalkOptionsMutableBuilder[Self <: AstWalkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoChildren(value: Boolean): Self = StObject.set(x, "goChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopWalking(value: Boolean): Self = StObject.set(x, "stopWalking", value.asInstanceOf[js.Any])
  }
}
