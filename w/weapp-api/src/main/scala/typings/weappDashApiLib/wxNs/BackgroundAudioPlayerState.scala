package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundAudioPlayerState extends js.Object {
  /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
  var currentPosition: js.UndefOr[scala.Double] = js.undefined
  /** 歌曲数据链接，只有在当前有音乐播放时返回 */
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
  var downloadPercent: js.UndefOr[scala.Double] = js.undefined
  /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: scala.Double
}

