package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_CardListAnonCardExt
import typings.wegameDashApi.Anon_CardListAnonCardExtCardId
import typings.wegameDashApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.addCard")
@js.native
object addCard extends js.Object {
  /**
    * 批量添加卡券。只有通过 认证 的小程序或文化互动类目的小游戏才能使用。更多文档请参考 微信卡券接口文档（https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2）。
    */
  def apply(param: Anon_CardListAnonCardExt with CallbacksWithType[Anon_CardListAnonCardExtCardId]): Unit = js.native
}

