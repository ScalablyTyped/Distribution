package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corpus. */
@js.native
trait Corpus extends js.Object {
  
  /** If the status of the corpus is `undetermined`, the following message: `Analysis of corpus 'name' failed. Please try adding the corpus again by setting the 'allow_overwrite' flag to 'true'`. */
  var error: js.UndefOr[String] = js.native
  
  /** The name of the corpus. */
  var name: String = js.native
  
  /** The number of OOV words in the corpus. The value is `0` while the corpus is being processed. */
  var out_of_vocabulary_words: Double = js.native
  
  /** The status of the corpus: * `analyzed`: The service successfully analyzed the corpus. The custom model can be trained with data from the corpus. * `being_processed`: The service is still analyzing the corpus. The service cannot accept requests to add new resources or to train the custom model. * `undetermined`: The service encountered an error while processing the corpus. The `error` field describes the failure. */
  var status: String = js.native
  
  /** The total number of words in the corpus. The value is `0` while the corpus is being processed. */
  var total_words: Double = js.native
}
object Corpus {
  
  @scala.inline
  def apply(name: String, out_of_vocabulary_words: Double, status: String, total_words: Double): Corpus = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out_of_vocabulary_words = out_of_vocabulary_words.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_words = total_words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corpus]
  }
  
  @scala.inline
  implicit class CorpusOps[Self <: Corpus] (val x: Self) extends AnyVal {
    
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
    def setTotal_words(value: Double): Self = this.set("total_words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
