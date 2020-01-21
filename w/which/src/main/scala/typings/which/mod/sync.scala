package typings.which.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("which", "sync")
@js.native
object sync extends js.Object {
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String): String = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String, options: Options with OptionsFirst with OptionsThrow): String = js.native
}

