package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartiallyResolved extends js.Object {
  
  var partiallyResolved: scala.Double = js.native
  
  var resolved: scala.Double = js.native
  
  var unresolved: scala.Double = js.native
}
object PartiallyResolved {
  
  @scala.inline
  def apply(partiallyResolved: scala.Double, resolved: scala.Double, unresolved: scala.Double): PartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallyResolved]
  }
  
  @scala.inline
  implicit class PartiallyResolvedOps[Self <: PartiallyResolved] (val x: Self) extends AnyVal {
    
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
    def setPartiallyResolved(value: scala.Double): Self = this.set("partiallyResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolved(value: scala.Double): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnresolved(value: scala.Double): Self = this.set("unresolved", value.asInstanceOf[js.Any])
  }
}
