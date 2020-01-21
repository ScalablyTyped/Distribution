package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SourceMapper")
@js.native
class SourceMapper protected () extends js.Object {
  def this(
    jsFile: TextWriter,
    sourceMapOut: TextWriter,
    document: Document,
    jsFilePath: String,
    emitOptions: EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  var allSourceMappings: js.Any = js.native
  var currentMappings: js.Array[js.Array[SourceMapping]] = js.native
  var currentNameIndex: js.Array[Double] = js.native
  var jsFile: js.Any = js.native
  var jsFileName: js.Any = js.native
  var mappingLevel: js.Any = js.native
  var names: js.Array[String] = js.native
  var sourceMapDirectory: js.Any = js.native
  var sourceMapEntries: js.Any = js.native
  var sourceMapOut: js.Any = js.native
  var sourceMapPath: js.Any = js.native
  var sourceRoot: js.Any = js.native
  var tsFilePaths: js.Any = js.native
  def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  def emitSourceMapping(): Unit = js.native
  def getOutputFile(): OutputFile = js.native
  def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  def setNewSourceFile(document: Document, emitOptions: EmitOptions): Unit = js.native
  /* private */ def setNewSourceFilePath(document: js.Any, emitOptions: js.Any): js.Any = js.native
  /* private */ def setSourceMapOptions(document: js.Any, jsFilePath: js.Any, emitOptions: js.Any, resolvePath: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

