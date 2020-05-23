package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.victory.anon.X
import typings.victory.victoryStrings.parallel
import typings.victory.victoryStrings.perpendicular
import typings.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryLabelProps extends js.Object {
  /**
    * Specifies the angle to rotate the text by.
    */
  var angle: js.UndefOr[String | Double] = js.undefined
  /**
    * The capHeight prop defines a text metric for the font being used: the expected height of capital letters.
    * This is necessary because of SVG, which (a) positions the *bottom* of the text at `y`, and (b) has no notion of line height.
    * The value should ideally use the same units as `lineHeight` and `dy`, preferably ems. If given a unitless number, it is assumed to be ems.
    * @default "0.71em"
    */
  var capHeight: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The className prop specifies a class name that will be applied to the rendered text element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Labels that apply to an entire data series will recieve the entire series as `data` instead of an individual datum prop.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine child text
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  /**
    * The dx prop defines a horizontal shift from the `x` coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The dy prop defines a vertical shift from the `y` coordinate.
    * Since this component already accounts for `capHeight`, `lineHeight`, and `verticalAnchor`, this will usually not be necessary.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The events prop attaches arbitrary event handlers to the label component.
    * Event handlers are currently only called with their corresponding events.
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.undefined
  /**
    * The labelPlacement prop is used to specify the placement of labels relative to the data point they represent.
    * This prop may be given as “vertical”, “parallel” or “perpendicular”. This props is particularly useful in polar
    * charts, where it may be desireable to position a label either parallel or perpendicular to its corresponding angle.
    * When this prop is not set, perpendicular label placement will be used for polar charts, and vertical label
    * placement will be used for cartesian charts.
    */
  var labelPlacement: js.UndefOr[parallel | perpendicular | vertical] = js.undefined
  /**
    * The lineHeight prop defines how much space a single line of text should take up.
    * Note that SVG has no notion of line-height, so the positioning may differ slightly from what you would expect with CSS,
    * but the result is similar: a roughly equal amount of extra space is distributed above and below the line of text.
    * The value should ideally use the same units as `capHeight` and `dy`, preferably ems.
    * If given a unitless number, it is assumed to be ems.
    * @default 1
    */
  var lineHeight: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * Victory components will pass an origin prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[X] = js.undefined
  /**
    * Victory components can pass a boolean polar prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  /**
    * The renderInPortal prop specifies whether VictoryLabel should render text in place or within a VictoryPortal.
    * Setting renderInPortal to true is equivalent to wrapping VictoryLabel in a VictoryPortal. This prop is false by default.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.undefined
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
  /**
    * The text prop defines the text VictoryLabel will render. The text prop may be given as a string, number, a function of datum,
    * or an array of any of these. Strings may include newline characters, which VictoryLabel will split into separate
    * <tspan/> elements. When text is given as an array, separate <tspan/> elements will be created for each element in the array.
    */
  var text: js.UndefOr[js.Array[String] | StringOrNumberOrCallback] = js.undefined
  /**
    * The textAnchor prop defines how the text is horizontally positioned relative to the given `x` and `y` coordinates.
    */
  var textAnchor: js.UndefOr[TextAnchorType | js.Function0[TextAnchorType]] = js.undefined
  /**
    * The transform prop applies a transform to the rendered `<text>` element.
    * In addition to being a string, it can be an object containing transform definitions for easier authoring.
    */
  var transform: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.undefined
  /**
    * The verticalAnchor prop defines how the text is vertically positioned relative to the given `x` and `y` coordinates.
    */
  var verticalAnchor: js.UndefOr[VerticalAnchorType | js.Function0[VerticalAnchorType]] = js.undefined
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object VictoryLabelProps {
  @scala.inline
  def apply(
    angle: String | Double = null,
    capHeight: StringOrNumberOrCallback = null,
    children: StringOrNumberOrCallback = null,
    className: String = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: StringOrNumberOrCallback = null,
    dy: StringOrNumberOrCallback = null,
    events: DOMAttributes[_] = null,
    labelPlacement: parallel | perpendicular | vertical = null,
    lineHeight: StringOrNumberOrCallback = null,
    origin: X = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    renderInPortal: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties | js.Array[CSSProperties] = null,
    text: js.Array[String] | StringOrNumberOrCallback = null,
    textAnchor: TextAnchorType | js.Function0[TextAnchorType] = null,
    transform: String | js.Object | (js.Function0[String | js.Object]) = null,
    verticalAnchor: VerticalAnchorType | js.Function0[VerticalAnchorType] = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): VictoryLabelProps = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInPortal)) __obj.updateDynamic("renderInPortal")(renderInPortal.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLabelProps]
  }
}

