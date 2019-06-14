package typings
package typedocLib.distLibCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typedocLib.typedocLibNumbers.`1`
  - typedocLib.typedocLibNumbers.`2`
  - typedocLib.typedocLibNumbers.`3`
  - typedocLib.typedocLibNumbers.`4`
  - typedocLib.typedocLibNumbers.`5`
*/
trait ExitCode extends js.Object

object ExitCode {
  @scala.inline
  def CompileError: typedocLib.typedocLibNumbers.`4` = this.cast(4)
  @scala.inline
  def NoInputFiles: typedocLib.typedocLibNumbers.`2` = this.cast(2)
  @scala.inline
  def NoOutput: typedocLib.typedocLibNumbers.`3` = this.cast(3)
  @scala.inline
  def OptionError: typedocLib.typedocLibNumbers.`1` = this.cast(1)
  @scala.inline
  def OutputError: typedocLib.typedocLibNumbers.`5` = this.cast(5)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

