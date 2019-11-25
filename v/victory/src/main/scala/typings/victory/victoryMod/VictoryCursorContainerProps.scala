package typings.victory.victoryMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactElement
import typings.victory.victoryStrings.x
import typings.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryCursorContainerProps extends VictoryContainerProps {
  /**
    * The cursorComponent prop takes a component instance which will be used to render a cursor element.
    * The new element created will be supplied with x1, y1, x2 and y2 positioning props.
    * If a cursorComponent is not supplied, a new Line component will be rendered.
    * @default cursorComponent={<Line/>}
    */
  var cursorComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
    * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
    * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
    * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
    * @example cursorDimension="x"
    */
  var cursorDimension: js.UndefOr[x | y] = js.undefined
  /**
    * The cursorLabel prop defines the label that will appear next to the cursor.
    * A label will only appear if cursorLabel is set. This prop should be given as a
    * function of a point (an Object with x and y properties).
    * @example cursorLabel={(point) => point.x}
    */
  var cursorLabel: js.UndefOr[js.Function1[/* point */ CursorData, Unit]] = js.undefined
  /**
    * The cursorLabelComponent prop takes a component instance which will be
    * used to render a label for the cursor. The new element created from the passed
    * cursorLabelComponent will be supplied with the following props: x, y,
    * active, text. If cursorLabelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * @default cursorLabelComponent={<VictoryLabel/>}
    */
  var cursorLabelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The cursorLabelOffset prop determines the pixel offset of the cursor label
    * from the cursor point. This prop should be an Object with x and y properties, or a
    * number to be used for both dimensions.
    * @default "{ x: 5, y: -10 }"
    */
  var cursorLabelOffset: js.UndefOr[Double | CursorData] = js.undefined
  /**
    * Whenever the mouse is not over the chart, the cursor will not be displayed.
    * If instead you would like to keep it displayed, use the defaultCursorValue prop to set the default value.
    * The prop should be a point (an Object with x and y properties) for 2-dimensional cursors, or a number for 1-dimensional cursors.
    * @example defaultCursorValue={{x: 1, y: 1}}, defaultCursorValue={0}}
    */
  var defaultCursorValue: js.UndefOr[Double | CursorData] = js.undefined
  /**
    * When the disable prop is set to true, VictoryCursorContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  /**
    * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
    * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
    * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
    * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
    * @example onChange={(value, props) => this.setState({cursorValue: value})}
    */
  var onCursorChange: js.UndefOr[
    js.Function2[/* value */ CursorData, /* props */ VictoryCursorContainerProps, Unit]
  ] = js.undefined
}

object VictoryCursorContainerProps {
  @scala.inline
  def apply(
    cursorComponent: ReactElement = null,
    cursorDimension: x | y = null,
    cursorLabel: /* point */ CursorData => Unit = null,
    cursorLabelComponent: ReactElement = null,
    cursorLabelOffset: Double | CursorData = null,
    defaultCursorValue: Double | CursorData = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    onCursorChange: (/* value */ CursorData, /* props */ VictoryCursorContainerProps) => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null
  ): VictoryCursorContainerProps = {
    val __obj = js.Dynamic.literal()
    if (cursorComponent != null) __obj.updateDynamic("cursorComponent")(cursorComponent.asInstanceOf[js.Any])
    if (cursorDimension != null) __obj.updateDynamic("cursorDimension")(cursorDimension.asInstanceOf[js.Any])
    if (cursorLabel != null) __obj.updateDynamic("cursorLabel")(js.Any.fromFunction1(cursorLabel))
    if (cursorLabelComponent != null) __obj.updateDynamic("cursorLabelComponent")(cursorLabelComponent.asInstanceOf[js.Any])
    if (cursorLabelOffset != null) __obj.updateDynamic("cursorLabelOffset")(cursorLabelOffset.asInstanceOf[js.Any])
    if (defaultCursorValue != null) __obj.updateDynamic("defaultCursorValue")(defaultCursorValue.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(js.Any.fromFunction2(onCursorChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryCursorContainerProps]
  }
}

