package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  var IS_ODP: js.UndefOr[scala.Boolean] = js.undefined
  var IS_OMP: js.UndefOr[yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1`] = js.undefined
  var LogIdName: js.UndefOr[java.lang.String] = js.undefined
  var access: js.UndefOr[java.lang.String] = js.undefined
  var access_error_log_path: js.UndefOr[java.lang.String] = js.undefined
  var access_log_path: js.UndefOr[java.lang.String] = js.undefined
  var auto_rotate: js.UndefOr[yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1`] = js.undefined
  // 模板文件地址，可以不填
  var data_path: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1`] = js.undefined
  var format_wf: js.UndefOr[java.lang.String] = js.undefined
  var intLevel: js.UndefOr[yogDashLogLib.yogDashLogLibNumbers.`16`] = js.undefined
  // 用户只需要填写log_path配置
  var log_path: js.UndefOr[java.lang.String] = js.undefined
  var use_sub_dir: js.UndefOr[yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1`] = js.undefined
}

