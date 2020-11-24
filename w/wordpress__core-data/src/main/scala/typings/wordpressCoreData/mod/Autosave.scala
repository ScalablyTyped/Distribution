package typings.wordpressCoreData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'edit' extends 'embed' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.PostRevision> : 'edit' extends 'view' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.PostRevision> : @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'> */ @js.native
trait Autosave extends js.Object {
  
  var preview_link: String = js.native
}
object Autosave {
  
  @scala.inline
  def apply(preview_link: String): Autosave = {
    val __obj = js.Dynamic.literal(preview_link = preview_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autosave]
  }
  
  @scala.inline
  implicit class AutosaveOps[Self <: Autosave] (val x: Self) extends AnyVal {
    
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
    def setPreview_link(value: String): Self = this.set("preview_link", value.asInstanceOf[js.Any])
  }
}
