package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createFor")
@js.native
object createFor extends js.Object {
  
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: Expression,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: Expression,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: Expression,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  /** @deprecated Use `factory.createFor` or the factory supplied by your transformation context instead. */
  def apply(initializer: Expression, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
  def apply(
    initializer: VariableDeclarationList,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: VariableDeclarationList,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: VariableDeclarationList,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: VariableDeclarationList,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
}
