package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessExecutionOptions extends js.Object {
  /**
  		 * The current working directory of the executed program or shell.
  		 * If omitted the tools current workspace root is used.
  		 */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The additional environment of the executed program or shell. If omitted
  		 * the parent process' environment is used. If provided it is merged with
  		 * the parent process' environment.
  		 */
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object ProcessExecutionOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ProcessExecutionOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[ProcessExecutionOptions]
  }
}

