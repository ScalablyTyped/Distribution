package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTypeLiteral extends JSDocType {
  /** If true, then this type literal represents an *array* of its type. */
  var isArrayType: js.UndefOr[Boolean] = js.native
  var jsDocPropertyTags: js.UndefOr[js.Array[JSDocPropertyLikeTag]] = js.native
  @JSName("kind")
  var kind_JSDocTypeLiteral: typings.typescript.mod.SyntaxKind.JSDocTypeLiteral = js.native
}

