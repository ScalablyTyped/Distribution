package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends js.Object {
  
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  
  /**
    * The person that uploaded this attachment.
    */
  var author: IdentityRef = js.native
  
  /**
    * Content hash of on-disk representation of file content. Its calculated by the server by using SHA1 hash function.
    */
  var contentHash: String = js.native
  
  /**
    * The time the attachment was uploaded.
    */
  var createdDate: Date = js.native
  
  /**
    * The description of the attachment.
    */
  var description: String = js.native
  
  /**
    * The display name of the attachment. Can't be null or empty.
    */
  var displayName: String = js.native
  
  /**
    * Id of the attachment.
    */
  var id: Double = js.native
  
  /**
    * Extended properties.
    */
  var properties: js.Any = js.native
  
  /**
    * The url to download the content of the attachment.
    */
  var url: String = js.native
}
object Attachment {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    contentHash: String,
    createdDate: Date,
    description: String,
    displayName: String,
    id: Double,
    properties: js.Any,
    url: String
  ): Attachment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], contentHash = contentHash.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    
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
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
