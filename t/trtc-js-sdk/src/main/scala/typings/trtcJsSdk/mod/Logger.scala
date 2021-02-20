package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkNumbers.`0`
import typings.trtcJsSdk.trtcJsSdkNumbers.`1`
import typings.trtcJsSdk.trtcJsSdkNumbers.`2`
import typings.trtcJsSdk.trtcJsSdkNumbers.`3`
import typings.trtcJsSdk.trtcJsSdkNumbers.`4`
import typings.trtcJsSdk.trtcJsSdkNumbers.`5`
import typings.trtcJsSdk.trtcJsSdkNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Logger {
  
  /** 日志输出等级 */
  @js.native
  trait LogLevel extends StObject {
    
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
  object LogLevel {
    
    @JSImport("trtc-js-sdk", "Logger.LogLevel")
    @js.native
    val ^ : LogLevel = js.native
    
    @scala.inline
    implicit class LogLevelMutableBuilder[Self <: LogLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBUG(value: `1`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: `4`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: `0`): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: `3`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  /** 关闭日志上传 */
  @JSImport("trtc-js-sdk", "Logger.disableUploadLog")
  @js.native
  def disableUploadLog(): Unit = js.native
  
  /** 打开日志上传 */
  @JSImport("trtc-js-sdk", "Logger.enableUploadLog")
  @js.native
  def enableUploadLog(): Unit = js.native
  
  /**
    * 设置日志输出等级
    * @example
    * ```javascript
    * // 输出INFO以上日志等级
    * TRTC.Logger.setLogLevel(TRTC.Logger.LogLevel.INFO);
    * ```
    */
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_0(level: `0`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_1(level: `1`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_2(level: `2`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_3(level: `3`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_4(level: `4`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_5(level: `5`): Unit = js.native
  @JSImport("trtc-js-sdk", "Logger.setLogLevel")
  @js.native
  def setLogLevel_6(level: `6`): Unit = js.native
}
