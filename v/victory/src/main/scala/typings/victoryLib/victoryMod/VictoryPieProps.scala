package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryPieProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps {
  /**
    * The colorScale prop is an optional prop that defines the color scale the pie
    * will be created on. This prop should be given as an array of CSS colors, or as a string
    * corresponding to one of the built in color scales. VictoryPie will automatically assign
    * values from this color scale to the pie slices unless colors are explicitly provided in the
    * data object
    */
  var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
  /**
    * Set the cornerRadius for every dataComponent (Slice by default) within VictoryPie
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The data prop specifies the data to be plotted,
    * where data X-value is the slice label (string or number),
    * and Y-value is the corresponding number value represented by the slice
    * Data should be in the form of an array of data points.
    * Each data point may be any format you wish (depending on the `x` and `y` accessor props),
    * but by default, an object with x and y properties is expected.
    * @example [{x: 1, y: 2}, {x: 2, y: 3}], [[1, 2], [2, 3]],
    * [[{x: "a", y: 1}, {x: "b", y: 2}], [{x: "a", y: 2}, {x: "b", y: 3}]]
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The dataComponent prop takes an entire, HTML-complete data component which will be used to
    * create slices for each datum in the pie chart. The new element created from the passed
    * dataComponent will have the property datum set by the pie chart for the point it renders;
    * properties style and pathFunction calculated by VictoryPie; an index property set
    * corresponding to the location of the datum in the data provided to the pie; events bound to
    * the VictoryPie; and the d3 compatible slice object.
    * If a dataComponent is not provided, VictoryPie's Slice component will be used.
    */
  var dataComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The overall end angle of the pie in degrees. This prop is used in conjunction with
    * startAngle to create a pie that spans only a segment of a circle.
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The event prop takes an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryPie
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
    *     eventKey: 1,
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              eventKey: 2,
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              eventKey: 2,
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
    *}}
    */
  var events: js.UndefOr[
    js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        StringOrNumberOrCallback | js.Array[java.lang.String] | js.Array[scala.Double]
      ]
    ]
  ] = js.undefined
  /**
    * When creating a donut chart, this prop determines the number of pixels between
    * the center of the chart and the inner edge of a donut. When this prop is set to zero
    * a regular pie chart is rendered.
    */
  var innerRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The labelRadius prop defines the radius of the arc that will be used for positioning each slice label.
    * If this prop is not set, the label radius will default to the radius of the pie + label padding.
    */
  var labelRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padAngle prop determines the amount of separation between adjacent data slices
    * in number of degrees
    */
  var padAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the radius of the chart. If this property is not provided it is computed
    * from width, height, and padding props
    *
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The overall start angle of the pie in degrees. This prop is used in conjunction with
    * endAngle to create a pie that spans only a segment of a circle.
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The style prop specifies styles for your pie. VictoryPie relies on Radium,
    * so valid Radium style objects should work for this prop. Height, width, and
    * padding should be specified via the height, width, and padding props.
    * @example {data: {stroke: "black"}, label: {fontSize: 10}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
  /**
    * The x prop specifies how to access the X value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'x', 'x.value.nested.1.thing', 'x[2].also.nested', null, d => Math.sin(d)
    */
  var x: js.UndefOr[DataGetterPropType] = js.undefined
  /**
    * The y prop specifies how to access the Y value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'y', 'y.value.nested.1.thing', 'y[2].also.nested', null, d => Math.sin(d)
    */
  var y: js.UndefOr[DataGetterPropType] = js.undefined
}

