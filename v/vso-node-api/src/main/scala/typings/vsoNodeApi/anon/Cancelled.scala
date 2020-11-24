package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelled extends js.Object {
  
  var cancelled: scala.Double = js.native
  
  var error: scala.Double = js.native
  
  var published: scala.Double = js.native
  
  var unpublished: scala.Double = js.native
}
object Cancelled {
  
  @scala.inline
  def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  
  @scala.inline
  implicit class CancelledOps[Self <: Cancelled] (val x: Self) extends AnyVal {
    
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
    def setCancelled(value: scala.Double): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: scala.Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished(value: scala.Double): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpublished(value: scala.Double): Self = this.set("unpublished", value.asInstanceOf[js.Any])
  }
}
