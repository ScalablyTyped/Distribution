package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import typings.victory.Anon_XY
import typings.victory.Anon_XYD3ScaleScalePropType
import typings.victory.victoryStrings.bottom
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryBoxPlotProps
  extends VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The boxWidth prop specifies how wide each box should be. If the whiskerWidth
    * prop is not set, this prop will also determine the width of the whisker crosshair.
    */
  var boxWidth: js.UndefOr[Double] = js.undefined
  /**
    * The domainPadding prop specifies a number of pixels of padding to add to the
    * beginning and end of a domain. This prop is useful for explicitly spacing ticks farther
    * from the origin to prevent crowding. This prop should be given as an object with
    * numbers specified for x and y.
    */
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a childName, target, eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, (i.e. "data" and "labels"). The childName will refer to an
    * individual child of VictoryChart, either by its name prop, or by index. The eventKey
    * may optionally be used to select a single element by index or eventKey rather than
    * an entire set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey and childName keys,
    * and a mutation key whose value is a function. The target and eventKey and childName keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "data",
    *     childName: "firstBar",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              childName: "secondBar",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              childName: "secondBar",
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
  var events: js.UndefOr[js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]] = js.undefined
  /**
    * The labelOrientation prop determines where labels are placed relative to their
    * corresponding data. If this prop is not set, it will be set to “top” for
    * horizontal charts, and “right” for vertical charts.
    */
  var labelOrientation: js.UndefOr[top | bottom | left | right] = js.undefined
  /**
    * When the boolean labels prop is set to true, the values for min, max, median,
    * q1, and q3 will be displayed for each box. For more granular label control, use
    * the individual minLabels, maxLabels, medianLabels, q1Labels, and q3Labels props.
    */
  var labels: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the max data accessor prop to define the max value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the max value
    * @example // max="max_value"
    *
    * function: use a function to translate each element in a data array into a max value
    * @example // max={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a max value
    * @example // max="bonds.max", max={["bonds", "max"]}
    */
  var max: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * The maxComponent prop takes a component instance which will be responsible for rendering
    * an element to represent the maximum value of the box plot. The new element created from
    * the passed maxComponent will be provided with the following props calculated by
    * VictoryBoxPlot: datum, index, scale, style, events, majorWhisker and minorWhisker. The
    * majorWhisker and minorWhisker props are given as objects with values for x1, y1, x2 and
    * y2 that describes the lines that make up the major and minor whisker. Any of these
    * props may be overridden by passing in props to the supplied component, or modified or
    * ignored within the custom component itself. If a maxComponent is not provided,
    * VictoryBoxPlot will use its default Whisker component.
    */
  var maxComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The maxLabelComponent prop takes a component instance which will be used to render the
    * label corresponding to the maximum value for each box. The new element created from the
    * passed maxLabelComponent will be supplied with the following props: x, y, datum, index,
    * scale, verticalAnchor, textAnchor, angle, transform, style and events. Any of these
    * props may be overridden by passing in props to the supplied component, or modified or
    * ignored within the custom component itself. If maxLabelComponent is omitted, a new
    * VictoryLabel will be created with props described above.
    */
  var maxLabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Use the median data accessor prop to define the median value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the median value
    * @example // median="median_value"
    *
    * function: use a function to translate each element in a data array into a median value
    * @example // median={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a median value
    * @example // median="bonds.median", median={["bonds", "median"]}
    */
  var median: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var medianComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The medianLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the median value for each box. The new element created from the passed
    * medianLabelComponent will be supplied with the following props: x, y, datum, index, scale,
    * verticalAnchor, textAnchor, angle, transform, style and events. Any of these props may be overridden
    * by passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If medianLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var medianLabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Use the min data accessor prop to define the min value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the min value
    * @example // min="min_value"
    *
    * function: use a function to translate each element in a data array into a min value
    * @example // min={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a min value
    * @example // min="bonds.min", min={["bonds", "min"]}
    */
  var min: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var minComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The minLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the minimum value for each box. The new element created from the passed
    * minLabelComponent will be supplied with the following props: x, y, datum, index, scale, verticalAnchor,
    * textAnchor, angle, transform, style and events. Any of these props may be overridden by passing in
    * props to the supplied component, or modified or ignored within the custom component itself. If
    * minLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var minLabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Use the q1 data accessor prop to define the q1 value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the q1 value
    * @example // q1="q1_value"
    *
    * function: use a function to translate each element in a data array into a q1 value
    * @example // q1={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a q1 value
    * @example // q1="bonds.q1", q1={["bonds", "q1"]}
    */
  var q1: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * The q1Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q1 value of the box plot. The new element created from the passed
    * q1Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q1Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q1Component: js.UndefOr[ReactElement] = js.undefined
  /**
    * The q1LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q1 value for each box. The new element created from the passed q1LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If
    * q1LabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var q1LabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Use the q3 data accessor prop to define the q3 value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the q3 value
    * @example // q3="q3_value"
    *
    * function: use a function to translate each element in a data array into a q3 value
    * @example // q3={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a q3 value
    * @example // q3="bonds.q3", q3={["bonds", "q3"]}
    */
  var q3: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * The q3Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q3 value of the box plot. The new element created from the passed
    * q3Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q3Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q3Component: js.UndefOr[ReactElement] = js.undefined
  /**
    * The q3LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q3 value for each box. The new element created from the passed q3LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If q3LabelComponent
    * is omitted, a new VictoryLabel will be created with props described above.
    */
  var q3LabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The style prop defines the style of the component. The style prop
    * should be given as an object with styles defined for parent, max,
    * maxLabels, min, minLabels, median, medianLabels, q1, q1Labels, q3,
    * q3Labels. Any valid svg styles are supported, but width, height, a
    * nd padding should be specified via props as they determine relative
    * layout for components in VictoryChart. Functional styles may be
    * defined for style properties, and they will be evaluated with each datum.
    */
  var style: js.UndefOr[VictoryBoxPlotStyleInterface] = js.undefined
  /**
    * The whiskerWidth prop specifies how wide each whisker crosshair should be. If the
    * whiskerWidth prop is not set, the width of the whisker crosshair will match
    * the width of the box.
    */
  var whiskerWidth: js.UndefOr[Double] = js.undefined
}

object VictoryBoxPlotProps {
  @scala.inline
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    boxWidth: Int | Double = null,
    categories: CategoryPropType = null,
    containerComponent: ReactElement = null,
    data: js.Array[_] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    domainPadding: DomainPaddingPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]] = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    labelOrientation: top | bottom | left | right = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    max: StringOrNumberOrCallback | js.Array[String] = null,
    maxComponent: ReactElement = null,
    maxDomain: Double | Anon_XY = null,
    maxLabelComponent: ReactElement = null,
    median: StringOrNumberOrCallback | js.Array[String] = null,
    medianComponent: ReactElement = null,
    medianLabelComponent: ReactElement = null,
    min: StringOrNumberOrCallback | js.Array[String] = null,
    minComponent: ReactElement = null,
    minDomain: Double | Anon_XY = null,
    minLabelComponent: ReactElement = null,
    name: String = null,
    padding: PaddingProps = null,
    q1: StringOrNumberOrCallback | js.Array[String] = null,
    q1Component: ReactElement = null,
    q1LabelComponent: ReactElement = null,
    q3: StringOrNumberOrCallback | js.Array[String] = null,
    q3Component: ReactElement = null,
    q3LabelComponent: ReactElement = null,
    scale: ScalePropType | D3Scale | Anon_XYD3ScaleScalePropType = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryBoxPlotStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    whiskerWidth: Int | Double = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null
  ): VictoryBoxPlotProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainPadding != null) __obj.updateDynamic("domainPadding")(domainPadding.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxComponent != null) __obj.updateDynamic("maxComponent")(maxComponent.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (maxLabelComponent != null) __obj.updateDynamic("maxLabelComponent")(maxLabelComponent.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (medianComponent != null) __obj.updateDynamic("medianComponent")(medianComponent.asInstanceOf[js.Any])
    if (medianLabelComponent != null) __obj.updateDynamic("medianLabelComponent")(medianLabelComponent.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minComponent != null) __obj.updateDynamic("minComponent")(minComponent.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (minLabelComponent != null) __obj.updateDynamic("minLabelComponent")(minLabelComponent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q1Component != null) __obj.updateDynamic("q1Component")(q1Component.asInstanceOf[js.Any])
    if (q1LabelComponent != null) __obj.updateDynamic("q1LabelComponent")(q1LabelComponent.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (q3Component != null) __obj.updateDynamic("q3Component")(q3Component.asInstanceOf[js.Any])
    if (q3LabelComponent != null) __obj.updateDynamic("q3LabelComponent")(q3LabelComponent.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (whiskerWidth != null) __obj.updateDynamic("whiskerWidth")(whiskerWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryBoxPlotProps]
  }
}

