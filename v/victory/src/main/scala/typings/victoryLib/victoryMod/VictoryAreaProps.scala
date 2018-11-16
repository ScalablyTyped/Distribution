package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VictoryAreaProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
       * The event prop take an array of event objects. Event objects are composed of
       * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
       * for a given component, so "data" and "labels" are all valid targets for VictoryArea events.
       * Since VictoryArea only renders a single element, the eventKey property is not used.
       * The eventHandlers object should be given as an object whose keys are standard
       * event names (i.e. onClick) and whose values are event callbacks. The return value
       * of an event handler is used to modify elemnts. The return value should be given
       * as an object or an array of objects with optional target and eventKey keys,
       * and a mutation key whose value is a function. The target and eventKey keys
       * will default to those corresponding to the element the event handler was attached to.
       * The mutation function will be called with the calculated props for the individual selected
       * element (i.e. an area), and the object returned from the mutation function
       * will override the props of the selected element via object assignment.
       * @example
       * events={[
       *   {
       *     target: "data",
       *     eventHandlers: {
       *       onClick: () => {
       *         return [
       *            {
       *              mutation: (props) => {
       *                return {style: merge({}, props.style, {fill: "orange"})};
       *              }
       *            }, {
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
        victoryLib.victoryLibStrings.all
      ]
    ]
  ] = js.undefined
  /**
       * The interpolation prop determines how data points should be connected when plotting a line
       * @default "linear"
       */
  var interpolation: js.UndefOr[InterpolationPropType] = js.undefined
  /**
       * The samples prop specifies how many individual points to plot when plotting
       * y as a function of x. Samples is ignored if x props are provided instead.
       * @default 50
       */
  var samples: js.UndefOr[scala.Double] = js.undefined
  /**
       * The style prop specifies styles for your VictoryArea. Any valid inline style properties
       * will be applied. Height, width, and padding should be specified via the height,
       * width, and padding props, as they are used to calculate the alignment of
       * components within chart.
       * @example {data: {fill: "red"}, labels: {fontSize: 12}}
       */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}

