package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboveNormal extends js.Object {
  
  var aboveNormal: scala.Double = js.native
  
  var belowNormal: scala.Double = js.native
  
  var high: scala.Double = js.native
  
  var low: scala.Double = js.native
  
  var normal: scala.Double = js.native
}
object AboveNormal {
  
  @scala.inline
  def apply(
    aboveNormal: scala.Double,
    belowNormal: scala.Double,
    high: scala.Double,
    low: scala.Double,
    normal: scala.Double
  ): AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveNormal]
  }
  
  @scala.inline
  implicit class AboveNormalOps[Self <: AboveNormal] (val x: Self) extends AnyVal {
    
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
    def setAboveNormal(value: scala.Double): Self = this.set("aboveNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelowNormal(value: scala.Double): Self = this.set("belowNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: scala.Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: scala.Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: scala.Double): Self = this.set("normal", value.asInstanceOf[js.Any])
  }
}
