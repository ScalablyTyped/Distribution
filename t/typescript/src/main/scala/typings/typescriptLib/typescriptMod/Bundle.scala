package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle extends Node {
  @JSName("kind")
  var kind_Bundle: typescriptLib.typescriptMod.SyntaxKind.Bundle = js.native
  var prepends: js.Array[InputFiles | UnparsedSource] = js.native
  var sourceFiles: js.Array[SourceFile] = js.native
}

