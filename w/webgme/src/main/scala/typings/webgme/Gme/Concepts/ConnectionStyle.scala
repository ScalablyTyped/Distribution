package typings.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStyle extends js.Object {
  
  var endArrow: String = js.native
  
  var startArrow: String = js.native
}
object ConnectionStyle {
  
  @scala.inline
  def apply(endArrow: String, startArrow: String): ConnectionStyle = {
    val __obj = js.Dynamic.literal(endArrow = endArrow.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStyle]
  }
  
  @scala.inline
  implicit class ConnectionStyleOps[Self <: ConnectionStyle] (val x: Self) extends AnyVal {
    
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
    def setEndArrow(value: String): Self = this.set("endArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartArrow(value: String): Self = this.set("startArrow", value.asInstanceOf[js.Any])
  }
}
