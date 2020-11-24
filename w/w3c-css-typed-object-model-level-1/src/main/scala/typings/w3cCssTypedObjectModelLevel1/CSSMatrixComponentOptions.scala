package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSMatrixComponentOptions extends js.Object {
  
  var is2D: Boolean = js.native
}
object CSSMatrixComponentOptions {
  
  @scala.inline
  def apply(is2D: Boolean): CSSMatrixComponentOptions = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMatrixComponentOptions]
  }
  
  @scala.inline
  implicit class CSSMatrixComponentOptionsOps[Self <: CSSMatrixComponentOptions] (val x: Self) extends AnyVal {
    
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
    def setIs2D(value: Boolean): Self = this.set("is2D", value.asInstanceOf[js.Any])
  }
}
