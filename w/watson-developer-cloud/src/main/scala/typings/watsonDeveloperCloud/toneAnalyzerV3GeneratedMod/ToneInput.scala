package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneInput. */
trait ToneInput extends js.Object {
  /** The input content that the service is to analyze. */
  var text: String
}

object ToneInput {
  @scala.inline
  def apply(text: String): ToneInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneInput]
  }
}

