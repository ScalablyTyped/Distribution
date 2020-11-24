package typings.victory.anon

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XArrayYArray extends _CategoryPropType {
  
  var x: js.Array[String] = js.native
  
  var y: js.Array[String] = js.native
}
object XArrayYArray {
  
  @scala.inline
  def apply(x: js.Array[String], y: js.Array[String]): XArrayYArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArrayYArray]
  }
  
  @scala.inline
  implicit class XArrayYArrayOps[Self <: XArrayYArray] (val x: Self) extends AnyVal {
    
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
    def setXVarargs(value: String*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: js.Array[String]): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: String*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[String]): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
