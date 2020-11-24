package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapper extends js.Object {
  
  var allSourceMappings: js.Any = js.native
  
  var currentMappings: js.Array[js.Array[SourceMapping]] = js.native
  
  var currentNameIndex: js.Array[Double] = js.native
  
  def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  def emitSourceMapping(): Unit = js.native
  
  def getOutputFile(): OutputFile = js.native
  
  def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  var jsFile: js.Any = js.native
  
  var jsFileName: js.Any = js.native
  
  var mappingLevel: js.Any = js.native
  
  var names: js.Array[String] = js.native
  
  def setNewSourceFile(document: Document, emitOptions: EmitOptions): Unit = js.native
  
  /* private */ def setNewSourceFilePath(document: js.Any, emitOptions: js.Any): js.Any = js.native
  
  /* private */ def setSourceMapOptions(document: js.Any, jsFilePath: js.Any, emitOptions: js.Any, resolvePath: js.Any): js.Any = js.native
  
  var sourceMapDirectory: js.Any = js.native
  
  var sourceMapEntries: js.Any = js.native
  
  var sourceMapOut: js.Any = js.native
  
  var sourceMapPath: js.Any = js.native
  
  var sourceRoot: js.Any = js.native
  
  var tsFilePaths: js.Any = js.native
}
object SourceMapper {
  
  @scala.inline
  def apply(
    allSourceMappings: js.Any,
    currentMappings: js.Array[js.Array[SourceMapping]],
    currentNameIndex: js.Array[Double],
    decreaseMappingLevel: IASTSpan => Unit,
    emitSourceMapping: () => Unit,
    getOutputFile: () => OutputFile,
    increaseMappingLevel: IASTSpan => Unit,
    jsFile: js.Any,
    jsFileName: js.Any,
    mappingLevel: js.Any,
    names: js.Array[String],
    setNewSourceFile: (Document, EmitOptions) => Unit,
    setNewSourceFilePath: (js.Any, js.Any) => js.Any,
    setSourceMapOptions: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    sourceMapDirectory: js.Any,
    sourceMapEntries: js.Any,
    sourceMapOut: js.Any,
    sourceMapPath: js.Any,
    sourceRoot: js.Any,
    tsFilePaths: js.Any
  ): SourceMapper = {
    val __obj = js.Dynamic.literal(allSourceMappings = allSourceMappings.asInstanceOf[js.Any], currentMappings = currentMappings.asInstanceOf[js.Any], currentNameIndex = currentNameIndex.asInstanceOf[js.Any], decreaseMappingLevel = js.Any.fromFunction1(decreaseMappingLevel), emitSourceMapping = js.Any.fromFunction0(emitSourceMapping), getOutputFile = js.Any.fromFunction0(getOutputFile), increaseMappingLevel = js.Any.fromFunction1(increaseMappingLevel), jsFile = jsFile.asInstanceOf[js.Any], jsFileName = jsFileName.asInstanceOf[js.Any], mappingLevel = mappingLevel.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], setNewSourceFile = js.Any.fromFunction2(setNewSourceFile), setNewSourceFilePath = js.Any.fromFunction2(setNewSourceFilePath), setSourceMapOptions = js.Any.fromFunction4(setSourceMapOptions), sourceMapDirectory = sourceMapDirectory.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], sourceMapOut = sourceMapOut.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], tsFilePaths = tsFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapper]
  }
  
  @scala.inline
  implicit class SourceMapperOps[Self <: SourceMapper] (val x: Self) extends AnyVal {
    
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
    def setAllSourceMappings(value: js.Any): Self = this.set("allSourceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMappingsVarargs(value: js.Array[SourceMapping]*): Self = this.set("currentMappings", js.Array(value :_*))
    
    @scala.inline
    def setCurrentMappings(value: js.Array[js.Array[SourceMapping]]): Self = this.set("currentMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNameIndexVarargs(value: Double*): Self = this.set("currentNameIndex", js.Array(value :_*))
    
    @scala.inline
    def setCurrentNameIndex(value: js.Array[Double]): Self = this.set("currentNameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseMappingLevel(value: IASTSpan => Unit): Self = this.set("decreaseMappingLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitSourceMapping(value: () => Unit): Self = this.set("emitSourceMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOutputFile(value: () => OutputFile): Self = this.set("getOutputFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseMappingLevel(value: IASTSpan => Unit): Self = this.set("increaseMappingLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJsFile(value: js.Any): Self = this.set("jsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsFileName(value: js.Any): Self = this.set("jsFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingLevel(value: js.Any): Self = this.set("mappingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNewSourceFile(value: (Document, EmitOptions) => Unit): Self = this.set("setNewSourceFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNewSourceFilePath(value: (js.Any, js.Any) => js.Any): Self = this.set("setNewSourceFilePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSourceMapOptions(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("setSourceMapOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSourceMapDirectory(value: js.Any): Self = this.set("sourceMapDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapEntries(value: js.Any): Self = this.set("sourceMapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapOut(value: js.Any): Self = this.set("sourceMapOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapPath(value: js.Any): Self = this.set("sourceMapPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoot(value: js.Any): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsFilePaths(value: js.Any): Self = this.set("tsFilePaths", value.asInstanceOf[js.Any])
  }
}
