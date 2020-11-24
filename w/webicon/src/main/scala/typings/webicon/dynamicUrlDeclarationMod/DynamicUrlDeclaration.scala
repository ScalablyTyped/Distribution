package typings.webicon.dynamicUrlDeclarationMod

import typings.webicon.staticUrlDeclarationMod.StaticUrlDeclaration
import typings.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicUrlDeclaration[T] extends UrlDeclarationBase {
  
  /**
    * Either the actual url or a function for generating the url.
    */
  @JSName("url")
  var url_DynamicUrlDeclaration: js.UndefOr[String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])] = js.native
}
object DynamicUrlDeclaration {
  
  @scala.inline
  def apply[T](): DynamicUrlDeclaration[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicUrlDeclaration[T]]
  }
  
  @scala.inline
  implicit class DynamicUrlDeclarationOps[Self <: DynamicUrlDeclaration[_], T] (val x: Self with DynamicUrlDeclaration[T]) extends AnyVal {
    
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
    def setUrlFunction1(value: /* args */ T => String | StaticUrlDeclaration): Self = this.set("url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
