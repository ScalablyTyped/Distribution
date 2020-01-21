package typings.wegameApi

import typings.wegameApi.wegameApiStrings.album
import typings.wegameApi.wegameApiStrings.camera
import typings.wegameApi.wegameApiStrings.compressed
import typings.wegameApi.wegameApiStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlbum extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var count: Double
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  var success: js.UndefOr[js.Function1[/* res */ AnonTempFilePaths, Unit]] = js.undefined
}

object AnonAlbum {
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]),
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ AnonTempFilePaths => Unit = null
  ): AnonAlbum = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonAlbum]
  }
}

