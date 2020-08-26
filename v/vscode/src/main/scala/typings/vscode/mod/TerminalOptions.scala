package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalOptions extends js.Object {
  /**
    * A path or Uri for the current working directory to be used for the terminal.
    */
  var cwd: js.UndefOr[String | Uri] = js.native
  /**
    * Object with environment variables that will be added to the VS Code process.
    */
  var env: js.UndefOr[StringDictionary[String | Null]] = js.native
  /**
    * When enabled the terminal will run the process as normal but not be surfaced to the user
    * until `Terminal.show` is called. The typical usage for this is when you need to run
    * something that may need interactivity but only want to tell the user about it when
    * interaction is needed. Note that the terminals will still be exposed to all extensions
    * as normal.
    */
  var hideFromUser: js.UndefOr[Boolean] = js.native
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Args for the custom shell executable. A string can be used on Windows only which allows
    * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
    */
  var shellArgs: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * A path to a custom shell executable to be used in the terminal.
    */
  var shellPath: js.UndefOr[String] = js.native
  /**
    * Whether the terminal process environment should be exactly as provided in
    * `TerminalOptions.env`. When this is false (default), the environment will be based on the
    * window's environment and also apply configured platform settings like
    * `terminal.integrated.windows.env` on top. When this is true, the complete environment
    * must be provided as nothing will be inherited from the process or any configuration.
    */
  var strictEnv: js.UndefOr[Boolean] = js.native
}

object TerminalOptions {
  @scala.inline
  def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  @scala.inline
  implicit class TerminalOptionsOps[Self <: TerminalOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String | Uri): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[String | Null]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setHideFromUser(value: Boolean): Self = this.set("hideFromUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFromUser: Self = this.set("hideFromUser", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShellArgsVarargs(value: String*): Self = this.set("shellArgs", js.Array(value :_*))
    @scala.inline
    def setShellArgs(value: js.Array[String] | String): Self = this.set("shellArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellArgs: Self = this.set("shellArgs", js.undefined)
    @scala.inline
    def setShellPath(value: String): Self = this.set("shellPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellPath: Self = this.set("shellPath", js.undefined)
    @scala.inline
    def setStrictEnv(value: Boolean): Self = this.set("strictEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictEnv: Self = this.set("strictEnv", js.undefined)
  }
  
}

