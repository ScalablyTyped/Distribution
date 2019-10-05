package typings.which.whichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("which", "sync")
@js.native
object sync extends js.Object {
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String): String = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  def apply(cmd: String, options: Options with OptionsAll with OptionsThrow): js.Array[String] = js.native
}

