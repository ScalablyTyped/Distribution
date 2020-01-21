package typings.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tslint.tslintStrings.human
  - typings.tslint.tslintStrings.machine
*/
trait ConsumerType extends js.Object

object ConsumerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def human: typings.tslint.tslintStrings.human = this.cast("human")
  @scala.inline
  def machine: typings.tslint.tslintStrings.machine = this.cast("machine")
}

