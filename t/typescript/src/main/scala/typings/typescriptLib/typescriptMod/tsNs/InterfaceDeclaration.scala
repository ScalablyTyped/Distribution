package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclaration
  extends DeclarationStatement
     with JSDocContainer {
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  var members: NodeArray[TypeElement] = js.native
  @JSName("name")
  var name_InterfaceDeclaration: Identifier = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

