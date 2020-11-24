package typings.stripe.mod.sources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISourceRetrieveOptions extends js.Object {
  
  var client_secret: js.UndefOr[String] = js.native
}
object ISourceRetrieveOptions {
  
  @scala.inline
  def apply(): ISourceRetrieveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceRetrieveOptions]
  }
  
  @scala.inline
  implicit class ISourceRetrieveOptionsOps[Self <: ISourceRetrieveOptions] (val x: Self) extends AnyVal {
    
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
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
  }
}
