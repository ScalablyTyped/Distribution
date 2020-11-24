package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousChange extends js.Object {
  
  var firstParent: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var previousChange: scala.Double = js.native
}
object PreviousChange {
  
  @scala.inline
  def apply(firstParent: scala.Double, none: scala.Double, previousChange: scala.Double): PreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousChange]
  }
  
  @scala.inline
  implicit class PreviousChangeOps[Self <: PreviousChange] (val x: Self) extends AnyVal {
    
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
    def setFirstParent(value: scala.Double): Self = this.set("firstParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousChange(value: scala.Double): Self = this.set("previousChange", value.asInstanceOf[js.Any])
  }
}
