package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Content hash of on-disk representation of file content. Its calculated by the server by using SHA1 hash function.
    */
  var contentHash: java.lang.String
  /**
    * The time the attachment was uploaded.
    */
  var createdDate: stdLib.Date
  /**
    * The description of the attachment.
    */
  var description: java.lang.String
  /**
    * The display name of the attachment. Can't be null or empty.
    */
  var displayName: java.lang.String
  /**
    * Id of the attachment.
    */
  var id: scala.Double
  /**
    * Extended properties.
    */
  var properties: js.Any
  /**
    * The url to download the content of the attachment.
    */
  var url: java.lang.String
}

object Attachment {
  @scala.inline
  def apply(
    _links: js.Any,
    author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    contentHash: java.lang.String,
    createdDate: stdLib.Date,
    description: java.lang.String,
    displayName: java.lang.String,
    id: scala.Double,
    properties: js.Any,
    url: java.lang.String
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("contentHash")(contentHash)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Attachment]
  }
}

