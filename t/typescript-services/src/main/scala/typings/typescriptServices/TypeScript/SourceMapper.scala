package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapper extends StObject {
  
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
  implicit class SourceMapperMutableBuilder[Self <: SourceMapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSourceMappings(value: js.Any): Self = StObject.set(x, "allSourceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMappings(value: js.Array[js.Array[SourceMapping]]): Self = StObject.set(x, "currentMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMappingsVarargs(value: js.Array[SourceMapping]*): Self = StObject.set(x, "currentMappings", js.Array(value :_*))
    
    @scala.inline
    def setCurrentNameIndex(value: js.Array[Double]): Self = StObject.set(x, "currentNameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNameIndexVarargs(value: Double*): Self = StObject.set(x, "currentNameIndex", js.Array(value :_*))
    
    @scala.inline
    def setDecreaseMappingLevel(value: IASTSpan => Unit): Self = StObject.set(x, "decreaseMappingLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitSourceMapping(value: () => Unit): Self = StObject.set(x, "emitSourceMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseMappingLevel(value: IASTSpan => Unit): Self = StObject.set(x, "increaseMappingLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJsFile(value: js.Any): Self = StObject.set(x, "jsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsFileName(value: js.Any): Self = StObject.set(x, "jsFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingLevel(value: js.Any): Self = StObject.set(x, "mappingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setSetNewSourceFile(value: (Document, EmitOptions) => Unit): Self = StObject.set(x, "setNewSourceFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNewSourceFilePath(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "setNewSourceFilePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSourceMapOptions(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "setSourceMapOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSourceMapDirectory(value: js.Any): Self = StObject.set(x, "sourceMapDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapEntries(value: js.Any): Self = StObject.set(x, "sourceMapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapOut(value: js.Any): Self = StObject.set(x, "sourceMapOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapPath(value: js.Any): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoot(value: js.Any): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsFilePaths(value: js.Any): Self = StObject.set(x, "tsFilePaths", value.asInstanceOf[js.Any])
  }
}
