package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.Y
import typings.victory.victoryStrings.bottom
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlyoutProps extends VictoryCommonProps {
  /**
    * a flag signifying whether the component is active
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * the center coordinates of the flyout
    */
  var center: js.UndefOr[Y] = js.native
  /**
    * the class name that will be applied to the rendered element
    */
  var className: js.UndefOr[String] = js.native
  /**
    * the corner radius of the flyout
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /**
    * the entire dataset if applicable
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * the data point corresponding to this flyout if applicable
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * offset in the x dimension.
    */
  var dx: js.UndefOr[Double] = js.native
  /**
    * offset in the y dimension.
    */
  var dy: js.UndefOr[Double] = js.native
  /**
    * events to attach to the rendered element
    */
  var events: js.UndefOr[js.Object] = js.native
  /**
    * an id to apply to the rendered component
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * the index of this flyout within the dataset
    */
  var index: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * the svg coordinates of the center point of a polar chart
    */
  var origin: js.UndefOr[js.Object] = js.native
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.native
  /**
    * the length of the triangular pointer
    */
  var pointerLength: js.UndefOr[Double] = js.native
  /**
    * the width of the base of the triangular pointer
    */
  var pointerWidth: js.UndefOr[Double] = js.native
  /**
    * a flag specifying whether the component is part of a polar chart
    */
  var polar: js.UndefOr[Boolean] = js.native
  /**
    * the aria role to assign to the element
    */
  var role: js.UndefOr[String] = js.native
  /**
    * the shape rendering attribute to apply to the rendered elements
    */
  var shapeRendering: js.UndefOr[String] = js.native
  /**
    * the styles to apply to the rendered element
    */
  var style: js.UndefOr[VictoryStyleObject] = js.native
  /**
    * a transform that will be supplied to elements this component renders
    */
  var transform: js.UndefOr[String] = js.native
  /**
    * the x coordinate of data point associated with this flyout
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * the y coordinate of data point associated with this flyout
    */
  var y: js.UndefOr[Double] = js.native
}

object FlyoutProps {
  @scala.inline
  def apply(): FlyoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyoutProps]
  }
  @scala.inline
  implicit class FlyoutPropsOps[Self <: FlyoutProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCenter(value: Y): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOrientation(value: top | bottom | left | right): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOrigin(value: js.Object): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPathComponent(value: ReactElement): Self = this.set("pathComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathComponent: Self = this.set("pathComponent", js.undefined)
    @scala.inline
    def setPointerLength(value: Double): Self = this.set("pointerLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerLength: Self = this.set("pointerLength", js.undefined)
    @scala.inline
    def setPointerWidth(value: Double): Self = this.set("pointerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerWidth: Self = this.set("pointerWidth", js.undefined)
    @scala.inline
    def setPolar(value: Boolean): Self = this.set("polar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolar: Self = this.set("polar", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setShapeRendering(value: String): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    @scala.inline
    def setStyle(value: VictoryStyleObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

