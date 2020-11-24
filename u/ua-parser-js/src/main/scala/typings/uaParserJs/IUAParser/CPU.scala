package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPU extends js.Object {
  
  var ARCHITECTURE: String = js.native
}
object CPU {
  
  @scala.inline
  def apply(ARCHITECTURE: String): CPU = {
    val __obj = js.Dynamic.literal(ARCHITECTURE = ARCHITECTURE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
  
  @scala.inline
  implicit class CPUOps[Self <: CPU] (val x: Self) extends AnyVal {
    
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
    def setARCHITECTURE(value: String): Self = this.set("ARCHITECTURE", value.asInstanceOf[js.Any])
  }
}
