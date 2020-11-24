package typings.webicon.urlDeclarationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlDeclarationBase extends js.Object {
  
  /**
    * The `GET`-variables of the url.
    */
  var params: js.UndefOr[js.Any] = js.native
  
  /**
    * The actual url.
    */
  var url: js.UndefOr[js.Any] = js.native
}
object UrlDeclarationBase {
  
  @scala.inline
  def apply(): UrlDeclarationBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDeclarationBase]
  }
  
  @scala.inline
  implicit class UrlDeclarationBaseOps[Self <: UrlDeclarationBase] (val x: Self) extends AnyVal {
    
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
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
