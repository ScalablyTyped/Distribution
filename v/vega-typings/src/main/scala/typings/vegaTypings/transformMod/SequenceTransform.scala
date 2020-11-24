package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var start: Double | SignalRef = js.native
  
  var step: js.UndefOr[Double | SignalRef] = js.native
  
  var stop: Double | SignalRef = js.native
  
  var `type`: sequence = js.native
}
object SequenceTransform {
  
  @scala.inline
  def apply(start: Double | SignalRef, stop: Double | SignalRef, `type`: sequence): SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceTransform]
  }
  
  @scala.inline
  implicit class SequenceTransformOps[Self <: SequenceTransform] (val x: Self) extends AnyVal {
    
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
    def setStart(value: Double | SignalRef): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double | SignalRef): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sequence): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
