package typings.uifabricUtilities.mathMod

import typings.uifabricUtilities.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFitContentToBoundsOptions extends js.Object {
  /**
    * The size of the bounds.
    */
  var boundsSize: ISize = js.native
  /**
    * The size of the content to fit to the bounds.
    * The output will be proportional to this value.
    */
  var contentSize: ISize = js.native
  /**
    * An optional maximum scale factor to apply. The default is 1.
    * Use Infinity for an unbounded resize.
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The fit mode to apply, either 'contain' or 'cover'.
    */
  var mode: FitMode = js.native
}

object IFitContentToBoundsOptions {
  @scala.inline
  def apply(boundsSize: ISize, contentSize: ISize, mode: FitMode): IFitContentToBoundsOptions = {
    val __obj = js.Dynamic.literal(boundsSize = boundsSize.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFitContentToBoundsOptions]
  }
  @scala.inline
  implicit class IFitContentToBoundsOptionsOps[Self <: IFitContentToBoundsOptions] (val x: Self) extends AnyVal {
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
    def setBoundsSize(value: ISize): Self = this.set("boundsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentSize(value: ISize): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: FitMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
  }
  
}

