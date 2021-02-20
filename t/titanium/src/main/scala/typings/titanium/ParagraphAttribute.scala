package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract datatype for specifying an Paragraph style attribute.
  */
@js.native
trait ParagraphAttribute extends StObject {
  
  /**
    * The text alignment of the receiver.
    */
  var alignment: js.UndefOr[Double] = js.native
  
  /**
    * A Boolean value indicating whether the system may tighten inter-character spacing
    * before truncating text.
    */
  var allowsDefaultTighteningForTruncation: js.UndefOr[Boolean] = js.native
  
  /**
    * The indentation of the first line of the receiver.
    */
  var firstLineHeadIndent: js.UndefOr[Double | String] = js.native
  
  /**
    * The indentation of the lines of lines other than the first.
    */
  var headIndent: js.UndefOr[Double | String] = js.native
  
  /**
    * The threshold of paragraph for hyphenation.
    */
  var hyphenationFactor: js.UndefOr[Double] = js.native
  
  /**
    * The mode that should be used to break lines in the receiver.
    */
  var lineBreakMode: js.UndefOr[Double] = js.native
  
  /**
    * The line height multiple.
    */
  var lineHeightMultiple: js.UndefOr[Double] = js.native
  
  /**
    * The distance in points between the bottom of one line fragment and the top of the next.
    */
  var lineSpacing: js.UndefOr[Double | String] = js.native
  
  /**
    * The maximum line height of receiver.
    */
  var maximumLineHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * The minimum height of receiver.
    */
  var minimumLineHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * The space after the end of the paragraph.
    */
  var paragraphSpacingAfter: js.UndefOr[Double | String] = js.native
  
  /**
    * The distance between the top of paragraph and the beginning of its text content.
    */
  var paragraphSpacingBefore: js.UndefOr[Double | String] = js.native
  
  /**
    * The trailing indentation of the receiver.
    */
  var tailIndent: js.UndefOr[Double | String] = js.native
}
object ParagraphAttribute {
  
  @scala.inline
  def apply(): ParagraphAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphAttribute]
  }
  
  @scala.inline
  implicit class ParagraphAttributeMutableBuilder[Self <: ParagraphAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAllowsDefaultTighteningForTruncation(value: Boolean): Self = StObject.set(x, "allowsDefaultTighteningForTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsDefaultTighteningForTruncationUndefined: Self = StObject.set(x, "allowsDefaultTighteningForTruncation", js.undefined)
    
    @scala.inline
    def setFirstLineHeadIndent(value: Double | String): Self = StObject.set(x, "firstLineHeadIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineHeadIndentUndefined: Self = StObject.set(x, "firstLineHeadIndent", js.undefined)
    
    @scala.inline
    def setHeadIndent(value: Double | String): Self = StObject.set(x, "headIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadIndentUndefined: Self = StObject.set(x, "headIndent", js.undefined)
    
    @scala.inline
    def setHyphenationFactor(value: Double): Self = StObject.set(x, "hyphenationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphenationFactorUndefined: Self = StObject.set(x, "hyphenationFactor", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: Double): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    @scala.inline
    def setLineHeightMultiple(value: Double): Self = StObject.set(x, "lineHeightMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightMultipleUndefined: Self = StObject.set(x, "lineHeightMultiple", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double | String): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    @scala.inline
    def setMaximumLineHeight(value: Double | String): Self = StObject.set(x, "maximumLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLineHeightUndefined: Self = StObject.set(x, "maximumLineHeight", js.undefined)
    
    @scala.inline
    def setMinimumLineHeight(value: Double | String): Self = StObject.set(x, "minimumLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLineHeightUndefined: Self = StObject.set(x, "minimumLineHeight", js.undefined)
    
    @scala.inline
    def setParagraphSpacingAfter(value: Double | String): Self = StObject.set(x, "paragraphSpacingAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphSpacingAfterUndefined: Self = StObject.set(x, "paragraphSpacingAfter", js.undefined)
    
    @scala.inline
    def setParagraphSpacingBefore(value: Double | String): Self = StObject.set(x, "paragraphSpacingBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphSpacingBeforeUndefined: Self = StObject.set(x, "paragraphSpacingBefore", js.undefined)
    
    @scala.inline
    def setTailIndent(value: Double | String): Self = StObject.set(x, "tailIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailIndentUndefined: Self = StObject.set(x, "tailIndent", js.undefined)
  }
}
