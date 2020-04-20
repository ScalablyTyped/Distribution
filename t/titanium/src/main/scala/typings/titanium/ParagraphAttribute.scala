package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying an Paragraph style attribute.
  */
trait ParagraphAttribute extends js.Object {
  /**
  	 * The text alignment of the receiver.
  	 */
  var alignment: js.UndefOr[Double] = js.undefined
  /**
  	 * A Boolean value indicating whether the system may tighten inter-character spacing
  	 * before truncating text.
  	 */
  var allowsDefaultTighteningForTruncation: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The indentation of the first line of the receiver.
  	 */
  var firstLineHeadIndent: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The indentation of the lines of lines other than the first.
  	 */
  var headIndent: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The threshold of paragraph for hyphenation.
  	 */
  var hyphenationFactor: js.UndefOr[Double] = js.undefined
  /**
  	 * The mode that should be used to break lines in the receiver.
  	 */
  var lineBreakMode: js.UndefOr[Double] = js.undefined
  /**
  	 * The line height multiple.
  	 */
  var lineHeightMultiple: js.UndefOr[Double] = js.undefined
  /**
  	 * The distance in points between the bottom of one line fragment and the top of the next.
  	 */
  var lineSpacing: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The maximum line height of receiver.
  	 */
  var maximumLineHeight: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The minimum height of receiver.
  	 */
  var minimumLineHeight: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The space after the end of the paragraph.
  	 */
  var paragraphSpacingAfter: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The distance between the top of paragraph and the beginning of its text content.
  	 */
  var paragraphSpacingBefore: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
  	 * The trailing indentation of the receiver.
  	 */
  var tailIndent: js.UndefOr[Double | java.lang.String] = js.undefined
}

object ParagraphAttribute {
  @scala.inline
  def apply(
    alignment: Int | Double = null,
    allowsDefaultTighteningForTruncation: js.UndefOr[Boolean] = js.undefined,
    firstLineHeadIndent: Double | java.lang.String = null,
    headIndent: Double | java.lang.String = null,
    hyphenationFactor: Int | Double = null,
    lineBreakMode: Int | Double = null,
    lineHeightMultiple: Int | Double = null,
    lineSpacing: Double | java.lang.String = null,
    maximumLineHeight: Double | java.lang.String = null,
    minimumLineHeight: Double | java.lang.String = null,
    paragraphSpacingAfter: Double | java.lang.String = null,
    paragraphSpacingBefore: Double | java.lang.String = null,
    tailIndent: Double | java.lang.String = null
  ): ParagraphAttribute = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsDefaultTighteningForTruncation)) __obj.updateDynamic("allowsDefaultTighteningForTruncation")(allowsDefaultTighteningForTruncation.asInstanceOf[js.Any])
    if (firstLineHeadIndent != null) __obj.updateDynamic("firstLineHeadIndent")(firstLineHeadIndent.asInstanceOf[js.Any])
    if (headIndent != null) __obj.updateDynamic("headIndent")(headIndent.asInstanceOf[js.Any])
    if (hyphenationFactor != null) __obj.updateDynamic("hyphenationFactor")(hyphenationFactor.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (lineHeightMultiple != null) __obj.updateDynamic("lineHeightMultiple")(lineHeightMultiple.asInstanceOf[js.Any])
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (maximumLineHeight != null) __obj.updateDynamic("maximumLineHeight")(maximumLineHeight.asInstanceOf[js.Any])
    if (minimumLineHeight != null) __obj.updateDynamic("minimumLineHeight")(minimumLineHeight.asInstanceOf[js.Any])
    if (paragraphSpacingAfter != null) __obj.updateDynamic("paragraphSpacingAfter")(paragraphSpacingAfter.asInstanceOf[js.Any])
    if (paragraphSpacingBefore != null) __obj.updateDynamic("paragraphSpacingBefore")(paragraphSpacingBefore.asInstanceOf[js.Any])
    if (tailIndent != null) __obj.updateDynamic("tailIndent")(tailIndent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphAttribute]
  }
}

