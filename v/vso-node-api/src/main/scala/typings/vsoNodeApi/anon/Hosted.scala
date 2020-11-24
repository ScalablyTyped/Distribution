package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hosted extends js.Object {
  
  var all: scala.Double = js.native
  
  var hosted: scala.Double = js.native
  
  var onPremises: scala.Double = js.native
}
object Hosted {
  
  @scala.inline
  def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Hosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosted]
  }
  
  @scala.inline
  implicit class HostedOps[Self <: Hosted] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosted(value: scala.Double): Self = this.set("hosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremises(value: scala.Double): Self = this.set("onPremises", value.asInstanceOf[js.Any])
  }
}
