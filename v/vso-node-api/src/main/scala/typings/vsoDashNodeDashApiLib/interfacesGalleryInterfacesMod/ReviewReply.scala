package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReviewReply extends js.Object {
  /**
       * Id of the reply
       */
  var id: scala.Double
  /**
       * Flag for soft deletion
       */
  var isDeleted: scala.Boolean
  /**
       * Version of the product when the reply was submitted or updated
       */
  var productVersion: java.lang.String
  /**
       * Content of the reply
       */
  var replyText: java.lang.String
  /**
       * Id of the review, to which this reply belongs
       */
  var reviewId: scala.Double
  /**
       * Title of the reply
       */
  var title: java.lang.String
  /**
       * Date the reply was submitted or updated
       */
  var updatedDate: stdLib.Date
  /**
       * Id of the user who left the reply
       */
  var userId: java.lang.String
}

