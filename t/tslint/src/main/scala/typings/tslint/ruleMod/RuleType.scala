package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tslint.tslintStrings.functionality
  - typings.tslint.tslintStrings.maintainability
  - typings.tslint.tslintStrings.style
  - typings.tslint.tslintStrings.typescript
  - typings.tslint.tslintStrings.formatting
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formatting: typings.tslint.tslintStrings.formatting = this.cast("formatting")
  @scala.inline
  def functionality: typings.tslint.tslintStrings.functionality = this.cast("functionality")
  @scala.inline
  def maintainability: typings.tslint.tslintStrings.maintainability = this.cast("maintainability")
  @scala.inline
  def style: typings.tslint.tslintStrings.style = this.cast("style")
  @scala.inline
  def typescript: typings.tslint.tslintStrings.typescript = this.cast("typescript")
}

