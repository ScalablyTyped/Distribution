package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
@js.native
trait AlternateWordForm extends js.Object {
  
  /** Gets the text of the alternate word form identified by this AlternateWordForm object. */
  var alternateText: String = js.native
  
  /** Gets the normalization format for this current AlternateWordForm object. */
  var normalizationFormat: AlternateNormalizationFormat = js.native
  
  /** Gets the TextSegment that identifies the source text's sub-string for which this AlternateWordForm object is an alternate. */
  var sourceTextSegment: TextSegment = js.native
}
object AlternateWordForm {
  
  @scala.inline
  def apply(
    alternateText: String,
    normalizationFormat: AlternateNormalizationFormat,
    sourceTextSegment: TextSegment
  ): AlternateWordForm = {
    val __obj = js.Dynamic.literal(alternateText = alternateText.asInstanceOf[js.Any], normalizationFormat = normalizationFormat.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateWordForm]
  }
  
  @scala.inline
  implicit class AlternateWordFormOps[Self <: AlternateWordForm] (val x: Self) extends AnyVal {
    
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
    def setAlternateText(value: String): Self = this.set("alternateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFormat(value: AlternateNormalizationFormat): Self = this.set("normalizationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTextSegment(value: TextSegment): Self = this.set("sourceTextSegment", value.asInstanceOf[js.Any])
  }
}
