package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends js.Object {
  
  /** [console.debug()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.debug.html)
    *
    * 向调试面板中打印 debug 日志 */
  def debug(/** 日志内容，可以有任意多个。 */
  args: js.Any*): Unit = js.native
  
  /** [console.error()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.error.html)
    *
    * 向调试面板中打印 error 日志 */
  def error(/** 日志内容，可以有任意多个。 */
  args: js.Any*): Unit = js.native
  
  /** [console.group(string label)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.group.html)
    *
    * 在调试面板中创建一个新的分组。随后输出的内容都会被添加一个缩进，表示该内容属于当前分组。调用 [console.groupEnd](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.groupEnd.html)之后分组结束。
    *
    * **注意**
    *
    *
    * 仅在工具中有效，在 vConsole 中为空函数实现。 */
  def group(): Unit = js.native
  def group(/** 分组标记，可选。 */
  label: String): Unit = js.native
  
  /** [console.groupEnd()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.groupEnd.html)
    *
    * 结束由 [console.group](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.group.html) 创建的分组
    *
    * **注意**
    *
    *
    * 仅在工具中有效，在 vConsole 中为空函数实现。 */
  def groupEnd(): Unit = js.native
  
  /** [console.info()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.info.html)
    *
    * 向调试面板中打印 info 日志 */
  def info(/** 日志内容，可以有任意多个。 */
  args: js.Any*): Unit = js.native
  
  /** [console.log()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.log.html)
    *
    * 向调试面板中打印 log 日志 */
  def log(/** 日志内容，可以有任意多个。 */
  args: js.Any*): Unit = js.native
  
  /** [console.warn()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/console.warn.html)
    *
    * 向调试面板中打印 warn 日志 */
  def warn(/** 日志内容，可以有任意多个。 */
  args: js.Any*): Unit = js.native
}
