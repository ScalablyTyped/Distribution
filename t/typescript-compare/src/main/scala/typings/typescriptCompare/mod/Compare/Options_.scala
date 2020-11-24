package typings.typescriptCompare.mod.Compare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options_ extends js.Object {
  
  var broaderLeft: js.Any = js.native
  
  var broaderRight: js.Any = js.native
  
  var equal: js.Any = js.native
  
  var mismatch: js.Any = js.native
}
object Options_ {
  
  @scala.inline
  def apply(broaderLeft: js.Any, broaderRight: js.Any, equal: js.Any, mismatch: js.Any): Options_ = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    
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
    def setBroaderLeft(value: js.Any): Self = this.set("broaderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroaderRight(value: js.Any): Self = this.set("broaderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqual(value: js.Any): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMismatch(value: js.Any): Self = this.set("mismatch", value.asInstanceOf[js.Any])
  }
}
