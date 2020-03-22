package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.Anon1
import typings.victory.AnonXBoolean
import typings.victory.AnonY
import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryScatterProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The bubbleProperty prop indicates which property of the data object should be used
    * to scale data points in a bubble chart
    */
  var bubbleProperty: js.UndefOr[String] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryScatter
    * events. The eventKey may optionally be used to select a single element by index rather than
    * an entire set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
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
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.undefined
  /**
    * The maxBubbleSize prop sets an upper limit for scaling data points in a bubble chart
    */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    */
  var samples: js.UndefOr[Double] = js.undefined
  /**
    * The size prop determines how to scale each data point
    */
  var size: js.UndefOr[Double | (js.Function1[/* data */ js.Any, Double])] = js.undefined
  /**
    * The style prop specifies styles for your VictoryScatter. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
  /**
    * The symbol prop determines which symbol should be drawn to represent data points.
    */
  var symbol: js.UndefOr[ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])] = js.undefined
}

object VictoryScatterProps {
  @scala.inline
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    bubbleProperty: String = null,
    categories: CategoryPropType = null,
    containerComponent: ReactElement = null,
    data: js.Array[_] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]] = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    labelComponent: ReactElement = null,
    labels: js.Array[String] | (js.Function1[/* data */ js.Any, String]) = null,
    maxBubbleSize: Int | Double = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    padding: PaddingProps = null,
    samples: Int | Double = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    size: Double | (js.Function1[/* data */ js.Any, Double]) = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbol: ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType]) = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null
  ): VictoryScatterProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (bubbleProperty != null) __obj.updateDynamic("bubbleProperty")(bubbleProperty.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxBubbleSize != null) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryScatterProps]
  }
}

