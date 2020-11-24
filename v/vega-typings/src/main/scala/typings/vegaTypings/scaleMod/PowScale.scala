package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.pow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowScale
  extends NumericScale
     with Scale {
  
  var exponent: Double | SignalRef = js.native
  
  @JSName("type")
  var type_PowScale: pow = js.native
}
object PowScale {
  
  @scala.inline
  def apply(exponent: Double | SignalRef, name: String, `type`: pow): PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowScale]
  }
  
  @scala.inline
  implicit class PowScaleOps[Self <: PowScale] (val x: Self) extends AnyVal {
    
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
    def setExponent(value: Double | SignalRef): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pow): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
