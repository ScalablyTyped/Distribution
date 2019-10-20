package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining a single tokenizaion rule. */
trait TokenDictRule extends js.Object {
  /** The part of speech that the `text` string belongs to. For example `noun`. Custom parts of speech can be specified. */
  var part_of_speech: String
  /** Array of tokens that represent the content of the `text` field in an alternate character set. */
  var readings: js.UndefOr[js.Array[String]] = js.undefined
  /** The string to tokenize. */
  var text: String
  /** Array of tokens that the `text` field is split into when found. */
  var tokens: js.Array[String]
}

object TokenDictRule {
  @scala.inline
  def apply(part_of_speech: String, text: String, tokens: js.Array[String], readings: js.Array[String] = null): TokenDictRule = {
    val __obj = js.Dynamic.literal(part_of_speech = part_of_speech, text = text, tokens = tokens)
    if (readings != null) __obj.updateDynamic("readings")(readings)
    __obj.asInstanceOf[TokenDictRule]
  }
}

