package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Grammar. */
@js.native
trait Grammar extends js.Object {
  
  /** If the status of the grammar is `undetermined`, the following message: `Analysis of grammar '{grammar_name}' failed. Please try fixing the error or adding the grammar again by setting the 'allow_overwrite' flag to 'true'.`. */
  var error: js.UndefOr[String] = js.native
  
  /** The name of the grammar. */
  var name: String = js.native
  
  /** The number of OOV words in the grammar. The value is `0` while the grammar is being processed. */
  var out_of_vocabulary_words: Double = js.native
  
  /** The status of the grammar: * `analyzed`: The service successfully analyzed the grammar. The custom model can be trained with data from the grammar. * `being_processed`: The service is still analyzing the grammar. The service cannot accept requests to add new resources or to train the custom model. * `undetermined`: The service encountered an error while processing the grammar. The `error` field describes the failure. */
  var status: String = js.native
}
object Grammar {
  
  @scala.inline
  def apply(name: String, out_of_vocabulary_words: Double, status: String): Grammar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out_of_vocabulary_words = out_of_vocabulary_words.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
  
  @scala.inline
  implicit class GrammarOps[Self <: Grammar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut_of_vocabulary_words(value: Double): Self = this.set("out_of_vocabulary_words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
