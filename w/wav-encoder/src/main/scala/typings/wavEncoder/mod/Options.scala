package typings.wavEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bitDepth: Double = js.native
  
  var float: Boolean = js.native
  
  var symmetric: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(bitDepth: Double, float: Boolean, symmetric: Boolean): Options = {
    val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], symmetric = symmetric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBitDepth(value: Double): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymmetric(value: Boolean): Self = this.set("symmetric", value.asInstanceOf[js.Any])
  }
}
