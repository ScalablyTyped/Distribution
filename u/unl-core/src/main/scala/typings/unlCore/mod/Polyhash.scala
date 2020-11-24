package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyhash extends js.Object {
  
  var data: js.Array[String] = js.native
  
  var precision: Double = js.native
}
object Polyhash {
  
  @scala.inline
  def apply(data: js.Array[String], precision: Double): Polyhash = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyhash]
  }
  
  @scala.inline
  implicit class PolyhashOps[Self <: Polyhash] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: String*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
  }
}
