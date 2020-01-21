package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalOptions extends js.Object {
  /**
  		 * A path or Uri for the current working directory to be used for the terminal.
  		 */
  var cwd: js.UndefOr[String | Uri] = js.undefined
  /**
  		 * Object with environment variables that will be added to the VS Code process.
  		 */
  var env: js.UndefOr[StringDictionary[String | Null]] = js.undefined
  /**
  		 * When enabled the terminal will run the process as normal but not be surfaced to the user
  		 * until `Terminal.show` is called. The typical usage for this is when you need to run
  		 * something that may need interactivity but only want to tell the user about it when
  		 * interaction is needed. Note that the terminals will still be exposed to all extensions
  		 * as normal.
  		 */
  var hideFromUser: js.UndefOr[Boolean] = js.undefined
  /**
  		 * A human-readable string which will be used to represent the terminal in the UI.
  		 */
  var name: js.UndefOr[String] = js.undefined
  /**
  		 * Args for the custom shell executable. A string can be used on Windows only which allows
  		 * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
  		 */
  var shellArgs: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
  		 * A path to a custom shell executable to be used in the terminal.
  		 */
  var shellPath: js.UndefOr[String] = js.undefined
  /**
  		 * Whether the terminal process environment should be exactly as provided in
  		 * `TerminalOptions.env`. When this is false (default), the environment will be based on the
  		 * window's environment and also apply configured platform settings like
  		 * `terminal.integrated.windows.env` on top. When this is true, the complete environment
  		 * must be provided as nothing will be inherited from the process or any configuration.
  		 */
  var strictEnv: js.UndefOr[Boolean] = js.undefined
}

object TerminalOptions {
  @scala.inline
  def apply(
    cwd: String | Uri = null,
    env: StringDictionary[String | Null] = null,
    hideFromUser: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    shellArgs: js.Array[String] | String = null,
    shellPath: String = null,
    strictEnv: js.UndefOr[Boolean] = js.undefined
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFromUser)) __obj.updateDynamic("hideFromUser")(hideFromUser.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shellArgs != null) __obj.updateDynamic("shellArgs")(shellArgs.asInstanceOf[js.Any])
    if (shellPath != null) __obj.updateDynamic("shellPath")(shellPath.asInstanceOf[js.Any])
    if (!js.isUndefined(strictEnv)) __obj.updateDynamic("strictEnv")(strictEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalOptions]
  }
}

