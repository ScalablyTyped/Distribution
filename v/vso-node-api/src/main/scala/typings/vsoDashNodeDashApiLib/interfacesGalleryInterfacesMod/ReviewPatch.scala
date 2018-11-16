package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReviewPatch extends js.Object {
  /**
       * Denotes the patch operation type
       */
  var operation: ReviewPatchOperation
  /**
       * Use when patch operation is FlagReview
       */
  var reportedConcern: UserReportedConcern
  /**
       * Use when patch operation is EditReview
       */
  var reviewItem: Review
}

