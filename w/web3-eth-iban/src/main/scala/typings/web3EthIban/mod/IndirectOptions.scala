package typings.web3EthIban.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndirectOptions extends js.Object {
  
  var identifier: String = js.native
  
  var institution: String = js.native
}
object IndirectOptions {
  
  @scala.inline
  def apply(identifier: String, institution: String): IndirectOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectOptions]
  }
  
  @scala.inline
  implicit class IndirectOptionsOps[Self <: IndirectOptions] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution(value: String): Self = this.set("institution", value.asInstanceOf[js.Any])
  }
}
