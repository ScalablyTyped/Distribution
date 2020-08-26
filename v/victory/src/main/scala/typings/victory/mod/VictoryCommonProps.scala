package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.Y
import typings.victory.anon.`1`
import typings.victory.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties
  */
@js.native
trait VictoryCommonProps extends js.Object {
  /**
    * The animate prop specifies props for VictoryAnimation to use.
    * The animate prop should also be used to specify enter and exit
    * transition configurations with the `onExit` and `onEnter` namespaces respectively.
    * @example
    * {duration: 500, onExit: () => {}, onEnter: {duration: 500, before: () => ({y: 0})}}
    */
  var animate: js.UndefOr[Boolean | AnimatePropTypeInterface] = js.native
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
  var containerComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The groupComponent prop takes an entire component which will be used to
    * create group elements for use within container elements. This prop defaults
    * to a <g> tag on web, and a react-native-svg <G> tag on mobile
    * @default <g/>
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The height props specifies the height the svg viewBox of the chart container.
    * This value should be given as a number of pixels
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The horizontal prop determines whether data will be plotted horizontally.
    * When this prop is set to true, the independent variable will be plotted on the y axis
    * and the dependent variable will be plotted on the x axis.
    * @default false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * The maxDomain prop defines a maximum domain value for a chart. This prop is useful in
    * situations where the maximum domain of a chart is static, while the minimum value
    * depends on data or other variable information.
    * If the domain prop is set in addition to maximumDomain, domain will be used.
    *
    * note: The x value supplied to the maxDomain prop refers to the independent variable,
    * and the y value refers to the dependent variable. This may cause confusion in
    * horizontal charts, as the independent variable will corresponds to the y axis.
    */
  var maxDomain: js.UndefOr[Double | Y] = js.native
  /**
    * The minDomain prop defines a minimum domain value for a chart. This prop is useful in
    * situations where the minimum domain of a chart is static, while the maximum value
    * depends on data or other variable information. If the domain prop is set in addition
    * to minimumDomain, domain will be used.
    *
    * note: The x value supplied to the minDomain prop refers to the independent variable,
    * and the y value refers to the dependent variable. This may cause confusion in
    * horizontal charts, as the independent variable will corresponds to the y axis.
    */
  var minDomain: js.UndefOr[Double | Y] = js.native
  /**
    * The name prop is used to reference a component instance when defining shared events.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The padding props specifies the amount of padding in number of pixels between
    * the edge of the chart and any rendered child components. This prop can be given
    * as a number or as an object with padding specified for top, bottom, left
    * and right.
    * @default 50
    */
  var padding: js.UndefOr[PaddingProps] = js.native
  /**
    * The scale prop determines which scales your chart should use. This prop can be
    * given as a string specifying a supported scale ("linear", "time", "log", "sqrt"),
    * as a d3 scale function, or as an object with scales specified for x and y
    * @example d3Scale.time(), {x: "linear", y: "log"}
    * @default "linear"
    */
  var scale: js.UndefOr[ScalePropType | D3Scale | `1`] = js.native
  /**
    * By default `domainPadding` is coerced to existing quadrants. This means that if a given domain only
    * includes positive values, no amount of padding applied by `domainPadding` will result in a domain with
    * negative values. This is the desired behavior in most cases. For users that need to apply padding without
    * regard to quadrant, the `singleQuadrantDomainPadding` prop may be used. This prop may be given as a boolean
    * or an object with boolean values specified for "x" and/or "y". When this prop is false (or false for a given
    * dimension), padding will be applied without regard to quadrant. If this prop is not specified,
    * `domainPadding` will be coerced to existing quadrants.
    *
    * *note:* The `x` value supplied to the `singleQuadrantDomainPadding` prop refers to the *independent* variable,
    * and the `y` value refers to the *dependent* variable. This may cause confusion in horizontal charts, as the
    * independent variable will corresponds to the y axis.
    */
  var singleQuadrantDomainPadding: js.UndefOr[Boolean | `2`] = js.native
  /**
    * The standalone prop determines whether the component will render a standalone svg
    * or a <g> tag that will be included in an external svg. Set standalone to false to
    * compose VictoryAxis with other components within an enclosing <svg> tag.
    * @default true
    */
  var standalone: js.UndefOr[Boolean] = js.native
  /**
    * The theme prop takes a style object with nested data, labels, and parent objects.
    * You can create this object yourself, or you can use a theme provided by Victory.
    * When using VictoryArea as a solo component, implement the theme directly on
    * VictoryArea. If you are wrapping VictoryArea in VictoryChart, VictoryStack, or
    * VictoryGroup, please call the theme on the outermost wrapper component instead.
    * @example theme={VictoryTheme.material}
    * http://www.github.com/FormidableLabs/victory-core/tree/master/src/victory-theme/material.js
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.native
  /**
    * The width props specifies the width of the svg viewBox of the chart container
    * This value should be given as a number of pixels
    */
  var width: js.UndefOr[Double] = js.native
}

object VictoryCommonProps {
  @scala.inline
  def apply(): VictoryCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryCommonProps]
  }
  @scala.inline
  implicit class VictoryCommonPropsOps[Self <: VictoryCommonProps] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean | AnimatePropTypeInterface): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setContainerComponent(value: ReactElement): Self = this.set("containerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerComponent: Self = this.set("containerComponent", js.undefined)
    @scala.inline
    def setGroupComponent(value: ReactElement): Self = this.set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupComponent: Self = this.set("groupComponent", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setMaxDomain(value: Double | Y): Self = this.set("maxDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDomain: Self = this.set("maxDomain", js.undefined)
    @scala.inline
    def setMinDomain(value: Double | Y): Self = this.set("minDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDomain: Self = this.set("minDomain", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPadding(value: PaddingProps): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setScale(value: ScalePropType | D3Scale | `1`): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSingleQuadrantDomainPadding(value: Boolean | `2`): Self = this.set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleQuadrantDomainPadding: Self = this.set("singleQuadrantDomainPadding", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    @scala.inline
    def setTheme(value: VictoryThemeDefinition): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

