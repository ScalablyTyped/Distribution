package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTypeNode extends NodeWithTypeArguments {
  var argument: TypeNode = js.native
  var isTypeOf: js.UndefOr[scala.Boolean] = js.native
  @JSName("kind")
  var kind_ImportTypeNode: typescriptLib.typescriptMod.SyntaxKind.ImportType = js.native
  var qualifier: js.UndefOr[EntityName] = js.native
}

