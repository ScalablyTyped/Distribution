package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellExecutionOptions extends js.Object {
  /**
  		 * The current working directory of the executed shell.
  		 * If omitted the tools current workspace root is used.
  		 */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The additional environment of the executed shell. If omitted
  		 * the parent process' environment is used. If provided it is merged with
  		 * the parent process' environment.
  		 */
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * The shell executable.
  		 */
  var executable: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The arguments to be passed to the shell executable used to run the task. Most shells
  		 * require special arguments to execute a command. For  example `bash` requires the `-c`
  		 * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
  		 * `/d` and `/c`.
  		 */
  var shellArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * The shell quotes supported by this shell.
  		 */
  var shellQuoting: js.UndefOr[ShellQuotingOptions] = js.undefined
}

object ShellExecutionOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    executable: java.lang.String = null,
    shellArgs: js.Array[java.lang.String] = null,
    shellQuoting: ShellQuotingOptions = null
  ): ShellExecutionOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (executable != null) __obj.updateDynamic("executable")(executable)
    if (shellArgs != null) __obj.updateDynamic("shellArgs")(shellArgs)
    if (shellQuoting != null) __obj.updateDynamic("shellQuoting")(shellQuoting)
    __obj.asInstanceOf[ShellExecutionOptions]
  }
}

