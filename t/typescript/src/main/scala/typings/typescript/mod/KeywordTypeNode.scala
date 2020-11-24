package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordTypeNode[TKind /* <: KeywordTypeSyntaxKind */]
  extends Token[TKind]
     with TypeNode
