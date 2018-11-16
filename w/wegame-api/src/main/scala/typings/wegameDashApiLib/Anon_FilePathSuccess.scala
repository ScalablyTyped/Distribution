package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_FilePathSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * 图片文件路径，可以是临时文件路径也可以是永久文件路径，不支持网络图片路径
           */
  var filePath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

