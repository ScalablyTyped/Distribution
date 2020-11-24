package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract datatype for specifying an Paragraph style attribute.
  */
@js.native
trait ParagraphAttribute extends js.Object {
  
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
  implicit class ParagraphAttributeOps[Self <: ParagraphAttribute] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Double): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAllowsDefaultTighteningForTruncation(value: Boolean): Self = this.set("allowsDefaultTighteningForTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsDefaultTighteningForTruncation: Self = this.set("allowsDefaultTighteningForTruncation", js.undefined)
    
    @scala.inline
    def setFirstLineHeadIndent(value: Double | String): Self = this.set("firstLineHeadIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineHeadIndent: Self = this.set("firstLineHeadIndent", js.undefined)
    
    @scala.inline
    def setHeadIndent(value: Double | String): Self = this.set("headIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadIndent: Self = this.set("headIndent", js.undefined)
    
    @scala.inline
    def setHyphenationFactor(value: Double): Self = this.set("hyphenationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyphenationFactor: Self = this.set("hyphenationFactor", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: Double): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    
    @scala.inline
    def setLineHeightMultiple(value: Double): Self = this.set("lineHeightMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeightMultiple: Self = this.set("lineHeightMultiple", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double | String): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    
    @scala.inline
    def setMaximumLineHeight(value: Double | String): Self = this.set("maximumLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLineHeight: Self = this.set("maximumLineHeight", js.undefined)
    
    @scala.inline
    def setMinimumLineHeight(value: Double | String): Self = this.set("minimumLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLineHeight: Self = this.set("minimumLineHeight", js.undefined)
    
    @scala.inline
    def setParagraphSpacingAfter(value: Double | String): Self = this.set("paragraphSpacingAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphSpacingAfter: Self = this.set("paragraphSpacingAfter", js.undefined)
    
    @scala.inline
    def setParagraphSpacingBefore(value: Double | String): Self = this.set("paragraphSpacingBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphSpacingBefore: Self = this.set("paragraphSpacingBefore", js.undefined)
    
    @scala.inline
    def setTailIndent(value: Double | String): Self = this.set("tailIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailIndent: Self = this.set("tailIndent", js.undefined)
  }
}
