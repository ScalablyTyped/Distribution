package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IASTSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SourceMapper")
@js.native
open class SourceMapper protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typings.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typings.typescriptServices.TypeScript.TextWriter,
    document: typings.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  
  /* private */ /* CompleteClass */
  var allSourceMappings: Any = js.native
  
  /* CompleteClass */
  var currentMappings: js.Array[js.Array[typings.typescriptServices.TypeScript.SourceMapping]] = js.native
  
  /* CompleteClass */
  var currentNameIndex: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  /* CompleteClass */
  override def emitSourceMapping(): Unit = js.native
  
  /* CompleteClass */
  override def getOutputFile(): typings.typescriptServices.TypeScript.OutputFile = js.native
  
  /* CompleteClass */
  override def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  /* private */ /* CompleteClass */
  var jsFile: Any = js.native
  
  /* private */ /* CompleteClass */
  var jsFileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var mappingLevel: Any = js.native
  
  /* CompleteClass */
  var names: js.Array[String] = js.native
  
  /* CompleteClass */
  override def setNewSourceFile(
    document: typings.typescriptServices.TypeScript.Document,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def setNewSourceFilePath(document: Any, emitOptions: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def setSourceMapOptions(document: Any, jsFilePath: Any, emitOptions: Any, resolvePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapDirectory: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapEntries: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapOut: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapPath: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceRoot: Any = js.native
  
  /* private */ /* CompleteClass */
  var tsFilePaths: Any = js.native
}
object SourceMapper {
  
  @JSImport("typescript-services", "SourceMapper")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "SourceMapper.MapFileExtension")
  @js.native
  def MapFileExtension: String = js.native
  inline def MapFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MapFileExtension")(x.asInstanceOf[js.Any])
}
