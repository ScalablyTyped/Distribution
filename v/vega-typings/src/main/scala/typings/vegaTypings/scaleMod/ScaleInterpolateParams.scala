package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typings.vegaTypings.vegaTypingsStrings.cubehelix
import typings.vegaTypings.vegaTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleInterpolateParams extends ScaleInterpolate {
  
  var gamma: js.UndefOr[Double | SignalRef] = js.native
  
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef = js.native
}
object ScaleInterpolateParams {
  
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
  
  @scala.inline
  implicit class ScaleInterpolateParamsOps[Self <: ScaleInterpolateParams] (val x: Self) extends AnyVal {
    
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
    def setType(value: rgb | cubehelix | `cubehelix-long` | SignalRef): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamma(value: Double | SignalRef): Self = this.set("gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
  }
}
