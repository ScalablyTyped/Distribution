package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.victoryStrings.bottom
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryBoxPlotProps
  extends VictoryCommonProps
     with VictoryDatableProps {
  
  /**
    * The boxWidth prop specifies how wide each box should be. If the whiskerWidth
    * prop is not set, this prop will also determine the width of the whisker crosshair.
    */
  var boxWidth: js.UndefOr[Double] = js.native
  
  /**
    * The domainPadding prop specifies a number of pixels of padding to add to the
    * beginning and end of a domain. This prop is useful for explicitly spacing ticks farther
    * from the origin to prevent crowding. This prop should be given as an object with
    * numbers specified for x and y.
    */
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.native
  
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.native
  
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
  var events: js.UndefOr[js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]] = js.native
  
  /**
    * The labelOrientation prop determines where labels are placed relative to their
    * corresponding data. If this prop is not set, it will be set to “top” for
    * horizontal charts, and “right” for vertical charts.
    */
  var labelOrientation: js.UndefOr[top | bottom | left | right] = js.native
  
  /**
    * When the boolean labels prop is set to true, the values for min, max, median,
    * q1, and q3 will be displayed for each box. For more granular label control, use
    * the individual minLabels, maxLabels, medianLabels, q1Labels, and q3Labels props.
    */
  var labels: js.UndefOr[Boolean] = js.native
  
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
  var max: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
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
  var maxComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The maxLabelComponent prop takes a component instance which will be used to render the
    * label corresponding to the maximum value for each box. The new element created from the
    * passed maxLabelComponent will be supplied with the following props: x, y, datum, index,
    * scale, verticalAnchor, textAnchor, angle, transform, style and events. Any of these
    * props may be overridden by passing in props to the supplied component, or modified or
    * ignored within the custom component itself. If maxLabelComponent is omitted, a new
    * VictoryLabel will be created with props described above.
    */
  var maxLabelComponent: js.UndefOr[ReactElement] = js.native
  
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
  var median: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var medianComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The medianLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the median value for each box. The new element created from the passed
    * medianLabelComponent will be supplied with the following props: x, y, datum, index, scale,
    * verticalAnchor, textAnchor, angle, transform, style and events. Any of these props may be overridden
    * by passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If medianLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var medianLabelComponent: js.UndefOr[ReactElement] = js.native
  
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
  var min: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var minComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The minLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the minimum value for each box. The new element created from the passed
    * minLabelComponent will be supplied with the following props: x, y, datum, index, scale, verticalAnchor,
    * textAnchor, angle, transform, style and events. Any of these props may be overridden by passing in
    * props to the supplied component, or modified or ignored within the custom component itself. If
    * minLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var minLabelComponent: js.UndefOr[ReactElement] = js.native
  
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
  var q1: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
  /**
    * The q1Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q1 value of the box plot. The new element created from the passed
    * q1Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q1Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q1Component: js.UndefOr[ReactElement] = js.native
  
  /**
    * The q1LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q1 value for each box. The new element created from the passed q1LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If
    * q1LabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var q1LabelComponent: js.UndefOr[ReactElement] = js.native
  
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
  var q3: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
  /**
    * The q3Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q3 value of the box plot. The new element created from the passed
    * q3Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q3Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q3Component: js.UndefOr[ReactElement] = js.native
  
  /**
    * The q3LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q3 value for each box. The new element created from the passed q3LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If q3LabelComponent
    * is omitted, a new VictoryLabel will be created with props described above.
    */
  var q3LabelComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The style prop defines the style of the component. The style prop
    * should be given as an object with styles defined for parent, max,
    * maxLabels, min, minLabels, median, medianLabels, q1, q1Labels, q3,
    * q3Labels. Any valid svg styles are supported, but width, height, a
    * nd padding should be specified via props as they determine relative
    * layout for components in VictoryChart. Functional styles may be
    * defined for style properties, and they will be evaluated with each datum.
    */
  var style: js.UndefOr[VictoryBoxPlotStyleInterface] = js.native
  
  /**
    * The whiskerWidth prop specifies how wide each whisker crosshair should be. If the
    * whiskerWidth prop is not set, the width of the whisker crosshair will match
    * the width of the box.
    */
  var whiskerWidth: js.UndefOr[Double] = js.native
}
object VictoryBoxPlotProps {
  
  @scala.inline
  def apply(): VictoryBoxPlotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBoxPlotProps]
  }
  
  @scala.inline
  implicit class VictoryBoxPlotPropsMutableBuilder[Self <: VictoryBoxPlotProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
    
    @scala.inline
    def setDomainPadding(value: DomainPaddingPropType): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[String, StringOrNumberOrCallback])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setLabelOrientation(value: top | bottom | left | right): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMax(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComponent(value: ReactElement): Self = StObject.set(x, "maxComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComponentUndefined: Self = StObject.set(x, "maxComponent", js.undefined)
    
    @scala.inline
    def setMaxFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxLabelComponent(value: ReactElement): Self = StObject.set(x, "maxLabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLabelComponentUndefined: Self = StObject.set(x, "maxLabelComponent", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxVarargs(value: String*): Self = StObject.set(x, "max", js.Array(value :_*))
    
    @scala.inline
    def setMedian(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianComponent(value: ReactElement): Self = StObject.set(x, "medianComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianComponentUndefined: Self = StObject.set(x, "medianComponent", js.undefined)
    
    @scala.inline
    def setMedianFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "median", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMedianLabelComponent(value: ReactElement): Self = StObject.set(x, "medianLabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianLabelComponentUndefined: Self = StObject.set(x, "medianLabelComponent", js.undefined)
    
    @scala.inline
    def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    @scala.inline
    def setMedianVarargs(value: String*): Self = StObject.set(x, "median", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinComponent(value: ReactElement): Self = StObject.set(x, "minComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinComponentUndefined: Self = StObject.set(x, "minComponent", js.undefined)
    
    @scala.inline
    def setMinFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinLabelComponent(value: ReactElement): Self = StObject.set(x, "minLabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLabelComponentUndefined: Self = StObject.set(x, "minLabelComponent", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinVarargs(value: String*): Self = StObject.set(x, "min", js.Array(value :_*))
    
    @scala.inline
    def setQ1(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1Component(value: ReactElement): Self = StObject.set(x, "q1Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1ComponentUndefined: Self = StObject.set(x, "q1Component", js.undefined)
    
    @scala.inline
    def setQ1Function1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "q1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQ1LabelComponent(value: ReactElement): Self = StObject.set(x, "q1LabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1LabelComponentUndefined: Self = StObject.set(x, "q1LabelComponent", js.undefined)
    
    @scala.inline
    def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    @scala.inline
    def setQ1Varargs(value: String*): Self = StObject.set(x, "q1", js.Array(value :_*))
    
    @scala.inline
    def setQ3(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3Component(value: ReactElement): Self = StObject.set(x, "q3Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3ComponentUndefined: Self = StObject.set(x, "q3Component", js.undefined)
    
    @scala.inline
    def setQ3Function1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "q3", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQ3LabelComponent(value: ReactElement): Self = StObject.set(x, "q3LabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3LabelComponentUndefined: Self = StObject.set(x, "q3LabelComponent", js.undefined)
    
    @scala.inline
    def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
    
    @scala.inline
    def setQ3Varargs(value: String*): Self = StObject.set(x, "q3", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: VictoryBoxPlotStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWhiskerWidth(value: Double): Self = StObject.set(x, "whiskerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiskerWidthUndefined: Self = StObject.set(x, "whiskerWidth", js.undefined)
  }
}
