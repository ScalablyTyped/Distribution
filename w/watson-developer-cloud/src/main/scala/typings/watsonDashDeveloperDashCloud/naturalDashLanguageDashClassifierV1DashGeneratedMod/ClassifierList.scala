package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** List of available classifiers. */
trait ClassifierList extends js.Object {
  /** The classifiers available to the user. Returns an empty array if no classifiers are available. */
  var classifiers: js.Array[Classifier]
}

object ClassifierList {
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): ClassifierList = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassifierList]
  }
}

