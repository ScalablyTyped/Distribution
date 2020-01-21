package typings.yargs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yargs.yargsStrings.boolean
  - typings.yargs.yargsStrings.number
  - typings.yargs.yargsStrings.string
*/
trait PositionalOptionsType extends js.Object

object PositionalOptionsType {
  @scala.inline
  def boolean: typings.yargs.yargsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.yargs.yargsStrings.number = this.cast("number")
  @scala.inline
  def string: typings.yargs.yargsStrings.string = this.cast("string")
}

