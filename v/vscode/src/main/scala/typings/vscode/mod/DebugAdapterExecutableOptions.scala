package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugAdapterExecutableOptions extends js.Object {
  /**
    * The current working directory for the executed debug adapter.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * The additional environment of the executed program or shell. If omitted
    * the parent process' environment is used. If provided it is merged with
    * the parent process' environment.
    */
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
}

object DebugAdapterExecutableOptions {
  @scala.inline
  def apply(cwd: String = null, env: StringDictionary[String] = null): DebugAdapterExecutableOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugAdapterExecutableOptions]
  }
}

