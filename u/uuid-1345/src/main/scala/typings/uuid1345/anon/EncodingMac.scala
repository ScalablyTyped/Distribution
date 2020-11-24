package typings.uuid1345.anon

import typings.uuid1345.uuid1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingMac extends js.Object {
  
  var encoding: binary = js.native
  
  var mac: js.UndefOr[Boolean] = js.native
}
object EncodingMac {
  
  @scala.inline
  def apply(encoding: binary): EncodingMac = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingMac]
  }
  
  @scala.inline
  implicit class EncodingMacOps[Self <: EncodingMac] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Boolean): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
  }
}
