package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents ratios used in media operations. */
@js.native
trait MediaRatio extends js.Object {
  
  /** The denominator of the MediaRatio. */
  var denominator: Double = js.native
  
  /** The numerator of the MediaRatio. */
  var numerator: Double = js.native
}
object MediaRatio {
  
  @scala.inline
  def apply(denominator: Double, numerator: Double): MediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRatio]
  }
  
  @scala.inline
  implicit class MediaRatioOps[Self <: MediaRatio] (val x: Self) extends AnyVal {
    
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
    def setDenominator(value: Double): Self = this.set("denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumerator(value: Double): Self = this.set("numerator", value.asInstanceOf[js.Any])
  }
}
