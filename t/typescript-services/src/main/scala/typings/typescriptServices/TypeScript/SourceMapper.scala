package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapper extends StObject {
  
  /* private */ var allSourceMappings: Any
  
  var currentMappings: js.Array[js.Array[SourceMapping]]
  
  var currentNameIndex: js.Array[Double]
  
  def decreaseMappingLevel(ast: IASTSpan): Unit
  
  def emitSourceMapping(): Unit
  
  def getOutputFile(): OutputFile
  
  def increaseMappingLevel(ast: IASTSpan): Unit
  
  /* private */ var jsFile: Any
  
  /* private */ var jsFileName: Any
  
  /* private */ var mappingLevel: Any
  
  var names: js.Array[String]
  
  def setNewSourceFile(document: Document, emitOptions: EmitOptions): Unit
  
  /* private */ def setNewSourceFilePath(document: Any, emitOptions: Any): Any
  
  /* private */ def setSourceMapOptions(document: Any, jsFilePath: Any, emitOptions: Any, resolvePath: Any): Any
  
  /* private */ var sourceMapDirectory: Any
  
  /* private */ var sourceMapEntries: Any
  
  /* private */ var sourceMapOut: Any
  
  /* private */ var sourceMapPath: Any
  
  /* private */ var sourceRoot: Any
  
  /* private */ var tsFilePaths: Any
}
object SourceMapper {
  
  inline def apply(
    allSourceMappings: Any,
    currentMappings: js.Array[js.Array[SourceMapping]],
    currentNameIndex: js.Array[Double],
    decreaseMappingLevel: IASTSpan => Unit,
    emitSourceMapping: () => Unit,
    getOutputFile: () => OutputFile,
    increaseMappingLevel: IASTSpan => Unit,
    jsFile: Any,
    jsFileName: Any,
    mappingLevel: Any,
    names: js.Array[String],
    setNewSourceFile: (Document, EmitOptions) => Unit,
    setNewSourceFilePath: (Any, Any) => Any,
    setSourceMapOptions: (Any, Any, Any, Any) => Any,
    sourceMapDirectory: Any,
    sourceMapEntries: Any,
    sourceMapOut: Any,
    sourceMapPath: Any,
    sourceRoot: Any,
    tsFilePaths: Any
  ): SourceMapper = {
    val __obj = js.Dynamic.literal(allSourceMappings = allSourceMappings.asInstanceOf[js.Any], currentMappings = currentMappings.asInstanceOf[js.Any], currentNameIndex = currentNameIndex.asInstanceOf[js.Any], decreaseMappingLevel = js.Any.fromFunction1(decreaseMappingLevel), emitSourceMapping = js.Any.fromFunction0(emitSourceMapping), getOutputFile = js.Any.fromFunction0(getOutputFile), increaseMappingLevel = js.Any.fromFunction1(increaseMappingLevel), jsFile = jsFile.asInstanceOf[js.Any], jsFileName = jsFileName.asInstanceOf[js.Any], mappingLevel = mappingLevel.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], setNewSourceFile = js.Any.fromFunction2(setNewSourceFile), setNewSourceFilePath = js.Any.fromFunction2(setNewSourceFilePath), setSourceMapOptions = js.Any.fromFunction4(setSourceMapOptions), sourceMapDirectory = sourceMapDirectory.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], sourceMapOut = sourceMapOut.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], tsFilePaths = tsFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceMapper] (val x: Self) extends AnyVal {
    
    inline def setAllSourceMappings(value: Any): Self = StObject.set(x, "allSourceMappings", value.asInstanceOf[js.Any])
    
    inline def setCurrentMappings(value: js.Array[js.Array[SourceMapping]]): Self = StObject.set(x, "currentMappings", value.asInstanceOf[js.Any])
    
    inline def setCurrentMappingsVarargs(value: js.Array[SourceMapping]*): Self = StObject.set(x, "currentMappings", js.Array(value*))
    
    inline def setCurrentNameIndex(value: js.Array[Double]): Self = StObject.set(x, "currentNameIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentNameIndexVarargs(value: Double*): Self = StObject.set(x, "currentNameIndex", js.Array(value*))
    
    inline def setDecreaseMappingLevel(value: IASTSpan => Unit): Self = StObject.set(x, "decreaseMappingLevel", js.Any.fromFunction1(value))
    
    inline def setEmitSourceMapping(value: () => Unit): Self = StObject.set(x, "emitSourceMapping", js.Any.fromFunction0(value))
    
    inline def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    inline def setIncreaseMappingLevel(value: IASTSpan => Unit): Self = StObject.set(x, "increaseMappingLevel", js.Any.fromFunction1(value))
    
    inline def setJsFile(value: Any): Self = StObject.set(x, "jsFile", value.asInstanceOf[js.Any])
    
    inline def setJsFileName(value: Any): Self = StObject.set(x, "jsFileName", value.asInstanceOf[js.Any])
    
    inline def setMappingLevel(value: Any): Self = StObject.set(x, "mappingLevel", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSetNewSourceFile(value: (Document, EmitOptions) => Unit): Self = StObject.set(x, "setNewSourceFile", js.Any.fromFunction2(value))
    
    inline def setSetNewSourceFilePath(value: (Any, Any) => Any): Self = StObject.set(x, "setNewSourceFilePath", js.Any.fromFunction2(value))
    
    inline def setSetSourceMapOptions(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "setSourceMapOptions", js.Any.fromFunction4(value))
    
    inline def setSourceMapDirectory(value: Any): Self = StObject.set(x, "sourceMapDirectory", value.asInstanceOf[js.Any])
    
    inline def setSourceMapEntries(value: Any): Self = StObject.set(x, "sourceMapEntries", value.asInstanceOf[js.Any])
    
    inline def setSourceMapOut(value: Any): Self = StObject.set(x, "sourceMapOut", value.asInstanceOf[js.Any])
    
    inline def setSourceMapPath(value: Any): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
    
    inline def setSourceRoot(value: Any): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setTsFilePaths(value: Any): Self = StObject.set(x, "tsFilePaths", value.asInstanceOf[js.Any])
  }
}
