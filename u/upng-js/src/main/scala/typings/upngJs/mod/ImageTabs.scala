package typings.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTabs extends js.Object {
  var PLTE: js.UndefOr[js.Array[Double]] = js.native
  var acTL: js.UndefOr[ImageTabACTL] = js.native
  var bKGD: js.UndefOr[Double | js.Array[Double]] = js.native
  var cHRM: js.UndefOr[js.Array[Double]] = js.native
   // Depends on ctype
  var gAMA: js.UndefOr[Double] = js.native
  var hIST: js.UndefOr[js.Array[Double]] = js.native
  var iTXt: js.UndefOr[ImageTabText] = js.native
  var pHYs: js.UndefOr[js.Array[Double]] = js.native
  var sRGB: js.UndefOr[Double] = js.native
  var tEXt: js.UndefOr[ImageTabText] = js.native
  var tRNS: js.UndefOr[Double | js.Array[Double]] = js.native
}

object ImageTabs {
  @scala.inline
  def apply(): ImageTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTabs]
  }
  @scala.inline
  implicit class ImageTabsOps[Self <: ImageTabs] (val x: Self) extends AnyVal {
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
    def setPLTEVarargs(value: Double*): Self = this.set("PLTE", js.Array(value :_*))
    @scala.inline
    def setPLTE(value: js.Array[Double]): Self = this.set("PLTE", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePLTE: Self = this.set("PLTE", js.undefined)
    @scala.inline
    def setAcTL(value: ImageTabACTL): Self = this.set("acTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcTL: Self = this.set("acTL", js.undefined)
    @scala.inline
    def setBKGDVarargs(value: Double*): Self = this.set("bKGD", js.Array(value :_*))
    @scala.inline
    def setBKGD(value: Double | js.Array[Double]): Self = this.set("bKGD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBKGD: Self = this.set("bKGD", js.undefined)
    @scala.inline
    def setCHRMVarargs(value: Double*): Self = this.set("cHRM", js.Array(value :_*))
    @scala.inline
    def setCHRM(value: js.Array[Double]): Self = this.set("cHRM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCHRM: Self = this.set("cHRM", js.undefined)
    @scala.inline
    def setGAMA(value: Double): Self = this.set("gAMA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGAMA: Self = this.set("gAMA", js.undefined)
    @scala.inline
    def setHISTVarargs(value: Double*): Self = this.set("hIST", js.Array(value :_*))
    @scala.inline
    def setHIST(value: js.Array[Double]): Self = this.set("hIST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHIST: Self = this.set("hIST", js.undefined)
    @scala.inline
    def setITXt(value: ImageTabText): Self = this.set("iTXt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteITXt: Self = this.set("iTXt", js.undefined)
    @scala.inline
    def setPHYsVarargs(value: Double*): Self = this.set("pHYs", js.Array(value :_*))
    @scala.inline
    def setPHYs(value: js.Array[Double]): Self = this.set("pHYs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePHYs: Self = this.set("pHYs", js.undefined)
    @scala.inline
    def setSRGB(value: Double): Self = this.set("sRGB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSRGB: Self = this.set("sRGB", js.undefined)
    @scala.inline
    def setTEXt(value: ImageTabText): Self = this.set("tEXt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTEXt: Self = this.set("tEXt", js.undefined)
    @scala.inline
    def setTRNSVarargs(value: Double*): Self = this.set("tRNS", js.Array(value :_*))
    @scala.inline
    def setTRNS(value: Double | js.Array[Double]): Self = this.set("tRNS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRNS: Self = this.set("tRNS", js.undefined)
  }
  
}

