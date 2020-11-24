package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slug extends js.Object {
  
  var slug: Nullable[String] = js.native
}
object Slug {
  
  @scala.inline
  def apply(): Slug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slug]
  }
  
  @scala.inline
  implicit class SlugOps[Self <: Slug] (val x: Self) extends AnyVal {
    
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
    def setSlug(value: Nullable[String]): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlugNull: Self = this.set("slug", null)
  }
}
