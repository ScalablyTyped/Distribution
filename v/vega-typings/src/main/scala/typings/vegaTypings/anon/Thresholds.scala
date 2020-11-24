package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thresholds extends js.Object {
  
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
}
object Thresholds {
  
  @scala.inline
  def apply(): Thresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thresholds]
  }
  
  @scala.inline
  implicit class ThresholdsOps[Self <: Thresholds] (val x: Self) extends AnyVal {
    
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
    def setThresholdsVarargs(value: (Double | SignalRef)*): Self = this.set("thresholds", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
}
