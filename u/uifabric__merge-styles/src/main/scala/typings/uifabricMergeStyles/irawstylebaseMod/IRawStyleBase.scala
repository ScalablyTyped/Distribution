package typings.uifabricMergeStyles.irawstylebaseMod

import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`-ms-autohiding-scrollbar`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`border-box`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`break-word`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`column-reverse`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`content-box`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`flex-end`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`flex-start`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`inline`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`padding-box`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`row-reverse`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`safe left`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`safe right`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`space-around`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`space-between`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`space-evenly`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`subpixel-antialiased`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`unsafe left`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`unsafe right`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`wrap-reverse`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.absolute
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.all
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.antialiased
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.backwards
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.baseline
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.both
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.butt
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.center
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.column
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.contain
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.cover
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.fill
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.fixed
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.forwards
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.grayscale
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.hidden
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.horizontal
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.left
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.local
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.none
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.normal
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.nowrap
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.relative
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.right
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.round
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.row
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.scroll
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.scrollbar
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.square
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.static
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.sticky
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.stretch
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.text
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.touch
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.vertical
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.visible
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawStyleBase extends IRawFontStyle {
  /**
    * (Moz specific) font smoothing directive.
    */
  var MozOsxFontSmoothing: js.UndefOr[none | antialiased | grayscale | `subpixel-antialiased`] = js.native
  /**
    * (Ms specific) constrast adjust rule.
    */
  var MsHighContrastAdjust: js.UndefOr[ICSSRule | String] = js.native
  /**
    * (Ms specific) scrollbar behavior adjust rule.
    */
  var MsOverflowStyle: js.UndefOr[auto | none | scrollbar | `-ms-autohiding-scrollbar`] = js.native
  /**
    * Edge requires the -webkit prefix backdrop-filter.
    */
  var WebkitBackdropFilter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * (Webkit specific) font smoothing directive.
    */
  var WebkitFontSmoothing: js.UndefOr[none | antialiased | grayscale | `subpixel-antialiased`] = js.native
  /**
    * (Webkit specific) momentum scrolling on iOS devices
    */
  var WebkitOverflowScrolling: js.UndefOr[auto | touch] = js.native
  /**
    * (Webkit specific) color of the highlight that appears overa  link while it's being tapped
    */
  var WebkitTapHighlightColor: js.UndefOr[String] = js.native
  /**
    * (Webkit specific) controls the text inflation algorithm used on some smartphones and tablets.
    * Other browsers will ignore this property.
    */
  var WebkitTextSizeAdjust: js.UndefOr[none | auto | ICSSPercentageRule | ICSSRule] = js.native
  /**
    * Aligns a flex container's lines within the flex container when there is extra space
    * in the cross-axis, similar to how justify-content aligns individual items within the main-axis.
    */
  var alignContent: js.UndefOr[
    ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | stretch
  ] = js.native
  /**
    * Sets the default alignment in the cross axis for all of the flex container's items,
    * including anonymous flex items, similarly to how justify-content aligns items along the main axis.
    */
  var alignItems: js.UndefOr[ICSSRule | `flex-start` | `flex-end` | center | baseline | stretch] = js.native
  /**
    * Aligns the box (as the alignment subject) within its containing block (as the alignment container)
    * along the block/column/cross axis of the alignment container.
    *
    * See CSS align-self property
    * https://www.w3.org/TR/css-align-3/#propdef-align-self
    */
  var alignSelf: js.UndefOr[
    ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule
  ] = js.native
  /**
    * This property allows precise alignment of elements, such as graphics, that do not
    * have a baseline-table or lack the desired baseline in their baseline-table. With the
    * alignment-adjust property, the position of the baseline identified by the
    * alignment-baseline can be explicitly determined. It also determines precisely
    * the alignment point for each glyph within a textual element.
    */
  var alignmentAdjust: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies how an object is aligned with respect to its parent. This property specifies
    * which baseline of this element is to be aligned with the corresponding baseline of the
    * parent. For example, this allows alphabetic baselines in Roman text to stay aligned
    * across font size changes. It defaults to the baseline with the same name as the computed
    * value of the alignment-baseline property.
    */
  var alignmentBaseline: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation CSS property is a shorthand property for the various animation properties:
    * `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`,
    * `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and
    * `animation-play-state`.
    */
  var animation: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines a length of time to elapse before an animation starts, allowing an animation to begin execution
    * some time after it is applied.
    */
  var animationDelay: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines whether an animation should run in reverse on some or all cycles.
    */
  var animationDirection: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the length an animation takes to finish. Default value is 0, meaning
    * there will be no animation.
    */
  var animationDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation-fill-mode CSS property specifies how a CSS animation should apply
    * styles to its target before and after its execution.
    */
  var animationFillMode: js.UndefOr[ICSSRule | none | forwards | backwards | both] = js.native
  /**
    * Specifies how many times an animation cycle should play.
    */
  var animationIterationCount: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the list of animations that apply to the element.
    */
  var animationName: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines whether an animation is running or paused.
    */
  var animationPlayState: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation-timing-function specifies the speed curve of an animation.
    */
  var animationTimingFunction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Allows changing the style of any element to platform-based interface elements or
    * vice versa.
    */
  var appearance: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Lets you apply graphical effects such as blurring or color shifting to the area
    * behind an element. Because it applies to everything behind the element, to see
    * the effect you must make the element or its background at least partially transparent.
    */
  var backdropFilter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines whether or not the “back” side of a transformed element is visible when
    * facing the viewer.
    */
  var backfaceVisibility: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property to set the values for one or more of:
    * background-clip, background-color, background-image,
    * background-origin, background-position, background-repeat,
    * background-size, and background-attachment.
    */
  var background: js.UndefOr[ICSSRule | String] = js.native
  /**
    * If a background-image is specified, this property determines
    * whether that image's position is fixed within the viewport,
    * or scrolls along with its containing block.
    * See CSS 3 background-attachment property https://drafts.csswg.org/css-backgrounds-3/#the-background-attachment
    */
  var backgroundAttachment: js.UndefOr[ICSSRule | scroll | fixed | local] = js.native
  /**
    * This property describes how the element's background images should blend with each
    * other and the element's background color. The value is a list of blend modes that
    * corresponds to each background image. Each element in the list will apply to the
    * corresponding element of background-image. If a property doesn’t have enough
    * comma-separated values to match the number of layers, the UA must calculate its
    * used value by repeating the list of values until there are enough.
    */
  var backgroundBlendMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The background-clip CSS property specifies if an element's background, whether a
    * `<color>` or an `<image>`, extends underneath its border.
    *
    * \* Does not work in IE
    *
    * \* The `text` value is experimental and should not be used in production code.
    */
  var backgroundClip: js.UndefOr[ICSSRule | `border-box` | `padding-box` | `content-box` | text] = js.native
  /**
    * Sets the background color of an element.
    */
  var backgroundColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets a compositing style for background images and colors.
    */
  var backgroundComposite: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Applies one or more background images to an element. These can be any valid CSS
    * image, including url() paths to image files or CSS gradients.
    */
  var backgroundImage: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies what the background-position property is relative to.
    */
  var backgroundOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the position of a background image.
    */
  var backgroundPosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Background-repeat defines if and how background images will be repeated after they
    * have been sized and positioned
    */
  var backgroundRepeat: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of background images
    */
  var backgroundSize: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property that defines the different properties of all four sides of an
    * element's border in a single declaration. It can be used to set border-width,
    * border-style and border-color, or a subset of these.
    */
  var border: js.UndefOr[ICSSRule | `0` | String] = js.native
  /**
    * Shorthand that sets the values of border-bottom-color,
    * border-bottom-style, and border-bottom-width.
    */
  var borderBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of the bottom border of an element.
    */
  var borderBottomColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the shape of the border of the bottom-left corner.
    */
  var borderBottomLeftRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines the shape of the border of the bottom-right corner.
    */
  var borderBottomRightRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the line style of the bottom border of a box.
    */
  var borderBottomStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's bottom border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderBottomWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Border-collapse can be used for collapsing the borders between table cells
    */
  var borderCollapse: js.UndefOr[ICSSRule | String] = js.native
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
  var borderColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies different corner clipping effects, such as scoop (inner curves), bevel
    * (straight cuts) or notch (cut-off rectangles). Works along with border-radius to
    * specify the size of each corner effect.
    */
  var borderCornerShape: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The property border-image-source is used to set the image to be used instead of
    * the border style. If this is set to none the border-style is used instead.
    */
  var borderImageSource: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The border-image-width CSS property defines the offset to use for dividing the
    * border image in nine parts, the top-left corner, central top edge, top-right-corner,
    * central right edge, bottom-right corner, central bottom edge, bottom-left corner,
    * and central right edge. They represent inward distance from the top, right, bottom,
    * and left edges.
    */
  var borderImageWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's left border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the left
    * border — border-left-width, border-left-style and border-left-color.
    */
  var borderLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The CSS border-left-color property sets the color of an element's left border. This
    *  page explains the border-left-color value, but often you will find it more
    * convenient to fix the border's left color as part of a shorthand set, either
    * border-left or border-color. Colors can be defined several ways. For more
    * information, see Usage.
    */
  var borderLeftColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's left border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderLeftStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's left border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderLeftWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines how round the border's corners are.
    */
  var borderRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's right border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the
    * right border — border-right-width, border-right-style and border-right-color.
    */
  var borderRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of an element's right border. This page explains the
    * border-right-color value, but often you will find it more convenient to fix the
    * border's right color as part of a shorthand set, either border-right or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderRightColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's right border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderRightStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's right border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderRightWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Specifies the distance between the borders of adjacent cells.
    */
  var borderSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's four borders. This property can have from one to
    * four values. With only one value, the value will be applied to all four borders;
    * otherwise, this works as a shorthand property for each of border-top-style,
    *  border-right-style, border-bottom-style, border-left-style, where each border
    *  style may be assigned a separate value.
    */
  var borderStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's top border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the top
    * border — border-top-width, border-top-style and border-top-color.
    */
  var borderTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of an element's top border. This page explains the border-top-color
    * value, but often you will find it more convenient to fix the border's top color as
    * part of a shorthand set, either border-top or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderTopColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the rounding of the top-left corner of the element.
    */
  var borderTopLeftRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the rounding of the top-right corner of the element.
    */
  var borderTopRightRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the style of an element's top border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderTopStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's top border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderTopWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the width of an element's four borders. This property can have from one to
    * four values. This is a shorthand property for setting values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * This property specifies how far an absolutely positioned box's bottom margin edge
    * is offset above the bottom edge of the box's containing block. For relatively
    * positioned boxes, the offset is with respect to the bottom edges of the box itself
    * (i.e., the box is given a position in the normal flow, then offset from that
    * position according to these properties).
    */
  var bottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Breaks a box into fragments creating new borders, padding and repeating backgrounds
    * or lets it stay as a continuous box on a page break, column break, or, for inline
    * elements, at a line break.
    */
  var boxDecorationBreak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Cast a drop shadow from the frame of almost any element.
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The CSS box-sizing property is used to alter the default CSS box model used to
    * calculate width and height of the elements.
    */
  var boxSizing: js.UndefOr[ICSSRule | `border-box` | `content-box`] = js.native
  /**
    * The CSS break-after property allows you to force a break on multi-column layouts.
    * More specifically, it allows you to force a break after an element. It allows you
    * to determine if a break should occur, and what type of break it should be. The
    * break-after CSS property describes how the page, column or region break behaves
    * after the generated box. If there is no generated box, the property is ignored.
    */
  var breakAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Control page/column/region breaks that fall above a block of content
    */
  var breakBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Control page/column/region breaks that fall within a block of content
    */
  var breakInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The clear CSS property specifies if an element can be positioned next to or must be
    * positioned below the floating elements that precede it in the markup.
    */
  var clear: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Clipping crops an graphic, so that only a portion of the graphic is rendered, or
    * filled. This clip-rule property, when used with the clip-path property, defines
    * which clip rule, or algorithm, to use when filling the different parts of a graphics.
    */
  var clipRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The color property sets the color of an element's foreground content (usually text),
    * accepting any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
    */
  var color: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Describes the number of columns of the element.
    * See CSS 3 column-count property https://www.w3.org/TR/css3-multicol/#cc
    */
  var columnCount: js.UndefOr[ICSSRule | Double | auto] = js.native
  /**
    * Specifies how to fill columns (balanced or sequential).
    */
  var columnFill: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The column-gap property controls the width of the gap between columns in multi-column
    * elements.
    */
  var columnGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width, style, and color of the rule between columns.
    */
  var columnRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the color of the rule between columns.
    */
  var columnRuleColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the width of the rule between columns.
    */
  var columnRuleWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The column-span CSS property makes it possible for an element to span across all
    * columns when its value is set to all. An element that spans more than one column
    * is called a spanning element.
    */
  var columnSpan: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the width of columns in multi-column elements.
    */
  var columnWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * This property is a shorthand property for setting column-width and/or column-count.
    */
  var columns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Content for pseudo selectors.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The counter-increment property accepts one or more names of counters (identifiers),
    * each one optionally followed by an integer which specifies the value by which the
    * counter should be incremented (e.g. if the value is 2, the counter increases by 2
    * each time it is invoked).
    */
  var counterIncrement: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The counter-reset property contains a list of one or more names of counters, each
    * one optionally followed by an integer (otherwise, the integer defaults to 0.) Each
    * time the given element is invoked, the counters specified by the property are set to the given integer.
    */
  var counterReset: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The cue property specifies sound files (known as an "auditory icon") to be played by
    * speech media agents before and after presenting an element's content; if only one
    * file is specified, it is played both before and after. The volume at which the
    * file(s) should be played, relative to the volume of the main element, may also be
    * specified. The icon files may also be set separately with the cue-before and
    * cue-after properties.
    */
  var cue: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The cue-after property specifies a sound file (known as an "auditory icon") to be
    * played by speech media agents after presenting an element's content; the volume at
    * which the file should be played may also be specified. The shorthand property cue
    * sets cue sounds for both before and after the element is presented.
    */
  var cueAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the mouse cursor displayed when the mouse pointer is over an element.
    */
  var cursor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The direction CSS property specifies the text direction/writing direction. The rtl
    * is used for Hebrew or Arabic text, the ltr is for other languages.
    */
  var direction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies the type of rendering box used for an element. It is a
    * shorthand property for many other display properties.
    * W3: https://www.w3.org/TR/css-display-3/#the-display-properties
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/display
    */
  var display: js.UndefOr[ICSSRule | ICSSDisplayRule] = js.native
  /**
    * The ‘fill’ property paints the interior of the given graphical element. The area to
    * be painted consists of any areas inside the outline of the shape. To determine the
    * inside of the shape, all subpaths are considered, and the interior is determined
    * according to the rules associated with the current value of the ‘fill-rule’
    * property. The zero-width geometric outline of a shape is included in the area to be
    * painted.
    */
  var fill: js.UndefOr[ICSSRule | String] = js.native
  /**
    * SVG: Specifies the opacity of the color or the content the current object is filled
    * with.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#FillOpacityProperty
    */
  var fillOpacity: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * The ‘fill-rule’ property indicates the algorithm which is to be used to determine
    * what parts of the canvas are included inside the shape. For a simple,
    * non-intersecting path, it is intuitively clear what region lies "inside"; however,
    * for a more complex path, such as a path that intersects itself or where one subpath
    * encloses another, the interpretation of "inside" is not so obvious.
    * The ‘fill-rule’ property provides two options for how the inside of a shape is
    * determined:
    */
  var fillRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Applies various image processing effects. This property is largely unsupported. See
    * Compatibility section for more information.
    */
  var filter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    */
  var flex: js.UndefOr[ICSSRule | String | Double] = js.native
  /**
    * The flex-basis CSS property describes the initial main size of the flex item before
    * any free space is distributed according to the flex factors described in the flex
    * property (flex-grow and flex-shrink).
    */
  var flexBasis: js.UndefOr[ICSSRule | String | Double] = js.native
  /**
    * The flex-direction CSS property describes how flex items are placed in the flex
    * container, by setting the direction of the flex container's main axis.
    */
  var flexDirection: js.UndefOr[ICSSRule | row | `row-reverse` | column | `column-reverse`] = js.native
  /**
    * The flex-flow CSS property defines the flex container's main and cross axis. It is
    * a shorthand property for the flex-direction and flex-wrap properties.
    */
  var flexFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the flex grow factor of a flex item.
    * See CSS flex-grow property https://drafts.csswg.org/css-flexbox-1/#flex-grow-property
    */
  var flexGrow: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies the flex shrink factor of a flex item.
    * See CSS flex-shrink property https://drafts.csswg.org/css-flexbox-1/#flex-shrink-property
    */
  var flexShrink: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies whether flex items are forced into a single line or can be wrapped onto
    * multiple lines. If wrapping is allowed, this property also enables you to control
    * the direction in which lines are stacked.
    * See CSS flex-wrap property https://drafts.csswg.org/css-flexbox-1/#flex-wrap-property
    */
  var flexWrap: js.UndefOr[ICSSRule | nowrap | wrap | `wrap-reverse`] = js.native
  /**
    * Elements which have the style float are floated horizontally. These elements can
    * move as far to the left or right of the containing element. All elements after
    * the floating element will flow around it, but elements before the floating element
    * are not impacted. If several floating elements are placed after each other, they
    * will float next to each other as long as there is room.
    */
  var float: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Flows content from a named flow (specified by a corresponding flow-into) through
    * selected elements to form a dynamic chain of layout regions.
    */
  var flowFrom: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The property which allows authors to opt particular elements out of forced colors mode,
    * restoring full control over the colors to CSS. Currently it's only supported in Edge Chromium.
    */
  var forcedColorAdjust: js.UndefOr[auto | none] = js.native
  /**
    * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting
    * grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single
    * declaration.
    */
  var gridArea: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoColumns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls how the auto-placement algorithm works,
    * specifying exactly how auto-placed items get flowed into the grid.
    */
  var gridAutoFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoRows: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls a grid item's placement in a grid area, particularly grid position and a
    * grid span. Shorthand for setting grid-column-start and grid-column-end in a single
    * declaration.
    */
  var gridColumn: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls a grid item's placement in a grid area as well as grid position and a
    * grid span. The grid-column-end property (with grid-row-start, grid-row-end, and
    * grid-column-start) determines a grid item's placement by specifying the grid lines
    * of a grid item's grid area.
    */
  var gridColumnEnd: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of the gap (gutter) between an element's columns
    */
  var gridColumnGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines a grid item's placement by specifying the starting grid lines of a grid
    * item's grid area . A grid item's placement in a grid area consists of a grid
    * position and a grid span. See also ( grid-row-start, grid-row-end, and
    * grid-column-end)
    */
  var gridColumnStart: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the gaps (gutters) between grid rows and columns. It is a shorthand
    * for grid-row-gap and grid-column-gap.
    */
  var gridGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Gets or sets a value that indicates which row an element within a Grid should
    * appear in. Shorthand for setting grid-row-start and grid-row-end in a single
    * declaration.
    */
  var gridRow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines a grid item’s placement by specifying the block-end. A grid item's
    * placement in a grid area consists of a grid position and a grid span. The
    * grid-row-end property (with grid-row-start, grid-column-start, and grid-column-end)
    * determines a grid item's placement by specifying the grid lines of a grid item's
    * grid area.
    */
  var gridRowEnd: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of the gap (gutter) between an element's grid rows
    */
  var gridRowGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies a row position based upon an integer location, string value, or desired
    * row size.
    * css/properties/grid-row is used as short-hand for grid-row-position and
    * grid-row-position
    */
  var gridRowPosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies a grid item’s start position within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the
    * inline-start edge of its grid area
    */
  var gridRowStart: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies named grid areas which are not associated with any particular grid item,
    * but can be referenced from the grid-placement properties. The syntax of the
    * grid-template-areas property also provides a visualization of the structure of the
    * grid, making the overall layout of the grid container easier to understand.
    */
  var gridTemplate: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies named grid areas
    */
  var gridTemplateAreas: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies (with grid-template-rows) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateColumns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies (with grid-template-columns) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateRows: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the height of an element. The content area of the element height does not
    * include the padding, border, and margin of the element.
    */
  var height: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Specifies the minimum number of characters in a hyphenated word
    */
  var hyphenateLimitChars: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Indicates the maximum number of successive hyphenated lines in an element. The
    * ‘no-limit’ value means that there is no limit.
    */
  var hyphenateLimitLines: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the maximum amount of trailing whitespace (before justification) that may
    * be left in a line before hyphenation is triggered to pull part of a word from the
    * next line back up into the current one.
    */
  var hyphenateLimitZone: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies whether or not words in a sentence can be split by the use of a manual or
    * automatic hyphenation mechanism.
    */
  var hyphens: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines how the browser distributes space between and around flex items
    * along the main-axis of their container.
    * See CSS justify-content property
    * https://www.w3.org/TR/css-flexbox-1/#justify-content-property
    */
  var justifyContent: js.UndefOr[
    ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` | stretch
  ] = js.native
  /**
    * Justifies the box (as the alignment subject) within its containing block (as the alignment container)
    * along the inline/row/main axis of the alignment container.
    *
    * See CSS jusitfy-self property
    * https://www.w3.org/TR/css-align-3/#propdef-justify-self
    */
  var justifySelf: js.UndefOr[
    ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule | left | right | (`safe left`) | (`safe right`) | (`unsafe left`) | (`unsafe right`)
  ] = js.native
  /**
    * Sets the left position of an element relative to the nearest anscestor that is set
    * to position absolute, relative, or fixed.
    */
  var left: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The letter-spacing CSS property specifies the spacing behavior between text
    * characters.
    */
  var letterSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the height of an inline block level element.
    * See CSS 2.1 line-height property https://www.w3.org/TR/CSS21/visudet.html#propdef-line-height
    */
  var lineHeight: js.UndefOr[ICSSRule | normal | ICSSPixelUnitRule | ICSSPercentageRule] = js.native
  /**
    * Shorthand property that sets the list-style-type, list-style-position and
    * list-style-image properties in one declaration.
    */
  var listStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property sets the image that will be used as the list item marker. When the
    * image is available, it will replace the marker set with the 'list-style-type'
    * marker. That also means that if the image is not available, it will show the style
    * specified by list-style-property
    */
  var listStyleImage: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies if the list-item markers should appear inside or outside the content flow.
    */
  var listStylePosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the type of list-item marker in a list.
    */
  var listStyleType: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The margin property is shorthand to allow you to set all four margins of an element
    * at once. Its equivalent longhand properties are margin-top, margin-right,
    * margin-bottom and margin-left. Negative values are also allowed.
    */
  var margin: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-bottom sets the bottom margin of an element.
    */
  var marginBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-left sets the left margin of an element.
    */
  var marginLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-right sets the right margin of an element.
    */
  var marginRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-top sets the top margin of an element.
    */
  var marginTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The marquee-direction determines the initial direction in which the marquee content moves.
    */
  var marqueeDirection: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'marquee-style' property determines a marquee's scrolling behavior.
    */
  var marqueeStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property is shorthand for setting mask-image, mask-mode, mask-repeat,
    * mask-position, mask-clip, mask-origin, mask-composite and mask-size. Omitted
    * values are set to their original properties' initial values.
    */
  var mask: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property is shorthand for setting mask-border-source, mask-border-slice,
    * mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values
    * are set to their original properties' initial values.
    */
  var maskBorder: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how the images for the sides and the middle part of the
    * mask image are scaled and tiled. The first keyword applies to the horizontal
    * sides, the second one applies to the vertical ones. If the second keyword is
    * absent, it is assumed to be the same as the first, similar to the CSS
    * border-image-repeat property.
    */
  var maskBorderRepeat: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies inward offsets from the top, right, bottom, and left
    * edges of the mask image, dividing it into nine regions: four corners, four
    * edges, and a middle. The middle image part is discarded and treated as fully
    * transparent black unless the fill keyword is present. The four values set the
    * top, right, bottom and left offsets in that order, similar to the CSS
    * border-image-slice property.
    */
  var maskBorderSlice: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies an image to be used as a mask. An image that is empty, fails to
    * download, is non-existent, or cannot be displayed is ignored and does not mask
    * the element.
    */
  var maskBorderSource: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property sets the width of the mask box image, similar to the CSS
    * border-image-width property.
    */
  var maskBorderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Determines the mask painting area, which defines the area that is affected by
    * the mask. The painted content of an element may be restricted to this area.
    */
  var maskClip: js.UndefOr[ICSSRule | String] = js.native
  /**
    * For elements rendered as a single box, specifies the mask positioning area. For
    * elements rendered as multiple boxes (e.g., inline boxes on several lines, boxes
    * on several pages) specifies which boxes box-decoration-break operates on to
    * determine the mask positioning area(s).
    */
  var maskOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property must not be used. It is no longer included in any standard or
    * standard track specification, nor is it implemented in any browser. It is only
    * used when the text-align-last property is set to size. It controls allowed
    * adjustments of font-size to fit line content.
    */
  var maxFontSize: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the maximum height for an element. It prevents the height of the element to
    *  exceed the specified value. If min-height is specified and is greater than
    * max-height, max-height is overridden.
    */
  var maxHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the maximum width for an element. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the minimum height for an element. It prevents the height of the element to
    * be smaller than the specified value. The value of min-height overrides both
    * max-height and height.
    */
  var minHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the minimum width of an element. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The mix-blend-mode CSS property describes how an element's content should blend
    * with the content of the element's direct parent and the element's background.
    */
  var mixBlendMode: js.UndefOr[ICSSRule | IMixBlendModes] = js.native
  /**
    * The ‘object-fit’ property specifies how the contents of a replaced element should
    * be fitted to the box established by its used height and width.
    * See CSS 3 object-fit property https://www.w3.org/TR/css3-images/#the-object-fit
    */
  var objectFit: js.UndefOr[ICSSRule | cover | contain | fill | none] = js.native
  /**
    * Specifies the transparency of an element.
    * See CSS 3 opacity property https://drafts.csswg.org/css-color-3/#opacity
    */
  var opacity: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies the order used to lay out flex items in their flex container.
    * Elements are laid out in the ascending order of the order value.
    * See CSS order property https://drafts.csswg.org/css-flexbox-1/#order-property
    */
  var order: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * In paged media, this property defines the minimum number of lines in
    * a block container that must be left at the bottom of the page.
    * See CSS 3 orphans, widows properties https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var orphans: js.UndefOr[ICSSRule | Double] = js.native
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
  var outline: js.UndefOr[ICSSRule | `0` | String] = js.native
  /**
    * The outline-color property sets the color of the outline of an element. An
    * outline is a line that is drawn around elements, outside the border edge, to make
    * the element stand out.
    */
  var outlineColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The outline-offset property offsets the outline and draw it beyond the border edge.
    */
  var outlineOffset: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The overflow property controls how extra content exceeding the bounding box of an
    * element is rendered. It can be used in conjunction with an element that has a
    * fixed width and height, to eliminate text-induced page distortion.
    */
  var overflow: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * Specifies the preferred scrolling methods for elements that overflow.
    */
  var overflowStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies whether or not the browser should insert line breaks within words to
    * prevent text from overflowing its content box. In contrast to word-break,
    * overflow-wrap will only create a break if an entire word cannot be placed on its
    * own line without overflowing.
    */
  var overflowWrap: js.UndefOr[ICSSRule | normal | `break-word`] = js.native
  /**
    * Controls how extra content exceeding the x-axis of the bounding box of an element
    * is rendered.
    */
  var overflowX: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * Controls how extra content exceeding the y-axis of the bounding box of an element
    * is rendered.
    */
  var overflowY: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * The padding optional CSS property sets the required padding space on one to four
    * sides of an element. The padding area is the space between an element and its
    * border. Negative values are not allowed but decimal values are permitted. The
    *  element size is treated as fixed, and the content of the element shifts toward the
    * center as padding is increased. The padding property is a shorthand to avoid
    * setting each side separately (padding-top, padding-right, padding-bottom,
    * padding-left).
    */
  var padding: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-block-end CSS property defines the logical block end padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property
    * depending on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-block-start CSS property defines the logical block start padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property depending
    * on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-bottom CSS property of an element sets the padding space required on
    * the bottom of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-bottom values, negative values of
    * padding-bottom are invalid.
    */
  var paddingBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-inline-end CSS property defines the logical inline end padding of an element,
    * which maps to a physical padding depending on the element's writing mode, directionality,
    * and text orientation. It corresponds to the padding-top, padding-right, padding-bottom,
    * or padding-left property depending on the values defined for writing-mode, direction,
    * and text-orientation.
    */
  var paddingInlineEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-inline-start CSS property defines the logical inline start padding of
    * an element, which maps to a physical padding depending on the element's writing mode,
    * directionality, and text orientation. It corresponds to the padding-top, padding-right,
    * padding-bottom, or padding-left property depending on the values defined for writing-mode,
    * direction, and text-orientation.
    */
  var paddingInlineStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-left CSS property of an element sets the padding space required on the
    * left side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-left values, negative values of
    * padding-left are invalid.
    */
  var paddingLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-right CSS property of an element sets the padding space required on the
    * right side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-right values, negative values of
    * padding-right are invalid.
    */
  var paddingRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-top CSS property of an element sets the padding space required on the
    * top of an element. The padding area is the space between the content of the element
    * and its border. Contrary to margin-top values, negative values of padding-top are
    * invalid.
    */
  var paddingTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The page-break-after property is supported in all major browsers. With CSS3,
    *  page-break-* properties are only aliases of the break-* properties. The CSS3
    * Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The page-break-before property sets the page-breaking behavior before an element.
    * With CSS3, page-break-* properties are only aliases of the break-* properties. The
    * CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the page-breaking behavior inside an element. With CSS3, page-break-*
    * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec
    * defines breaks for all CSS box fragmentation.
    */
  var pageBreakInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause property determines how long a speech media agent should pause before and
    * after presenting an element. It is a shorthand for the pause-before and pause-after
    *  properties.
    */
  var pause: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause-after property determines how long a speech media agent should pause after
    * presenting an element. It may be replaced by the shorthand property pause, which
    * sets pause time before and after.
    */
  var pauseAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause-before property determines how long a speech media agent should pause
    * before presenting an element. It may be replaced by the shorthand property pause,
    * which sets pause time before and after.
    */
  var pauseBefore: js.UndefOr[ICSSRule | String] = js.native
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
  var perspective: js.UndefOr[ICSSRule | String] = js.native
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
  var perspectiveOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pointer-events property allows you to control whether an element can be the
    * target for the pointing device (e.g, mouse, pen) events.
    */
  var pointerEvents: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The position property controls the type of positioning used by an element within
    * its parent elements. The effect of the position property depends on a lot of
    * factors, for example the position property of parent elements.
    */
  var position: js.UndefOr[ICSSRule | static | relative | absolute | fixed | sticky] = js.native
  /**
    * Sets the type of quotation marks for embedded quotations.
    */
  var quotes: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls whether the last region in a chain displays additional 'overset' content
    * according its default overflow property, or if it displays a fragment of content
    * as if it were flowing into a subsequent region.
    */
  var regionFragment: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The resize CSS sets whether an element is resizable, and if so, in which direction(s).
    */
  var resize: js.UndefOr[ICSSRule | none | both | horizontal | vertical | block | `inline`] = js.native
  /**
    * The rest-after property determines how long a speech media agent should pause after
    * presenting an element's main content, before presenting that element's exit cue
    * sound. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The rest-before property determines how long a speech media agent should pause after
    * presenting an intro cue sound for an element, before presenting that element's main
    * content. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the position an element in relation to the right side of the containing
    * element.
    */
  var right: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines the alpha channel threshold used to extract a shape from an image. Can be
    * thought of as a "minimum opacity" threshold; that is, a value of 0.5 means that the
    * shape will enclose all the pixels that are more than 50% opaque.
    */
  var shapeImageThreshold: js.UndefOr[ICSSRule | String] = js.native
  /**
    * A future level of CSS Shapes will define a shape-inside property, which will define
    * a shape to wrap content within the element. See Editor's Draft
    * http://dev.w3.org/csswg/css-shapes and CSSWG wiki page on next-level plans
    * http://wiki.csswg.org/spec/css-shapes
    */
  var shapeInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Adds a margin to a shape-outside. In effect, defines a new shape that is the
    * smallest contour around all the points that are the shape-margin distance outward
    * perpendicular to each point on the underlying shape. For points where a
    * perpendicular direction is not defined (e.g., a triangle corner), takes all
    * points on a circle centered at the point and with a radius of the shape-margin
    * distance. This property accepts only non-negative values.
    */
  var shapeMargin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Declares a shape around which text should be wrapped, with possible modifications
    * from the shape-margin property. The shape defined by shape-outside and shape-margin
    * changes the geometry of a float element's float area.
    */
  var shapeOutside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The speak property determines whether or not a speech synthesizer will read aloud
    * the contents of an element.
    */
  var speak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The speak-as property determines how the speech synthesizer interprets the content:
    * words as whole words or as a sequence of letters, numbers as a numerical value or a
    * sequence of digits, punctuation as pauses in speech or named punctuation characters.
    */
  var speakAs: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The stroke property in CSS is for adding a border to SVG shapes.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#Stroke
    */
  var stroke: js.UndefOr[ICSSRule | String] = js.native
  /**
    * SVG: The stroke-linecap attribute defines the shape to be used at the end of open subpaths when they are stroked.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#LineCaps
    */
  var strokeLinecap: js.UndefOr[ICSSRule | butt | round | square] = js.native
  /**
    * SVG: Specifies the opacity of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeOpacityProperty
    */
  var strokeOpacity: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * SVG: Specifies the width of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeWidthProperty
    */
  var strokeWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
    */
  var tabSize: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'table-layout' property controls the algorithm used to lay out the table cells, rows, and columns.
    */
  var tableLayout: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-align CSS property describes how inline content like text is aligned in its
    * parent block element. text-align does not control the alignment of block elements
    * itself, only their inline content.
    */
  var textAlign: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-align-last CSS property describes how the last line of a block element or
    * a line before line break is aligned in its parent block element.
    */
  var textAlignLast: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-decoration CSS property is used to set the text formatting to underline,
    * overline, line-through or blink. underline and overline decorations are positioned
    * under the text, line-through over it.
    */
  var textDecoration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the color of any text decoration, such as underlines, overlines, and strike
    * throughs.
    */
  var textDecorationColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets what kind of line decorations are added to an element, such as underlines,
    * overlines, etc.
    */
  var textDecorationLine: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies what parts of an element’s content are skipped over when applying any
    * text decoration.
    */
  var textDecorationSkip: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies the style of the text decoration line drawn on the
    * specified element. The intended meaning for the values are the same as those of
    * the border-style-properties.
    */
  var textDecorationStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis property will apply special emphasis marks to the elements text.
    * Slightly similar to the text-decoration property only that this property can have
    * affect on the line-height. It also is noted that this is shorthand for
    * text-emphasis-style and for text-emphasis-color.
    */
  var textEmphasis: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis-color property specifies the foreground color of the emphasis
    * marks.
    */
  var textEmphasisColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis-style property applies special emphasis marks to an element's
    * text.
    */
  var textEmphasisStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property helps determine an inline box's block-progression dimension, derived
    * from the text-height and font-size properties for non-replaced elements, the height
    * or the width for replaced elements, and the stacked block-progression dimension for
    * inline-block elements. The block-progression dimension determines the position of
    * the padding, border and margin for the element.
    */
  var textHeight: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the amount of space horizontally that should be left on the first line of
    * the text of an element. This horizontal spacing is at the beginning of the first
    * line and is in respect to the left edge of the containing block box.
    */
  var textIndent: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-overflow shorthand CSS property determines how overflowed content that is
    * not displayed is signaled to the users. It can be clipped, display an ellipsis
    * ('…', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string. It covers the
    * two long-hand properties text-overflow-mode and text-overflow-ellipsis
    */
  var textOverflow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-overline property is the shorthand for the text-overline-style,
    * text-overline-width, text-overline-color, and text-overline-mode properties.
    */
  var textOverline: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line color for the overline text decoration.
    */
  var textOverlineColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the mode for the overline text decoration, determining whether the text
    * decoration affects the space characters or not.
    */
  var textOverlineMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line style for overline text decoration.
    */
  var textOverlineStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line width for the overline text decoration.
    */
  var textOverlineWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The text-rendering CSS property provides information to the browser about how to
    * optimize when rendering text. Options are: legibility, speed or geometric precision.
    */
  var textRendering: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The CSS text-shadow property applies one or more drop shadows to the text and
    * `<text-decorations>` of an element. Each shadow is specified as an offset from the
    * text, along with optional color and blur radius values.
    */
  var textShadow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-size-adjust CSS property controls the text inflation algorithm used
    * on some smartphones and tablets. Other browsers will ignore this property.
    */
  var textSizeAdjust: js.UndefOr[none | auto | ICSSPercentageRule | ICSSRule] = js.native
  /**
    * This property transforms text for styling purposes. (It has no effect on the
    * underlying content.)
    */
  var textTransform: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Unsupported.
    * This property will add a underline position value to the element that has an
    * underline defined.
    */
  var textUnderlinePosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * After review this should be replaced by text-decoration should it not?
    * This property will set the underline style for text with a line value for
    * underline, overline, and line-through.
    */
  var textUnderlineStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how far an absolutely positioned box's top margin edge is
    * offset below the top edge of the box's containing block. For relatively positioned
    * boxes, the offset is with respect to the top edges of the box itself (i.e., the box
    * is given a position in the normal flow, then offset from that position according to
    * these properties).
    */
  var top: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Determines whether touch input may trigger default behavior supplied by the user
    * agent, such as panning or zooming.
    */
  var touchAction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * CSS transforms allow elements styled with CSS to be transformed in two-dimensional
    * or three-dimensional space. Using this property, elements can be translated,
    * rotated, scaled, and skewed. The value list may consist of 2D and/or 3D transform
    * values.
    */
  var transform: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property defines the origin of the transformation axes relative to the element
    * to which the transformation is applied.
    */
  var transformOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property allows you to define the relative position of the origin of the
    * transformation grid along the z-axis.
    */
  var transformOriginZ: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how nested elements are rendered in 3D space relative to their parent.
    */
  var transformStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The transition CSS property is a shorthand property for transition-property,
    * transition-duration, transition-timing-function, and transition-delay. It allows to
    * define the transition between two states of an element.
    */
  var transition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines when the transition will start. A value of ‘0s’ means the transition will
    * execute as soon as the property is changed. Otherwise, the value specifies an
    * offset from the moment the property is changed, and the transition will delay
    * execution by that offset.
    */
  var transitionDelay: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'transition-duration' property specifies the length of time a transition
    * animation takes to complete.
    */
  var transitionDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'transition-property' property specifies the name of the CSS property to which
    * the transition is applied.
    */
  var transitionProperty: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the pace of action within a transition
    */
  var transitionTimingFunction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The unicode-bidi CSS property specifies the level of embedding with respect to the bidirectional algorithm.
    */
  var unicodeBidi: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This is for all the high level UX stuff.
    */
  var userFocus: js.UndefOr[ICSSRule | String] = js.native
  /**
    * For inputing user content
    */
  var userInput: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the text selection behavior.
    */
  var userSelect: js.UndefOr[ICSSRule | none | auto | text | all | contain] = js.native
  /**
    * The vertical-align property controls how inline elements or text are vertically
    * aligned compared to the baseline. If this property is used on table-cells it
    * controls the vertical alignment of content of the table cell.
    */
  var verticalAlign: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The visibility property specifies whether the boxes generated by an element are rendered.
    */
  var visibility: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-balance property sets the apparent position (in stereo sound) of the synthesized voice for spoken media.
    */
  var voiceBalance: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-duration property allows the author to explicitly set the amount of time
    * it should take a speech synthesizer to read an element's content, for example to
    * allow the speech to be synchronized with other media. With a value of auto (the
    * default) the length of time it takes to read the content is determined by the
    * content itself and the voice-rate property.
    */
  var voiceDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-family property sets the speaker's voice used by a speech media agent to
    * read an element. The speaker may be specified as a named character (to match a
    * voice option in the speech reading software) or as a generic description of the
    * age and gender of the voice. Similar to the font-family property for visual media,
    * a comma-separated list of fallback options may be given in case the speech reader
    * does not recognize the character name or cannot synthesize the requested combination
    * of generic properties.
    */
  var voiceFamily: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech
    * when reading an element; the pitch may be specified absolutely or relative to the
    * normal pitch for the voice-family used to read the text.
    */
  var voicePitch: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-range property determines how much variation in pitch or tone will be
    * created by the speech synthesize when reading an element. Emphasized text,
    * grammatical structures and punctuation may all be rendered as changes in pitch,
    * this property determines how strong or obvious those changes are; large ranges are
    * associated with enthusiastic or emotional speech, while small ranges are associated
    * with flat or mechanical speech.
    */
  var voiceRange: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-rate property sets the speed at which the voice synthesized by a speech
    * media agent will read content.
    */
  var voiceRate: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-stress property sets the level of vocal emphasis to be used for
    * synthesized speech reading the element.
    */
  var voiceStress: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-volume property sets the volume for spoken content in speech media. It
    * replaces the deprecated volume property.
    */
  var voiceVolume: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The white-space property controls whether and how white space inside the element is
    * collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
    */
  var whiteSpace: js.UndefOr[ICSSRule | String] = js.native
  /**
    * In paged media, this property defines the mimimum number of lines that must be left
    * at the top of the second page.
    * See CSS 3 orphans, widows properties
    * https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var widows: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * Specifies the width of the content area of an element. The content area of the element
    * width does not include the padding, border, and margin of the element.
    */
  var width: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The word-break property is often used when there is long generated content that is
    * strung together without and spaces or hyphens to beak apart. A common case of this
    * is when there is a long URL that does not have any hyphens. This case could
    * potentially cause the breaking of the layout as it could extend past the parent
    * element.
    */
  var wordBreak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The word-spacing CSS property specifies the spacing behavior between "words".
    */
  var wordSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * An alias of css/properties/overflow-wrap, word-wrap defines whether to break
    * words when the content exceeds the boundaries of its container.
    */
  var wordWrap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies how exclusions affect inline content within block-level elements. Elements
    * lay out their inline content in their content area but wrap around exclusion areas.
    */
  var wrapFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Set the value that is used to offset the inner wrap shape from other shapes. Inline
    * content that intersects a shape with this property will be pushed by this shape's
    * margin.
    */
  var wrapMargin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * writing-mode specifies if lines of text are laid out horizontally or vertically,
    * and the direction which lines of text and blocks progress.
    */
  var writingMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The z-index property specifies the z-order of an element and its descendants.
    * When elements overlap, z-order determines which one covers the other.
    * See CSS 2 z-index property https://www.w3.org/TR/CSS2/visuren.html#z-index
    */
  var zIndex: js.UndefOr[ICSSRule | auto | Double] = js.native
  /**
    * Sets the initial zoom factor of a document defined by `@viewport`.
    * See CSS zoom descriptor https://drafts.csswg.org/css-device-adapt/#zoom-desc
    */
  var zoom: js.UndefOr[ICSSRule | auto | Double | ICSSPercentageRule] = js.native
}

object IRawStyleBase {
  @scala.inline
  def apply(): IRawStyleBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRawStyleBase]
  }
  @scala.inline
  implicit class IRawStyleBaseOps[Self <: IRawStyleBase] (val x: Self) extends AnyVal {
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
    def setMozOsxFontSmoothing(value: none | antialiased | grayscale | `subpixel-antialiased`): Self = this.set("MozOsxFontSmoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOsxFontSmoothing: Self = this.set("MozOsxFontSmoothing", js.undefined)
    @scala.inline
    def setMsHighContrastAdjust(value: ICSSRule | String): Self = this.set("MsHighContrastAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsHighContrastAdjust: Self = this.set("MsHighContrastAdjust", js.undefined)
    @scala.inline
    def setMsOverflowStyle(value: auto | none | scrollbar | `-ms-autohiding-scrollbar`): Self = this.set("MsOverflowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsOverflowStyle: Self = this.set("MsOverflowStyle", js.undefined)
    @scala.inline
    def setWebkitBackdropFilter(value: ICSSRule | String): Self = this.set("WebkitBackdropFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBackdropFilter: Self = this.set("WebkitBackdropFilter", js.undefined)
    @scala.inline
    def setWebkitFontSmoothing(value: none | antialiased | grayscale | `subpixel-antialiased`): Self = this.set("WebkitFontSmoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitFontSmoothing: Self = this.set("WebkitFontSmoothing", js.undefined)
    @scala.inline
    def setWebkitOverflowScrolling(value: auto | touch): Self = this.set("WebkitOverflowScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitOverflowScrolling: Self = this.set("WebkitOverflowScrolling", js.undefined)
    @scala.inline
    def setWebkitTapHighlightColor(value: String): Self = this.set("WebkitTapHighlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitTapHighlightColor: Self = this.set("WebkitTapHighlightColor", js.undefined)
    @scala.inline
    def setWebkitTextSizeAdjust(value: none | auto | ICSSPercentageRule | ICSSRule): Self = this.set("WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitTextSizeAdjust: Self = this.set("WebkitTextSizeAdjust", js.undefined)
    @scala.inline
    def setAlignContent(value: ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | stretch): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignItems(value: ICSSRule | `flex-start` | `flex-end` | center | baseline | stretch): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setAlignSelf(
      value: ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule
    ): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAlignmentAdjust(value: ICSSRule | String): Self = this.set("alignmentAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentAdjust: Self = this.set("alignmentAdjust", js.undefined)
    @scala.inline
    def setAlignmentBaseline(value: ICSSRule | String): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setAnimation(value: ICSSRule | String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: ICSSRule | String): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDirection(value: ICSSRule | String): Self = this.set("animationDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDirection: Self = this.set("animationDirection", js.undefined)
    @scala.inline
    def setAnimationDuration(value: ICSSRule | String): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationFillMode(value: ICSSRule | none | forwards | backwards | both): Self = this.set("animationFillMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationFillMode: Self = this.set("animationFillMode", js.undefined)
    @scala.inline
    def setAnimationIterationCount(value: ICSSRule | String): Self = this.set("animationIterationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationIterationCount: Self = this.set("animationIterationCount", js.undefined)
    @scala.inline
    def setAnimationName(value: ICSSRule | String): Self = this.set("animationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationName: Self = this.set("animationName", js.undefined)
    @scala.inline
    def setAnimationPlayState(value: ICSSRule | String): Self = this.set("animationPlayState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationPlayState: Self = this.set("animationPlayState", js.undefined)
    @scala.inline
    def setAnimationTimingFunction(value: ICSSRule | String): Self = this.set("animationTimingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTimingFunction: Self = this.set("animationTimingFunction", js.undefined)
    @scala.inline
    def setAppearance(value: ICSSRule | String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setBackdropFilter(value: ICSSRule | String): Self = this.set("backdropFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropFilter: Self = this.set("backdropFilter", js.undefined)
    @scala.inline
    def setBackfaceVisibility(value: ICSSRule | String): Self = this.set("backfaceVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfaceVisibility: Self = this.set("backfaceVisibility", js.undefined)
    @scala.inline
    def setBackground(value: ICSSRule | String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundAttachment(value: ICSSRule | scroll | fixed | local): Self = this.set("backgroundAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundAttachment: Self = this.set("backgroundAttachment", js.undefined)
    @scala.inline
    def setBackgroundBlendMode(value: ICSSRule | String): Self = this.set("backgroundBlendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundBlendMode: Self = this.set("backgroundBlendMode", js.undefined)
    @scala.inline
    def setBackgroundClip(value: ICSSRule | `border-box` | `padding-box` | `content-box` | text): Self = this.set("backgroundClip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundClip: Self = this.set("backgroundClip", js.undefined)
    @scala.inline
    def setBackgroundColor(value: ICSSRule | String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundComposite(value: ICSSRule | String): Self = this.set("backgroundComposite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundComposite: Self = this.set("backgroundComposite", js.undefined)
    @scala.inline
    def setBackgroundImage(value: ICSSRule | String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    @scala.inline
    def setBackgroundOrigin(value: ICSSRule | String): Self = this.set("backgroundOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundOrigin: Self = this.set("backgroundOrigin", js.undefined)
    @scala.inline
    def setBackgroundPosition(value: ICSSRule | String): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
    @scala.inline
    def setBackgroundRepeat(value: ICSSRule | String): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    @scala.inline
    def setBackgroundSize(value: ICSSRule | String): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    @scala.inline
    def setBorder(value: ICSSRule | `0` | String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderBottom(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    @scala.inline
    def setBorderBottomColor(value: ICSSRule | String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setBorderBottomLeftRadius(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadius(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderBottomStyle(value: ICSSRule | String): Self = this.set("borderBottomStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomStyle: Self = this.set("borderBottomStyle", js.undefined)
    @scala.inline
    def setBorderBottomWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    @scala.inline
    def setBorderCollapse(value: ICSSRule | String): Self = this.set("borderCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderCollapse: Self = this.set("borderCollapse", js.undefined)
    @scala.inline
    def setBorderColor(value: ICSSRule | String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderCornerShape(value: ICSSRule | String): Self = this.set("borderCornerShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderCornerShape: Self = this.set("borderCornerShape", js.undefined)
    @scala.inline
    def setBorderImageSource(value: ICSSRule | String): Self = this.set("borderImageSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderImageSource: Self = this.set("borderImageSource", js.undefined)
    @scala.inline
    def setBorderImageWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderImageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderImageWidth: Self = this.set("borderImageWidth", js.undefined)
    @scala.inline
    def setBorderLeft(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderLeftColor(value: ICSSRule | String): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    @scala.inline
    def setBorderLeftStyle(value: ICSSRule | String): Self = this.set("borderLeftStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftStyle: Self = this.set("borderLeftStyle", js.undefined)
    @scala.inline
    def setBorderLeftWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    @scala.inline
    def setBorderRadius(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    @scala.inline
    def setBorderRightColor(value: ICSSRule | String): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    @scala.inline
    def setBorderRightStyle(value: ICSSRule | String): Self = this.set("borderRightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightStyle: Self = this.set("borderRightStyle", js.undefined)
    @scala.inline
    def setBorderRightWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    @scala.inline
    def setBorderSpacing(value: ICSSRule | String): Self = this.set("borderSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSpacing: Self = this.set("borderSpacing", js.undefined)
    @scala.inline
    def setBorderStyle(value: ICSSRule | String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderTop(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    @scala.inline
    def setBorderTopColor(value: ICSSRule | String): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    @scala.inline
    def setBorderTopLeftRadius(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadius(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setBorderTopStyle(value: ICSSRule | String): Self = this.set("borderTopStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopStyle: Self = this.set("borderTopStyle", js.undefined)
    @scala.inline
    def setBorderTopWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    @scala.inline
    def setBorderWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBottom(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBoxDecorationBreak(value: ICSSRule | String): Self = this.set("boxDecorationBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxDecorationBreak: Self = this.set("boxDecorationBreak", js.undefined)
    @scala.inline
    def setBoxShadow(value: ICSSRule | String): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxShadow: Self = this.set("boxShadow", js.undefined)
    @scala.inline
    def setBoxSizing(value: ICSSRule | `border-box` | `content-box`): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxSizing: Self = this.set("boxSizing", js.undefined)
    @scala.inline
    def setBreakAfter(value: ICSSRule | String): Self = this.set("breakAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakAfter: Self = this.set("breakAfter", js.undefined)
    @scala.inline
    def setBreakBefore(value: ICSSRule | String): Self = this.set("breakBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakBefore: Self = this.set("breakBefore", js.undefined)
    @scala.inline
    def setBreakInside(value: ICSSRule | String): Self = this.set("breakInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakInside: Self = this.set("breakInside", js.undefined)
    @scala.inline
    def setClear(value: ICSSRule | String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClipRule(value: ICSSRule | String): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setColor(value: ICSSRule | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColumnCount(value: ICSSRule | Double | auto): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnFill(value: ICSSRule | String): Self = this.set("columnFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnFill: Self = this.set("columnFill", js.undefined)
    @scala.inline
    def setColumnGap(value: ICSSRule | String): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    @scala.inline
    def setColumnRule(value: ICSSRule | String): Self = this.set("columnRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnRule: Self = this.set("columnRule", js.undefined)
    @scala.inline
    def setColumnRuleColor(value: ICSSRule | String): Self = this.set("columnRuleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnRuleColor: Self = this.set("columnRuleColor", js.undefined)
    @scala.inline
    def setColumnRuleWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("columnRuleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnRuleWidth: Self = this.set("columnRuleWidth", js.undefined)
    @scala.inline
    def setColumnSpan(value: ICSSRule | String): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    @scala.inline
    def setColumnWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setColumns(value: ICSSRule | String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCounterIncrement(value: ICSSRule | String): Self = this.set("counterIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterIncrement: Self = this.set("counterIncrement", js.undefined)
    @scala.inline
    def setCounterReset(value: ICSSRule | String): Self = this.set("counterReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterReset: Self = this.set("counterReset", js.undefined)
    @scala.inline
    def setCue(value: ICSSRule | String): Self = this.set("cue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCue: Self = this.set("cue", js.undefined)
    @scala.inline
    def setCueAfter(value: ICSSRule | String): Self = this.set("cueAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCueAfter: Self = this.set("cueAfter", js.undefined)
    @scala.inline
    def setCursor(value: ICSSRule | String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDirection(value: ICSSRule | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisplay(value: ICSSRule | ICSSDisplayRule): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFill(value: ICSSRule | String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: ICSSRule | Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: ICSSRule | String): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFilter(value: ICSSRule | String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFlex(value: ICSSRule | String | Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexBasis(value: ICSSRule | String | Double): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    @scala.inline
    def setFlexDirection(value: ICSSRule | row | `row-reverse` | column | `column-reverse`): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    @scala.inline
    def setFlexFlow(value: ICSSRule | String): Self = this.set("flexFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexFlow: Self = this.set("flexFlow", js.undefined)
    @scala.inline
    def setFlexGrow(value: ICSSRule | Double | String): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    @scala.inline
    def setFlexShrink(value: ICSSRule | Double | String): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    @scala.inline
    def setFlexWrap(value: ICSSRule | nowrap | wrap | `wrap-reverse`): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setFloat(value: ICSSRule | String): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setFlowFrom(value: ICSSRule | String): Self = this.set("flowFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowFrom: Self = this.set("flowFrom", js.undefined)
    @scala.inline
    def setForcedColorAdjust(value: auto | none): Self = this.set("forcedColorAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcedColorAdjust: Self = this.set("forcedColorAdjust", js.undefined)
    @scala.inline
    def setGridArea(value: ICSSRule | String): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setGridAutoColumns(value: ICSSRule | String): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
    @scala.inline
    def setGridAutoFlow(value: ICSSRule | String): Self = this.set("gridAutoFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoFlow: Self = this.set("gridAutoFlow", js.undefined)
    @scala.inline
    def setGridAutoRows(value: ICSSRule | String): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
    @scala.inline
    def setGridColumn(value: ICSSRule | String): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
    @scala.inline
    def setGridColumnEnd(value: ICSSRule | String): Self = this.set("gridColumnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnEnd: Self = this.set("gridColumnEnd", js.undefined)
    @scala.inline
    def setGridColumnGap(value: ICSSRule | String): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    @scala.inline
    def setGridColumnStart(value: ICSSRule | String): Self = this.set("gridColumnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnStart: Self = this.set("gridColumnStart", js.undefined)
    @scala.inline
    def setGridGap(value: ICSSRule | String): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    @scala.inline
    def setGridRow(value: ICSSRule | String): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    @scala.inline
    def setGridRowEnd(value: ICSSRule | String): Self = this.set("gridRowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowEnd: Self = this.set("gridRowEnd", js.undefined)
    @scala.inline
    def setGridRowGap(value: ICSSRule | String): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    @scala.inline
    def setGridRowPosition(value: ICSSRule | String): Self = this.set("gridRowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowPosition: Self = this.set("gridRowPosition", js.undefined)
    @scala.inline
    def setGridRowStart(value: ICSSRule | String): Self = this.set("gridRowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowStart: Self = this.set("gridRowStart", js.undefined)
    @scala.inline
    def setGridTemplate(value: ICSSRule | String): Self = this.set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplate: Self = this.set("gridTemplate", js.undefined)
    @scala.inline
    def setGridTemplateAreas(value: ICSSRule | String): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
    @scala.inline
    def setGridTemplateColumns(value: ICSSRule | String): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
    @scala.inline
    def setGridTemplateRows(value: ICSSRule | String): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
    @scala.inline
    def setHeight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHyphenateLimitChars(value: ICSSRule | String): Self = this.set("hyphenateLimitChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphenateLimitChars: Self = this.set("hyphenateLimitChars", js.undefined)
    @scala.inline
    def setHyphenateLimitLines(value: ICSSRule | String): Self = this.set("hyphenateLimitLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphenateLimitLines: Self = this.set("hyphenateLimitLines", js.undefined)
    @scala.inline
    def setHyphenateLimitZone(value: ICSSRule | String): Self = this.set("hyphenateLimitZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphenateLimitZone: Self = this.set("hyphenateLimitZone", js.undefined)
    @scala.inline
    def setHyphens(value: ICSSRule | String): Self = this.set("hyphens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphens: Self = this.set("hyphens", js.undefined)
    @scala.inline
    def setJustifyContent(
      value: ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` | stretch
    ): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setJustifySelf(
      value: ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule | left | right | (`safe left`) | (`safe right`) | (`unsafe left`) | (`unsafe right`)
    ): Self = this.set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifySelf: Self = this.set("justifySelf", js.undefined)
    @scala.inline
    def setLeft(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLetterSpacing(value: ICSSRule | String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLineHeight(value: ICSSRule | normal | ICSSPixelUnitRule | ICSSPercentageRule): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setListStyle(value: ICSSRule | String): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setListStyleImage(value: ICSSRule | String): Self = this.set("listStyleImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyleImage: Self = this.set("listStyleImage", js.undefined)
    @scala.inline
    def setListStylePosition(value: ICSSRule | String): Self = this.set("listStylePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStylePosition: Self = this.set("listStylePosition", js.undefined)
    @scala.inline
    def setListStyleType(value: ICSSRule | String): Self = this.set("listStyleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyleType: Self = this.set("listStyleType", js.undefined)
    @scala.inline
    def setMargin(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginBottom(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarqueeDirection(value: ICSSRule | String): Self = this.set("marqueeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarqueeDirection: Self = this.set("marqueeDirection", js.undefined)
    @scala.inline
    def setMarqueeStyle(value: ICSSRule | String): Self = this.set("marqueeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarqueeStyle: Self = this.set("marqueeStyle", js.undefined)
    @scala.inline
    def setMask(value: ICSSRule | String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskBorder(value: ICSSRule | String): Self = this.set("maskBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorder: Self = this.set("maskBorder", js.undefined)
    @scala.inline
    def setMaskBorderRepeat(value: ICSSRule | String): Self = this.set("maskBorderRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorderRepeat: Self = this.set("maskBorderRepeat", js.undefined)
    @scala.inline
    def setMaskBorderSlice(value: ICSSRule | String): Self = this.set("maskBorderSlice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorderSlice: Self = this.set("maskBorderSlice", js.undefined)
    @scala.inline
    def setMaskBorderSource(value: ICSSRule | String): Self = this.set("maskBorderSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorderSource: Self = this.set("maskBorderSource", js.undefined)
    @scala.inline
    def setMaskBorderWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("maskBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorderWidth: Self = this.set("maskBorderWidth", js.undefined)
    @scala.inline
    def setMaskClip(value: ICSSRule | String): Self = this.set("maskClip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClip: Self = this.set("maskClip", js.undefined)
    @scala.inline
    def setMaskOrigin(value: ICSSRule | String): Self = this.set("maskOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskOrigin: Self = this.set("maskOrigin", js.undefined)
    @scala.inline
    def setMaxFontSize(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("maxFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSize: Self = this.set("maxFontSize", js.undefined)
    @scala.inline
    def setMaxHeight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMixBlendMode(value: ICSSRule | IMixBlendModes): Self = this.set("mixBlendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixBlendMode: Self = this.set("mixBlendMode", js.undefined)
    @scala.inline
    def setObjectFit(value: ICSSRule | cover | contain | fill | none): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    @scala.inline
    def setOpacity(value: ICSSRule | Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrder(value: ICSSRule | Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrphans(value: ICSSRule | Double): Self = this.set("orphans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrphans: Self = this.set("orphans", js.undefined)
    @scala.inline
    def setOutline(value: ICSSRule | `0` | String): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setOutlineColor(value: ICSSRule | String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineOffset(value: ICSSRule | String): Self = this.set("outlineOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineOffset: Self = this.set("outlineOffset", js.undefined)
    @scala.inline
    def setOverflow(value: ICSSRule | auto | hidden | scroll | visible): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setOverflowStyle(value: ICSSRule | String): Self = this.set("overflowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowStyle: Self = this.set("overflowStyle", js.undefined)
    @scala.inline
    def setOverflowWrap(value: ICSSRule | normal | `break-word`): Self = this.set("overflowWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowWrap: Self = this.set("overflowWrap", js.undefined)
    @scala.inline
    def setOverflowX(value: ICSSRule | auto | hidden | scroll | visible): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    @scala.inline
    def setOverflowY(value: ICSSRule | auto | hidden | scroll | visible): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    @scala.inline
    def setPadding(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBlockEnd(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingBlockEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBlockEnd: Self = this.set("paddingBlockEnd", js.undefined)
    @scala.inline
    def setPaddingBlockStart(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingBlockStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBlockStart: Self = this.set("paddingBlockStart", js.undefined)
    @scala.inline
    def setPaddingBottom(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingInlineEnd(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingInlineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingInlineEnd: Self = this.set("paddingInlineEnd", js.undefined)
    @scala.inline
    def setPaddingInlineStart(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingInlineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingInlineStart: Self = this.set("paddingInlineStart", js.undefined)
    @scala.inline
    def setPaddingLeft(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTop(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPageBreakAfter(value: ICSSRule | String): Self = this.set("pageBreakAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBreakAfter: Self = this.set("pageBreakAfter", js.undefined)
    @scala.inline
    def setPageBreakBefore(value: ICSSRule | String): Self = this.set("pageBreakBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBreakBefore: Self = this.set("pageBreakBefore", js.undefined)
    @scala.inline
    def setPageBreakInside(value: ICSSRule | String): Self = this.set("pageBreakInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBreakInside: Self = this.set("pageBreakInside", js.undefined)
    @scala.inline
    def setPause(value: ICSSRule | String): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPauseAfter(value: ICSSRule | String): Self = this.set("pauseAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseAfter: Self = this.set("pauseAfter", js.undefined)
    @scala.inline
    def setPauseBefore(value: ICSSRule | String): Self = this.set("pauseBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseBefore: Self = this.set("pauseBefore", js.undefined)
    @scala.inline
    def setPerspective(value: ICSSRule | String): Self = this.set("perspective", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    @scala.inline
    def setPerspectiveOrigin(value: ICSSRule | String): Self = this.set("perspectiveOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerspectiveOrigin: Self = this.set("perspectiveOrigin", js.undefined)
    @scala.inline
    def setPointerEvents(value: ICSSRule | String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setPosition(value: ICSSRule | static | relative | absolute | fixed | sticky): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setQuotes(value: ICSSRule | String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    @scala.inline
    def setRegionFragment(value: ICSSRule | String): Self = this.set("regionFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionFragment: Self = this.set("regionFragment", js.undefined)
    @scala.inline
    def setResize(value: ICSSRule | none | both | horizontal | vertical | block | `inline`): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRestAfter(value: ICSSRule | String): Self = this.set("restAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestAfter: Self = this.set("restAfter", js.undefined)
    @scala.inline
    def setRestBefore(value: ICSSRule | String): Self = this.set("restBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestBefore: Self = this.set("restBefore", js.undefined)
    @scala.inline
    def setRight(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShapeImageThreshold(value: ICSSRule | String): Self = this.set("shapeImageThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeImageThreshold: Self = this.set("shapeImageThreshold", js.undefined)
    @scala.inline
    def setShapeInside(value: ICSSRule | String): Self = this.set("shapeInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeInside: Self = this.set("shapeInside", js.undefined)
    @scala.inline
    def setShapeMargin(value: ICSSRule | String): Self = this.set("shapeMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeMargin: Self = this.set("shapeMargin", js.undefined)
    @scala.inline
    def setShapeOutside(value: ICSSRule | String): Self = this.set("shapeOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeOutside: Self = this.set("shapeOutside", js.undefined)
    @scala.inline
    def setSpeak(value: ICSSRule | String): Self = this.set("speak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeak: Self = this.set("speak", js.undefined)
    @scala.inline
    def setSpeakAs(value: ICSSRule | String): Self = this.set("speakAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakAs: Self = this.set("speakAs", js.undefined)
    @scala.inline
    def setStroke(value: ICSSRule | String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: ICSSRule | butt | round | square): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: ICSSRule | Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTabSize(value: ICSSRule | String): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setTableLayout(value: ICSSRule | String): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableLayout: Self = this.set("tableLayout", js.undefined)
    @scala.inline
    def setTextAlign(value: ICSSRule | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextAlignLast(value: ICSSRule | String): Self = this.set("textAlignLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignLast: Self = this.set("textAlignLast", js.undefined)
    @scala.inline
    def setTextDecoration(value: ICSSRule | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextDecorationColor(value: ICSSRule | String): Self = this.set("textDecorationColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationColor: Self = this.set("textDecorationColor", js.undefined)
    @scala.inline
    def setTextDecorationLine(value: ICSSRule | String): Self = this.set("textDecorationLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationLine: Self = this.set("textDecorationLine", js.undefined)
    @scala.inline
    def setTextDecorationSkip(value: ICSSRule | String): Self = this.set("textDecorationSkip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationSkip: Self = this.set("textDecorationSkip", js.undefined)
    @scala.inline
    def setTextDecorationStyle(value: ICSSRule | String): Self = this.set("textDecorationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationStyle: Self = this.set("textDecorationStyle", js.undefined)
    @scala.inline
    def setTextEmphasis(value: ICSSRule | String): Self = this.set("textEmphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEmphasis: Self = this.set("textEmphasis", js.undefined)
    @scala.inline
    def setTextEmphasisColor(value: ICSSRule | String): Self = this.set("textEmphasisColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEmphasisColor: Self = this.set("textEmphasisColor", js.undefined)
    @scala.inline
    def setTextEmphasisStyle(value: ICSSRule | String): Self = this.set("textEmphasisStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEmphasisStyle: Self = this.set("textEmphasisStyle", js.undefined)
    @scala.inline
    def setTextHeight(value: ICSSRule | String): Self = this.set("textHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextHeight: Self = this.set("textHeight", js.undefined)
    @scala.inline
    def setTextIndent(value: ICSSRule | String): Self = this.set("textIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextIndent: Self = this.set("textIndent", js.undefined)
    @scala.inline
    def setTextOverflow(value: ICSSRule | String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setTextOverline(value: ICSSRule | String): Self = this.set("textOverline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverline: Self = this.set("textOverline", js.undefined)
    @scala.inline
    def setTextOverlineColor(value: ICSSRule | String): Self = this.set("textOverlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverlineColor: Self = this.set("textOverlineColor", js.undefined)
    @scala.inline
    def setTextOverlineMode(value: ICSSRule | String): Self = this.set("textOverlineMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverlineMode: Self = this.set("textOverlineMode", js.undefined)
    @scala.inline
    def setTextOverlineStyle(value: ICSSRule | String): Self = this.set("textOverlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverlineStyle: Self = this.set("textOverlineStyle", js.undefined)
    @scala.inline
    def setTextOverlineWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("textOverlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverlineWidth: Self = this.set("textOverlineWidth", js.undefined)
    @scala.inline
    def setTextRendering(value: ICSSRule | String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    @scala.inline
    def setTextShadow(value: ICSSRule | String): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
    @scala.inline
    def setTextSizeAdjust(value: none | auto | ICSSPercentageRule | ICSSRule): Self = this.set("textSizeAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSizeAdjust: Self = this.set("textSizeAdjust", js.undefined)
    @scala.inline
    def setTextTransform(value: ICSSRule | String): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
    @scala.inline
    def setTextUnderlinePosition(value: ICSSRule | String): Self = this.set("textUnderlinePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextUnderlinePosition: Self = this.set("textUnderlinePosition", js.undefined)
    @scala.inline
    def setTextUnderlineStyle(value: ICSSRule | String): Self = this.set("textUnderlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextUnderlineStyle: Self = this.set("textUnderlineStyle", js.undefined)
    @scala.inline
    def setTop(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTouchAction(value: ICSSRule | String): Self = this.set("touchAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchAction: Self = this.set("touchAction", js.undefined)
    @scala.inline
    def setTransform(value: ICSSRule | String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformOrigin(value: ICSSRule | String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    @scala.inline
    def setTransformOriginZ(value: ICSSRule | String): Self = this.set("transformOriginZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOriginZ: Self = this.set("transformOriginZ", js.undefined)
    @scala.inline
    def setTransformStyle(value: ICSSRule | String): Self = this.set("transformStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformStyle: Self = this.set("transformStyle", js.undefined)
    @scala.inline
    def setTransition(value: ICSSRule | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setTransitionDelay(value: ICSSRule | String): Self = this.set("transitionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDelay: Self = this.set("transitionDelay", js.undefined)
    @scala.inline
    def setTransitionDuration(value: ICSSRule | String): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setTransitionProperty(value: ICSSRule | String): Self = this.set("transitionProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionProperty: Self = this.set("transitionProperty", js.undefined)
    @scala.inline
    def setTransitionTimingFunction(value: ICSSRule | String): Self = this.set("transitionTimingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionTimingFunction: Self = this.set("transitionTimingFunction", js.undefined)
    @scala.inline
    def setUnicodeBidi(value: ICSSRule | String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    @scala.inline
    def setUserFocus(value: ICSSRule | String): Self = this.set("userFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFocus: Self = this.set("userFocus", js.undefined)
    @scala.inline
    def setUserInput(value: ICSSRule | String): Self = this.set("userInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInput: Self = this.set("userInput", js.undefined)
    @scala.inline
    def setUserSelect(value: ICSSRule | none | auto | text | all | contain): Self = this.set("userSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSelect: Self = this.set("userSelect", js.undefined)
    @scala.inline
    def setVerticalAlign(value: ICSSRule | String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVisibility(value: ICSSRule | String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setVoiceBalance(value: ICSSRule | String): Self = this.set("voiceBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceBalance: Self = this.set("voiceBalance", js.undefined)
    @scala.inline
    def setVoiceDuration(value: ICSSRule | String): Self = this.set("voiceDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceDuration: Self = this.set("voiceDuration", js.undefined)
    @scala.inline
    def setVoiceFamily(value: ICSSRule | String): Self = this.set("voiceFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceFamily: Self = this.set("voiceFamily", js.undefined)
    @scala.inline
    def setVoicePitch(value: ICSSRule | String): Self = this.set("voicePitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoicePitch: Self = this.set("voicePitch", js.undefined)
    @scala.inline
    def setVoiceRange(value: ICSSRule | String): Self = this.set("voiceRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceRange: Self = this.set("voiceRange", js.undefined)
    @scala.inline
    def setVoiceRate(value: ICSSRule | String): Self = this.set("voiceRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceRate: Self = this.set("voiceRate", js.undefined)
    @scala.inline
    def setVoiceStress(value: ICSSRule | String): Self = this.set("voiceStress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceStress: Self = this.set("voiceStress", js.undefined)
    @scala.inline
    def setVoiceVolume(value: ICSSRule | String): Self = this.set("voiceVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceVolume: Self = this.set("voiceVolume", js.undefined)
    @scala.inline
    def setWhiteSpace(value: ICSSRule | String): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteSpace: Self = this.set("whiteSpace", js.undefined)
    @scala.inline
    def setWidows(value: ICSSRule | Double): Self = this.set("widows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidows: Self = this.set("widows", js.undefined)
    @scala.inline
    def setWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWordBreak(value: ICSSRule | String): Self = this.set("wordBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordBreak: Self = this.set("wordBreak", js.undefined)
    @scala.inline
    def setWordSpacing(value: ICSSRule | String): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    @scala.inline
    def setWordWrap(value: ICSSRule | String): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
    @scala.inline
    def setWrapFlow(value: ICSSRule | String): Self = this.set("wrapFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapFlow: Self = this.set("wrapFlow", js.undefined)
    @scala.inline
    def setWrapMargin(value: ICSSRule | String): Self = this.set("wrapMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapMargin: Self = this.set("wrapMargin", js.undefined)
    @scala.inline
    def setWritingMode(value: ICSSRule | String): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    @scala.inline
    def setZIndex(value: ICSSRule | auto | Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZoom(value: ICSSRule | auto | Double | ICSSPercentageRule): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

