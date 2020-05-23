package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryTooltipProps extends js.Object {
  /**
    * When true, tooltip events will set the active prop on both data and label elements.
    * @default false
    */
  var activateData: js.UndefOr[Boolean] = js.undefined
  /**
    * The active prop specifies whether the tooltip component should be displayed.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * The angle prop specifies the angle to rotate the tooltip around its origin point.
    */
  var angle: js.UndefOr[String | Double] = js.undefined
  /**
    * The cornerRadius prop determines corner radius of the flyout container. This prop may be given as a positive number or a function of datum.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * Victory components can pass a data prop to their label component. This can be useful in custom components that need to make use of the entire dataset.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine text.
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  /**
    * The dx prop defines a horizontal shift from the x coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The dy prop defines a vertical shift from the y coordinate.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The events prop attaches arbitrary event handlers to the label component. This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory’s event system, event handlers will be called with the event, the props of the component is attached to, and an eventKey.
    * Examples: events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[js.Object] = js.undefined
  /**
    * The flyoutComponent prop takes a component instance which will be used to create the flyout path for each tooltip.
    * The new element created from the passed flyoutComponent will be supplied with the following properties: x, y, dx, dy,
    * index, datum, cornerRadius, pointerLength, pointerWidth, width, height, orientation, style, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If flyoutComponent is omitted, a default Flyout component will be created with props described above.
    * Examples: flyoutComponent={<Flyout x={50} y={50}/>}, flyoutComponent={<MyCustomFlyout/>}
    * @default <Flyout/>
    */
  var flyoutComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The flyoutHeight prop defines the height of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop
    * is not set, flyoutHeight will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutHeight: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The style prop applies SVG style properties to the rendered flyout container. These props will be passed to the flyoutComponent.
    */
  var flyoutStyle: js.UndefOr[VictoryStyleObject] = js.undefined
  /**
    * The flyoutWidth prop defines the width of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop is
    * not set, flyoutWidth will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutWidth: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The groupComponent prop takes a component instance which will be used to create group elements for use within container elements. This prop defaults to a <g> tag.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * This prop refers to the height of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel, and should not be set
    * manually. In versions before ^33.0.0 this prop referred to the height of the tooltip flyout. Please use flyoutHeight instead
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal prop determines whether to plot the flyouts to the left / right of the (x, y) coordinate rather than top / bottom.
    * This is useful when an orientation prop is not provided, and data will determine the default orientation. i.e.
    * negative values result in a left orientation and positive values will result in a right orientation by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * The index prop represents the index of the datum in the data array.
    */
  var index: js.UndefOr[Double | String] = js.undefined
  /**
    * The labelComponent prop takes a component instance which will be used to render each tooltip label.
    * The new element created from the passed labelComponent will be supplied with the following properties: x, y, index, datum, verticalAnchor, textAnchor, style, text, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If labelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * Examples: labelComponent={<VictoryLabel dy={20}/>}, labelComponent={<MyCustomLabel/>}
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The orientation prop determines which side of the (x, y) coordinate the tooltip should be rendered on.
    * This prop can be given as “top”, “bottom”, “left”, “right”, or as a function of datum that returns one of these values.
    * If this prop is not provided it will be determined from the sign of the datum, and the value of the horizontal prop.
    */
  var orientation: js.UndefOr[OrientationTypes | VictoryNumberCallback] = js.undefined
  /**
    * The pointerLength prop determines the length of the triangular pointer extending from the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerLength: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The pointerWidth prop determines the width of the base of the triangular pointer extending from
    * the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerWidth: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * When renderInPortal is true, rendered tooltips will be wrapped in VictoryPortal and rendered within the Portal element
    * within VictoryContainer. Note: This prop should not be set to true when using a custom container element.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.undefined
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * The text prop defines the text VictoryTooltip will render. The text prop may be given as a string, number, or function of datum.
    * When VictoryLabel is used as the labelComponent, strings may include newline characters, which VictoryLabel will split in to separate <tspan/> elements.
    */
  var text: js.UndefOr[StringOrNumberOrCallback | (js.Array[Double | String])] = js.undefined
  /**
    * VictoryAxis uses the standard theme prop. Read about it here
    * @default VictoryTheme.grayscale
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.undefined
  /**
    * This prop refers to the width of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel,
    * and should not be set manually. In versions before ^33.0.0 this prop referred to the width of the tooltip flyout. Please use flyoutWidth instead
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object VictoryTooltipProps {
  @scala.inline
  def apply(
    activateData: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    angle: String | Double = null,
    cornerRadius: NumberOrCallback = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: StringOrNumberOrCallback = null,
    dy: StringOrNumberOrCallback = null,
    events: js.Object = null,
    flyoutComponent: ReactElement = null,
    flyoutHeight: NumberOrCallback = null,
    flyoutStyle: VictoryStyleObject = null,
    flyoutWidth: NumberOrCallback = null,
    groupComponent: ReactElement = null,
    height: js.UndefOr[Double] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    index: Double | String = null,
    labelComponent: ReactElement = null,
    orientation: OrientationTypes | VictoryNumberCallback = null,
    pointerLength: NumberOrCallback = null,
    pointerWidth: NumberOrCallback = null,
    renderInPortal: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    text: StringOrNumberOrCallback | (js.Array[Double | String]) = null,
    theme: VictoryThemeDefinition = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): VictoryTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activateData)) __obj.updateDynamic("activateData")(activateData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (flyoutComponent != null) __obj.updateDynamic("flyoutComponent")(flyoutComponent.asInstanceOf[js.Any])
    if (flyoutHeight != null) __obj.updateDynamic("flyoutHeight")(flyoutHeight.asInstanceOf[js.Any])
    if (flyoutStyle != null) __obj.updateDynamic("flyoutStyle")(flyoutStyle.asInstanceOf[js.Any])
    if (flyoutWidth != null) __obj.updateDynamic("flyoutWidth")(flyoutWidth.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pointerLength != null) __obj.updateDynamic("pointerLength")(pointerLength.asInstanceOf[js.Any])
    if (pointerWidth != null) __obj.updateDynamic("pointerWidth")(pointerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInPortal)) __obj.updateDynamic("renderInPortal")(renderInPortal.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryTooltipProps]
  }
}

