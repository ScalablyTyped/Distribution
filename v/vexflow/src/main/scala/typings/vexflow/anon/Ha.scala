package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ha extends js.Object {
  
  var ha: Double = js.native
  
  var o: js.Array[String] = js.native
  
  var x_max: Double = js.native
  
  var x_min: Double = js.native
}
object Ha {
  
  @scala.inline
  def apply(ha: Double, o: js.Array[String], x_max: Double, x_min: Double): Ha = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ha]
  }
  
  @scala.inline
  implicit class HaOps[Self <: Ha] (val x: Self) extends AnyVal {
    
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
    def setHa(value: Double): Self = this.set("ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOVarargs(value: String*): Self = this.set("o", js.Array(value :_*))
    
    @scala.inline
    def setO(value: js.Array[String]): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_max(value: Double): Self = this.set("x_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_min(value: Double): Self = this.set("x_min", value.asInstanceOf[js.Any])
  }
}
