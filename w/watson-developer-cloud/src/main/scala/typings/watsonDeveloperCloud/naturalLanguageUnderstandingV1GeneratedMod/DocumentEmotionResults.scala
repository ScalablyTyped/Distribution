package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Emotion results for the document as a whole. */
@js.native
trait DocumentEmotionResults extends js.Object {
  
  /** Emotion results for the document as a whole. */
  var emotion: js.UndefOr[EmotionScores] = js.native
}
object DocumentEmotionResults {
  
  @scala.inline
  def apply(): DocumentEmotionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentEmotionResults]
  }
  
  @scala.inline
  implicit class DocumentEmotionResultsOps[Self <: DocumentEmotionResults] (val x: Self) extends AnyVal {
    
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
    def setEmotion(value: EmotionScores): Self = this.set("emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
  }
}
