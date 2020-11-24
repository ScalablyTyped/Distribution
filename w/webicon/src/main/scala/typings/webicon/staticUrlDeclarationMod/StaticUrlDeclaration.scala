package typings.webicon.staticUrlDeclarationMod

import typings.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticUrlDeclaration extends UrlDeclarationBase {
  
  @JSName("url")
  var url_StaticUrlDeclaration: js.UndefOr[String] = js.native
}
object StaticUrlDeclaration {
  
  @scala.inline
  def apply(): StaticUrlDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticUrlDeclaration]
  }
  
  @scala.inline
  implicit class StaticUrlDeclarationOps[Self <: StaticUrlDeclaration] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
