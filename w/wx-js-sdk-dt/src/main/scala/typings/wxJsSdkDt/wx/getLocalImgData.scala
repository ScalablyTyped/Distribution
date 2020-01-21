package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getLocalImgData")
@js.native
object getLocalImgData extends js.Object {
  /**
    * 获取本地图片接口,此接口仅在 iOS WKWebview 下提供，用于兼容 iOS WKWebview 不支持 localId 直接显示图片的问题
    */
  def apply(config: GetLocalImgDataConfig): Unit = js.native
}

