package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryTooltipProps extends js.Object {
  /**
    * When true, tooltip events will set the active prop on both data and label elements.
    * @default false
    */
  var activateData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The active prop specifies whether the tooltip component should be displayed.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The angle prop specifies the angle to rotate the tooltip around its origin point.
    */
  var angle: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  var flyoutComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The style prop applies SVG style properties to the rendered flyout container. These props will be passed to the flyoutComponent.
    */
  var flyoutStyle: js.UndefOr[VictoryStyleObject] = js.undefined
  /**
    * The groupComponent prop takes a component instance which will be used to create group elements for use within container elements. This prop defaults to a <g> tag.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The height prop defines the height of the tooltip flyout. This prop may be given as a positive number or a function of datum.
    * If this prop is not set, height will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var height: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The horizontal prop determines whether to plot the flyouts to the left / right of the (x, y) coordinate rather than top / bottom.
    * This is useful when an orientation prop is not provided, and data will determine the default orientation. i.e.
    * negative values result in a left orientation and positive values will result in a right orientation by default.
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The index prop represents the index of the datum in the data array.
    */
  var index: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The labelComponent prop takes a component instance which will be used to render each tooltip label.
    * The new element created from the passed labelComponent will be supplied with the following properties: x, y, index, datum, verticalAnchor, textAnchor, style, text, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If labelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * Examples: labelComponent={<VictoryLabel dy={20}/>}, labelComponent={<MyCustomLabel/>}
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The orientation prop determines which side of the (x, y) coordinate the tooltip should be rendered on.
    * This prop can be given as “top”, “bottom”, “left”, “right”, or as a function of datum that returns one of these values.
    * If this prop is not provided it will be determined from the sign of the datum, and the value of the horizontal prop.
    */
  var orientation: js.UndefOr[OrientationTypes] = js.undefined
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
  var renderInPortal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * The text prop defines the text VictoryTooltip will render. The text prop may be given as a string, number, or function of datum.
    * When VictoryLabel is used as the labelComponent, strings may include newline characters, which VictoryLabel will split in to separate <tspan/> elements.
    */
  var text: js.UndefOr[StringOrNumberOrCallback | js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  /**
    * VictoryAxis uses the standard theme prop. Read about it here
    * @default VictoryTheme.grayscale
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.undefined
  /**
    * The width prop defines the width of the tooltip flyout. This prop may be given as a positive number or a function of datum.
    * If this prop is not set, width will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var width: js.UndefOr[NumberOrCallback] = js.undefined
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

