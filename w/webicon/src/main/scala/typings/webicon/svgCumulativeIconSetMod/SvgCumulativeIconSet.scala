package typings.webicon.svgCumulativeIconSetMod

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvgCumulativeIconSet extends SvgIcon {
  
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: `true` = js.native
  
  /**
    * The number of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.native
}
object SvgCumulativeIconSet {
  
  @scala.inline
  def apply(cumulative: `true`): SvgCumulativeIconSet = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSet]
  }
  
  @scala.inline
  implicit class SvgCumulativeIconSetOps[Self <: SvgCumulativeIconSet] (val x: Self) extends AnyVal {
    
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
    def setCumulative(value: `true`): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitDuration(value: Double): Self = this.set("waitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitDuration: Self = this.set("waitDuration", js.undefined)
  }
}
