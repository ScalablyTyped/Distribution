package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformation extends js.Object {
  /**
    * Clock-wise rotation in radians. Defaults to \`0\`.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * Horizontal scale factor. Defaults to \`1\`.
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  /**
    * Vertical scale factor. Defaults to \`1\`.
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  /**
    * Horizontal translation (shift) in dip. Defaults to \`0\`.
    */
  var translationX: js.UndefOr[Double] = js.undefined
  /**
    * Vertical translation (shift) in dip. Defaults to \`0\`.
    */
  var translationY: js.UndefOr[Double] = js.undefined
  /**
    * Z-axis translation (shift) in dip. Defaults to \`0\`. Android 5.0+ only.
    */
  var translationZ: js.UndefOr[Double] = js.undefined
}

object Transformation {
  @scala.inline
  def apply(
    rotation: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    translationX: Int | Double = null,
    translationY: Int | Double = null,
    translationZ: Int | Double = null
  ): Transformation = {
    val __obj = js.Dynamic.literal()
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (translationZ != null) __obj.updateDynamic("translationZ")(translationZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformation]
  }
}

