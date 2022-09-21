package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IReferenceResolverHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ReferenceResolver")
@js.native
open class ReferenceResolver protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ReferenceResolver {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  override def getNormalizedFilePath(path: Any, parentFilePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getUniqueFileId(filePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var host: Any = js.native
  
  /* private */ /* CompleteClass */
  var inputFileNames: Any = js.native
  
  /* private */ /* CompleteClass */
  override def isSameFile(filePath1: Any, filePath2: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isVisited(filePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def recordVisitedFile(filePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def resolveFile(normalizedPath: Any, resolutionResult: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def resolveImportedFile(path: Any, referenceLocation: Any, resolutionResult: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def resolveIncludedFile(path: Any, referenceLocation: Any, resolutionResult: Any): Any = js.native
  
  /* CompleteClass */
  override def resolveInputFiles(): typings.typescriptServices.TypeScript.ReferenceResolutionResult = js.native
  
  /* private */ /* CompleteClass */
  var useCaseSensitiveFileResolution: Any = js.native
  
  /* private */ /* CompleteClass */
  var visited: Any = js.native
}
object ReferenceResolver {
  
  @JSImport("typescript-services", "ReferenceResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typings.typescriptServices.TypeScript.ReferenceResolutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputFileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], useCaseSensitiveFileResolution.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.ReferenceResolutionResult]
}
