package typings
package victoryLib.victoryMod

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
  var cursorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
       * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
       * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
       * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
       * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
       * @example cursorDimension="x"
       */
  var cursorDimension: js.UndefOr[victoryLib.victoryLibStrings.x | victoryLib.victoryLibStrings.y] = js.undefined
  /**
       * The cursorLabel prop defines the label that will appear next to the cursor.
       * A label will only appear if cursorLabel is set. This prop should be given as a
       * function of a point (an Object with x and y properties).
       * @example cursorLabel={(point) => point.x}
       */
  var cursorLabel: js.UndefOr[js.Function1[/* point */ CursorData, scala.Unit]] = js.undefined
  /**
       * The cursorLabelComponent prop takes a component instance which will be
       * used to render a label for the cursor. The new element created from the passed
       * cursorLabelComponent will be supplied with the following props: x, y,
       * active, text. If cursorLabelComponent is omitted, a new VictoryLabel will be created with the props described above.
       * @default cursorLabelComponent={<VictoryLabel/>}
       */
  var cursorLabelComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
       * The cursorLabelOffset prop determines the pixel offset of the cursor label
       * from the cursor point. This prop should be an Object with x and y properties, or a
       * number to be used for both dimensions.
       * @default "{ x: 5, y: -10 }"
       */
  var cursorLabelOffset: js.UndefOr[scala.Double | CursorData] = js.undefined
  /**
       * Whenever the mouse is not over the chart, the cursor will not be displayed.
       * If instead you would like to keep it displayed, use the defaultCursorValue prop to set the default value.
       * The prop should be a point (an Object with x and y properties) for 2-dimensional cursors, or a number for 1-dimensional cursors.
       * @example defaultCursorValue={{x: 1, y: 1}}, defaultCursorValue={0}}
       */
  var defaultCursorValue: js.UndefOr[scala.Double | CursorData] = js.undefined
  /**
       * When the disable prop is set to true, VictoryCursorContainer events will not fire.
       */
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
       * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
       * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
       * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
       * @example onChange={(value, props) => this.setState({cursorValue: value})}
       */
  var onCursorChange: js.UndefOr[
    js.Function2[/* value */ CursorData, /* props */ VictoryCursorContainerProps, scala.Unit]
  ] = js.undefined
}

