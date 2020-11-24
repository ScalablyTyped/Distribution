package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ------------------0_0--------------------
  * @description Defines For String Methods
  * @see https://github.com/node-modules/utility#others
  * -------------------0^0---------------------
  */
@js.native
trait IReplaceInvalidHttpHeaderCharReturns extends js.Object {
  
  var invalid: Boolean = js.native
  
  var `val`: String = js.native
}
object IReplaceInvalidHttpHeaderCharReturns {
  
  @scala.inline
  def apply(invalid: Boolean, `val`: String): IReplaceInvalidHttpHeaderCharReturns = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  }
  
  @scala.inline
  implicit class IReplaceInvalidHttpHeaderCharReturnsOps[Self <: IReplaceInvalidHttpHeaderCharReturns] (val x: Self) extends AnyVal {
    
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
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
