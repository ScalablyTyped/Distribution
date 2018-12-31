package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Id of the changeset.
    */
  var changesetId: scala.Double
  /**
    * Alias or display name of user
    */
  var checkedInBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Comment for the changeset.
    */
  var comment: java.lang.String
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: scala.Boolean
  /**
    * Creation date of the changeset.
    */
  var createdDate: stdLib.Date
  /**
    * URL to retrieve the item.
    */
  var url: java.lang.String
}

