package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReferenceResolver")
@js.native
class ReferenceResolver protected () extends js.Object {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
  var host: js.Any = js.native
  var inputFileNames: js.Any = js.native
  var useCaseSensitiveFileResolution: js.Any = js.native
  var visited: js.Any = js.native
  /* private */ def getNormalizedFilePath(path: js.Any, parentFilePath: js.Any): js.Any = js.native
  /* private */ def getUniqueFileId(filePath: js.Any): js.Any = js.native
  /* private */ def isSameFile(filePath1: js.Any, filePath2: js.Any): js.Any = js.native
  /* private */ def isVisited(filePath: js.Any): js.Any = js.native
  /* private */ def recordVisitedFile(filePath: js.Any): js.Any = js.native
  /* private */ def resolveFile(normalizedPath: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* private */ def resolveImportedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* private */ def resolveIncludedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  def resolveInputFiles(): ReferenceResolutionResult = js.native
}

/* static members */
@JSGlobal("TypeScript.ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): ReferenceResolutionResult = js.native
}

