package typings.victory.mod

import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryGroupProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The color prop is an optional prop that defines a single color to be applied to the
    * children of VictoryGroup. The color prop will override colors specified via colorScale.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The colorScale prop is an optional prop that defines the color scale the chart's bars
    * will be created on. This prop should be given as an array of CSS colors, or as a string
    * corresponding to one of the built in color scales. VictoryBar will automatically assign
    * values from this color scale to the bars unless colors are explicitly provided in the
    * `dataAttributes` prop.
    */
  var colorScale: js.UndefOr[ColorScalePropType] = js.native
  /**
    * The domainPadding prop specifies a number of pixels of padding to add to the
    * beginning and end of a domain. This prop is useful for explicitly spacing ticks farther
    * from the origin to prevent crowding. This prop should be given as an object with
    * numbers specified for x and y.
    */
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.native
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a childName, target, eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, (i.e. "data" and "labels"). The childName will refer to an
    * individual child of VictoryGroup, either by its name prop, or by index. The eventKey
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
    */
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.native
  /**
    * The offset prop determines the number of pixels each element in a group should
    * be offset from its original position of the on the independent axis. In the
    * case of groups of bars, this number should be equal to the width of the bar
    * plus the desired spacing between bars.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The style prop specifies styles for your grouped chart. These styles will be
    * applied to all grouped children
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
}

object VictoryGroupProps {
  @scala.inline
  def apply(): VictoryGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryGroupProps]
  }
  @scala.inline
  implicit class VictoryGroupPropsOps[Self <: VictoryGroupProps] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = this.set("colorScale", js.Array(value :_*))
    @scala.inline
    def setColorScale(value: ColorScalePropType): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    @scala.inline
    def setDomainPadding(value: DomainPaddingPropType): Self = this.set("domainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainPadding: Self = this.set("domainPadding", js.undefined)
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

