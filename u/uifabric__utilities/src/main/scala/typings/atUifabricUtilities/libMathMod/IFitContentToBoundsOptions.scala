package typings.atUifabricUtilities.libMathMod

import typings.atUifabricUtilities.libISizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFitContentToBoundsOptions extends js.Object {
  /**
    * The size of the bounds.
    */
  var boundsSize: ISize
  /**
    * The size of the content to fit to the bounds.
    * The output will be proportional to this value.
    */
  var contentSize: ISize
  /**
    * An optional maximum scale factor to apply. The default is 1.
    * Use Infinity for an unbounded resize.
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The fit mode to apply, either 'contain' or 'cover'.
    */
  var mode: FitMode
}

object IFitContentToBoundsOptions {
  @scala.inline
  def apply(boundsSize: ISize, contentSize: ISize, mode: FitMode, maxScale: Int | Double = null): IFitContentToBoundsOptions = {
    val __obj = js.Dynamic.literal(boundsSize = boundsSize.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFitContentToBoundsOptions]
  }
}

