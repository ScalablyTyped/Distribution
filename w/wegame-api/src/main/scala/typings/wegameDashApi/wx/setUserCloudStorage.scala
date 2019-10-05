package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_CompleteFailKVDataList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.setUserCloudStorage")
@js.native
object setUserCloudStorage extends js.Object {
  /**
    * 对用户托管数据进行写数据操作，允许同时写多组 KV 数据。
    * 托管数据的限制
    *      > 每个openid所标识的微信用户在每个游戏上托管的数据不能超过128个key-value对。
    *      > 上报的key-value列表当中每一项的key+value长度都不能超过1K(1024)字节。
    *      > 上报的key-value列表当中每一个key长度都不能超过128字节。
    */
  def apply(param: Anon_CompleteFailKVDataList): Unit = js.native
}

