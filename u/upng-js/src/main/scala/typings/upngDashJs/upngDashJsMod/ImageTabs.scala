package typings.upngDashJs.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTabs extends js.Object {
  var PLTE: js.UndefOr[js.Array[Double]] = js.undefined
  var acTL: js.UndefOr[ImageTabACTL] = js.undefined
  var bKGD: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var cHRM: js.UndefOr[js.Array[Double]] = js.undefined
   // Depends on ctype
  var gAMA: js.UndefOr[Double] = js.undefined
  var hIST: js.UndefOr[js.Array[Double]] = js.undefined
  var iTXt: js.UndefOr[ImageTabText] = js.undefined
  var pHYs: js.UndefOr[js.Array[Double]] = js.undefined
  var sRGB: js.UndefOr[Double] = js.undefined
  var tEXt: js.UndefOr[ImageTabText] = js.undefined
  var tRNS: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object ImageTabs {
  @scala.inline
  def apply(
    PLTE: js.Array[Double] = null,
    acTL: ImageTabACTL = null,
    bKGD: Double | js.Array[Double] = null,
    cHRM: js.Array[Double] = null,
    gAMA: Int | Double = null,
    hIST: js.Array[Double] = null,
    iTXt: ImageTabText = null,
    pHYs: js.Array[Double] = null,
    sRGB: Int | Double = null,
    tEXt: ImageTabText = null,
    tRNS: Double | js.Array[Double] = null
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

