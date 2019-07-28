package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.ImportKeyword
import typings.typescript.typescriptMod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaProperty extends PrimaryExpression {
  var keywordToken: NewKeyword | ImportKeyword = js.native
  @JSName("kind")
  var kind_MetaProperty: typings.typescript.typescriptMod.SyntaxKind.MetaProperty = js.native
  var name: Identifier = js.native
}

