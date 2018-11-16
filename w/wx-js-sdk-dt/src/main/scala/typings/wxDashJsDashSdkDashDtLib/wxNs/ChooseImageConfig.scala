package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseImageConfig extends js.Object {
  /**
           * 照片数，默认9
           */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
           * 可以指定是原图还是压缩图，默认二者都有
           */
  var sizeType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * 可以指定来源是相册还是相机，默认二者都有
           */
  var sourceType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
           */
  def success(res: wxDashJsDashSdkDashDtLib.Anon_LocalIds): scala.Unit
}

