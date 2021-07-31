package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IReferenceResolverHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ReferenceResolver")
@js.native
class ReferenceResolver protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ReferenceResolver {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
  
  /* CompleteClass */
  /* private */ override def getNormalizedFilePath(path: js.Any, parentFilePath: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getUniqueFileId(filePath: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var host: js.Any = js.native
  
  /* CompleteClass */
  var inputFileNames: js.Any = js.native
  
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
  
  /* CompleteClass */
  var useCaseSensitiveFileResolution: js.Any = js.native
  
  /* CompleteClass */
  var visited: js.Any = js.native
}
object ReferenceResolver {
  
  @JSImport("typescript-services", "ReferenceResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typings.typescriptServices.TypeScript.ReferenceResolutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputFileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], useCaseSensitiveFileResolution.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.ReferenceResolutionResult]
}
