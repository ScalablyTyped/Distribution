package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IASTSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SourceMapper")
@js.native
class SourceMapper protected ()
  extends typings.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typings.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typings.typescriptServices.TypeScript.TextWriter,
    document: typings.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  /* CompleteClass */
  override var allSourceMappings: js.Any = js.native
  /* CompleteClass */
  override var currentMappings: js.Array[js.Array[typings.typescriptServices.TypeScript.SourceMapping]] = js.native
  /* CompleteClass */
  override var currentNameIndex: js.Array[Double] = js.native
  /* CompleteClass */
  override var jsFile: js.Any = js.native
  /* CompleteClass */
  override var jsFileName: js.Any = js.native
  /* CompleteClass */
  override var mappingLevel: js.Any = js.native
  /* CompleteClass */
  override var names: js.Array[String] = js.native
  /* CompleteClass */
  override var sourceMapDirectory: js.Any = js.native
  /* CompleteClass */
  override var sourceMapEntries: js.Any = js.native
  /* CompleteClass */
  override var sourceMapOut: js.Any = js.native
  /* CompleteClass */
  override var sourceMapPath: js.Any = js.native
  /* CompleteClass */
  override var sourceRoot: js.Any = js.native
  /* CompleteClass */
  override var tsFilePaths: js.Any = js.native
  /* CompleteClass */
  override def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  /* CompleteClass */
  override def emitSourceMapping(): Unit = js.native
  /* CompleteClass */
  override def getOutputFile(): typings.typescriptServices.TypeScript.OutputFile = js.native
  /* CompleteClass */
  override def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  /* CompleteClass */
  override def setNewSourceFile(
    document: typings.typescriptServices.TypeScript.Document,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions
  ): Unit = js.native
  /* CompleteClass */
  /* private */ override def setNewSourceFilePath(document: js.Any, emitOptions: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def setSourceMapOptions(document: js.Any, jsFilePath: js.Any, emitOptions: js.Any, resolvePath: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

