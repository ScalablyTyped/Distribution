package typings.wegameApi.wx

import typings.wegameApi.AnonExtConfig
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getExtConfig")
@js.native
object getExtConfig extends js.Object {
  // --第三方平台
  /**
    * 获取第三方平台自定义的数据字段。
    * Tips: 本接口暂时无法通过 wx.canIUse 判断是否兼容，开发者需要自行判断 wx.getExtConfig 是否存在来兼容，示例：
    *       if (wx.getExtConfig) {
    *          wx.getExtConfig({
    *              success (res) {
    *                  console.log(res.extConfig)
    *              }
    *         })
    *       }
    */
  def apply(callbacks: CallbacksWithType[AnonExtConfig]): Unit = js.native
}

