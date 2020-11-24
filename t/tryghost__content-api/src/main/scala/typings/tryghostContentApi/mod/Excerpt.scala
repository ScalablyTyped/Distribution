package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Excerpt extends js.Object {
  
  var custom_excerpt: js.UndefOr[String] = js.native
  
  var excerpt: js.UndefOr[String] = js.native
}
object Excerpt {
  
  @scala.inline
  def apply(): Excerpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excerpt]
  }
  
  @scala.inline
  implicit class ExcerptOps[Self <: Excerpt] (val x: Self) extends AnyVal {
    
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
    def setCustom_excerpt(value: String): Self = this.set("custom_excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_excerpt: Self = this.set("custom_excerpt", js.undefined)
    
    @scala.inline
    def setExcerpt(value: String): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcerpt: Self = this.set("excerpt", js.undefined)
  }
}
