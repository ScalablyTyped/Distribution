package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryTooltipProps extends js.Object {
  /**
    * When true, tooltip events will set the active prop on both data and label elements.
    * @default false
    */
  var activateData: js.UndefOr[Boolean] = js.native
  /**
    * The active prop specifies whether the tooltip component should be displayed.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The angle prop specifies the angle to rotate the tooltip around its origin point.
    */
  var angle: js.UndefOr[String | Double] = js.native
  /**
    * The cornerRadius prop determines corner radius of the flyout container. This prop may be given as a positive number or a function of datum.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback] = js.native
  /**
    * Victory components can pass a data prop to their label component. This can be useful in custom components that need to make use of the entire dataset.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine text.
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * The dx prop defines a horizontal shift from the x coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The dy prop defines a vertical shift from the y coordinate.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The events prop attaches arbitrary event handlers to the label component. This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory’s event system, event handlers will be called with the event, the props of the component is attached to, and an eventKey.
    * Examples: events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[js.Object] = js.native
  /**
    * The flyoutComponent prop takes a component instance which will be used to create the flyout path for each tooltip.
    * The new element created from the passed flyoutComponent will be supplied with the following properties: x, y, dx, dy,
    * index, datum, cornerRadius, pointerLength, pointerWidth, width, height, orientation, style, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If flyoutComponent is omitted, a default Flyout component will be created with props described above.
    * Examples: flyoutComponent={<Flyout x={50} y={50}/>}, flyoutComponent={<MyCustomFlyout/>}
    * @default <Flyout/>
    */
  var flyoutComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The flyoutHeight prop defines the height of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop
    * is not set, flyoutHeight will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutHeight: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The style prop applies SVG style properties to the rendered flyout container. These props will be passed to the flyoutComponent.
    */
  var flyoutStyle: js.UndefOr[VictoryStyleObject] = js.native
  /**
    * The flyoutWidth prop defines the width of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop is
    * not set, flyoutWidth will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutWidth: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The groupComponent prop takes a component instance which will be used to create group elements for use within container elements. This prop defaults to a <g> tag.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
  /**
    * This prop refers to the height of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel, and should not be set
    * manually. In versions before ^33.0.0 this prop referred to the height of the tooltip flyout. Please use flyoutHeight instead
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The horizontal prop determines whether to plot the flyouts to the left / right of the (x, y) coordinate rather than top / bottom.
    * This is useful when an orientation prop is not provided, and data will determine the default orientation. i.e.
    * negative values result in a left orientation and positive values will result in a right orientation by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * The index prop represents the index of the datum in the data array.
    */
  var index: js.UndefOr[Double | String] = js.native
  /**
    * The labelComponent prop takes a component instance which will be used to render each tooltip label.
    * The new element created from the passed labelComponent will be supplied with the following properties: x, y, index, datum, verticalAnchor, textAnchor, style, text, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If labelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * Examples: labelComponent={<VictoryLabel dy={20}/>}, labelComponent={<MyCustomLabel/>}
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The orientation prop determines which side of the (x, y) coordinate the tooltip should be rendered on.
    * This prop can be given as “top”, “bottom”, “left”, “right”, or as a function of datum that returns one of these values.
    * If this prop is not provided it will be determined from the sign of the datum, and the value of the horizontal prop.
    */
  var orientation: js.UndefOr[OrientationTypes | VictoryNumberCallback] = js.native
  /**
    * The pointerLength prop determines the length of the triangular pointer extending from the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerLength: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The pointerWidth prop determines the width of the base of the triangular pointer extending from
    * the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerWidth: js.UndefOr[NumberOrCallback] = js.native
  /**
    * When renderInPortal is true, rendered tooltips will be wrapped in VictoryPortal and rendered within the Portal element
    * within VictoryContainer. Note: This prop should not be set to true when using a custom container element.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.native
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * The text prop defines the text VictoryTooltip will render. The text prop may be given as a string, number, or function of datum.
    * When VictoryLabel is used as the labelComponent, strings may include newline characters, which VictoryLabel will split in to separate <tspan/> elements.
    */
  var text: js.UndefOr[StringOrNumberOrCallback | (js.Array[Double | String])] = js.native
  /**
    * VictoryAxis uses the standard theme prop. Read about it here
    * @default VictoryTheme.grayscale
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.native
  /**
    * This prop refers to the width of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel,
    * and should not be set manually. In versions before ^33.0.0 this prop referred to the width of the tooltip flyout. Please use flyoutWidth instead
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.native
}

object VictoryTooltipProps {
  @scala.inline
  def apply(): VictoryTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryTooltipProps]
  }
  @scala.inline
  implicit class VictoryTooltipPropsOps[Self <: VictoryTooltipProps] (val x: Self) extends AnyVal {
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
    def setActivateData(value: Boolean): Self = this.set("activateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivateData: Self = this.set("activateData", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAngle(value: String | Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("cornerRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setCornerRadius(value: NumberOrCallback): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    @scala.inline
    def setDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("dx", js.Any.fromFunction1(value))
    @scala.inline
    def setDx(value: StringOrNumberOrCallback): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("dy", js.Any.fromFunction1(value))
    @scala.inline
    def setDy(value: StringOrNumberOrCallback): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFlyoutComponent(value: ReactElement): Self = this.set("flyoutComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlyoutComponent: Self = this.set("flyoutComponent", js.undefined)
    @scala.inline
    def setFlyoutHeightFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("flyoutHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setFlyoutHeight(value: NumberOrCallback): Self = this.set("flyoutHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlyoutHeight: Self = this.set("flyoutHeight", js.undefined)
    @scala.inline
    def setFlyoutStyle(value: VictoryStyleObject): Self = this.set("flyoutStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlyoutStyle: Self = this.set("flyoutStyle", js.undefined)
    @scala.inline
    def setFlyoutWidthFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("flyoutWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setFlyoutWidth(value: NumberOrCallback): Self = this.set("flyoutWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlyoutWidth: Self = this.set("flyoutWidth", js.undefined)
    @scala.inline
    def setGroupComponent(value: ReactElement): Self = this.set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupComponent: Self = this.set("groupComponent", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setIndex(value: Double | String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLabelComponent(value: ReactElement): Self = this.set("labelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelComponent: Self = this.set("labelComponent", js.undefined)
    @scala.inline
    def setOrientationFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("orientation", js.Any.fromFunction1(value))
    @scala.inline
    def setOrientation(value: OrientationTypes | VictoryNumberCallback): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPointerLengthFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("pointerLength", js.Any.fromFunction1(value))
    @scala.inline
    def setPointerLength(value: NumberOrCallback): Self = this.set("pointerLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerLength: Self = this.set("pointerLength", js.undefined)
    @scala.inline
    def setPointerWidthFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("pointerWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setPointerWidth(value: NumberOrCallback): Self = this.set("pointerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerWidth: Self = this.set("pointerWidth", js.undefined)
    @scala.inline
    def setRenderInPortal(value: Boolean): Self = this.set("renderInPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderInPortal: Self = this.set("renderInPortal", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextVarargs(value: (Double | String)*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("text", js.Any.fromFunction1(value))
    @scala.inline
    def setText(value: StringOrNumberOrCallback | (js.Array[Double | String])): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: VictoryThemeDefinition): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

