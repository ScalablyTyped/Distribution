package typings.tablesorter.intervalOptionsMod

import typings.tablesorter.numericOptionsMod.NumericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalOptions extends NumericOptions {
  
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.native
}
object IntervalOptions {
  
  @scala.inline
  def apply(): IntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalOptions]
  }
  
  @scala.inline
  implicit class IntervalOptionsOps[Self <: IntervalOptions] (val x: Self) extends AnyVal {
    
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
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
