package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTabs extends js.Object {
  var PLTE: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var acTL: js.UndefOr[ImageTabACTL] = js.undefined
  var bKGD: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var cHRM: js.UndefOr[js.Array[scala.Double]] = js.undefined
   // Depends on ctype
  var gAMA: js.UndefOr[scala.Double] = js.undefined
  var hIST: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iTXt: js.UndefOr[ImageTabText] = js.undefined
  var pHYs: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var sRGB: js.UndefOr[scala.Double] = js.undefined
  var tEXt: js.UndefOr[ImageTabText] = js.undefined
  var tRNS: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object ImageTabs {
  @scala.inline
  def apply(
    PLTE: js.Array[scala.Double] = null,
    acTL: ImageTabACTL = null,
    bKGD: scala.Double | js.Array[scala.Double] = null,
    cHRM: js.Array[scala.Double] = null,
    gAMA: scala.Int | scala.Double = null,
    hIST: js.Array[scala.Double] = null,
    iTXt: ImageTabText = null,
    pHYs: js.Array[scala.Double] = null,
    sRGB: scala.Int | scala.Double = null,
    tEXt: ImageTabText = null,
    tRNS: scala.Double | js.Array[scala.Double] = null
  ): ImageTabs = {
    val __obj = js.Dynamic.literal()
    if (PLTE != null) __obj.updateDynamic("PLTE")(PLTE)
    if (acTL != null) __obj.updateDynamic("acTL")(acTL)
    if (bKGD != null) __obj.updateDynamic("bKGD")(bKGD.asInstanceOf[js.Any])
    if (cHRM != null) __obj.updateDynamic("cHRM")(cHRM)
    if (gAMA != null) __obj.updateDynamic("gAMA")(gAMA.asInstanceOf[js.Any])
    if (hIST != null) __obj.updateDynamic("hIST")(hIST)
    if (iTXt != null) __obj.updateDynamic("iTXt")(iTXt)
    if (pHYs != null) __obj.updateDynamic("pHYs")(pHYs)
    if (sRGB != null) __obj.updateDynamic("sRGB")(sRGB.asInstanceOf[js.Any])
    if (tEXt != null) __obj.updateDynamic("tEXt")(tEXt)
    if (tRNS != null) __obj.updateDynamic("tRNS")(tRNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTabs]
  }
}

