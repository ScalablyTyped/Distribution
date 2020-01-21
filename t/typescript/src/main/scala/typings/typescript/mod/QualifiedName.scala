package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedName
  extends EntityName
     with Node {
  @JSName("kind")
  var kind_QualifiedName: typings.typescript.mod.SyntaxKind.QualifiedName = js.native
  var left: EntityName = js.native
  var right: Identifier = js.native
}

