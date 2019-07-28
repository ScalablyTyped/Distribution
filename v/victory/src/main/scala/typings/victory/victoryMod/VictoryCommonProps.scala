package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import typings.victory.Anon_XYD3Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties
  */
trait VictoryCommonProps extends js.Object {
  /**
    * The animate prop specifies props for VictoryAnimation to use.
    * The animate prop should also be used to specify enter and exit
    * transition configurations with the `onExit` and `onEnter` namespaces respectively.
    * @example
    * {duration: 500, onExit: () => {}, onEnter: {duration: 500, before: () => ({y: 0})})}
    */
  var animate: js.UndefOr[AnimatePropTypeInterface] = js.undefined
  /**
    * The containerComponent prop takes an entire component which will be used to
    * create a container element for standalone charts.
    * The new element created from the passed containerComponent wil be provided with
    * these props from VictoryArea: height, width, children
    * (the chart itself) and style. Props that are not provided by the
    * child chart component include title and desc, both of which
    * are intended to add accessibility to Victory components. The more descriptive these props
    * are, the more accessible your data will be for people using screen readers.
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If a dataComponent is
    * not provided, VictoryArea will use the default VictoryContainer component.
    * @example <VictoryContainer title="Chart of Dog Breeds" desc="This chart shows how popular each dog breed is by percentage in Seattle." />
    * @default <VictoryContainer/>
    */
  var containerComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The groupComponent prop takes an entire component which will be used to
    * create group elements for use within container elements. This prop defaults
    * to a <g> tag on web, and a react-native-svg <G> tag on mobile
    * @default <g/>
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The height props specifies the height the svg viewBox of the chart container.
    * This value should be given as a number of pixels
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal prop determines whether data will be plotted horizontally.
    * When this prop is set to true, the independent variable will be plotted on the y axis
    * and the dependent variable will be plotted on the x axis.
    * @default false
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * The name prop is used to reference a component instance when defining shared events.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The padding props specifies the amount of padding in number of pixels between
    * the edge of the chart and any rendered child components. This prop can be given
    * as a number or as an object with padding specified for top, bottom, left
    * and right.
    * @default 50
    */
  var padding: js.UndefOr[PaddingProps] = js.undefined
  /**
    * The scale prop determines which scales your chart should use. This prop can be
    * given as a string specifying a supported scale ("linear", "time", "log", "sqrt"),
    * as a d3 scale function, or as an object with scales specified for x and y
    * @example d3Scale.time(), {x: "linear", y: "log"}
    * @default "linear"
    */
  var scale: js.UndefOr[ScalePropType | D3Scale | Anon_XYD3Scale] = js.undefined
  /**
    * The standalone prop determines whether the component will render a standalone svg
    * or a <g> tag that will be included in an external svg. Set standalone to false to
    * compose VictoryAxis with other components within an enclosing <svg> tag.
    * @default true
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
  /**
    * The theme prop takes a style object with nested data, labels, and parent objects.
    * You can create this object yourself, or you can use a theme provided by Victory.
    * When using VictoryArea as a solo component, implement the theme directly on
    * VictoryArea. If you are wrapping VictoryArea in VictoryChart, VictoryStack, or
    * VictoryGroup, please call the theme on the outermost wrapper component instead.
    * @example theme={VictoryTheme.material}
    * http://www.github.com/FormidableLabs/victory-core/tree/master/src/victory-theme/material.js
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.undefined
  /**
    * The width props specifies the width of the svg viewBox of the chart container
    * This value should be given as a number of pixels
    */
  var width: js.UndefOr[Double] = js.undefined
}

object VictoryCommonProps {
  @scala.inline
  def apply(
    animate: AnimatePropTypeInterface = null,
    containerComponent: ReactElement = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null
  ): VictoryCommonProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryCommonProps]
  }
}

