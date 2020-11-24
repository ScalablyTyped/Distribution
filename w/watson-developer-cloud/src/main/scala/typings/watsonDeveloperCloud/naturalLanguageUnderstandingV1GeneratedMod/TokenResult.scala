package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TokenResult. */
@js.native
trait TokenResult extends js.Object {
  
  /** The [lemma](https://wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.native
  
  /** Character offsets indicating the beginning and end of the token in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
  
  /** The part of speech of the token. For descriptions of the values, see [Universal Dependencies POS tags](https://universaldependencies.org/u/pos/). */
  var part_of_speech: js.UndefOr[String] = js.native
  
  /** The token as it appears in the analyzed text. */
  var text: js.UndefOr[String] = js.native
}
object TokenResult {
  
  @scala.inline
  def apply(): TokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResult]
  }
  
  @scala.inline
  implicit class TokenResultOps[Self <: TokenResult] (val x: Self) extends AnyVal {
    
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
    def setLemma(value: String): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLemma: Self = this.set("lemma", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPart_of_speech(value: String): Self = this.set("part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart_of_speech: Self = this.set("part_of_speech", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
