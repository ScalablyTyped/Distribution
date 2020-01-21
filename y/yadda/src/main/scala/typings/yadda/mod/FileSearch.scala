package typings.yadda.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "FileSearch")
@js.native
class FileSearch protected ()
  extends typings.yadda.libMod.FileSearch {
  def this(directories: String) = this()
  def this(directories: String, patterns: RegExp) = this()
}

