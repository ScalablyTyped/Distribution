package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapper extends js.Object {
  var allSourceMappings: js.Any
  var currentMappings: js.Array[js.Array[SourceMapping]]
  var currentNameIndex: js.Array[Double]
  var jsFile: js.Any
  var jsFileName: js.Any
  var mappingLevel: js.Any
  var names: js.Array[String]
  var sourceMapDirectory: js.Any
  var sourceMapEntries: js.Any
  var sourceMapOut: js.Any
  var sourceMapPath: js.Any
  var sourceRoot: js.Any
  var tsFilePaths: js.Any
  def decreaseMappingLevel(ast: IASTSpan): Unit
  def emitSourceMapping(): Unit
  def getOutputFile(): OutputFile
  def increaseMappingLevel(ast: IASTSpan): Unit
  def setNewSourceFile(document: Document, emitOptions: EmitOptions): Unit
  /* private */ def setNewSourceFilePath(document: js.Any, emitOptions: js.Any): js.Any
  /* private */ def setSourceMapOptions(document: js.Any, jsFilePath: js.Any, emitOptions: js.Any, resolvePath: js.Any): js.Any
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
}

