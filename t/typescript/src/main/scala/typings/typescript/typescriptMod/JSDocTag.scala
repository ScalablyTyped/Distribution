package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDocTag extends Node {
  var comment: js.UndefOr[String] = js.native
  @JSName("parent")
  var parent_JSDocTag: JSDoc | JSDocTypeLiteral = js.native
  var tagName: Identifier = js.native
}

