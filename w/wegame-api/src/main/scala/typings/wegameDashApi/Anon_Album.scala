package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.album
import typings.wegameDashApi.wegameDashApiStrings.camera
import typings.wegameDashApi.wegameDashApiStrings.compressed
import typings.wegameDashApi.wegameDashApiStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Album extends js.Object {
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
  var success: js.UndefOr[js.Function1[/* res */ Anon_TempFilePaths, Unit]] = js.undefined
}

object Anon_Album {
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]),
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ Anon_TempFilePaths => Unit = null
  ): Anon_Album = {
    val __obj = js.Dynamic.literal(count = count, sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_Album]
  }
}

