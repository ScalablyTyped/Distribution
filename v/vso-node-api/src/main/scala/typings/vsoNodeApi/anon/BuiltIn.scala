package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltIn extends js.Object {
  
  var builtIn: scala.Double = js.native
  
  var trusted: scala.Double = js.native
}
object BuiltIn {
  
  @scala.inline
  def apply(builtIn: scala.Double, trusted: scala.Double): BuiltIn = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltIn]
  }
  
  @scala.inline
  implicit class BuiltInOps[Self <: BuiltIn] (val x: Self) extends AnyVal {
    
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
    def setBuiltIn(value: scala.Double): Self = this.set("builtIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: scala.Double): Self = this.set("trusted", value.asInstanceOf[js.Any])
  }
}
