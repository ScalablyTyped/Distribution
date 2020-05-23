package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.XBoolean
import typings.victory.anon.Y
import typings.victory.anon.`1`
import typings.victory.victoryStrings.bottom
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyoutProps extends VictoryCommonProps {
  /**
    * a flag signifying whether the component is active
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * the center coordinates of the flyout
    */
  var center: js.UndefOr[Y] = js.undefined
  /**
    * the class name that will be applied to the rendered element
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * the corner radius of the flyout
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /**
    * the entire dataset if applicable
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * the data point corresponding to this flyout if applicable
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  /**
    * offset in the x dimension.
    */
  var dx: js.UndefOr[Double] = js.undefined
  /**
    * offset in the y dimension.
    */
  var dy: js.UndefOr[Double] = js.undefined
  /**
    * events to attach to the rendered element
    */
  var events: js.UndefOr[js.Object] = js.undefined
  /**
    * an id to apply to the rendered component
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * the index of this flyout within the dataset
    */
  var index: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[top | bottom | left | right] = js.undefined
  /**
    * the svg coordinates of the center point of a polar chart
    */
  var origin: js.UndefOr[js.Object] = js.undefined
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * the length of the triangular pointer
    */
  var pointerLength: js.UndefOr[Double] = js.undefined
  /**
    * the width of the base of the triangular pointer
    */
  var pointerWidth: js.UndefOr[Double] = js.undefined
  /**
    * a flag specifying whether the component is part of a polar chart
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  /**
    * the aria role to assign to the element
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * the shape rendering attribute to apply to the rendered elements
    */
  var shapeRendering: js.UndefOr[String] = js.undefined
  /**
    * the styles to apply to the rendered element
    */
  var style: js.UndefOr[VictoryStyleObject] = js.undefined
  /**
    * a transform that will be supplied to elements this component renders
    */
  var transform: js.UndefOr[String] = js.undefined
  /**
    * the x coordinate of data point associated with this flyout
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * the y coordinate of data point associated with this flyout
    */
  var y: js.UndefOr[Double] = js.undefined
}

object FlyoutProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animate: Boolean | AnimatePropTypeInterface = null,
    center: Y = null,
    className: String = null,
    containerComponent: ReactElement = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: js.UndefOr[Double] = js.undefined,
    dy: js.UndefOr[Double] = js.undefined,
    events: js.Object = null,
    groupComponent: ReactElement = null,
    height: js.UndefOr[Double] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    index: js.UndefOr[Double] = js.undefined,
    maxDomain: Double | Y = null,
    minDomain: Double | Y = null,
    name: String = null,
    orientation: top | bottom | left | right = null,
    origin: js.Object = null,
    padding: PaddingProps = null,
    pathComponent: ReactElement = null,
    pointerLength: js.UndefOr[Double] = js.undefined,
    pointerWidth: js.UndefOr[Double] = js.undefined,
    polar: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    scale: ScalePropType | D3Scale | `1` = null,
    shapeRendering: String = null,
    singleQuadrantDomainPadding: Boolean | XBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleObject = null,
    theme: VictoryThemeDefinition = null,
    transform: String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): FlyoutProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (!js.isUndefined(dx)) __obj.updateDynamic("dx")(dx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dy)) __obj.updateDynamic("dy")(dy.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathComponent != null) __obj.updateDynamic("pathComponent")(pathComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerLength)) __obj.updateDynamic("pointerLength")(pointerLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerWidth)) __obj.updateDynamic("pointerWidth")(pointerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyoutProps]
  }
}

