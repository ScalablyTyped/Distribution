package typings.stripe.mod.fileLinks

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileLinksListOptions extends IListOptionsCreated {
  
  /**
    * Filter links by their expiration status. By default, all links are returned.
    */
  var expired: js.UndefOr[Boolean] = js.native
  
  /**
    * Only return links for the given file.
    */
  var file: js.UndefOr[String] = js.native
}
object IFileLinksListOptions {
  
  @scala.inline
  def apply(): IFileLinksListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileLinksListOptions]
  }
  
  @scala.inline
  implicit class IFileLinksListOptionsOps[Self <: IFileLinksListOptions] (val x: Self) extends AnyVal {
    
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
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
