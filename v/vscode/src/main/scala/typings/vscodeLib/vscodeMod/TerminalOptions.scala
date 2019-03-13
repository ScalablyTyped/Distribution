package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalOptions extends js.Object {
  /**
  		 * A path for the current working directory to be used for the terminal.
  		 */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Object with environment variables that will be added to the VS Code process.
  		 */
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]] = js.undefined
  /**
  		 * A human-readable string which will be used to represent the terminal in the UI.
  		 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Args for the custom shell executable, this does not work on Windows (see #8429)
  		 */
  var shellArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * A path to a custom shell executable to be used in the terminal.
  		 */
  var shellPath: js.UndefOr[java.lang.String] = js.undefined
}

object TerminalOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = null,
    name: java.lang.String = null,
    shellArgs: js.Array[java.lang.String] = null,
    shellPath: java.lang.String = null
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shellArgs != null) __obj.updateDynamic("shellArgs")(shellArgs)
    if (shellPath != null) __obj.updateDynamic("shellPath")(shellPath)
    __obj.asInstanceOf[TerminalOptions]
  }
}

