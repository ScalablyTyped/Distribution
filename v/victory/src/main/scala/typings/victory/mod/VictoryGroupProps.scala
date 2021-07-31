package typings.victory.mod

import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryGroupProps
  extends StObject
     with VictoryCommonProps
     with VictoryDatableProps
     with VictoryMultiLabeableProps {
  
  /**
    * The color prop is an optional prop that defines a single color to be applied to the
    * children of VictoryGroup. The color prop will override colors specified via colorScale.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The colorScale prop is an optional prop that defines the color scale the chart's bars
    * will be created on. This prop should be given as an array of CSS colors, or as a string
    * corresponding to one of the built in color scales. VictoryBar will automatically assign
    * values from this color scale to the bars unless colors are explicitly provided in the
    * `dataAttributes` prop.
    */
  var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * The offset prop determines the number of pixels each element in a group should
    * be offset from its original position of the on the independent axis. In the
    * case of groups of bars, this number should be equal to the width of the bar
    * plus the desired spacing between bars.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The style prop specifies styles for your grouped chart. These styles will be
    * applied to all grouped children
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}
object VictoryGroupProps {
  
  @scala.inline
  def apply(): VictoryGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryGroupProps]
  }
  
  @scala.inline
  implicit class VictoryGroupPropsMutableBuilder[Self <: VictoryGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScale(value: ColorScalePropType): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDomainPadding(value: DomainPaddingPropType): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
