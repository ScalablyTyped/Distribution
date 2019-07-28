package typings.victory.victoryMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactElement
import typings.victory.victoryStrings.x
import typings.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryVoronoiContainerProps extends VictoryContainerProps {
  /**
  		 * When the activateData prop is set to true, the active prop will be set to true on all
  		 * data components within a voronoi area. When this prop is set to false, the onActivated
  		 * and onDeactivated callbacks will still fire, but no mutations to data components will
  		 * occur via Victory’s event system.
  		 */
  var activateData: js.UndefOr[Boolean] = js.undefined
  /**
  		 * When the activateLabels prop is set to true, the active prop will be set to true on all
  		 * labels corresponding to points within a voronoi area. When this prop is set to false,
  		 * the onActivated and onDeactivated callbacks will still fire, but no mutations to label
  		 * components will occur via Victory’s event system. Labels defined directly on
  		 * VictoryVoronoiContainer via the labels prop will still appear when this prop is set to false.
  		 */
  var activateLabels: js.UndefOr[Boolean] = js.undefined
  /**
  		 * When the disable prop is set to true, VictoryVoronoiContainer events will not fire.
  		 */
  var disable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The labelComponent prop specified the component that will be rendered when labels are defined
  		 * on VictoryVoronoiContainer. If the labels prop is omitted, no label component will be rendered.
  		 */
  var labelComponent: js.UndefOr[ReactElement] = js.undefined
  /**
  		 * When a labels prop is provided to VictoryVoronoiContainer it will render a label component
  		 * rather than activating labels on the child components it renders. This is useful for
  		 * creating multi- point tooltips. This prop should be given as a function which will be called
  		 * once for each active point. The labels function will be called with the arguments point,
  		 * index, and points, where point refers to a single active point, index refers to the position
  		 * of that point in the array of active points, and points is an array of all active points.
  		 */
  var labels: js.UndefOr[
    js.Function3[/* point */ js.Any, /* index */ Double, /* points */ js.Array[_], String]
  ] = js.undefined
  /**
  		 * The onActivated prop accepts a function to be called whenever new data points are activated.
  		 * The function is called with the parameters points (an array of active data objects) and props
  		 * (the props used by VictoryVoronoiContainer).
  		 */
  var onActivated: js.UndefOr[
    js.Function2[/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps, Unit]
  ] = js.undefined
  /**
  		 * The onDeactivated prop accepts a function to be called whenever points are deactivated. The
  		 * function is called with the parameters points (an array of the newly-deactivated data objects)
  		 * and props (the props used by VictoryVoronoiContainer).
  		 */
  var onDeactivated: js.UndefOr[
    js.Function2[/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps, Unit]
  ] = js.undefined
  /**
  		 * When the radius prop is set, the voronoi areas associated with each data point will be no larger
  		 * than the given radius. This prop should be given as a number.
  		 */
  var radius: js.UndefOr[Double] = js.undefined
  /**
  		 * The voronoiBlacklist prop is used to specify a list of components to ignore when calculating a
  		 * shared voronoi diagram. Components with a name prop matching an element in the voronoiBlacklist
  		 * array will be ignored by VictoryVoronoiContainer. Ignored components will never be flagged as
  		 * active, and will not contribute date to shared tooltips or labels.
  		 */
  var voronoiBlacklist: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * When the voronoiDimension prop is set, voronoi selection will only take the given dimension into
  		 * account. For example, when dimension is set to “x”, all data points matching a particular x mouse
  		 * position will be activated regardless of y value. When this prop is not given, voronoi selection
  		 * is determined by both x any y values.
  		 */
  var voronoiDimension: js.UndefOr[x | y] = js.undefined
  /**
  		 * When the voronoiPadding prop is given, the area of the chart that will trigger voronoi events is
  		 * reduced by the given padding on every side. By default, no padding is applied, and the entire range
  		 * of a given chart may trigger voronoi events. This prop should be given as a number.
  		 */
  var voronoiPadding: js.UndefOr[Double] = js.undefined
}

object VictoryVoronoiContainerProps {
  @scala.inline
  def apply(
    activateData: js.UndefOr[Boolean] = js.undefined,
    activateLabels: js.UndefOr[Boolean] = js.undefined,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    labelComponent: ReactElement = null,
    labels: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[_]) => String = null,
    onActivated: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit = null,
    onDeactivated: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit = null,
    radius: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    voronoiBlacklist: js.Array[String] = null,
    voronoiDimension: x | y = null,
    voronoiPadding: Int | Double = null,
    width: Int | Double = null
  ): VictoryVoronoiContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activateData)) __obj.updateDynamic("activateData")(activateData)
    if (!js.isUndefined(activateLabels)) __obj.updateDynamic("activateLabels")(activateLabels)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (labels != null) __obj.updateDynamic("labels")(js.Any.fromFunction3(labels))
    if (onActivated != null) __obj.updateDynamic("onActivated")(js.Any.fromFunction2(onActivated))
    if (onDeactivated != null) __obj.updateDynamic("onDeactivated")(js.Any.fromFunction2(onDeactivated))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (voronoiBlacklist != null) __obj.updateDynamic("voronoiBlacklist")(voronoiBlacklist)
    if (voronoiDimension != null) __obj.updateDynamic("voronoiDimension")(voronoiDimension.asInstanceOf[js.Any])
    if (voronoiPadding != null) __obj.updateDynamic("voronoiPadding")(voronoiPadding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryVoronoiContainerProps]
  }
}

