package typings.wordpressCoreData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'edit' extends 'embed' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.PostRevision> : 'edit' extends 'view' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.PostRevision> : @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'> */ trait Autosave extends js.Object {
  var preview_link: String
}

object Autosave {
  @scala.inline
  def apply(preview_link: String): Autosave = {
    val __obj = js.Dynamic.literal(preview_link = preview_link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Autosave]
  }
}

