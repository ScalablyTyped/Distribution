package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  var declarationList: VariableDeclarationList = js.native
  @JSName("kind")
  var kind_VariableStatement: typescriptLib.typescriptMod.SyntaxKind.VariableStatement = js.native
}

