package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparsedSource extends Node {
  var fileName: String = js.native
  var hasNoDefaultLib: js.UndefOr[Boolean] = js.native
  var helpers: js.UndefOr[js.Array[UnscopedEmitHelper]] = js.native
  @JSName("kind")
  var kind_UnparsedSource: typings.typescript.typescriptMod.SyntaxKind.UnparsedSource = js.native
  var libReferenceDirectives: js.Array[FileReference] = js.native
  var prologues: js.Array[UnparsedPrologue] = js.native
  var referencedFiles: js.Array[FileReference] = js.native
  var sourceMapPath: js.UndefOr[String] = js.native
  var sourceMapText: js.UndefOr[String] = js.native
  var syntheticReferences: js.UndefOr[js.Array[UnparsedSyntheticReference]] = js.native
  var text: String = js.native
  var texts: js.Array[UnparsedSourceText] = js.native
  var typeReferenceDirectives: js.UndefOr[js.Array[String]] = js.native
}

