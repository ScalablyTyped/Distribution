package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.NotEmittedStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createNotEmittedStatement")
@js.native
object createNotEmittedStatement extends js.Object {
  /**
    * Creates a synthetic statement to act as a placeholder for a not-emitted statement in
    * order to preserve comments.
    *
    * @param original The original statement.
    */
  def apply(original: Node): NotEmittedStatement = js.native
}

