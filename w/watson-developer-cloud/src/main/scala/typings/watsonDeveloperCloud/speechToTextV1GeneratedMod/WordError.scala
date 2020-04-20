package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordError. */
trait WordError extends js.Object {
  /** A key-value pair that describes an error associated with the definition of a word in the words resource. Each pair has the format `"element": "message"`, where `element` is the aspect of the definition that caused the problem and `message` describes the problem. The following example describes a problem with one of the word's sounds-like definitions: `"{sounds_like_string}": "Numbers are not allowed in sounds-like. You can try for example '{suggested_string}'."` You must correct the error before you can train the model. */
  var element: String
}

object WordError {
  @scala.inline
  def apply(element: String): WordError = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordError]
  }
}

