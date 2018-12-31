package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 消息分享对象
  */
trait SharedAppMessage extends ShareTimelineConfig {
  /**
    * 如果 type 是 music 或 video，则要提供数据链接，默认为空
    */
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享描述
    */
  var desc: java.lang.String
  /**
    * 分享类型, music、video 或 link，不填默认为 link
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

