package typings.tslint.anon

import typings.tslint.tagExclusionMod.IContentTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var content: IContentTags = js.native
  
  var existence: js.Array[String] = js.native
}
object Content {
  
  @scala.inline
  def apply(content: IContentTags, existence: js.Array[String]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    
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
    def setContent(value: IContentTags): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistenceVarargs(value: String*): Self = this.set("existence", js.Array(value :_*))
    
    @scala.inline
    def setExistence(value: js.Array[String]): Self = this.set("existence", value.asInstanceOf[js.Any])
  }
}
