package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Translation. */
trait Translation extends js.Object {
  /** Translation output in UTF-8. */
  var translation_output: String
}

object Translation {
  @scala.inline
  def apply(translation_output: String): Translation = {
    val __obj = js.Dynamic.literal(translation_output = translation_output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
}

