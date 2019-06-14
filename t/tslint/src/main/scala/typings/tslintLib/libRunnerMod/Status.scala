package typings
package tslintLib.libRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - tslintLib.tslintLibNumbers.`0`
  - tslintLib.tslintLibNumbers.`1`
  - tslintLib.tslintLibNumbers.`2`
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def FatalError: tslintLib.tslintLibNumbers.`1` = this.cast(1)
  @scala.inline
  def LintError: tslintLib.tslintLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Ok: tslintLib.tslintLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

