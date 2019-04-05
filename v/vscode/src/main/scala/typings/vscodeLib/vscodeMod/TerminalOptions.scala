package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalOptions extends js.Object {
  /**
  		 * A path or Uri for the current working directory to be used for the terminal.
  		 */
  var cwd: js.UndefOr[java.lang.String | Uri] = js.undefined
  /**
  		 * Object with environment variables that will be added to the VS Code process.
  		 */
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]] = js.undefined
  /**
  		 * A human-readable string which will be used to represent the terminal in the UI.
  		 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Args for the custom shell executable. A string can be used on Windows only which allows
  		 * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
  		 */
  var shellArgs: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
  		 * A path to a custom shell executable to be used in the terminal.
  		 */
  var shellPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether the terminal process environment should be exactly as provided in
  		 * `TerminalOptions.env`. When this is false (default), the environment will be based on the
  		 * window's environment and also apply configured platform settings like
  		 * `terminal.integrated.windows.env` on top. When this is true, the complete environment
  		 * must be provided as nothing will be inherited from the process or any configuration.
  		 */
  var strictEnv: js.UndefOr[scala.Boolean] = js.undefined
}

object TerminalOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String | Uri = null,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = null,
    name: java.lang.String = null,
    shellArgs: js.Array[java.lang.String] | java.lang.String = null,
    shellPath: java.lang.String = null,
    strictEnv: js.UndefOr[scala.Boolean] = js.undefined
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shellArgs != null) __obj.updateDynamic("shellArgs")(shellArgs.asInstanceOf[js.Any])
    if (shellPath != null) __obj.updateDynamic("shellPath")(shellPath)
    if (!js.isUndefined(strictEnv)) __obj.updateDynamic("strictEnv")(strictEnv)
    __obj.asInstanceOf[TerminalOptions]
  }
}

