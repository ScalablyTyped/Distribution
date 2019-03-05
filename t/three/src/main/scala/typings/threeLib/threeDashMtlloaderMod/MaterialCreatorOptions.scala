package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialCreatorOptions extends js.Object {
  /*
    * ignoreZeroRGBs: Ignore values of RGBs (Ka,Kd,Ks) that are all 0's
    * Default: false
    */
  var ignoreZeroRGBs: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * invertTrProperty: Use values 1 of Tr field for fully opaque. This option is useful for obj
    * exported from 3ds MAX, vcglib or meshlab.
    * Default: false
    */
  var invertTrProperty: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * normalizeRGB: RGBs need to be normalized to 0-1 from 0-255
    * Default: false, assumed to be already normalized
    */
  var normalizeRGB: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * side: Which side to apply the material
    * THREE.FrontSide (default), THREE.BackSide, THREE.DoubleSide
    */
  var side: js.UndefOr[threeLib.threeDashCoreMod.Side] = js.undefined
  /*
    * wrap: What type of wrapping to apply for textures
    * THREE.RepeatWrapping (default), THREE.ClampToEdgeWrapping, THREE.MirroredRepeatWrapping
    */
  var wrap: js.UndefOr[threeLib.threeDashCoreMod.Wrapping] = js.undefined
}

object MaterialCreatorOptions {
  @scala.inline
  def apply(
    ignoreZeroRGBs: js.UndefOr[scala.Boolean] = js.undefined,
    invertTrProperty: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeRGB: js.UndefOr[scala.Boolean] = js.undefined,
    side: threeLib.threeDashCoreMod.Side = null,
    wrap: threeLib.threeDashCoreMod.Wrapping = null
  ): MaterialCreatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreZeroRGBs)) __obj.updateDynamic("ignoreZeroRGBs")(ignoreZeroRGBs)
    if (!js.isUndefined(invertTrProperty)) __obj.updateDynamic("invertTrProperty")(invertTrProperty)
    if (!js.isUndefined(normalizeRGB)) __obj.updateDynamic("normalizeRGB")(normalizeRGB)
    if (side != null) __obj.updateDynamic("side")(side)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[MaterialCreatorOptions]
  }
}

