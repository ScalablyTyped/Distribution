package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
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
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
