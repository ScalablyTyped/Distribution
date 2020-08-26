package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellExecutionOptions extends js.Object {
  /**
    * The current working directory of the executed shell.
    * If omitted the tools current workspace root is used.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * The additional environment of the executed shell. If omitted
    * the parent process' environment is used. If provided it is merged with
    * the parent process' environment.
    */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The shell executable.
    */
  var executable: js.UndefOr[String] = js.native
  /**
    * The arguments to be passed to the shell executable used to run the task. Most shells
    * require special arguments to execute a command. For  example `bash` requires the `-c`
    * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
    * `/d` and `/c`.
    */
  var shellArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The shell quotes supported by this shell.
    */
  var shellQuoting: js.UndefOr[ShellQuotingOptions] = js.native
}

object ShellExecutionOptions {
  @scala.inline
  def apply(): ShellExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellExecutionOptions]
  }
  @scala.inline
  implicit class ShellExecutionOptionsOps[Self <: ShellExecutionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setExecutable(value: String): Self = this.set("executable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutable: Self = this.set("executable", js.undefined)
    @scala.inline
    def setShellArgsVarargs(value: String*): Self = this.set("shellArgs", js.Array(value :_*))
    @scala.inline
    def setShellArgs(value: js.Array[String]): Self = this.set("shellArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellArgs: Self = this.set("shellArgs", js.undefined)
    @scala.inline
    def setShellQuoting(value: ShellQuotingOptions): Self = this.set("shellQuoting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellQuoting: Self = this.set("shellQuoting", js.undefined)
  }
  
}

