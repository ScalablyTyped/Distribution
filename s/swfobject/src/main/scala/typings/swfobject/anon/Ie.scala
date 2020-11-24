package typings.swfobject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ie extends js.Object {
  
      // number or boolean
  var ie: Boolean = js.native
  
  var mac: Boolean = js.native
  
  var pv: js.Array[Double] = js.native
  
  var w3: Boolean = js.native
  
  var win: Boolean = js.native
  
  var wk: js.Any = js.native
}
object Ie {
  
  @scala.inline
  def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: js.Any): Ie = {
    val __obj = js.Dynamic.literal(ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], w3 = w3.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], wk = wk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ie]
  }
  
  @scala.inline
  implicit class IeOps[Self <: Ie] (val x: Self) extends AnyVal {
    
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
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Boolean): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvVarargs(value: Double*): Self = this.set("pv", js.Array(value :_*))
    
    @scala.inline
    def setPv(value: js.Array[Double]): Self = this.set("pv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW3(value: Boolean): Self = this.set("w3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin(value: Boolean): Self = this.set("win", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWk(value: js.Any): Self = this.set("wk", value.asInstanceOf[js.Any])
  }
}
