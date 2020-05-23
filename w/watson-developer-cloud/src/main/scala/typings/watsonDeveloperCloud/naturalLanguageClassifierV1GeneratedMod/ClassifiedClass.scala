package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class and confidence. */
trait ClassifiedClass extends js.Object {
  /** Class label. */
  var class_name: js.UndefOr[String] = js.undefined
  /** A decimal percentage that represents the confidence that Watson has in this class. Higher values represent higher confidences. */
  var confidence: js.UndefOr[Double] = js.undefined
}

object ClassifiedClass {
  @scala.inline
  def apply(class_name: String = null, confidence: js.UndefOr[Double] = js.undefined): ClassifiedClass = {
    val __obj = js.Dynamic.literal()
    if (class_name != null) __obj.updateDynamic("class_name")(class_name.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedClass]
  }
}

