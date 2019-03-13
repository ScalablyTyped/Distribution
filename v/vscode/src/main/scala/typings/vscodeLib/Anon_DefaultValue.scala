package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue[T] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.undefined
  var globalValue: js.UndefOr[T] = js.undefined
  var key: java.lang.String
  var workspaceFolderValue: js.UndefOr[T] = js.undefined
  var workspaceValue: js.UndefOr[T] = js.undefined
}

object Anon_DefaultValue {
  @scala.inline
  def apply[T](
    key: java.lang.String,
    defaultValue: T = null,
    globalValue: T = null,
    workspaceFolderValue: T = null,
    workspaceValue: T = null
  ): Anon_DefaultValue[T] = {
    val __obj = js.Dynamic.literal(key = key)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (globalValue != null) __obj.updateDynamic("globalValue")(globalValue.asInstanceOf[js.Any])
    if (workspaceFolderValue != null) __obj.updateDynamic("workspaceFolderValue")(workspaceFolderValue.asInstanceOf[js.Any])
    if (workspaceValue != null) __obj.updateDynamic("workspaceValue")(workspaceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValue[T]]
  }
}

