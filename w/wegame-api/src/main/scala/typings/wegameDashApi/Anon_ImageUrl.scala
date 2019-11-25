package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageUrl extends js.Object {
  /**
    * 转发显示图片的链接，可以是网络图片路径或本地图片文件路径或相对代码包根目录的图片文件路径。显示图片长宽比是 5:4
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * 审核通过的图片 ID，详见 使用审核通过的转发图片（https://developers.weixin.qq.com/minigame/dev/guide/open-ability/sh
    * are/share.html#%E4%BD%BF%E7%94%A8%E5%AE%A1%E6%A0%B8%E9%80%9A%E8%BF%87%E7%9A%84%E8%BD%AC%E5%8F%91%E5%9B%BE%E7%89%87）
    */
  var imageUrlId: js.UndefOr[String] = js.undefined
  /**
    * 发送对象的 openId
    */
  var openId: String
  /**
    * 转发标题，不传则默认使用当前小游戏的昵称。
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_ImageUrl {
  @scala.inline
  def apply(openId: String, imageUrl: String = null, imageUrlId: String = null, title: String = null): Anon_ImageUrl = {
    val __obj = js.Dynamic.literal(openId = openId.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (imageUrlId != null) __obj.updateDynamic("imageUrlId")(imageUrlId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImageUrl]
  }
}

