package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token[TKind /* <: SyntaxKind */] extends Node {
  @JSName("kind")
  var kind_Token: TKind = js.native
}

