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
  val kind_ParenthesizedTypeNode: ParenthesizedType = js.native
  
  val `type`: TypeNode = js.native
}
