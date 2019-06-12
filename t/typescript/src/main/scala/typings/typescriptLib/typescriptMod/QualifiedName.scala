package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedName
  extends EntityName
     with Node {
  @JSName("kind")
  var kind_QualifiedName: typescriptLib.typescriptMod.SyntaxKind.QualifiedName = js.native
  var left: EntityName = js.native
  var right: Identifier = js.native
}

