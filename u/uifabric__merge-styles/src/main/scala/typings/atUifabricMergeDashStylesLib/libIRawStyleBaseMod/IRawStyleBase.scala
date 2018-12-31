package typings
package atUifabricMergeDashStylesLib.libIRawStyleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawStyleBase extends IRawFontStyle {
  /**
    * (Moz specific) font smoothing directive.
    */
  var MozOsxFontSmoothing: js.UndefOr[
    atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.antialiased | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.grayscale | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`subpixel-antialiased`
  ] = js.undefined
  /**
    * (Ms specific) constrast adjust rule.
    */
  var MsHighContrastAdjust: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Edge requires the -webkit prefix backdrop-filter.
    */
  var WebkitBackdropFilter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * (Webkit specific) font smoothing directive.
    */
  var WebkitFontSmoothing: js.UndefOr[
    atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.antialiased | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.grayscale | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`subpixel-antialiased`
  ] = js.undefined
  /**
    * (Webkit specific) momentum scrolling on iOS devices
    */
  var WebkitOverflowScrolling: js.UndefOr[
    atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.touch
  ] = js.undefined
  /**
    * Aligns a flex container's lines within the flex container when there is extra space
    * in the cross-axis, similar to how justify-content aligns individual items within the main-axis.
    */
  var alignContent: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-start` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-end` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.center | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`space-between` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`space-around` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.stretch
  ] = js.undefined
  /**
    * Sets the default alignment in the cross axis for all of the flex container's items,
    * including anonymous flex items, similarly to how justify-content aligns items along the main axis.
    */
  var alignItems: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-start` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-end` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.center | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.baseline | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.stretch
  ] = js.undefined
  /**
    * Aligns the box (as the alignment subject) within its containing block (as the alignment container)
    * along the block/column/cross axis of the alignment container.
    *
    * See CSS align-self property
    * https://www.w3.org/TR/css-align-3/#propdef-align-self
    */
  var alignSelf: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule
  ] = js.undefined
  /**
    * This property allows precise alignment of elements, such as graphics, that do not
    * have a baseline-table or lack the desired baseline in their baseline-table. With the
    * alignment-adjust property, the position of the baseline identified by the
    * alignment-baseline can be explicitly determined. It also determines precisely
    * the alignment point for each glyph within a textual element.
    */
  var alignmentAdjust: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies how an object is aligned with respect to its parent. This property specifies
    * which baseline of this element is to be aligned with the corresponding baseline of the
    * parent. For example, this allows alphabetic baselines in Roman text to stay aligned
    * across font size changes. It defaults to the baseline with the same name as the computed
    * value of the alignment-baseline property.
    */
  var alignmentBaseline: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The animation CSS property is a shorthand property for the various animation properties:
    * `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`,
    * `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and
    * `animation-play-state`.
    */
  var animation: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines a length of time to elapse before an animation starts, allowing an animation to begin execution some time after it is applied.
    */
  var animationDelay: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines whether an animation should run in reverse on some or all cycles.
    */
  var animationDirection: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the length an animation takes to finish. Default value is 0, meaning
    * there will be no animation.
    */
  var animationDuration: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The animation-fill-mode CSS property specifies how a CSS animation should apply
    * styles to its target before and after its execution.
    */
  var animationFillMode: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.forwards | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.backwards | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.both
  ] = js.undefined
  /**
    * Specifies how many times an animation cycle should play.
    */
  var animationIterationCount: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines the list of animations that apply to the element.
    */
  var animationName: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines whether an animation is running or paused.
    */
  var animationPlayState: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The animation-timing-function specifies the speed curve of an animation.
    */
  var animationTimingFunction: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Allows changing the style of any element to platform-based interface elements or
    * vice versa.
    */
  var appearance: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Lets you apply graphical effects such as blurring or color shifting to the area
    * behind an element. Because it applies to everything behind the element, to see
    * the effect you must make the element or its background at least partially transparent.
    */
  var backdropFilter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Determines whether or not the “back” side of a transformed element is visible when
    * facing the viewer.
    */
  var backfaceVisibility: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Shorthand property to set the values for one or more of:
    * background-clip, background-color, background-image,
    * background-origin, background-position, background-repeat,
    * background-size, and background-attachment.
    */
  var background: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * If a background-image is specified, this property determines
    * whether that image's position is fixed within the viewport,
    * or scrolls along with its containing block.
    * See CSS 3 background-attachment property https://drafts.csswg.org/css-backgrounds-3/#the-background-attachment
    */
  var backgroundAttachment: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.scroll | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.fixed | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.local
  ] = js.undefined
  /**
    * This property describes how the element's background images should blend with each
    * other and the element's background color. The value is a list of blend modes that
    * corresponds to each background image. Each element in the list will apply to the
    * corresponding element of background-image. If a property doesn’t have enough
    * comma-separated values to match the number of layers, the UA must calculate its
    * used value by repeating the list of values until there are enough.
    */
  var backgroundBlendMode: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The background-clip CSS property specifies if an element's background, whether a
    * <color> or an <image>, extends underneath its border.
    *
    * \* Does not work in IE
    *
    * \* The `text` value is experimental and should not be used in production code.
    */
  var backgroundClip: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`border-box` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`padding-box` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`content-box` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.text
  ] = js.undefined
  /**
    * Sets the background color of an element.
    */
  var backgroundColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets a compositing style for background images and colors.
    */
  var backgroundComposite: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Applies one or more background images to an element. These can be any valid CSS
    * image, including url() paths to image files or CSS gradients.
    */
  var backgroundImage: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies what the background-position property is relative to.
    */
  var backgroundOrigin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the position of a background image.
    */
  var backgroundPosition: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Background-repeat defines if and how background images will be repeated after they
    * have been sized and positioned
    */
  var backgroundRepeat: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the size of background images
    */
  var backgroundSize: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Shorthand property that defines the different properties of all four sides of an
    * element's border in a single declaration. It can be used to set border-width,
    * border-style and border-color, or a subset of these.
    */
  var border: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`0` | java.lang.String
  ] = js.undefined
  /**
    * Shorthand that sets the values of border-bottom-color,
    * border-bottom-style, and border-bottom-width.
    */
  var borderBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the color of the bottom border of an element.
    */
  var borderBottomColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines the shape of the border of the bottom-left corner.
    */
  var borderBottomLeftRadius: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines the shape of the border of the bottom-right corner.
    */
  var borderBottomRightRadius: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the line style of the bottom border of a box.
    */
  var borderBottomStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the width of an element's bottom border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderBottomWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Border-collapse can be used for collapsing the borders between table cells
    */
  var borderCollapse: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The CSS border-color property sets the color of an element's four borders. This
    * property can have from one to four values, made up of the elementary properties:
    *      •       border-top-color
    *      •       border-right-color
    *      •       border-bottom-color
    *      •       border-left-color The default color is the currentColor of each of
    * these values.
    * If you provide one value, it sets the color for the element. Two values set the
    * horizontal and vertical values, respectively. Providing three values sets the top,
    * vertical, and bottom values, in that order. Four values set all for sides: top,
    * right, bottom, and left, in that order.
    */
  var borderColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies different corner clipping effects, such as scoop (inner curves), bevel
    * (straight cuts) or notch (cut-off rectangles). Works along with border-radius to
    * specify the size of each corner effect.
    */
  var borderCornerShape: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The property border-image-source is used to set the image to be used instead of
    * the border style. If this is set to none the border-style is used instead.
    */
  var borderImageSource: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The border-image-width CSS property defines the offset to use for dividing the
    * border image in nine parts, the top-left corner, central top edge, top-right-corner,
    * central right edge, bottom-right corner, central bottom edge, bottom-left corner,
    * and central right edge. They represent inward distance from the top, right, bottom,
    * and left edges.
    */
  var borderImageWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's left border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the left
    * border — border-left-width, border-left-style and border-left-color.
    */
  var borderLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The CSS border-left-color property sets the color of an element's left border. This
    *  page explains the border-left-color value, but often you will find it more
    * convenient to fix the border's left color as part of a shorthand set, either
    * border-left or border-color. Colors can be defined several ways. For more
    * information, see Usage.
    */
  var borderLeftColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the style of an element's left border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderLeftStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the width of an element's left border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderLeftWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Defines how round the border's corners are.
    */
  var borderRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's right border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the
    * right border — border-right-width, border-right-style and border-right-color.
    */
  var borderRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the color of an element's right border. This page explains the
    * border-right-color value, but often you will find it more convenient to fix the
    * border's right color as part of a shorthand set, either border-right or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderRightColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the style of an element's right border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderRightStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the width of an element's right border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderRightWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Specifies the distance between the borders of adjacent cells.
    */
  var borderSpacing: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the style of an element's four borders. This property can have from one to
    * four values. With only one value, the value will be applied to all four borders;
    * otherwise, this works as a shorthand property for each of border-top-style,
    *  border-right-style, border-bottom-style, border-left-style, where each border
    *  style may be assigned a separate value.
    */
  var borderStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's top border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the top
    * border — border-top-width, border-top-style and border-top-color.
    */
  var borderTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the color of an element's top border. This page explains the border-top-color
    * value, but often you will find it more convenient to fix the border's top color as
    * part of a shorthand set, either border-top or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderTopColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the rounding of the top-left corner of the element.
    */
  var borderTopLeftRadius: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the rounding of the top-right corner of the element.
    */
  var borderTopRightRadius: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the style of an element's top border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderTopStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the width of an element's top border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderTopWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the width of an element's four borders. This property can have from one to
    * four values. This is a shorthand property for setting values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * This property specifies how far an absolutely positioned box's bottom margin edge
    * is offset above the bottom edge of the box's containing block. For relatively
    * positioned boxes, the offset is with respect to the bottom edges of the box itself
    * (i.e., the box is given a position in the normal flow, then offset from that
    * position according to these properties).
    */
  var bottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Breaks a box into fragments creating new borders, padding and repeating backgrounds
    * or lets it stay as a continuous box on a page break, column break, or, for inline
    * elements, at a line break.
    */
  var boxDecorationBreak: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Cast a drop shadow from the frame of almost any element.
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The CSS box-sizing property is used to alter the default CSS box model used to
    * calculate width and height of the elements.
    */
  var boxSizing: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`border-box` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`content-box`
  ] = js.undefined
  /**
    * The CSS break-after property allows you to force a break on multi-column layouts.
    * More specifically, it allows you to force a break after an element. It allows you
    * to determine if a break should occur, and what type of break it should be. The
    * break-after CSS property describes how the page, column or region break behaves
    * after the generated box. If there is no generated box, the property is ignored.
    */
  var breakAfter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Control page/column/region breaks that fall above a block of content
    */
  var breakBefore: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Control page/column/region breaks that fall within a block of content
    */
  var breakInside: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The clear CSS property specifies if an element can be positioned next to or must be
    * positioned below the floating elements that precede it in the markup.
    */
  var clear: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Clipping crops an graphic, so that only a portion of the graphic is rendered, or
    * filled. This clip-rule property, when used with the clip-path property, defines
    * which clip rule, or algorithm, to use when filling the different parts of a graphics.
    */
  var clipRule: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The color property sets the color of an element's foreground content (usually text),
    * accepting any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
    */
  var color: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Describes the number of columns of the element.
    * See CSS 3 column-count property https://www.w3.org/TR/css3-multicol/#cc
    */
  var columnCount: js.UndefOr[
    ICSSRule | scala.Double | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto
  ] = js.undefined
  /**
    * Specifies how to fill columns (balanced or sequential).
    */
  var columnFill: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The column-gap property controls the width of the gap between columns in multi-column
    * elements.
    */
  var columnGap: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the width, style, and color of the rule between columns.
    */
  var columnRule: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the color of the rule between columns.
    */
  var columnRuleColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the width of the rule between columns.
    */
  var columnRuleWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The column-span CSS property makes it possible for an element to span across all
    * columns when its value is set to all. An element that spans more than one column
    * is called a spanning element.
    */
  var columnSpan: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the width of columns in multi-column elements.
    */
  var columnWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * This property is a shorthand property for setting column-width and/or column-count.
    */
  var columns: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Content for pseudo selectors.
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The counter-increment property accepts one or more names of counters (identifiers),
    * each one optionally followed by an integer which specifies the value by which the
    * counter should be incremented (e.g. if the value is 2, the counter increases by 2
    * each time it is invoked).
    */
  var counterIncrement: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The counter-reset property contains a list of one or more names of counters, each
    * one optionally followed by an integer (otherwise, the integer defaults to 0.) Each
    * time the given element is invoked, the counters specified by the property are set to the given integer.
    */
  var counterReset: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The cue property specifies sound files (known as an "auditory icon") to be played by
    * speech media agents before and after presenting an element's content; if only one
    * file is specified, it is played both before and after. The volume at which the
    * file(s) should be played, relative to the volume of the main element, may also be
    * specified. The icon files may also be set separately with the cue-before and
    * cue-after properties.
    */
  var cue: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The cue-after property specifies a sound file (known as an "auditory icon") to be
    * played by speech media agents after presenting an element's content; the volume at
    * which the file should be played may also be specified. The shorthand property cue
    * sets cue sounds for both before and after the element is presented.
    */
  var cueAfter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the mouse cursor displayed when the mouse pointer is over an element.
    */
  var cursor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The direction CSS property specifies the text direction/writing direction. The rtl
    * is used for Hebrew or Arabic text, the ltr is for other languages.
    */
  var direction: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies the type of rendering box used for an element. It is a
    * shorthand property for many other display properties.
    * W3: https://www.w3.org/TR/css-display-3/#the-display-properties
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/display
    */
  var display: js.UndefOr[ICSSRule | ICSSDisplayRule] = js.undefined
  /**
    * The ‘fill’ property paints the interior of the given graphical element. The area to
    * be painted consists of any areas inside the outline of the shape. To determine the
    * inside of the shape, all subpaths are considered, and the interior is determined
    * according to the rules associated with the current value of the ‘fill-rule’
    * property. The zero-width geometric outline of a shape is included in the area to be
    * painted.
    */
  var fill: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * SVG: Specifies the opacity of the color or the content the current object is filled
    * with.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#FillOpacityProperty
    */
  var fillOpacity: js.UndefOr[ICSSRule | scala.Double] = js.undefined
  /**
    * The ‘fill-rule’ property indicates the algorithm which is to be used to determine
    * what parts of the canvas are included inside the shape. For a simple,
    * non-intersecting path, it is intuitively clear what region lies "inside"; however,
    * for a more complex path, such as a path that intersects itself or where one subpath
    * encloses another, the interpretation of "inside" is not so obvious.
    * The ‘fill-rule’ property provides two options for how the inside of a shape is
    * determined:
    */
  var fillRule: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Applies various image processing effects. This property is largely unsupported. See
    * Compatibility section for more information.
    */
  var filter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    */
  var flex: js.UndefOr[ICSSRule | java.lang.String | scala.Double] = js.undefined
  /**
    * The flex-basis CSS property describes the initial main size of the flex item before
    * any free space is distributed according to the flex factors described in the flex
    * property (flex-grow and flex-shrink).
    */
  var flexBasis: js.UndefOr[ICSSRule | java.lang.String | scala.Double] = js.undefined
  /**
    * The flex-direction CSS property describes how flex items are placed in the flex
    * container, by setting the direction of the flex container's main axis.
    */
  var flexDirection: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.row | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`row-reverse` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.column | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`column-reverse`
  ] = js.undefined
  /**
    * The flex-flow CSS property defines the flex container's main and cross axis. It is
    * a shorthand property for the flex-direction and flex-wrap properties.
    */
  var flexFlow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the flex grow factor of a flex item.
    * See CSS flex-grow property https://drafts.csswg.org/css-flexbox-1/#flex-grow-property
    */
  var flexGrow: js.UndefOr[ICSSRule | scala.Double | java.lang.String] = js.undefined
  /**
    * Specifies the flex shrink factor of a flex item.
    * See CSS flex-shrink property https://drafts.csswg.org/css-flexbox-1/#flex-shrink-property
    */
  var flexShrink: js.UndefOr[ICSSRule | scala.Double | java.lang.String] = js.undefined
  /**
    * Specifies whether flex items are forced into a single line or can be wrapped onto
    * multiple lines. If wrapping is allowed, this property also enables you to control
    * the direction in which lines are stacked.
    * See CSS flex-wrap property https://drafts.csswg.org/css-flexbox-1/#flex-wrap-property
    */
  var flexWrap: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.nowrap | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.wrap | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`wrap-reverse`
  ] = js.undefined
  /**
    * Elements which have the style float are floated horizontally. These elements can
    * move as far to the left or right of the containing element. All elements after
    * the floating element will flow around it, but elements before the floating element
    * are not impacted. If several floating elements are placed after each other, they
    * will float next to each other as long as there is room.
    */
  var float: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Flows content from a named flow (specified by a corresponding flow-into) through
    * selected elements to form a dynamic chain of layout regions.
    */
  var flowFrom: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting
    * grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single
    * declaration.
    */
  var gridArea: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoColumns: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Controls how the auto-placement algorithm works,
    * specifying exactly how auto-placed items get flowed into the grid.
    */
  var gridAutoFlow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoRows: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Controls a grid item's placement in a grid area, particularly grid position and a
    * grid span. Shorthand for setting grid-column-start and grid-column-end in a single
    * declaration.
    */
  var gridColumn: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Controls a grid item's placement in a grid area as well as grid position and a
    * grid span. The grid-column-end property (with grid-row-start, grid-row-end, and
    * grid-column-start) determines a grid item's placement by specifying the grid lines
    * of a grid item's grid area.
    */
  var gridColumnEnd: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the size of the gap (gutter) between an element's columns
    */
  var gridColumnGap: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Determines a grid item's placement by specifying the starting grid lines of a grid
    * item's grid area . A grid item's placement in a grid area consists of a grid
    * position and a grid span. See also ( grid-row-start, grid-row-end, and
    * grid-column-end)
    */
  var gridColumnStart: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the gaps (gutters) between grid rows and columns. It is a shorthand
    * for grid-row-gap and grid-column-gap.
    */
  var gridGap: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Gets or sets a value that indicates which row an element within a Grid should
    * appear in. Shorthand for setting grid-row-start and grid-row-end in a single
    * declaration.
    */
  var gridRow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Determines a grid item’s placement by specifying the block-end. A grid item's
    * placement in a grid area consists of a grid position and a grid span. The
    * grid-row-end property (with grid-row-start, grid-column-start, and grid-column-end)
    * determines a grid item's placement by specifying the grid lines of a grid item's
    * grid area.
    */
  var gridRowEnd: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the size of the gap (gutter) between an element's grid rows
    */
  var gridRowGap: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies a row position based upon an integer location, string value, or desired
    * row size.
    * css/properties/grid-row is used as short-hand for grid-row-position and
    * grid-row-position
    */
  var gridRowPosition: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies a grid item’s start position within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the
    * inline-start edge of its grid area
    */
  var gridRowStart: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies named grid areas which are not associated with any particular grid item,
    * but can be referenced from the grid-placement properties. The syntax of the
    * grid-template-areas property also provides a visualization of the structure of the
    * grid, making the overall layout of the grid container easier to understand.
    */
  var gridTemplate: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies named grid areas
    */
  var gridTemplateAreas: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies (with grid-template-rows) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateColumns: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies (with grid-template-columns) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateRows: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the height of an element. The content area of the element height does not
    * include the padding, border, and margin of the element.
    */
  var height: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Specifies the minimum number of characters in a hyphenated word
    */
  var hyphenateLimitChars: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Indicates the maximum number of successive hyphenated lines in an element. The
    * ‘no-limit’ value means that there is no limit.
    */
  var hyphenateLimitLines: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the maximum amount of trailing whitespace (before justification) that may
    * be left in a line before hyphenation is triggered to pull part of a word from the
    * next line back up into the current one.
    */
  var hyphenateLimitZone: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies whether or not words in a sentence can be split by the use of a manual or
    * automatic hyphenation mechanism.
    */
  var hyphens: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines how the browser distributes space between and around flex items
    * along the main-axis of their container.
    * See CSS justify-content property
    * https://www.w3.org/TR/css-flexbox-1/#justify-content-property
    */
  var justifyContent: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-start` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`flex-end` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.center | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`space-between` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`space-around` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`space-evenly` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.stretch
  ] = js.undefined
  /**
    * Justifies the box (as the alignment subject) within its containing block (as the alignment container)
    * along the inline/row/main axis of the alignment container.
    *
    * See CSS jusitfy-self property
    * https://www.w3.org/TR/css-align-3/#propdef-justify-self
    */
  var justifySelf: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.left | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.right | (atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`safe left`) | (atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`safe right`) | (atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`unsafe left`) | (atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`unsafe right`)
  ] = js.undefined
  /**
    * Sets the left position of an element relative to the nearest anscestor that is set
    * to position absolute, relative, or fixed.
    */
  var left: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The letter-spacing CSS property specifies the spacing behavior between text
    * characters.
    */
  var letterSpacing: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the height of an inline block level element.
    * See CSS 2.1 line-height property https://www.w3.org/TR/CSS21/visudet.html#propdef-line-height
    */
  var lineHeight: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | ICSSPixelUnitRule | ICSSPercentageRule
  ] = js.undefined
  /**
    * Shorthand property that sets the list-style-type, list-style-position and
    * list-style-image properties in one declaration.
    */
  var listStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property sets the image that will be used as the list item marker. When the
    * image is available, it will replace the marker set with the 'list-style-type'
    * marker. That also means that if the image is not available, it will show the style
    * specified by list-style-property
    */
  var listStyleImage: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies if the list-item markers should appear inside or outside the content flow.
    */
  var listStylePosition: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the type of list-item marker in a list.
    */
  var listStyleType: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The margin property is shorthand to allow you to set all four margins of an element
    * at once. Its equivalent longhand properties are margin-top, margin-right,
    * margin-bottom and margin-left. Negative values are also allowed.
    */
  var margin: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * margin-bottom sets the bottom margin of an element.
    */
  var marginBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * margin-left sets the left margin of an element.
    */
  var marginLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * margin-right sets the right margin of an element.
    */
  var marginRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * margin-top sets the top margin of an element.
    */
  var marginTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The marquee-direction determines the initial direction in which the marquee content moves.
    */
  var marqueeDirection: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The 'marquee-style' property determines a marquee's scrolling behavior.
    */
  var marqueeStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property is shorthand for setting mask-image, mask-mode, mask-repeat,
    * mask-position, mask-clip, mask-origin, mask-composite and mask-size. Omitted
    * values are set to their original properties' initial values.
    */
  var mask: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property is shorthand for setting mask-border-source, mask-border-slice,
    * mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values
    * are set to their original properties' initial values.
    */
  var maskBorder: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies how the images for the sides and the middle part of the
    * mask image are scaled and tiled. The first keyword applies to the horizontal
    * sides, the second one applies to the vertical ones. If the second keyword is
    * absent, it is assumed to be the same as the first, similar to the CSS
    * border-image-repeat property.
    */
  var maskBorderRepeat: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies inward offsets from the top, right, bottom, and left
    * edges of the mask image, dividing it into nine regions: four corners, four
    * edges, and a middle. The middle image part is discarded and treated as fully
    * transparent black unless the fill keyword is present. The four values set the
    * top, right, bottom and left offsets in that order, similar to the CSS
    * border-image-slice property.
    */
  var maskBorderSlice: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies an image to be used as a mask. An image that is empty, fails to
    * download, is non-existent, or cannot be displayed is ignored and does not mask
    * the element.
    */
  var maskBorderSource: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property sets the width of the mask box image, similar to the CSS
    * border-image-width property.
    */
  var maskBorderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Determines the mask painting area, which defines the area that is affected by
    * the mask. The painted content of an element may be restricted to this area.
    */
  var maskClip: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * For elements rendered as a single box, specifies the mask positioning area. For
    * elements rendered as multiple boxes (e.g., inline boxes on several lines, boxes
    * on several pages) specifies which boxes box-decoration-break operates on to
    * determine the mask positioning area(s).
    */
  var maskOrigin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property must not be used. It is no longer included in any standard or
    * standard track specification, nor is it implemented in any browser. It is only
    * used when the text-align-last property is set to size. It controls allowed
    * adjustments of font-size to fit line content.
    */
  var maxFontSize: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the maximum height for an element. It prevents the height of the element to
    *  exceed the specified value. If min-height is specified and is greater than
    * max-height, max-height is overridden.
    */
  var maxHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the maximum width for an element. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the minimum height for an element. It prevents the height of the element to
    * be smaller than the specified value. The value of min-height overrides both
    * max-height and height.
    */
  var minHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the minimum width of an element. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The mix-blend-mode CSS property describes how an element's content should blend
    * with the content of the element's direct parent and the element's background.
    */
  var mixBlendMode: js.UndefOr[ICSSRule | IMixBlendModes] = js.undefined
  /**
    * Specifies the transparency of an element.
    * See CSS 3 opacity property https://drafts.csswg.org/css-color-3/#opacity
    */
  var opacity: js.UndefOr[ICSSRule | scala.Double | java.lang.String] = js.undefined
  /**
    * Specifies the order used to lay out flex items in their flex container.
    * Elements are laid out in the ascending order of the order value.
    * See CSS order property https://drafts.csswg.org/css-flexbox-1/#order-property
    */
  var order: js.UndefOr[ICSSRule | scala.Double] = js.undefined
  /**
    * In paged media, this property defines the minimum number of lines in
    * a block container that must be left at the bottom of the page.
    * See CSS 3 orphans, widows properties https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var orphans: js.UndefOr[ICSSRule | scala.Double] = js.undefined
  /**
    * The CSS outline property is a shorthand property for setting one or more of the
    * individual outline properties outline-style, outline-width and outline-color in a
    * single rule. In most cases the use of this shortcut is preferable and more
    * convenient.
    * Outlines differ from borders in the following ways:
    *      •       Outlines do not take up space, they are drawn above the content.
    *      •       Outlines may be non-rectangular. They are rectangular in
    * Gecko/Firefox. Internet Explorer attempts to place the smallest contiguous outline
    * around all elements or shapes that are indicated to have an outline. Opera draws a
    * non-rectangular shape around a construct.
    */
  var outline: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`0` | java.lang.String
  ] = js.undefined
  /**
    * The outline-color property sets the color of the outline of an element. An
    * outline is a line that is drawn around elements, outside the border edge, to make
    * the element stand out.
    */
  var outlineColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The outline-offset property offsets the outline and draw it beyond the border edge.
    */
  var outlineOffset: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The overflow property controls how extra content exceeding the bounding box of an
    * element is rendered. It can be used in conjunction with an element that has a
    * fixed width and height, to eliminate text-induced page distortion.
    */
  var overflow: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.hidden | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.scroll | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.visible
  ] = js.undefined
  /**
    * Specifies the preferred scrolling methods for elements that overflow.
    */
  var overflowStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies whether or not the browser should insert line breaks within words to
    * prevent text from overflowing its content box. In contrast to word-break,
    * overflow-wrap will only create a break if an entire word cannot be placed on its
    * own line without overflowing.
    */
  var overflowWrap: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`break-word`
  ] = js.undefined
  /**
    * Controls how extra content exceeding the x-axis of the bounding box of an element
    * is rendered.
    */
  var overflowX: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.hidden | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.scroll | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.visible
  ] = js.undefined
  /**
    * Controls how extra content exceeding the y-axis of the bounding box of an element
    * is rendered.
    */
  var overflowY: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.hidden | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.scroll | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.visible
  ] = js.undefined
  /**
    * The padding optional CSS property sets the required padding space on one to four
    * sides of an element. The padding area is the space between an element and its
    * border. Negative values are not allowed but decimal values are permitted. The
    *  element size is treated as fixed, and the content of the element shifts toward the
    * center as padding is increased. The padding property is a shorthand to avoid
    * setting each side separately (padding-top, padding-right, padding-bottom,
    * padding-left).
    */
  var padding: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-block-end CSS property defines the logical block end padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property
    * depending on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-block-start CSS property defines the logical block start padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property depending
    * on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-bottom CSS property of an element sets the padding space required on
    * the bottom of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-bottom values, negative values of
    * padding-bottom are invalid.
    */
  var paddingBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-inline-end CSS property defines the logical inline end padding of an element,
    * which maps to a physical padding depending on the element's writing mode, directionality,
    * and text orientation. It corresponds to the padding-top, padding-right, padding-bottom,
    * or padding-left property depending on the values defined for writing-mode, direction,
    * and text-orientation.
    */
  var paddingInlineEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-inline-start CSS property defines the logical inline start padding of
    * an element, which maps to a physical padding depending on the element's writing mode,
    * directionality, and text orientation. It corresponds to the padding-top, padding-right,
    * padding-bottom, or padding-left property depending on the values defined for writing-mode,
    * direction, and text-orientation.
    */
  var paddingInlineStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-left CSS property of an element sets the padding space required on the
    * left side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-left values, negative values of
    * padding-left are invalid.
    */
  var paddingLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-right CSS property of an element sets the padding space required on the
    * right side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-right values, negative values of
    * padding-right are invalid.
    */
  var paddingRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The padding-top CSS property of an element sets the padding space required on the
    * top of an element. The padding area is the space between the content of the element
    * and its border. Contrary to margin-top values, negative values of padding-top are
    * invalid.
    */
  var paddingTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The page-break-after property is supported in all major browsers. With CSS3,
    *  page-break-* properties are only aliases of the break-* properties. The CSS3
    * Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakAfter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The page-break-before property sets the page-breaking behavior before an element.
    * With CSS3, page-break-* properties are only aliases of the break-* properties. The
    * CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakBefore: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the page-breaking behavior inside an element. With CSS3, page-break-*
    * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec
    * defines breaks for all CSS box fragmentation.
    */
  var pageBreakInside: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The pause property determines how long a speech media agent should pause before and
    * after presenting an element. It is a shorthand for the pause-before and pause-after
    *  properties.
    */
  var pause: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The pause-after property determines how long a speech media agent should pause after
    * presenting an element. It may be replaced by the shorthand property pause, which
    * sets pause time before and after.
    */
  var pauseAfter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The pause-before property determines how long a speech media agent should pause
    * before presenting an element. It may be replaced by the shorthand property pause,
    * which sets pause time before and after.
    */
  var pauseBefore: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The perspective property defines how far an element is placed from the view on the
    * z-axis, from the screen to the viewer. Perspective defines how an object is viewed.
    * In graphic arts, perspective is the representation on a flat surface of what the
    * viewer's eye would see in a 3D space. (See Wikipedia for more information about
    * graphical perspective and for related illustrations.)
    * The illusion of perspective on a flat surface, such as a computer screen, is created
    * by projecting points on the flat surface as they would appear if the flat surface
    * were a window through which the viewer was looking at the object. In discussion of
    * virtual environments, this flat surface is called a projection plane.
    */
  var perspective: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The perspective-origin property establishes the origin for the perspective property.
    * It effectively sets the X and Y position at which the viewer appears to be looking
    * at the children of the element.
    * When used with perspective, perspective-origin changes the appearance of an object,
    * as if a viewer were looking at it from a different origin. An object appears
    * differently if a viewer is looking directly at it versus looking at it from below,
    * above, or from the side. Thus, the perspective-origin is like a vanishing point.
    * The default value of perspective-origin is 50% 50%. This displays an object as if
    * the viewer's eye were positioned directly at the center of the screen, both
    * top-to-bottom and left-to-right. A value of 0% 0% changes the object as if the
    * viewer was looking toward the top left angle. A value of 100% 100% changes the
    * appearance as if viewed toward the bottom right angle.
    */
  var perspectiveOrigin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The pointer-events property allows you to control whether an element can be the
    * target for the pointing device (e.g, mouse, pen) events.
    */
  var pointerEvents: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The position property controls the type of positioning used by an element within
    * its parent elements. The effect of the position property depends on a lot of
    * factors, for example the position property of parent elements.
    */
  var position: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.static | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.relative | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.absolute | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.fixed | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.sticky
  ] = js.undefined
  /**
    * Sets the type of quotation marks for embedded quotations.
    */
  var quotes: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Controls whether the last region in a chain displays additional 'overset' content
    * according its default overflow property, or if it displays a fragment of content
    * as if it were flowing into a subsequent region.
    */
  var regionFragment: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The resize CSS sets whether an element is resizable, and if so, in which direction(s).
    */
  var resize: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.both | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.horizontal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.vertical | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.block | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`inline`
  ] = js.undefined
  /**
    * The rest-after property determines how long a speech media agent should pause after
    * presenting an element's main content, before presenting that element's exit cue
    * sound. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restAfter: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The rest-before property determines how long a speech media agent should pause after
    * presenting an intro cue sound for an element, before presenting that element's main
    * content. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restBefore: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the position an element in relation to the right side of the containing
    * element.
    */
  var right: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Defines the alpha channel threshold used to extract a shape from an image. Can be
    * thought of as a "minimum opacity" threshold; that is, a value of 0.5 means that the
    * shape will enclose all the pixels that are more than 50% opaque.
    */
  var shapeImageThreshold: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * A future level of CSS Shapes will define a shape-inside property, which will define
    * a shape to wrap content within the element. See Editor's Draft
    * <http://dev.w3.org/csswg/css-shapes/> and CSSWG wiki page on next-level plans
    * <http://wiki.csswg.org/spec/css-shapes>
    */
  var shapeInside: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Adds a margin to a shape-outside. In effect, defines a new shape that is the
    * smallest contour around all the points that are the shape-margin distance outward
    * perpendicular to each point on the underlying shape. For points where a
    * perpendicular direction is not defined (e.g., a triangle corner), takes all
    * points on a circle centered at the point and with a radius of the shape-margin
    * distance. This property accepts only non-negative values.
    */
  var shapeMargin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Declares a shape around which text should be wrapped, with possible modifications
    * from the shape-margin property. The shape defined by shape-outside and shape-margin
    * changes the geometry of a float element's float area.
    */
  var shapeOutside: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The speak property determines whether or not a speech synthesizer will read aloud
    * the contents of an element.
    */
  var speak: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The speak-as property determines how the speech synthesizer interprets the content:
    * words as whole words or as a sequence of letters, numbers as a numerical value or a
    * sequence of digits, punctuation as pauses in speech or named punctuation characters.
    */
  var speakAs: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The stroke property in CSS is for adding a border to SVG shapes.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#Stroke
    */
  var stroke: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * SVG: The stroke-linecap attribute defines the shape to be used at the end of open subpaths when they are stroked.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#LineCaps
    */
  var strokeLinecap: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.butt | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.round | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.square
  ] = js.undefined
  /**
    * SVG: Specifies the opacity of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeOpacityProperty
    */
  var strokeOpacity: js.UndefOr[ICSSRule | scala.Double] = js.undefined
  /**
    * SVG: Specifies the width of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeWidthProperty
    */
  var strokeWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
    */
  var tabSize: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The 'table-layout' property controls the algorithm used to lay out the table cells, rows, and columns.
    */
  var tableLayout: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-align CSS property describes how inline content like text is aligned in its
    * parent block element. text-align does not control the alignment of block elements
    * itself, only their inline content.
    */
  var textAlign: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-align-last CSS property describes how the last line of a block element or
    * a line before line break is aligned in its parent block element.
    */
  var textAlignLast: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-decoration CSS property is used to set the text formatting to underline,
    * overline, line-through or blink. underline and overline decorations are positioned
    * under the text, line-through over it.
    */
  var textDecoration: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the color of any text decoration, such as underlines, overlines, and strike
    * throughs.
    */
  var textDecorationColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets what kind of line decorations are added to an element, such as underlines,
    * overlines, etc.
    */
  var textDecorationLine: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies what parts of an element’s content are skipped over when applying any
    * text decoration.
    */
  var textDecorationSkip: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies the style of the text decoration line drawn on the
    * specified element. The intended meaning for the values are the same as those of
    * the border-style-properties.
    */
  var textDecorationStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-emphasis property will apply special emphasis marks to the elements text.
    * Slightly similar to the text-decoration property only that this property can have
    * affect on the line-height. It also is noted that this is shorthand for
    * text-emphasis-style and for text-emphasis-color.
    */
  var textEmphasis: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-emphasis-color property specifies the foreground color of the emphasis
    * marks.
    */
  var textEmphasisColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-emphasis-style property applies special emphasis marks to an element's
    * text.
    */
  var textEmphasisStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property helps determine an inline box's block-progression dimension, derived
    * from the text-height and font-size properties for non-replaced elements, the height
    * or the width for replaced elements, and the stacked block-progression dimension for
    * inline-block elements. The block-progression dimension determines the position of
    * the padding, border and margin for the element.
    */
  var textHeight: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the amount of space horizontally that should be left on the first line of
    * the text of an element. This horizontal spacing is at the beginning of the first
    * line and is in respect to the left edge of the containing block box.
    */
  var textIndent: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-overflow shorthand CSS property determines how overflowed content that is
    * not displayed is signaled to the users. It can be clipped, display an ellipsis
    * ('…', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string. It covers the
    * two long-hand properties text-overflow-mode and text-overflow-ellipsis
    */
  var textOverflow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The text-overline property is the shorthand for the text-overline-style,
    * text-overline-width, text-overline-color, and text-overline-mode properties.
    */
  var textOverline: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the line color for the overline text decoration.
    */
  var textOverlineColor: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the mode for the overline text decoration, determining whether the text
    * decoration affects the space characters or not.
    */
  var textOverlineMode: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the line style for overline text decoration.
    */
  var textOverlineStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies the line width for the overline text decoration.
    */
  var textOverlineWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The text-rendering CSS property provides information to the browser about how to
    * optimize when rendering text. Options are: legibility, speed or geometric precision.
    */
  var textRendering: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The CSS text-shadow property applies one or more drop shadows to the text and
    * <text-decorations> of an element. Each shadow is specified as an offset from the
    * text, along with optional color and blur radius values.
    */
  var textShadow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property transforms text for styling purposes. (It has no effect on the
    * underlying content.)
    */
  var textTransform: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Unsupported.
    * This property will add a underline position value to the element that has an
    * underline defined.
    */
  var textUnderlinePosition: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * After review this should be replaced by text-decoration should it not?
    * This property will set the underline style for text with a line value for
    * underline, overline, and line-through.
    */
  var textUnderlineStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies how far an absolutely positioned box's top margin edge is
    * offset below the top edge of the box's containing block. For relatively positioned
    * boxes, the offset is with respect to the top edges of the box itself (i.e., the box
    * is given a position in the normal flow, then offset from that position according to
    * these properties).
    */
  var top: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Determines whether touch input may trigger default behavior supplied by the user
    * agent, such as panning or zooming.
    */
  var touchAction: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * CSS transforms allow elements styled with CSS to be transformed in two-dimensional
    * or three-dimensional space. Using this property, elements can be translated,
    * rotated, scaled, and skewed. The value list may consist of 2D and/or 3D transform
    * values.
    */
  var transform: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property defines the origin of the transformation axes relative to the element
    * to which the transformation is applied.
    */
  var transformOrigin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property allows you to define the relative position of the origin of the
    * transformation grid along the z-axis.
    */
  var transformOriginZ: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This property specifies how nested elements are rendered in 3D space relative to their parent.
    */
  var transformStyle: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The transition CSS property is a shorthand property for transition-property,
    * transition-duration, transition-timing-function, and transition-delay. It allows to
    * define the transition between two states of an element.
    */
  var transition: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines when the transition will start. A value of ‘0s’ means the transition will
    * execute as soon as the property is changed. Otherwise, the value specifies an
    * offset from the moment the property is changed, and the transition will delay
    * execution by that offset.
    */
  var transitionDelay: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The 'transition-duration' property specifies the length of time a transition
    * animation takes to complete.
    */
  var transitionDuration: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The 'transition-property' property specifies the name of the CSS property to which
    * the transition is applied.
    */
  var transitionProperty: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Sets the pace of action within a transition
    */
  var transitionTimingFunction: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The unicode-bidi CSS property specifies the level of embedding with respect to the bidirectional algorithm.
    */
  var unicodeBidi: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * This is for all the high level UX stuff.
    */
  var userFocus: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * For inputing user content
    */
  var userInput: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Defines the text selection behavior.
    */
  var userSelect: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.text | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.all | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.contain
  ] = js.undefined
  /**
    * The vertical-align property controls how inline elements or text are vertically
    * aligned compared to the baseline. If this property is used on table-cells it
    * controls the vertical alignment of content of the table cell.
    */
  var verticalAlign: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The visibility property specifies whether the boxes generated by an element are rendered.
    */
  var visibility: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-balance property sets the apparent position (in stereo sound) of the synthesized voice for spoken media.
    */
  var voiceBalance: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-duration property allows the author to explicitly set the amount of time
    * it should take a speech synthesizer to read an element's content, for example to
    * allow the speech to be synchronized with other media. With a value of auto (the
    * default) the length of time it takes to read the content is determined by the
    * content itself and the voice-rate property.
    */
  var voiceDuration: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-family property sets the speaker's voice used by a speech media agent to
    * read an element. The speaker may be specified as a named character (to match a
    * voice option in the speech reading software) or as a generic description of the
    * age and gender of the voice. Similar to the font-family property for visual media,
    * a comma-separated list of fallback options may be given in case the speech reader
    * does not recognize the character name or cannot synthesize the requested combination
    * of generic properties.
    */
  var voiceFamily: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech
    * when reading an element; the pitch may be specified absolutely or relative to the
    * normal pitch for the voice-family used to read the text.
    */
  var voicePitch: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-range property determines how much variation in pitch or tone will be
    * created by the speech synthesize when reading an element. Emphasized text,
    * grammatical structures and punctuation may all be rendered as changes in pitch,
    * this property determines how strong or obvious those changes are; large ranges are
    * associated with enthusiastic or emotional speech, while small ranges are associated
    * with flat or mechanical speech.
    */
  var voiceRange: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-rate property sets the speed at which the voice synthesized by a speech
    * media agent will read content.
    */
  var voiceRate: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-stress property sets the level of vocal emphasis to be used for
    * synthesized speech reading the element.
    */
  var voiceStress: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The voice-volume property sets the volume for spoken content in speech media. It
    * replaces the deprecated volume property.
    */
  var voiceVolume: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The white-space property controls whether and how white space inside the element is
    * collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
    */
  var whiteSpace: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * In paged media, this property defines the mimimum number of lines that must be left
    * at the top of the second page.
    * See CSS 3 orphans, widows properties
    * https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var widows: js.UndefOr[ICSSRule | scala.Double] = js.undefined
  /**
    * Specifies the width of the content area of an element. The content area of the element
    * width does not include the padding, border, and margin of the element.
    */
  var width: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * The word-break property is often used when there is long generated content that is
    * strung together without and spaces or hyphens to beak apart. A common case of this
    * is when there is a long URL that does not have any hyphens. This case could
    * potentially cause the breaking of the layout as it could extend past the parent
    * element.
    */
  var wordBreak: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The word-spacing CSS property specifies the spacing behavior between "words".
    */
  var wordSpacing: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * An alias of css/properties/overflow-wrap, word-wrap defines whether to break
    * words when the content exceeds the boundaries of its container.
    */
  var wordWrap: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Specifies how exclusions affect inline content within block-level elements. Elements
    * lay out their inline content in their content area but wrap around exclusion areas.
    */
  var wrapFlow: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * Set the value that is used to offset the inner wrap shape from other shapes. Inline
    * content that intersects a shape with this property will be pushed by this shape's
    * margin.
    */
  var wrapMargin: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * writing-mode specifies if lines of text are laid out horizontally or vertically,
    * and the direction which lines of text and blocks progress.
    */
  var writingMode: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
  /**
    * The z-index property specifies the z-order of an element and its descendants.
    * When elements overlap, z-order determines which one covers the other.
    * See CSS 2 z-index property https://www.w3.org/TR/CSS2/visuren.html#z-index
    */
  var zIndex: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | scala.Double
  ] = js.undefined
  /**
    * Sets the initial zoom factor of a document defined by @viewport.
    * See CSS zoom descriptor https://drafts.csswg.org/css-device-adapt/#zoom-desc
    */
  var zoom: js.UndefOr[
    ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.auto | scala.Double | ICSSPercentageRule
  ] = js.undefined
}

