package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "isToken")
@js.native
object isToken extends js.Object {
  /**
    * True if node is of some token syntax kind.
    * For example, this is true for an IfKeyword but not for an IfStatement.
    * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
    */
  def apply(n: Node): Boolean = js.native
}

