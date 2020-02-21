package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultLanguageValue[T] extends js.Object {
  var defaultLanguageValue: js.UndefOr[T] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var globalLanguageValue: js.UndefOr[T] = js.undefined
  var globalValue: js.UndefOr[T] = js.undefined
  var key: String
  var languageIds: js.UndefOr[js.Array[String]] = js.undefined
  var workspaceFolderLanguageValue: js.UndefOr[T] = js.undefined
  var workspaceFolderValue: js.UndefOr[T] = js.undefined
  var workspaceLanguageValue: js.UndefOr[T] = js.undefined
  var workspaceValue: js.UndefOr[T] = js.undefined
}

object AnonDefaultLanguageValue {
  @scala.inline
  def apply[T](
    key: String,
    defaultLanguageValue: T = null,
    defaultValue: T = null,
    globalLanguageValue: T = null,
    globalValue: T = null,
    languageIds: js.Array[String] = null,
    workspaceFolderLanguageValue: T = null,
    workspaceFolderValue: T = null,
    workspaceLanguageValue: T = null,
    workspaceValue: T = null
  ): AnonDefaultLanguageValue[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (defaultLanguageValue != null) __obj.updateDynamic("defaultLanguageValue")(defaultLanguageValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (globalLanguageValue != null) __obj.updateDynamic("globalLanguageValue")(globalLanguageValue.asInstanceOf[js.Any])
    if (globalValue != null) __obj.updateDynamic("globalValue")(globalValue.asInstanceOf[js.Any])
    if (languageIds != null) __obj.updateDynamic("languageIds")(languageIds.asInstanceOf[js.Any])
    if (workspaceFolderLanguageValue != null) __obj.updateDynamic("workspaceFolderLanguageValue")(workspaceFolderLanguageValue.asInstanceOf[js.Any])
    if (workspaceFolderValue != null) __obj.updateDynamic("workspaceFolderValue")(workspaceFolderValue.asInstanceOf[js.Any])
    if (workspaceLanguageValue != null) __obj.updateDynamic("workspaceLanguageValue")(workspaceLanguageValue.asInstanceOf[js.Any])
    if (workspaceValue != null) __obj.updateDynamic("workspaceValue")(workspaceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultLanguageValue[T]]
  }
}

