package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkNumbers.`0`
import typings.trtcJsSdk.trtcJsSdkNumbers.`1`
import typings.trtcJsSdk.trtcJsSdkNumbers.`2`
import typings.trtcJsSdk.trtcJsSdkNumbers.`3`
import typings.trtcJsSdk.trtcJsSdkNumbers.`4`
import typings.trtcJsSdk.trtcJsSdkNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Logger {
  
  @JSImport("trtc-js-sdk", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /** 日志输出等级 */
  trait LogLevel extends StObject {
    
    /** 输出 DEBUG、INFO、WARN、ERROR 等级日志 */
    var DEBUG: `1`
    
    /** 输出 ERROR 等级日志 */
    var ERROR: `4`
    
    /** 输出 INFO、WARN、ERROR 等级日志 */
    var INFO: `2`
    
    /**
      * 不输出任何日志
      * **注意： 关闭日之后我们将无法帮助您定位线上问题，建议至少保留 WARN 日志等级！**
      */
    var NONE: `5`
    
    /** 输出所有日志 */
    var TRACE: `0`
    
    /** 输出 WARN、ERROR 等级日志 */
    var WARN: `3`
  }
  object LogLevel {
    
    @JSImport("trtc-js-sdk", "Logger.LogLevel")
    @js.native
    val ^ : LogLevel = js.native
    
    extension [Self <: LogLevel](x: Self) {
      
      inline def setDEBUG(value: `1`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `4`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: `0`): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: `3`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  /** 关闭日志上传 */
  inline def disableUploadLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableUploadLog")().asInstanceOf[Unit]
  
  /** 打开日志上传 */
  inline def enableUploadLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableUploadLog")().asInstanceOf[Unit]
  
  /**
    * 设置日志输出等级
    * @example
    * ```javascript
    * // 输出INFO以上日志等级
    * TRTC.Logger.setLogLevel(TRTC.Logger.LogLevel.INFO);
    * ```
    */
  inline def setLogLevel(level: `0` | `1` | `2` | `3` | `4` | `5`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
