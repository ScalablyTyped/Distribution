package typings.wegameApi.wx

import typings.wegameApi.AnonImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.modifyFriendInteractiveStorage")
@js.native
object modifyFriendInteractiveStorage extends js.Object {
  /**
    * 修改好友的互动型托管数据，该接口只可在开放数据域下使用，示例代码：
    * wx.modifyFriendInteractiveStorage({
    *     key: '1',
    *     opNum: 1,
    *     operation: 'add',
    *     toUser: '', // 好友的 openId
    *     title: '送你 10 个金币，赶快打开游戏看看吧', // 2.9.0 支持
    *     imageUrl: 'image/xxx' // 2.9.0 支持
    * });
    *
    * 赠送动作的校验：
    *     调用该接口需要上传 JSServer 函数 "checkInteractiveData"，该函数可用于执行赠送动作的校验逻辑，校验通过后返回结果表示本次赠送是否合法。只有 checkInteractiveData 返回了 {ret: true}，此次修改才会成功。
    *
    * 使用模板规则进行交互：
    *     每次调用该接口会弹窗询问用户是否确认执行该操作，2.9.0 之后版本，需要在 game.json 中设置 modifyFriendInteractiveStorageTemplates 来定制交互的文案。
    *     modifyFriendInteractiveStorageTemplates是一个模板数组，每一个模板需要有 key, action, object 参数，还有一个可选参数 ratio，详细说明见示例配置：
    *         {
    *             "modifyFriendInteractiveStorageTemplates": [
    *                  {
    *                      "key": "1", // 这个 key 与接口中同名参数相对应，不同的 key 对应不同的模板
    *                      "action": "赠送", // 互动行为
    *                      "object": "金币", // 互动物品
    *                      "ratio": 10 // 物品比率，opNum * ratio 代表物品个数
    *                  }
    *              ]
    *          }
    *     最后生成的文案为 "确认 ${action} ${nickname} ${object}？"，或者 "确认 ${action} ${nickname} ${object} x ${opNum * ratio}？"
    *
    * 使用自定义文案进行交互：
    *     2.7.7 之后，2.9.0 之前的版本，文案通过 game.json 的 modifyFriendInteractiveStorageConfirmWording 字段配置。 配置内容可包含 nickname 变量，用 ${nickname} 表示，实际调用时会被替换成好友的昵称。示例配置：
    *         {
    *             "modifyFriendInteractiveStorageConfirmWording": "确认送给${nickname}一个体力？"
    *         }
    *     2.9.0 之后，在 modifyFriendInteractiveStorageTemplates 和 modifyFriendInteractiveStorageConfirmWording 都存在的情况下，会优先使用前者。
    */
  def apply(param: AnonImageUrl): Unit = js.native
}

