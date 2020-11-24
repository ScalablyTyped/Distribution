package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Content. */
@js.native
trait Content extends js.Object {
  
  /** An array of `ContentItem` objects that provides the text that is to be analyzed. */
  var content_items: js.Array[ContentItem] = js.native
}
object Content {
  
  @scala.inline
  def apply(content_items: js.Array[ContentItem]): Content = {
    val __obj = js.Dynamic.literal(content_items = content_items.asInstanceOf[js.Any])
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
    def setContent_itemsVarargs(value: ContentItem*): Self = this.set("content_items", js.Array(value :_*))
    
    @scala.inline
    def setContent_items(value: js.Array[ContentItem]): Self = this.set("content_items", value.asInstanceOf[js.Any])
  }
}
