package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryAxisProps extends VictoryCommonProps {
  /**
    * The axisComponent prop takes in an entire component which will be used
    * to create the axis line. The new element created from the passed axisComponent
    * will be supplied with the following properties: x1, y1, x2, y2, style and events.
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If an axisComponent
    * is not supplied, VictoryAxis will render its default AxisLine component.
    * @default <AxisLine/>
    */
  var axisComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * The axisLabelComponent prop takes in an entire component which will be used
    * to create the axis label. The new element created from the passed axisLabelComponent
    * will be supplied with the following properties: x, y, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within
    * the custom component itself. If an axisLabelComponent is not supplied, a new
    * VictoryLabel will be created with props described above
    * @default <VictoryLabel/>
    */
  var axisLabelComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * This prop specifies whether a given axis is intended to cross another axis.
    */
  var crossAxis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The dependentAxis prop specifies whether the axis corresponds to the
    * dependent variable (usually y). This prop is useful when composing axis
    * with other components to form a chart.
    */
  var dependentAxis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The domain prop describes the range of values your axis will include. This prop should be
    * given as a array of the minimum and maximum expected values for your axis.
    * If this value is not given it will be calculated based on the scale or tickValues.
    * @examples [-1, 1]
    */
  var domain: js.UndefOr[DomainPropType] = js.undefined
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "axis", "axisLabel", "ticks", "tickLabels", and "grid" are
    * all valid targets for VictoryAxis events. The eventKey may optionally be used to select a
    * single element by index rather than an entire set. The eventHandlers object
    * should be given as an object whose keys are standard event names (i.e. onClick)
    * and whose values are event callbacks. The return value of an event handler
    * be used to modify other elemnts. The return value should be given as an object or
    * an array of objects with optional target and eventKey keys, and a mutation
    * key whose value is a function. The target and eventKey keys will default to those
    * corresponding to the element the event handler was attached to. The mutation
    * function will be called with the calculated props for the individual selected
    * element (i.e. a single tick), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "grid",
    *     eventKey: 2,
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *           {
    *             mutation: (props) => {
    *               return {style: merge({}, props.style, {stroke: "orange"})};
    *             }
    *           }, {
    *             target: "tickLabels",
    *             mutation: () => {
    *               return {text: "hey"};
    *             }
    *           }
    *         ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[
    js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.axis | victoryLib.victoryLibStrings.axisLabel | victoryLib.victoryLibStrings.grid | victoryLib.victoryLibStrings.ticks | victoryLib.victoryLibStrings.tickLabels | victoryLib.victoryLibStrings.parent, 
        scala.Double | java.lang.String
      ]
    ]
  ] = js.undefined
  /**
    * When true, this prop reduces the number of tick labels to fit the length of the axis.
    * Labels are removed at approximately even intervals from the original array of labels.
    * This feature only works well for labels that are approximately evenly spaced.
    * @default false
    */
  var fixLabelOverlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The gridComponent prop takes in an entire component which will be used
    * to create grid lines. The new element created from the passed gridComponent
    * will be supplied with the following properties: x1, y1, x2, y2, tick, style and events.
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If a gridComponent
    * is not supplied, VictoryAxis will render its default GridLine component.
    * @default <GridLine/>
    */
  var gridComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * If true, this value will flip the domain of a given axis.
    */
  var invertAxis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The label prop defines the label that will appear along the axis. This
    * prop should be given as a value or an entire, HTML-complete label
    * component. If a label component is given, it will be cloned. The new
    * element's properties x, y, textAnchor, verticalAnchor, and transform
    * will have defaults provided by the axis; styles filled out with
    * defaults provided by the axis, and overrides from the label component.
    * If a value is given, a new VictoryLabel will be created with props and
    * styles from the axis.
    */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
    * This value describes how far from the "edge" of its permitted area each axis
    * will be set back in the x-direction.  If this prop is not given,
    * the offset is calculated based on font size, axis orientation, and label padding.
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * This value describes how far from the "edge" of its permitted area each axis
    * will be set back in the y-direction.  If this prop is not given,
    * the offset is calculated based on font size, axis orientation, and label padding.
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation prop specifies the position and orientation of your axis.
    */
  var orientation: js.UndefOr[
    victoryLib.victoryLibStrings.top | victoryLib.victoryLibStrings.bottom | victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right
  ] = js.undefined
  /**
    * The style prop defines the style of the component. The style prop should be given as an object
    * with styles defined for parent, axis, axisLabel, grid, ticks, and tickLabels. Any valid svg
    * styles are supported, but width, height, and padding should be specified via props as they
    * determine relative layout for components in VictoryChart. Functional styles may be defined for
    * grid, tick, and tickLabel style properties, and they will be evaluated with each tick.
    *
    * note: When a component is rendered as a child of another Victory component, or within a custom
    * <svg> element with standalone={false} parent styles will be applied to the enclosing <g> tag.
    * Many styles that can be applied to a parent <svg> will not be expressed when applied to a <g>.
    *
    * note: custom angle and verticalAnchor properties may be included in labels styles.
    */
  var style: js.UndefOr[victoryLib.Anon_AxisAxisLabel] = js.undefined
  /**
    * The tickComponent prop takes in an entire component which will be used
    * to create tick lines. The new element created from the passed tickComponent
    * will be supplied with the following properties: x1, y1, x2, y2, tick, style and events.
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If a tickComponent
    * is not supplied, VictoryAxis will render its default Tick component.
    * @default <Tick/>
    */
  var tickComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * The tickCount prop specifies approximately how many ticks should be drawn on the axis if
    * tickValues are not explicitly provided. This value is calculated by d3 scale and
    * prioritizes returning "nice" values and evenly spaced ticks over an exact number of ticks.
    * If you need an exact number of ticks, please specify them via the tickValues prop.
    * This prop must have a value greater than zero.
    * @default 5
    */
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The tickFormat prop specifies how tick values should be expressed visually.
    * tickFormat can be given as a function to be applied to every tickValue, or as
    * an array of display values for each tickValue.
    * @example d3.time.format("%Y"), (x) => x.toPrecision(2), ["first", "second", "third"]
    */
  var tickFormat: js.UndefOr[js.Array[_] | victoryLib.Fn_Index] = js.undefined
  /**
    * The tickLabelComponent prop takes in an entire component which will be used
    * to create the tick labels. The new element created from the passed tickLabelComponent
    * will be supplied with the following properties: x, y, verticalAnchor, textAnchor,
    * angle, tick, style and events. Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within
    * the custom component itself. If an tickLabelComponent is not supplied, a new
    * VictoryLabel will be created with props described above
    * @default <VictoryLabel/>
    */
  var tickLabelComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * The tickValues prop explicitly specifies which tick values to draw on the axis.
    * @example ["apples", "bananas", "oranges"], [2, 4, 6, 8]
    */
  var tickValues: js.UndefOr[js.Array[_]] = js.undefined
}

object VictoryAxisProps {
  @scala.inline
  def apply(
    animate: AnimatePropTypeInterface = null,
    axisComponent: reactLib.reactMod.ReactElement[_] = null,
    axisLabelComponent: reactLib.reactMod.ReactElement[_] = null,
    containerComponent: reactLib.reactMod.ReactElement[_] = null,
    crossAxis: js.UndefOr[scala.Boolean] = js.undefined,
    dependentAxis: js.UndefOr[scala.Boolean] = js.undefined,
    domain: DomainPropType = null,
    events: js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.axis | victoryLib.victoryLibStrings.axisLabel | victoryLib.victoryLibStrings.grid | victoryLib.victoryLibStrings.ticks | victoryLib.victoryLibStrings.tickLabels | victoryLib.victoryLibStrings.parent, 
        scala.Double | java.lang.String
      ]
    ] = null,
    fixLabelOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    gridComponent: reactLib.reactMod.ReactElement[_] = null,
    groupComponent: reactLib.reactMod.ReactElement[_] = null,
    height: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    invertAxis: js.UndefOr[scala.Boolean] = js.undefined,
    label: js.Any = null,
    name: java.lang.String = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    orientation: victoryLib.victoryLibStrings.top | victoryLib.victoryLibStrings.bottom | victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | victoryLib.Anon_XYD3Scale = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    style: victoryLib.Anon_AxisAxisLabel = null,
    theme: VictoryThemeDefinition = null,
    tickComponent: reactLib.reactMod.ReactElement[_] = null,
    tickCount: scala.Int | scala.Double = null,
    tickFormat: js.Array[_] | victoryLib.Fn_Index = null,
    tickLabelComponent: reactLib.reactMod.ReactElement[_] = null,
    tickValues: js.Array[_] = null,
    width: scala.Int | scala.Double = null
  ): VictoryAxisProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (axisComponent != null) __obj.updateDynamic("axisComponent")(axisComponent)
    if (axisLabelComponent != null) __obj.updateDynamic("axisLabelComponent")(axisLabelComponent)
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (!js.isUndefined(crossAxis)) __obj.updateDynamic("crossAxis")(crossAxis)
    if (!js.isUndefined(dependentAxis)) __obj.updateDynamic("dependentAxis")(dependentAxis)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(fixLabelOverlap)) __obj.updateDynamic("fixLabelOverlap")(fixLabelOverlap)
    if (gridComponent != null) __obj.updateDynamic("gridComponent")(gridComponent)
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(invertAxis)) __obj.updateDynamic("invertAxis")(invertAxis)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tickComponent != null) __obj.updateDynamic("tickComponent")(tickComponent)
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(tickFormat.asInstanceOf[js.Any])
    if (tickLabelComponent != null) __obj.updateDynamic("tickLabelComponent")(tickLabelComponent)
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryAxisProps]
  }
}

