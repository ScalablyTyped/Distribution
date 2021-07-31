package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "EmitOptions")
@js.native
class EmitOptions protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.EmitOptions {
  def this(
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  
  /* CompleteClass */
  var _commonDirectoryPath: js.Any = js.native
  
  /* CompleteClass */
  var _diagnostic: js.Any = js.native
  
  /* CompleteClass */
  var _outputDirectory: js.Any = js.native
  
  /* CompleteClass */
  var _settings: js.Any = js.native
  
  /* CompleteClass */
  var _sharedOutputFile: js.Any = js.native
  
  /* CompleteClass */
  var _sourceMapRootDirectory: js.Any = js.native
  
  /* CompleteClass */
  var _sourceRootDirectory: js.Any = js.native
  
  /* CompleteClass */
  override def commonDirectoryPath(): String = js.native
  
  /* CompleteClass */
  override def compilationSettings(): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  
  /* CompleteClass */
  /* private */ override def determineCommonDirectoryPath(compiler: js.Any): js.Any = js.native
  
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
