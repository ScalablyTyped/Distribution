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

object LogConfig {
  @scala.inline
  def apply(
    IS_ODP: js.UndefOr[scala.Boolean] = js.undefined,
    IS_OMP: yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1` = null,
    LogIdName: java.lang.String = null,
    access: java.lang.String = null,
    access_error_log_path: java.lang.String = null,
    access_log_path: java.lang.String = null,
    auto_rotate: yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1` = null,
    data_path: java.lang.String = null,
    debug: yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1` = null,
    format_wf: java.lang.String = null,
    intLevel: yogDashLogLib.yogDashLogLibNumbers.`16` = null,
    log_path: java.lang.String = null,
    use_sub_dir: yogDashLogLib.yogDashLogLibNumbers.`0` | yogDashLogLib.yogDashLogLibNumbers.`1` = null
  ): LogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IS_ODP)) __obj.updateDynamic("IS_ODP")(IS_ODP)
    if (IS_OMP != null) __obj.updateDynamic("IS_OMP")(IS_OMP.asInstanceOf[js.Any])
    if (LogIdName != null) __obj.updateDynamic("LogIdName")(LogIdName)
    if (access != null) __obj.updateDynamic("access")(access)
    if (access_error_log_path != null) __obj.updateDynamic("access_error_log_path")(access_error_log_path)
    if (access_log_path != null) __obj.updateDynamic("access_log_path")(access_log_path)
    if (auto_rotate != null) __obj.updateDynamic("auto_rotate")(auto_rotate.asInstanceOf[js.Any])
    if (data_path != null) __obj.updateDynamic("data_path")(data_path)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (format_wf != null) __obj.updateDynamic("format_wf")(format_wf)
    if (intLevel != null) __obj.updateDynamic("intLevel")(intLevel)
    if (log_path != null) __obj.updateDynamic("log_path")(log_path)
    if (use_sub_dir != null) __obj.updateDynamic("use_sub_dir")(use_sub_dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
}

