package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedPrepend
  extends UnparsedSection
     with UnparsedSourceText {
  
  @JSName("data")
  val data_UnparsedPrepend: java.lang.String = js.native
  
  @JSName("kind")
  val kind_UnparsedPrepend: typings.typescript.mod.SyntaxKind.UnparsedPrepend = js.native
  
  val texts: js.Array[UnparsedTextLike] = js.native
}
