package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Grammar. */
trait Grammar extends js.Object {
  /** If the status of the grammar is `undetermined`, the following message: `Analysis of grammar '{grammar_name}' failed. Please try fixing the error or adding the grammar again by setting the 'allow_overwrite' flag to 'true'.`. */
  var error: js.UndefOr[String] = js.undefined
  /** The name of the grammar. */
  var name: String
  /** The number of OOV words in the grammar. The value is `0` while the grammar is being processed. */
  var out_of_vocabulary_words: Double
  /** The status of the grammar: * `analyzed`: The service successfully analyzed the grammar. The custom model can be trained with data from the grammar. * `being_processed`: The service is still analyzing the grammar. The service cannot accept requests to add new resources or to train the custom model. * `undetermined`: The service encountered an error while processing the grammar. The `error` field describes the failure. */
  var status: String
}

object Grammar {
  @scala.inline
  def apply(name: String, out_of_vocabulary_words: Double, status: String, error: String = null): Grammar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out_of_vocabulary_words = out_of_vocabulary_words.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
}

