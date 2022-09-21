package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.a
import typings.wechatMiniprogram.wechatMiniprogramStrings.aPlussign
import typings.wechatMiniprogram.wechatMiniprogramStrings.as
import typings.wechatMiniprogram.wechatMiniprogramStrings.asPlussign
import typings.wechatMiniprogram.wechatMiniprogramStrings.ax
import typings.wechatMiniprogram.wechatMiniprogramStrings.axPlussign
import typings.wechatMiniprogram.wechatMiniprogramStrings.r
import typings.wechatMiniprogram.wechatMiniprogramStrings.rPlussign
import typings.wechatMiniprogram.wechatMiniprogramStrings.w
import typings.wechatMiniprogram.wechatMiniprogramStrings.wPlussign
import typings.wechatMiniprogram.wechatMiniprogramStrings.wx
import typings.wechatMiniprogram.wechatMiniprogramStrings.wxPlussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSyncOption extends StObject {
  
  /** 文件路径 (本地路径) */
  var filePath: String
  
  /** 文件系统标志，默认值: 'r'
    *
    * 可选值：
    * - 'a': 打开文件用于追加。 如果文件不存在，则创建该文件;
    * - 'ax': 类似于 'a'，但如果路径存在，则失败;
    * - 'a+': 打开文件用于读取和追加。 如果文件不存在，则创建该文件;
    * - 'ax+': 类似于 'a+'，但如果路径存在，则失败;
    * - 'as': 打开文件用于追加（在同步模式中）。 如果文件不存在，则创建该文件;
    * - 'as+': 打开文件用于读取和追加（在同步模式中）。 如果文件不存在，则创建该文件;
    * - 'r': 打开文件用于读取。 如果文件不存在，则会发生异常;
    * - 'r+': 打开文件用于读取和写入。 如果文件不存在，则会发生异常;
    * - 'w': 打开文件用于写入。 如果文件不存在则创建文件，如果文件存在则截断文件;
    * - 'wx': 类似于 'w'，但如果路径存在，则失败;
    * - 'w+': 打开文件用于读取和写入。 如果文件不存在则创建文件，如果文件存在则截断文件;
    * - 'wx+': 类似于 'w+'，但如果路径存在，则失败; */
  var flag: js.UndefOr[
    a | ax | aPlussign | axPlussign | as | asPlussign | r | rPlussign | w | wx | wPlussign | wxPlussign
  ] = js.undefined
}
object OpenSyncOption {
  
  inline def apply(filePath: String): OpenSyncOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSyncOption]
  }
  
  extension [Self <: OpenSyncOption](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFlag(
      value: a | ax | aPlussign | axPlussign | as | asPlussign | r | rPlussign | w | wx | wPlussign | wxPlussign
    ): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
