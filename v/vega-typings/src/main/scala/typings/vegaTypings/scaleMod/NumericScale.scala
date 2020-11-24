package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericScale extends ContinuousScale {
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.native
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.native
}
object NumericScale {
  
  @scala.inline
  def apply(name: String): NumericScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericScale]
  }
  
  @scala.inline
  implicit class NumericScaleOps[Self <: NumericScale] (val x: Self) extends AnyVal {
    
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
    def setNice(value: Boolean | Double | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}
