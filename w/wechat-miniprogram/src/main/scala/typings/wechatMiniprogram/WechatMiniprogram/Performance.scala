package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Performance extends StObject {
  
  /** [[PerformanceObserver](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/PerformanceObserver.html) Performance.createObserver(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/Performance.createObserver.html)
    *
    * 创建全局性能事件监听器
    *
    * 最低基础库： `2.11.0` */
  def createObserver(callback: js.Function1[/* repeated */ Any, Any]): PerformanceObserver = js.native
  
  /** [Array Performance.getEntries()](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/Performance.getEntries.html)
    *
    * 该方法返回当前缓冲区中的所有性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntries(): js.Array[Any] = js.native
  
  /** [Array Performance.getEntriesByName(string name, string entryType)](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/Performance.getEntriesByName.html)
    *
    * 获取当前缓冲区中所有名称为 [name] 且类型为 [entryType] 的性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntriesByName(name: String): js.Array[Any] = js.native
  def getEntriesByName(name: String, entryType: String): js.Array[Any] = js.native
  
  /** [Array Performance.getEntriesByType(string entryType)](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/Performance.getEntriesByType.html)
    *
    * 获取当前缓冲区中所有类型为 [entryType] 的性能数据
    *
    * 最低基础库： `2.11.0` */
  def getEntriesByType(entryType: String): js.Array[Any] = js.native
  
  /** [Performance.setBufferSize(number size)](https://developers.weixin.qq.com/miniprogram/dev/api/base/performance/Performance.setBufferSize.html)
    *
    * 设置缓冲区大小， 默认缓冲 30 条性能数据
    *
    * 最低基础库： `2.11.0` */
  def setBufferSize(size: Double): Unit = js.native
}
