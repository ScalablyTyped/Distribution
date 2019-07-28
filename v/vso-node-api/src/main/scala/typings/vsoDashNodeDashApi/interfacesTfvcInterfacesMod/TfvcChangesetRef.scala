package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetRef extends js.Object {
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any
  /**
    * Alias or display name of user
    */
  var author: IdentityRef
  /**
    * Id of the changeset.
    */
  var changesetId: Double
  /**
    * Alias or display name of user
    */
  var checkedInBy: IdentityRef
  /**
    * Comment for the changeset.
    */
  var comment: String
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: Boolean
  /**
    * Creation date of the changeset.
    */
  var createdDate: Date
  /**
    * URL to retrieve the item.
    */
  var url: String
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
    val __obj = js.Dynamic.literal(_links = _links, author = author, changesetId = changesetId, checkedInBy = checkedInBy, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, url = url)
  
    __obj.asInstanceOf[TfvcChangesetRef]
  }
}

