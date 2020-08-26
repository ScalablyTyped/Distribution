package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.Active
import typings.victory.anon.EndAngle
import typings.victory.victoryStrings.cornerRadius
import typings.victory.victoryStrings.padAngle
import typings.victory.victoryStrings.radius
import typings.victory.victoryStrings.sliceEndAngle
import typings.victory.victoryStrings.sliceStartAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictorySliceProps extends VictoryCommonProps {
  /**
    * the corner radius to apply to this slice.
    * When this prop is given as a function
    * it will be called with the rest of the props supplied to Slice.
    */
  var cornerRadius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.cornerRadius]
  ] = js.native
  /**
    * the data point corresponding to this slice
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * the inner radius of the slice.
    * When this prop is given as a function
    * it will be called with datum and active.
    */
  var innerRadius: js.UndefOr[Double | (js.Function1[/* props */ Active, Double])] = js.native
  /**
    * the angular padding to add to the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var padAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.padAngle]
  ] = js.native
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.native
  /**
    * a function that calculates the path of a given slice.
    * When given, this prop will be called with the slice object
    */
  var pathFunction: js.UndefOr[js.Function1[/* props */ this.type, String]] = js.native
  /**
    * the outer radius of the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var radius: js.UndefOr[SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.radius]] = js.native
  /**
    * an object specifying the `startAngle`, `endAngle`, `padAngle`,
    * and `data` of the slice
    */
  var slice: EndAngle = js.native
  /**
    * the end angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice.
    */
  var sliceEndAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.sliceEndAngle]
  ] = js.native
  /**
    * the start angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice
    */
  var sliceStartAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.sliceStartAngle]
  ] = js.native
}

object VictorySliceProps {
  @scala.inline
  def apply(slice: EndAngle): VictorySliceProps = {
    val __obj = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictorySliceProps]
  }
  @scala.inline
  implicit class VictorySlicePropsOps[Self <: VictorySliceProps] (val x: Self) extends AnyVal {
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
    def setSlice(value: EndAngle): Self = this.set("slice", value.asInstanceOf[js.Any])
    @scala.inline
    def setCornerRadiusFunction1(value: /* props */ Omit[VictorySliceProps, cornerRadius] => Double): Self = this.set("cornerRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setCornerRadius(value: SliceNumberOrCallback[VictorySliceProps, cornerRadius]): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    @scala.inline
    def setInnerRadiusFunction1(value: /* props */ Active => Double): Self = this.set("innerRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRadius(value: Double | (js.Function1[/* props */ Active, Double])): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setPadAngleFunction1(value: /* props */ Omit[VictorySliceProps, padAngle] => Double): Self = this.set("padAngle", js.Any.fromFunction1(value))
    @scala.inline
    def setPadAngle(value: SliceNumberOrCallback[VictorySliceProps, padAngle]): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    @scala.inline
    def setPathComponent(value: ReactElement): Self = this.set("pathComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathComponent: Self = this.set("pathComponent", js.undefined)
    @scala.inline
    def setPathFunction(value: VictorySliceProps => String): Self = this.set("pathFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deletePathFunction: Self = this.set("pathFunction", js.undefined)
    @scala.inline
    def setRadiusFunction1(value: /* props */ Omit[VictorySliceProps, radius] => Double): Self = this.set("radius", js.Any.fromFunction1(value))
    @scala.inline
    def setRadius(value: SliceNumberOrCallback[VictorySliceProps, radius]): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSliceEndAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceEndAngle] => Double): Self = this.set("sliceEndAngle", js.Any.fromFunction1(value))
    @scala.inline
    def setSliceEndAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceEndAngle]): Self = this.set("sliceEndAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliceEndAngle: Self = this.set("sliceEndAngle", js.undefined)
    @scala.inline
    def setSliceStartAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceStartAngle] => Double): Self = this.set("sliceStartAngle", js.Any.fromFunction1(value))
    @scala.inline
    def setSliceStartAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceStartAngle]): Self = this.set("sliceStartAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliceStartAngle: Self = this.set("sliceStartAngle", js.undefined)
  }
  
}

