package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.AnonDefaultValue
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
  		 * a workspace-specific value and a folder-specific value.
  		 *
  		 * The *effective* value (returned by [`get`](#WorkspaceConfiguration.get))
  		 * is computed like this: `defaultValue` overridden by `globalValue`,
  		 * `globalValue` overridden by `workspaceValue`. `workspaceValue` overwridden by `workspaceFolderValue`.
  		 * Refer to [Settings](https://code.visualstudio.com/docs/getstarted/settings)
  		 * for more information.
  		 *
  		 * *Note:* The configuration name must denote a leaf in the configuration tree
  		 * (`editor.fontSize` vs `editor`) otherwise no result is returned.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @return Information about a configuration setting or `undefined`.
  		 */
  def inspect[T](section: String): js.UndefOr[AnonDefaultValue[T]] = js.native
  /**
  		 * Update a configuration value. The updated configuration values are persisted.
  		 *
  		 * A value can be changed in
  		 *
  		 * - [Global configuration](#ConfigurationTarget.Global): Changes the value for all instances of the editor.
  		 * - [Workspace configuration](#ConfigurationTarget.Workspace): Changes the value for current workspace, if available.
  		 * - [Workspace folder configuration](#ConfigurationTarget.WorkspaceFolder): Changes the value for the
  		 * [Workspace folder](#workspace.workspaceFolders) to which the current [configuration](#WorkspaceConfiguration) is scoped to.
  		 *
  		 * *Note 1:* Setting a global value in the presence of a more specific workspace value
  		 * has no observable effect in that workspace, but in others. Setting a workspace value
  		 * in the presence of a more specific folder value has no observable effect for the resources
  		 * under respective [folder](#workspace.workspaceFolders), but in others. Refer to
  		 * [Settings Inheritance](https://code.visualstudio.com/docs/getstarted/settings) for more information.
  		 *
  		 * *Note 2:* To remove a configuration value use `undefined`, like so: `config.update('somekey', undefined)`
  		 *
  		 * Will throw error when
  		 * - Writing a configuration which is not registered.
  		 * - Writing a configuration to workspace or folder target when no workspace is opened
  		 * - Writing a configuration to folder target when there is no folder settings
  		 * - Writing to folder target without passing a resource when getting the configuration (`workspace.getConfiguration(section, resource)`)
  		 * - Writing a window configuration to folder target
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @param value The new value.
  		 * @param configurationTarget The [configuration target](#ConfigurationTarget) or a boolean value.
  		 *	- If `true` configuration target is `ConfigurationTarget.Global`.
  		 *	- If `false` configuration target is `ConfigurationTarget.Workspace`.
  		 *	- If `undefined` or `null` configuration target is
  		 *	`ConfigurationTarget.WorkspaceFolder` when configuration is resource specific
  		 *	`ConfigurationTarget.Workspace` otherwise.
  		 */
  def update(section: String, value: js.Any): Thenable[Unit] = js.native
  def update(section: String, value: js.Any, configurationTarget: Boolean): Thenable[Unit] = js.native
  def update(section: String, value: js.Any, configurationTarget: ConfigurationTarget): Thenable[Unit] = js.native
}

