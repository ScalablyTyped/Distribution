package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HS256 extends js.Object {
  
  var hS256: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var rS256: scala.Double = js.native
}
object HS256 {
  
  @scala.inline
  def apply(hS256: scala.Double, none: scala.Double, rS256: scala.Double): HS256 = {
    val __obj = js.Dynamic.literal(hS256 = hS256.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rS256 = rS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[HS256]
  }
  
  @scala.inline
  implicit class HS256Ops[Self <: HS256] (val x: Self) extends AnyVal {
    
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
    def setHS256(value: scala.Double): Self = this.set("hS256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRS256(value: scala.Double): Self = this.set("rS256", value.asInstanceOf[js.Any])
  }
}
