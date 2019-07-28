package typings.wallabyjs.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironmentViewportSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IWallabyEnvironmentViewportSize {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): IWallabyEnvironmentViewportSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyEnvironmentViewportSize]
  }
}

