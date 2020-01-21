package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparsedPrepend
  extends UnparsedSection
     with UnparsedSourceText {
  @JSName("data")
  var data_UnparsedPrepend: java.lang.String = js.native
  @JSName("kind")
  var kind_UnparsedPrepend: typings.typescript.mod.SyntaxKind.UnparsedPrepend = js.native
  var texts: js.Array[UnparsedTextLike] = js.native
}

