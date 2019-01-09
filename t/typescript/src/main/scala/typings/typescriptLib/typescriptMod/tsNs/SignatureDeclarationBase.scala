package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureDeclarationBase
  extends NamedDeclaration
     with JSDocContainer {
  @JSName("kind")
  var kind_SignatureDeclarationBase: js.UndefOr[
    SyntaxKind | (/* import warning: ImportType.apply Failed type conversion: typescript.typescript.ts.SignatureDeclaration['kind'] */ js.Any)
  ] = js.native
  @JSName("name")
  var name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  var parameters: NodeArray[ParameterDeclaration] = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

