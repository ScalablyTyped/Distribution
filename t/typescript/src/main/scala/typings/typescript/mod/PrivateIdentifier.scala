package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIdentifier
  extends Node
     with DeclarationName
     with PropertyName {
  var escapedText: String = js.native
  @JSName("kind")
  var kind_PrivateIdentifier: typings.typescript.mod.SyntaxKind.PrivateIdentifier = js.native
  val text: java.lang.String = js.native
}

