package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryBoxPlotProps
  extends VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The boxWidth prop specifies how wide each box should be. If the whiskerWidth
    * prop is not set, this prop will also determine the width of the whisker crosshair.
    */
  var boxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The domainPadding prop specifies a number of pixels of padding to add to the
    * beginning and end of a domain. This prop is useful for explicitly spacing ticks farther
    * from the origin to prevent crowding. This prop should be given as an object with
    * numbers specified for x and y.
    */
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
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
    *}}
    */
  var events: js.UndefOr[js.Array[EventPropTypeInterface[java.lang.String, StringOrNumberOrCallback]]] = js.undefined
  /**
    * The horizontal prop determines whether the bars will be laid vertically or
    * horizontally. The bars will be vertical if this prop is false or unspecified,
    * or horizontal if the prop is set to true.
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The labelOrientation prop determines where labels are placed relative to their
    * corresponding data. If this prop is not set, it will be set to “top” for
    * horizontal charts, and “right” for vertical charts.
    */
  var labelOrientation: js.UndefOr[
    victoryLib.victoryLibStrings.top | victoryLib.victoryLibStrings.bottom | victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right
  ] = js.undefined
  /**
    * When the boolean labels prop is set to true, the values for min, max, median,
    * q1, and q3 will be displayed for each box. For more granular label control, use
    * the individual minLabels, maxLabels, medianLabels, q1Labels, and q3Labels props.
    */
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use the max data accessor prop to define the max value of a box plot.
    */
  var max: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * Use the median data accessor prop to define the median value of a box plot.
    */
  var median: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * Use the min data accessor prop to define the min value of a box plot.
    */
  var min: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * Use the q1 data accessor prop to define the q1 value of a box plot.
    */
  var q1: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * Use the q3 data accessor prop to define the q1 value of a box plot.
    */
  var q3: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The style prop defines the style of the component. The style prop
    * should be given as an object with styles defined for parent, max,
    * maxLabels, min, minLabels,median, medianLabels,q1, q1Labels,q3,
    * q3Labels. Any valid svg styles are supported, but width, height, a
    * nd padding should be specified via props as they determine relative
    * layout for components in VictoryChart. Functional styles may be
    * defined for style properties, and they will be evaluated with each datum.
    */
  var style: js.UndefOr[VictoryBoxPlotStyleInterface] = js.undefined
  /**
    * The whiskerWidth prop specifies how wide each whisker crosshair should be. If the
    * whiskerWidth prop is not set, the width of the whisker crosshair will match
    * the width of the box.
    */
  var whiskerWidth: js.UndefOr[scala.Double] = js.undefined
}

