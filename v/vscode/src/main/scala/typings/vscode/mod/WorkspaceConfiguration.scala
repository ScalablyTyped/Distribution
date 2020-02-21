package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.AnonDefaultLanguageValue
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceConfiguration
  extends /**
		 * Readable dictionary that backs this configuration.
		 */
/* key */ StringDictionary[js.Any] {
  /**
  		 * Return a value from this configuration.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @return The value `section` denotes or `undefined`.
  		 */
  def get[T](section: String): js.UndefOr[T] = js.native
  /**
  		 * Return a value from this configuration.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @param defaultValue A value should be returned when no value could be found, is `undefined`.
  		 * @return The value `section` denotes or the default.
  		 */
  def get[T](section: String, defaultValue: T): T = js.native
  /**
  		 * Check if this configuration has a certain value.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @return `true` if the section doesn't resolve to `undefined`.
  		 */
  def has(section: String): Boolean = js.native
  /**
  		 * Retrieve all information about a configuration setting. A configuration value
  		 * often consists of a *default* value, a global or installation-wide value,
  		 * a workspace-specific value, folder-specific value
  		 * and language-specific values (if [WorkspaceConfiguration](#WorkspaceConfiguration) is scoped to a language).
  		 *
  		 * Also provides all language ids under which the given configuration setting is defined.
  		 *
  		 * *Note:* The configuration name must denote a leaf in the configuration tree
  		 * (`editor.fontSize` vs `editor`) otherwise no result is returned.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @return Information about a configuration setting or `undefined`.
  		 */
  def inspect[T](section: String): js.UndefOr[AnonDefaultLanguageValue[T]] = js.native
  /**
  		 * Update a configuration value. The updated configuration values are persisted.
  		 *
  		 * A value can be changed in
  		 *
  		 * - [Global settings](#ConfigurationTarget.Global): Changes the value for all instances of the editor.
  		 * - [Workspace settings](#ConfigurationTarget.Workspace): Changes the value for current workspace, if available.
  		 * - [Workspace folder settings](#ConfigurationTarget.WorkspaceFolder): Changes the value for settings from one of the [Workspace Folders](#workspace.workspaceFolders) under which the requested resource belongs to.
  		 * - Language settings: Changes the value for the requested languageId.
  		 *
  		 * *Note:* To remove a configuration value use `undefined`, like so: `config.update('somekey', undefined)`
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @param value The new value.
  		 * @param configurationTarget The [configuration target](#ConfigurationTarget) or a boolean value.
  		 *	- If `true` updates [Global settings](#ConfigurationTarget.Global).
  		 *	- If `false` updates [Workspace settings](#ConfigurationTarget.Workspace).
  		 *	- If `undefined` or `null` updates to [Workspace folder settings](#ConfigurationTarget.WorkspaceFolder) if configuration is resource specific,
  		 * 	otherwise to [Workspace settings](#ConfigurationTarget.Workspace).
  		 * @param overrideInLanguage Whether to update the value in the scope of requested languageId or not.
  		 *	- If `true` updates the value under the requested languageId.
  		 *	- If `undefined` updates the value under the requested languageId only if the configuration is defined for the language.
  		 * @throws error while updating
  		 *	- configuration which is not registered.
  		 *	- window configuration to workspace folder
  		 *	- configuration to workspace or workspace folder when no workspace is opened.
  		 *	- configuration to workspace folder when there is no workspace folder settings.
  		 *	- configuration to workspace folder when [WorkspaceConfiguration](#WorkspaceConfiguration) is not scoped to a resource.
  		 */
  def update(section: String, value: js.Any): Thenable[Unit] = js.native
  def update(section: String, value: js.Any, configurationTarget: Boolean): Thenable[Unit] = js.native
  def update(section: String, value: js.Any, configurationTarget: Boolean, overrideInLanguage: Boolean): Thenable[Unit] = js.native
  def update(section: String, value: js.Any, configurationTarget: ConfigurationTarget): Thenable[Unit] = js.native
  def update(
    section: String,
    value: js.Any,
    configurationTarget: ConfigurationTarget,
    overrideInLanguage: Boolean
  ): Thenable[Unit] = js.native
}

