package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.Bottom
import typings.victory.anon.XBoolean
import typings.victory.anon.Y
import typings.victory.anon.`1`
import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.end
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.middle
import typings.victory.victoryStrings.parent
import typings.victory.victoryStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryBarProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The alignment prop specifies how bars should be aligned relative to their data points.
    * This prop may be given as “start”, “middle” or “end”. When this prop is not specified,
    * bars will have “middle” alignment relative to their data points.
    */
  var alignment: js.UndefOr[start | middle | end] = js.undefined
  /**
    * The barRatio prop specifies an approximate ratio between bar widths and spaces between bars.
    * When width is not specified via the barWidth prop or in bar styles, the barRatio prop will
    * be used to calculate a default width for each bar given the total number of bars in the data series
    * and the overall width of the chart.
    */
  var barRatio: js.UndefOr[Double] = js.undefined
  /**
    * The barWidth prop is used to specify the width of each bar. This prop may be given as
    * a number of pixels or as a function that returns a number. When this prop is given as
    * a function, it will be evaluated with the arguments datum, and active. When this value
    * is not given, a default value will be calculated based on the overall dimensions of
    * the chart, and the number of bars.
    */
  var barWidth: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The cornerRadius prop specifies a radius to apply to each bar.
    * If this prop is given as a single number, the radius will only be applied to the top of each bar.
    * When this prop is given as a function, it will be evaluated with the arguments datum, and active.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback | Bottom] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryBar events.
    * The eventKey may optionally be used to select a single element by index rather than an entire
    * set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @example
    * events={[
    *   {
    *     target: "data",
    *     eventKey: "thisOne",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              eventKey: "theOtherOne",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              eventKey: "theOtherOne",
    *              target: "labels",
    *              mutation: () => {
    *                return {text: "hey"};
    *              }
    *            }
    *          ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]] = js.undefined
  /**
    * The style prop specifies styles for your VictoryBar. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red", width: 8}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}

object VictoryBarProps {
  @scala.inline
  def apply(
    alignment: start | middle | end = null,
    animate: Boolean | AnimatePropTypeInterface = null,
    barRatio: js.UndefOr[Double] = js.undefined,
    barWidth: NumberOrCallback = null,
    categories: CategoryPropType = null,
    containerComponent: ReactElement = null,
    cornerRadius: NumberOrCallback | Bottom = null,
    data: js.Array[_] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, Double | String]] = null,
    groupComponent: ReactElement = null,
    height: js.UndefOr[Double] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    labelComponent: ReactElement = null,
    labels: js.Array[String] | (js.Function1[/* data */ js.Any, String]) = null,
    maxDomain: Double | Y = null,
    minDomain: Double | Y = null,
    name: String = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | `1` = null,
    singleQuadrantDomainPadding: Boolean | XBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    width: js.UndefOr[Double] = js.undefined,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null
  ): VictoryBarProps = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(barRatio)) __obj.updateDynamic("barRatio")(barRatio.get.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryBarProps]
  }
}

