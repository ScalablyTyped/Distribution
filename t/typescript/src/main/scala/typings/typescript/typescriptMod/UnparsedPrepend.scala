package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparsedPrepend
  extends UnparsedSection
     with UnparsedSourceText {
  @JSName("data")
  var data_UnparsedPrepend: String = js.native
  @JSName("kind")
  var kind_UnparsedPrepend: typings.typescript.typescriptMod.SyntaxKind.UnparsedPrepend = js.native
  var texts: js.Array[UnparsedTextLike] = js.native
}

