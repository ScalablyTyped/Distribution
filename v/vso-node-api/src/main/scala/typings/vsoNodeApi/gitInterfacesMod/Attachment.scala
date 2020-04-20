package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any
  /**
    * The person that uploaded this attachment.
    */
  var author: IdentityRef
  /**
    * Content hash of on-disk representation of file content. Its calculated by the server by using SHA1 hash function.
    */
  var contentHash: String
  /**
    * The time the attachment was uploaded.
    */
  var createdDate: Date
  /**
    * The description of the attachment.
    */
  var description: String
  /**
    * The display name of the attachment. Can't be null or empty.
    */
  var displayName: String
  /**
    * Id of the attachment.
    */
  var id: Double
  /**
    * Extended properties.
    */
  var properties: js.Any
  /**
    * The url to download the content of the attachment.
    */
  var url: String
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
}

