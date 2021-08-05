package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryTooltipProps extends StObject {
  
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
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
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
  
  inline def apply(): VictoryTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryTooltipProps]
  }
  
  extension [Self <: VictoryTooltipProps](x: Self) {
    
    inline def setActivateData(value: Boolean): Self = StObject.set(x, "activateData", value.asInstanceOf[js.Any])
    
    inline def setActivateDataUndefined: Self = StObject.set(x, "activateData", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAngle(value: String | Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCornerRadius(value: NumberOrCallback): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "cornerRadius", js.Any.fromFunction1(value))
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setDx(value: StringOrNumberOrCallback): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dx", js.Any.fromFunction1(value))
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: StringOrNumberOrCallback): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dy", js.Any.fromFunction1(value))
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFlyoutComponent(value: ReactElement): Self = StObject.set(x, "flyoutComponent", value.asInstanceOf[js.Any])
    
    inline def setFlyoutComponentUndefined: Self = StObject.set(x, "flyoutComponent", js.undefined)
    
    inline def setFlyoutHeight(value: NumberOrCallback): Self = StObject.set(x, "flyoutHeight", value.asInstanceOf[js.Any])
    
    inline def setFlyoutHeightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "flyoutHeight", js.Any.fromFunction1(value))
    
    inline def setFlyoutHeightUndefined: Self = StObject.set(x, "flyoutHeight", js.undefined)
    
    inline def setFlyoutStyle(value: VictoryStyleObject): Self = StObject.set(x, "flyoutStyle", value.asInstanceOf[js.Any])
    
    inline def setFlyoutStyleUndefined: Self = StObject.set(x, "flyoutStyle", js.undefined)
    
    inline def setFlyoutWidth(value: NumberOrCallback): Self = StObject.set(x, "flyoutWidth", value.asInstanceOf[js.Any])
    
    inline def setFlyoutWidthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "flyoutWidth", js.Any.fromFunction1(value))
    
    inline def setFlyoutWidthUndefined: Self = StObject.set(x, "flyoutWidth", js.undefined)
    
    inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
    
    inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
    
    inline def setOrientation(value: OrientationTypes | VictoryNumberCallback): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "orientation", js.Any.fromFunction1(value))
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPointerLength(value: NumberOrCallback): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    inline def setPointerLengthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "pointerLength", js.Any.fromFunction1(value))
    
    inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
    
    inline def setPointerWidth(value: NumberOrCallback): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
    
    inline def setPointerWidthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "pointerWidth", js.Any.fromFunction1(value))
    
    inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    
    inline def setRenderInPortal(value: Boolean): Self = StObject.set(x, "renderInPortal", value.asInstanceOf[js.Any])
    
    inline def setRenderInPortalUndefined: Self = StObject.set(x, "renderInPortal", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: StringOrNumberOrCallback | (js.Array[Double | String])): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: (Double | String)*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    inline def setTheme(value: VictoryThemeDefinition): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
