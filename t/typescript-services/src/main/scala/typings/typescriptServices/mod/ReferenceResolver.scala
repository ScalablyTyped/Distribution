package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IReferenceResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ReferenceResolver")
@js.native
class ReferenceResolver protected ()
  extends typings.typescriptServices.TypeScript.ReferenceResolver {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
  /* CompleteClass */
  override var host: js.Any = js.native
  /* CompleteClass */
  override var inputFileNames: js.Any = js.native
  /* CompleteClass */
  override var useCaseSensitiveFileResolution: js.Any = js.native
  /* CompleteClass */
  override var visited: js.Any = js.native
  /* CompleteClass */
  /* private */ override def getNormalizedFilePath(path: js.Any, parentFilePath: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getUniqueFileId(filePath: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isSameFile(filePath1: js.Any, filePath2: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isVisited(filePath: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def recordVisitedFile(filePath: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def resolveFile(normalizedPath: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def resolveImportedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def resolveIncludedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* CompleteClass */
  override def resolveInputFiles(): typings.typescriptServices.TypeScript.ReferenceResolutionResult = js.native
}

/* static members */
@JSImport("typescript-services", "ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typings.typescriptServices.TypeScript.ReferenceResolutionResult = js.native
}

