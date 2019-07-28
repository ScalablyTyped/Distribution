package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.UnparsedInternalText
import typings.typescript.typescriptMod.SyntaxKind.UnparsedText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparsedTextLike
  extends UnparsedSection
     with UnparsedSourceText {
  @JSName("kind")
  var kind_UnparsedTextLike: UnparsedText | UnparsedInternalText = js.native
}

