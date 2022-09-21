package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.EmitOptions")
@js.native
open class EmitOptions protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.EmitOptions {
  def this(
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  
  /* private */ /* CompleteClass */
  var _commonDirectoryPath: Any = js.native
  
  /* private */ /* CompleteClass */
  var _diagnostic: Any = js.native
  
  /* private */ /* CompleteClass */
  var _outputDirectory: Any = js.native
  
  /* private */ /* CompleteClass */
  var _settings: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sharedOutputFile: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceMapRootDirectory: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceRootDirectory: Any = js.native
  
  /* CompleteClass */
  override def commonDirectoryPath(): String = js.native
  
  /* CompleteClass */
  override def compilationSettings(): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  
  /* private */ /* CompleteClass */
  override def determineCommonDirectoryPath(compiler: Any): Any = js.native
  
  /* CompleteClass */
  override def diagnostic(): typings.typescriptServices.TypeScript.Diagnostic = js.native
  
  /* CompleteClass */
  override def outputDirectory(): String = js.native
  
  /* CompleteClass */
  override def resolvePath(path: String): String = js.native
  
  /* CompleteClass */
  override def sharedOutputFile(): String = js.native
  
  /* CompleteClass */
  override def sourceMapRootDirectory(): String = js.native
  
  /* CompleteClass */
  override def sourceRootDirectory(): String = js.native
}
