package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceResolutionResult extends js.Object {
  var diagnostics: js.Array[Diagnostic]
  var resolvedFiles: js.Array[IResolvedFile]
  var seenNoDefaultLibTag: Boolean
}

object ReferenceResolutionResult {
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    resolvedFiles: js.Array[IResolvedFile],
    seenNoDefaultLibTag: Boolean
  ): ReferenceResolutionResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], resolvedFiles = resolvedFiles.asInstanceOf[js.Any], seenNoDefaultLibTag = seenNoDefaultLibTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolutionResult]
  }
}

