package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
@js.native
trait AlternateWordForm extends StObject {
  
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
  implicit class AlternateWordFormMutableBuilder[Self <: AlternateWordForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateText(value: String): Self = StObject.set(x, "alternateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFormat(value: AlternateNormalizationFormat): Self = StObject.set(x, "normalizationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTextSegment(value: TextSegment): Self = StObject.set(x, "sourceTextSegment", value.asInstanceOf[js.Any])
  }
}
