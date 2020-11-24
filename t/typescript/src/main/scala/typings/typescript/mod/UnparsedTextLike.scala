package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.UnparsedInternalText
import typings.typescript.mod.SyntaxKind.UnparsedText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedTextLike
  extends UnparsedSection
     with UnparsedSourceText {
  
  @JSName("kind")
  val kind_UnparsedTextLike: UnparsedText | UnparsedInternalText = js.native
}
