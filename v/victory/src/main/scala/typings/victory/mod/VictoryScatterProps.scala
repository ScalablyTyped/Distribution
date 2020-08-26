package typings.victory.mod

import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryScatterProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The bubbleProperty prop indicates which property of the data object should be used
    * to scale data points in a bubble chart
    */
  var bubbleProperty: js.UndefOr[String] = js.native
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryScatter
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
    */
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.native
  /**
    * The maxBubbleSize prop sets an upper limit for scaling data points in a bubble chart
    */
  var maxBubbleSize: js.UndefOr[Double] = js.native
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    */
  var samples: js.UndefOr[Double] = js.native
  /**
    * The size prop determines how to scale each data point
    */
  var size: js.UndefOr[Double | (js.Function1[/* data */ js.Any, Double])] = js.native
  /**
    * The style prop specifies styles for your VictoryScatter. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
  /**
    * The symbol prop determines which symbol should be drawn to represent data points.
    */
  var symbol: js.UndefOr[ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])] = js.native
}

object VictoryScatterProps {
  @scala.inline
  def apply(): VictoryScatterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryScatterProps]
  }
  @scala.inline
  implicit class VictoryScatterPropsOps[Self <: VictoryScatterProps] (val x: Self) extends AnyVal {
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
    def setBubbleProperty(value: String): Self = this.set("bubbleProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleProperty: Self = this.set("bubbleProperty", js.undefined)
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("eventKey", js.Any.fromFunction1(value))
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setMaxBubbleSize(value: Double): Self = this.set("maxBubbleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBubbleSize: Self = this.set("maxBubbleSize", js.undefined)
    @scala.inline
    def setSamples(value: Double): Self = this.set("samples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamples: Self = this.set("samples", js.undefined)
    @scala.inline
    def setSizeFunction1(value: /* data */ js.Any => Double): Self = this.set("size", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double | (js.Function1[/* data */ js.Any, Double])): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSymbolFunction1(value: /* data */ js.Any => ScatterSymbolType): Self = this.set("symbol", js.Any.fromFunction1(value))
    @scala.inline
    def setSymbol(value: ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
  
}

