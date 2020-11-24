package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcChangesetRef extends js.Object {
  
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any = js.native
  
  /**
    * Alias or display name of user
    */
  var author: IdentityRef = js.native
  
  /**
    * Id of the changeset.
    */
  var changesetId: Double = js.native
  
  /**
    * Alias or display name of user
    */
  var checkedInBy: IdentityRef = js.native
  
  /**
    * Comment for the changeset.
    */
  var comment: String = js.native
  
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: Boolean = js.native
  
  /**
    * Creation date of the changeset.
    */
  var createdDate: Date = js.native
  
  /**
    * URL to retrieve the item.
    */
  var url: String = js.native
}
object TfvcChangesetRef {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    changesetId: Double,
    checkedInBy: IdentityRef,
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
    url: String
  ): TfvcChangesetRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changesetId = changesetId.asInstanceOf[js.Any], checkedInBy = checkedInBy.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetRef]
  }
  
  @scala.inline
  implicit class TfvcChangesetRefOps[Self <: TfvcChangesetRef] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesetId(value: Double): Self = this.set("changesetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedInBy(value: IdentityRef): Self = this.set("checkedInBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = this.set("commentTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
