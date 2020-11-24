package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.opreturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpReturnOutput extends Output {
  
  var dataHex: String = js.native
  
  var `type`: opreturn = js.native
}
object OpReturnOutput {
  
  @scala.inline
  def apply(dataHex: String, `type`: opreturn): OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpReturnOutput]
  }
  
  @scala.inline
  implicit class OpReturnOutputOps[Self <: OpReturnOutput] (val x: Self) extends AnyVal {
    
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
    def setDataHex(value: String): Self = this.set("dataHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: opreturn): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
