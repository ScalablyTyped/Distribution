package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Request payload to classify. */
trait ClassifyInput extends js.Object {
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: String
}

object ClassifyInput {
  @scala.inline
  def apply(text: String): ClassifyInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyInput]
  }
}

