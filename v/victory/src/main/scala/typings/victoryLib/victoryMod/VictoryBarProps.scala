package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VictoryBarProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
       * The barRatio prop specifies an approximate ratio between bar widths and spaces between bars.
       * When width is not specified via the barWidth prop or in bar styles, the barRatio prop will
       * be used to calculate a default width for each bar given the total number of bars in the data series
       * and the overall width of the chart.
       */
  var barRatio: js.UndefOr[scala.Double] = js.undefined
  /**
       * The barWidth prop is used to specify the width of each bar. This prop may be given as
       * a number of pixels or as a function that returns a number. When this prop is given as
       * a function, it will be evaluated with the arguments datum, and active. When this value
       * is not given, a default value will be calculated based on the overall dimensions of
       * the chart, and the number of bars.
       */
  var barWidth: js.UndefOr[NumberOrCallback] = js.undefined
  /**
       * Similar to data accessor props `x` and `y`, this prop may be used to functionally
       * assign eventKeys to data
       */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
       * The event prop take an array of event objects. Event objects are composed of
       * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
       * for a given component, so "data" and "labels" are all valid targets for VictoryBar events.
       * The eventKey may optionally be used to select a single element by index rather than an entire
       * set. The eventHandlers object should be given as an object whose keys are standard
       * event names (i.e. onClick) and whose values are event callbacks. The return value
       * of an event handler is used to modify elemnts. The return value should be given
       * as an object or an array of objects with optional target and eventKey keys,
       * and a mutation key whose value is a function. The target and eventKey keys
       * will default to those corresponding to the element the event handler was attached to.
       * The mutation function will be called with the calculated props for the individual selected
       * element (i.e. a single bar), and the object returned from the mutation function
       * will override the props of the selected element via object assignment.
       * @example
       * events={[
       *   {
       *     target: "data",
       *     eventKey: "thisOne",
       *     eventHandlers: {
       *       onClick: () => {
       *         return [
       *            {
       *              eventKey: "theOtherOne",
       *              mutation: (props) => {
       *                return {style: merge({}, props.style, {fill: "orange"})};
       *              }
       *            }, {
       *              eventKey: "theOtherOne",
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
        scala.Double | java.lang.String
      ]
    ]
  ] = js.undefined
  /**
       * The horizontal prop determines whether the bars will be laid vertically or
       * horizontally. The bars will be vertical if this prop is false or unspecified,
       * or horizontal if the prop is set to true.
       */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The style prop specifies styles for your VictoryBar. Any valid inline style properties
       * will be applied. Height, width, and padding should be specified via the height,
       * width, and padding props, as they are used to calculate the alignment of
       * components within chart. In addition to normal style properties, angle and verticalAnchor
       * may also be specified via the labels object, and they will be passed as props to
       * VictoryLabel, or any custom labelComponent.
       * @example {data: {fill: "red", width: 8}, labels: {fontSize: 12}}
       */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}

