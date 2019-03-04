package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Album extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var count: scala.Double
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 所选的图片的尺寸
    */
  var sizeType: js.Array[wegameDashApiLib.wegameDashApiLibStrings.original] | js.Array[wegameDashApiLib.wegameDashApiLibStrings.compressed] | (js.Tuple2[
    wegameDashApiLib.wegameDashApiLibStrings.original, 
    wegameDashApiLib.wegameDashApiLibStrings.compressed
  ])
  /**
    * 选择图片的来源
    */
  var sourceType: js.Array[wegameDashApiLib.wegameDashApiLibStrings.album] | js.Array[wegameDashApiLib.wegameDashApiLibStrings.camera] | (js.Tuple2[
    wegameDashApiLib.wegameDashApiLibStrings.album, 
    wegameDashApiLib.wegameDashApiLibStrings.camera
  ])
  var success: js.UndefOr[js.Function1[/* res */ Anon_TempFilePaths, scala.Unit]] = js.undefined
}

object Anon_Album {
  @scala.inline
  def apply(
    count: scala.Double,
    sizeType: js.Array[wegameDashApiLib.wegameDashApiLibStrings.original] | js.Array[wegameDashApiLib.wegameDashApiLibStrings.compressed] | (js.Tuple2[
      wegameDashApiLib.wegameDashApiLibStrings.original, 
      wegameDashApiLib.wegameDashApiLibStrings.compressed
    ]),
    sourceType: js.Array[wegameDashApiLib.wegameDashApiLibStrings.album] | js.Array[wegameDashApiLib.wegameDashApiLibStrings.camera] | (js.Tuple2[
      wegameDashApiLib.wegameDashApiLibStrings.album, 
      wegameDashApiLib.wegameDashApiLibStrings.camera
    ]),
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ Anon_TempFilePaths, scala.Unit] = null
  ): Anon_Album = {
    val __obj = js.Dynamic.literal(count = count, sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Album]
  }
}

