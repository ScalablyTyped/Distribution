package typings.yogDashLog.yogDashLogMod

import typings.yogDashLog.yogDashLogNumbers.`0`
import typings.yogDashLog.yogDashLogNumbers.`16`
import typings.yogDashLog.yogDashLogNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  var IS_ODP: js.UndefOr[Boolean] = js.undefined
  var IS_OMP: js.UndefOr[`0` | `1`] = js.undefined
  var LogIdName: js.UndefOr[String] = js.undefined
  var access: js.UndefOr[String] = js.undefined
  var access_error_log_path: js.UndefOr[String] = js.undefined
  var access_log_path: js.UndefOr[String] = js.undefined
  var auto_rotate: js.UndefOr[`0` | `1`] = js.undefined
  // 模板文件地址，可以不填
  var data_path: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[`0` | `1`] = js.undefined
  var format_wf: js.UndefOr[String] = js.undefined
  var intLevel: js.UndefOr[`16`] = js.undefined
  // 用户只需要填写log_path配置
  var log_path: js.UndefOr[String] = js.undefined
  var use_sub_dir: js.UndefOr[`0` | `1`] = js.undefined
}

object LogConfig {
  @scala.inline
  def apply(
    IS_ODP: js.UndefOr[Boolean] = js.undefined,
    IS_OMP: `0` | `1` = null,
    LogIdName: String = null,
    access: String = null,
    access_error_log_path: String = null,
    access_log_path: String = null,
    auto_rotate: `0` | `1` = null,
    data_path: String = null,
    debug: `0` | `1` = null,
    format_wf: String = null,
    intLevel: `16` = null,
    log_path: String = null,
    use_sub_dir: `0` | `1` = null
  ): LogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IS_ODP)) __obj.updateDynamic("IS_ODP")(IS_ODP.asInstanceOf[js.Any])
    if (IS_OMP != null) __obj.updateDynamic("IS_OMP")(IS_OMP.asInstanceOf[js.Any])
    if (LogIdName != null) __obj.updateDynamic("LogIdName")(LogIdName.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (access_error_log_path != null) __obj.updateDynamic("access_error_log_path")(access_error_log_path.asInstanceOf[js.Any])
    if (access_log_path != null) __obj.updateDynamic("access_log_path")(access_log_path.asInstanceOf[js.Any])
    if (auto_rotate != null) __obj.updateDynamic("auto_rotate")(auto_rotate.asInstanceOf[js.Any])
    if (data_path != null) __obj.updateDynamic("data_path")(data_path.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (format_wf != null) __obj.updateDynamic("format_wf")(format_wf.asInstanceOf[js.Any])
    if (intLevel != null) __obj.updateDynamic("intLevel")(intLevel.asInstanceOf[js.Any])
    if (log_path != null) __obj.updateDynamic("log_path")(log_path.asInstanceOf[js.Any])
    if (use_sub_dir != null) __obj.updateDynamic("use_sub_dir")(use_sub_dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
}

