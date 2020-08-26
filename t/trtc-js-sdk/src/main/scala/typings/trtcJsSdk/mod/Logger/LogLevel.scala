package typings.trtcJsSdk.mod.Logger

import org.scalablytyped.runtime.TopLevel
import typings.trtcJsSdk.trtcJsSdkNumbers.`0`
import typings.trtcJsSdk.trtcJsSdkNumbers.`1`
import typings.trtcJsSdk.trtcJsSdkNumbers.`2`
import typings.trtcJsSdk.trtcJsSdkNumbers.`3`
import typings.trtcJsSdk.trtcJsSdkNumbers.`4`
import typings.trtcJsSdk.trtcJsSdkNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 日志输出等级 */
@js.native
trait LogLevel extends js.Object {
  /** 输出 DEBUG、INFO、WARN、ERROR 等级日志 */
  var DEBUG: `1` = js.native
  /** 输出 ERROR 等级日志 */
  var ERROR: `4` = js.native
  /** 输出 INFO、WARN、ERROR 等级日志 */
  var INFO: `2` = js.native
  /**
    * 不输出任何日志
    * **注意： 关闭日之后我们将无法帮助您定位线上问题，建议至少保留 WARN 日志等级！**
    */
  var NONE: `5` = js.native
  /** 输出所有日志 */
  var TRACE: `0` = js.native
  /** 输出 WARN、ERROR 等级日志 */
  var WARN: `3` = js.native
}

@JSImport("trtc-js-sdk", "Logger.LogLevel")
@js.native
object LogLevel extends TopLevel[LogLevel]

