package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频组件控制
/**
	 * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
	 */
trait AudioContext extends js.Object {
  /**
  		 * 暂停
  		 */
  def pause(): scala.Unit
  /**
  		 * 播放
  		 */
  def play(): scala.Unit
  /**
  		 * 跳转到指定位置，单位 s
  		 */
  def seek(position: scala.Double): scala.Unit
  /**
  		 * 音频的地址
  		 */
  def setSrc(src: java.lang.String): scala.Unit
}

