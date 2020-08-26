package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryList extends js.Object {
  /** [Array EntryList.getEntries()](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/EntryList.getEntries.html)
    *
    * 该方法返回当前列表中的所有性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntries(): js.Array[_] = js.native
  /** [Array EntryList.getEntriesByName(string name, string entryType)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/EntryList.getEntriesByName.html)
    *
    * 获取当前列表中所有名称为 [name] 且类型为 [entryType] 的性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntriesByName(name: String): js.Array[_] = js.native
  def getEntriesByName(name: String, entryType: String): js.Array[_] = js.native
  /** [Array EntryList.getEntriesByType(string entryType)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/EntryList.getEntriesByType.html)
    *
    * 获取当前列表中所有类型为 [entryType] 的性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntriesByType(entryType: String): js.Array[_] = js.native
}

