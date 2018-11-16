package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QnAItem extends js.Object {
  /**
       * Time when the review was first created
       */
  var createdDate: stdLib.Date
  /**
       * Unique identifier of a QnA item
       */
  var id: scala.Double
  /**
       * Get status of item
       */
  var status: QnAItemStatus
  /**
       * Text description of the QnA item
       */
  var text: java.lang.String
  /**
       * Time when the review was edited/updated
       */
  var updatedDate: stdLib.Date
  /**
       * User details for the item.
       */
  var user: UserIdentityRef
}

