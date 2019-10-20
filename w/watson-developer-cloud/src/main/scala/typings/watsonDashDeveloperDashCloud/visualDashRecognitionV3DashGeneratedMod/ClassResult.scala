package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Result of a class within a classifier. */
trait ClassResult extends js.Object {
  /** Name of the class. Class names are translated in the language defined by the **Accept-Language** request header for the build-in classifier IDs (`default`, `food`, and `explicit`). Class names of custom classifiers are not translated. The response might not be in the specified language when the requested language is not supported or when there is no translation for the class name. */
  var class_name: String
  /** Confidence score for the property in the range of 0 to 1. A higher score indicates greater likelihood that the class is depicted in the image. The default threshold for returning scores from a classifier is 0.5. */
  var score: Double
  /** Knowledge graph of the property. For example, `/fruit/pome/apple/eating apple/Granny Smith`. Included only if identified. */
  var type_hierarchy: js.UndefOr[String] = js.undefined
}

object ClassResult {
  @scala.inline
  def apply(class_name: String, score: Double, type_hierarchy: String = null): ClassResult = {
    val __obj = js.Dynamic.literal(class_name = class_name, score = score)
    if (type_hierarchy != null) __obj.updateDynamic("type_hierarchy")(type_hierarchy)
    __obj.asInstanceOf[ClassResult]
  }
}

