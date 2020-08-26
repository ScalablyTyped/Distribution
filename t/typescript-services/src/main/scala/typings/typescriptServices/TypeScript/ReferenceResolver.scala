package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceResolver extends js.Object {
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

object ReferenceResolver {
  @scala.inline
  def apply(
    getNormalizedFilePath: (js.Any, js.Any) => js.Any,
    getUniqueFileId: js.Any => js.Any,
    host: js.Any,
    inputFileNames: js.Any,
    isSameFile: (js.Any, js.Any) => js.Any,
    isVisited: js.Any => js.Any,
    recordVisitedFile: js.Any => js.Any,
    resolveFile: (js.Any, js.Any) => js.Any,
    resolveImportedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveIncludedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveInputFiles: () => ReferenceResolutionResult,
    useCaseSensitiveFileResolution: js.Any,
    visited: js.Any
  ): ReferenceResolver = {
    val __obj = js.Dynamic.literal(getNormalizedFilePath = js.Any.fromFunction2(getNormalizedFilePath), getUniqueFileId = js.Any.fromFunction1(getUniqueFileId), host = host.asInstanceOf[js.Any], inputFileNames = inputFileNames.asInstanceOf[js.Any], isSameFile = js.Any.fromFunction2(isSameFile), isVisited = js.Any.fromFunction1(isVisited), recordVisitedFile = js.Any.fromFunction1(recordVisitedFile), resolveFile = js.Any.fromFunction2(resolveFile), resolveImportedFile = js.Any.fromFunction3(resolveImportedFile), resolveIncludedFile = js.Any.fromFunction3(resolveIncludedFile), resolveInputFiles = js.Any.fromFunction0(resolveInputFiles), useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolver]
  }
  @scala.inline
  implicit class ReferenceResolverOps[Self <: ReferenceResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNormalizedFilePath(value: (js.Any, js.Any) => js.Any): Self = this.set("getNormalizedFilePath", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUniqueFileId(value: js.Any => js.Any): Self = this.set("getUniqueFileId", js.Any.fromFunction1(value))
    @scala.inline
    def setHost(value: js.Any): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFileNames(value: js.Any): Self = this.set("inputFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSameFile(value: (js.Any, js.Any) => js.Any): Self = this.set("isSameFile", js.Any.fromFunction2(value))
    @scala.inline
    def setIsVisited(value: js.Any => js.Any): Self = this.set("isVisited", js.Any.fromFunction1(value))
    @scala.inline
    def setRecordVisitedFile(value: js.Any => js.Any): Self = this.set("recordVisitedFile", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveFile(value: (js.Any, js.Any) => js.Any): Self = this.set("resolveFile", js.Any.fromFunction2(value))
    @scala.inline
    def setResolveImportedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("resolveImportedFile", js.Any.fromFunction3(value))
    @scala.inline
    def setResolveIncludedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("resolveIncludedFile", js.Any.fromFunction3(value))
    @scala.inline
    def setResolveInputFiles(value: () => ReferenceResolutionResult): Self = this.set("resolveInputFiles", js.Any.fromFunction0(value))
    @scala.inline
    def setUseCaseSensitiveFileResolution(value: js.Any): Self = this.set("useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisited(value: js.Any): Self = this.set("visited", value.asInstanceOf[js.Any])
  }
  
}

