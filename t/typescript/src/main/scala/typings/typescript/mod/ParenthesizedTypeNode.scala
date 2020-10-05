package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ParenthesizedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedTypeNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_ParenthesizedTypeNode: ParenthesizedType = js.native
  var `type`: TypeNode = js.native
}

