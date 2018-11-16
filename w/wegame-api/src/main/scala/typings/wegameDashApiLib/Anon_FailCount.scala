package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_FailCount extends js.Object {
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

