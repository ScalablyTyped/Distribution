package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QuestionsResult extends js.Object {
  /**
       * Flag indicating if there are more QnA threads to be shown (for paging)
       */
  var hasMoreQuestions: scala.Boolean
  /**
       * List of the QnA threads
       */
  var questions: js.Array[Question]
}

