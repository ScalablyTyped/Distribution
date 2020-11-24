package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Emotion results for a specified target. */
@js.native
trait TargetedEmotionResults extends js.Object {
  
  /** The emotion results for the target. */
  var emotion: js.UndefOr[EmotionScores] = js.native
  
  /** Targeted text. */
  var text: js.UndefOr[String] = js.native
}
object TargetedEmotionResults {
  
  @scala.inline
  def apply(): TargetedEmotionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedEmotionResults]
  }
  
  @scala.inline
  implicit class TargetedEmotionResultsOps[Self <: TargetedEmotionResults] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
