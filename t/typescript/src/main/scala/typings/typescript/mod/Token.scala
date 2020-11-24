package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token[TKind /* <: SyntaxKind */] extends Node {
  
  @JSName("kind")
  val kind_Token: TKind = js.native
}
