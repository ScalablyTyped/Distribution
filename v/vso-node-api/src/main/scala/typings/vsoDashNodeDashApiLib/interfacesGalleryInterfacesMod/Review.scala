package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /**
    * Admin Reply, if any, for this review
    */
  var adminReply: ReviewReply
  /**
    * Unique identifier of a review item
    */
  var id: scala.Double
  /**
    * Flag for soft deletion
    */
  var isDeleted: scala.Boolean
  var isIgnored: scala.Boolean
  /**
    * Version of the product for which review was submitted
    */
  var productVersion: java.lang.String
  /**
    * Rating procided by the user
    */
  var rating: scala.Double
  /**
    * Reply, if any, for this review
    */
  var reply: ReviewReply
  /**
    * Text description of the review
    */
  var text: java.lang.String
  /**
    * Title of the review
    */
  var title: java.lang.String
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: stdLib.Date
  /**
    * Name of the user
    */
  var userDisplayName: java.lang.String
  /**
    * Id of the user who submitted the review
    */
  var userId: java.lang.String
}

