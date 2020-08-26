package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.album
import typings.wegameApi.wegameApiStrings.camera
import typings.wegameApi.wegameApiStrings.compressed
import typings.wegameApi.wegameApiStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeType extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var count: Double = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]) = js.native
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]) = js.native
  var success: js.UndefOr[js.Function1[/* res */ TempFilePaths, Unit]] = js.native
}

object SizeType {
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  ): SizeType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
  @scala.inline
  implicit class SizeTypeOps[Self <: SizeType] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeTypeVarargs(value: (original | compressed)*): Self = this.set("sizeType", js.Array(value :_*))
    @scala.inline
    def setSizeType(value: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: (js.Array[album | camera]) | (js.Tuple2[album, camera])): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ TempFilePaths => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

