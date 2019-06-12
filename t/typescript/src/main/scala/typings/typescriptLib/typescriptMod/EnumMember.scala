package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumMember
  extends NamedDeclaration
     with JSDocContainer
     with HasExpressionInitializer
     with VariableLikeDeclaration
     with _HasJSDoc {
  var initializer: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_EnumMember: typescriptLib.typescriptMod.SyntaxKind.EnumMember = js.native
  @JSName("name")
  var name_EnumMember: PropertyName = js.native
  @JSName("parent")
  var parent_EnumMember: EnumDeclaration = js.native
}

