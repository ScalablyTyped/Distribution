package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.game
import typings.wegameDashApi.wegameDashApiStrings.normal
import typings.wegameDashApi.wegameDashApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Game extends js.Object {
  /**
    * 开始监听设备方向的变化。默认值normal，
    * game - 适用于更新游戏的回调频率，在 20ms/次 左右
    * ui - 适用于更新 UI 的回调频率，在 60ms/次 左右
    * normal - 普通的回调频率，在 200ms/次 左右
    */
  var interval: game | ui | normal
}

object Anon_Game {
  @scala.inline
  def apply(interval: game | ui | normal): Anon_Game = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Game]
  }
}

