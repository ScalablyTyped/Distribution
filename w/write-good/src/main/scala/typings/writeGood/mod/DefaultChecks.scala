package typings.writeGood.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultChecks extends js.Object {
  
  /** Checks for adverbs that can weaken meaning: really, very, extremely, etc. Enabled by default */
  var adverb: js.UndefOr[Boolean] = js.native
  
  /** Checks for common cliches. Enabled by default */
  var cliches: js.UndefOr[Boolean] = js.native
  
  /** Checks for {@link https://en.wikipedia.org/wiki/E-Prime|"to-be"} verbs. **Disabled** by default */
  var eprime: js.UndefOr[Boolean] = js.native
  
  /** Checks for lexical illusions – cases where a word is repeated. Enabled by default */
  var illusion: js.UndefOr[Boolean] = js.native
  
  /** Checks for passive voice. Enabled by default */
  var passive: js.UndefOr[Boolean] = js.native
  
  /** Checks for so at the beginning of the sentence. Enabled by default */
  var so: js.UndefOr[Boolean] = js.native
  
  /** Checks for there is or there are at the beginning of the sentence. Enabled by default */
  var thereIs: js.UndefOr[Boolean] = js.native
  
  /** Checks for wordy phrases and unnecessary words.. Enabled by default */
  var tooWordy: js.UndefOr[Boolean] = js.native
  
  /** Checks for "weasel words." Enabled by default */
  var weasel: js.UndefOr[Boolean] = js.native
}
object DefaultChecks {
  
  @scala.inline
  def apply(): DefaultChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultChecks]
  }
  
  @scala.inline
  implicit class DefaultChecksOps[Self <: DefaultChecks] (val x: Self) extends AnyVal {
    
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
    def setAdverb(value: Boolean): Self = this.set("adverb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdverb: Self = this.set("adverb", js.undefined)
    
    @scala.inline
    def setCliches(value: Boolean): Self = this.set("cliches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCliches: Self = this.set("cliches", js.undefined)
    
    @scala.inline
    def setEprime(value: Boolean): Self = this.set("eprime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEprime: Self = this.set("eprime", js.undefined)
    
    @scala.inline
    def setIllusion(value: Boolean): Self = this.set("illusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIllusion: Self = this.set("illusion", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    
    @scala.inline
    def setSo(value: Boolean): Self = this.set("so", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSo: Self = this.set("so", js.undefined)
    
    @scala.inline
    def setThereIs(value: Boolean): Self = this.set("thereIs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThereIs: Self = this.set("thereIs", js.undefined)
    
    @scala.inline
    def setTooWordy(value: Boolean): Self = this.set("tooWordy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooWordy: Self = this.set("tooWordy", js.undefined)
    
    @scala.inline
    def setWeasel(value: Boolean): Self = this.set("weasel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeasel: Self = this.set("weasel", js.undefined)
  }
}
