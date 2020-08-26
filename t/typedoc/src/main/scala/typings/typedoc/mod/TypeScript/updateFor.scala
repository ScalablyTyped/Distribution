package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ForInitializer
import typings.typescript.mod.ForStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateFor")
@js.native
object updateFor extends js.Object {
  def apply(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
}

