package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Words. */
trait Words extends js.Object {
  /** An array of `Word` objects that provides information about each word in the custom model's words resource. The array is empty if the custom model has no words. */
  var words: js.Array[Word]
}

object Words {
  @scala.inline
  def apply(words: js.Array[Word]): Words = {
    val __obj = js.Dynamic.literal(words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
}

