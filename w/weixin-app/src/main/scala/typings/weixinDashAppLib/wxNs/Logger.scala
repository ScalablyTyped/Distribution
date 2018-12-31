package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 接口
trait Logger extends js.Object {
  /**
  		 * 写debug日志，参数同log方法
  		 */
  def debug(args: js.Any*): scala.Unit
  /**
  		 * 写info日志，参数同log方法
  		 */
  def info(args: js.Any*): scala.Unit
  /**
  		 * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
  		 */
  def log(args: js.Any*): scala.Unit
  /**
  		 * 写warn日志，参数同log方法
  		 */
  def warn(args: js.Any*): scala.Unit
}

