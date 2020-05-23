package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IResolvedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReferenceResolutionResult")
@js.native
class ReferenceResolutionResult ()
  extends typings.typescriptServices.TypeScript.ReferenceResolutionResult {
  /* CompleteClass */
  override var diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override var resolvedFiles: js.Array[IResolvedFile] = js.native
  /* CompleteClass */
  override var seenNoDefaultLibTag: Boolean = js.native
}

