package typings.wegameApi.wx

import typings.wegameApi.AnonCardList
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.openCard")
@js.native
object openCard extends js.Object {
  // --卡券
  /**
    * 查看微信卡包中的卡券。只有通过 认证 的小程序或文化互动类目的小游戏才能使用。更多文档请参考：微信卡券接口文档（https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2）
    */
  def apply(param: AnonCardList with CallbacksWithType[_]): Unit = js.native
}

