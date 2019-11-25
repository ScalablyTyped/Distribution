package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Classifier and score combination. */
trait ClassifierResult extends js.Object {
  /** Classes within the classifier. */
  var classes: js.Array[ClassResult]
  /** ID of a classifier identified in the image. */
  var classifier_id: String
  /** Name of the classifier. */
  var name: String
}

object ClassifierResult {
  @scala.inline
  def apply(classes: js.Array[ClassResult], classifier_id: String, name: String): ClassifierResult = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassifierResult]
  }
}

