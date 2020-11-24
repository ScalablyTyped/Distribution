package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstWalkOptions extends js.Object {
  
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
  implicit class AstWalkOptionsOps[Self <: AstWalkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGoChildren(value: Boolean): Self = this.set("goChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopWalking(value: Boolean): Self = this.set("stopWalking", value.asInstanceOf[js.Any])
  }
}
