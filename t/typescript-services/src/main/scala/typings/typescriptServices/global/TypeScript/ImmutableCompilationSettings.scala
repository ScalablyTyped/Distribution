package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: typings.typescriptServices.TypeScript.LanguageVersion,
    moduleGenTarget: typings.typescriptServices.TypeScript.ModuleGenTarget,
    outFileOption: String,
    outDirOption: String,
    mapSourceFiles: Boolean,
    mapRoot: String,
    sourceRoot: String,
    generateDeclarationFiles: Boolean,
    useCaseSensitiveFileResolution: Boolean,
    gatherDiagnostics: Boolean,
    codepage: Double,
    createFileLog: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _codeGenTarget: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _codepage: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _createFileLog: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _gatherDiagnostics: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _generateDeclarationFiles: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _mapRoot: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _mapSourceFiles: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _moduleGenTarget: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _noImplicitAny: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _noLib: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _noResolve: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _outDirOption: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _outFileOption: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _propagateEnumConstants: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _removeComments: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceRoot: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _useCaseSensitiveFileResolution: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _watch: js.Any = js.native
  
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  
  /* CompleteClass */
  override def codeGenTarget(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* CompleteClass */
  override def codepage(): Double = js.native
  
  /* CompleteClass */
  override def createFileLog(): Boolean = js.native
  
  /* CompleteClass */
  override def gatherDiagnostics(): Boolean = js.native
  
  /* CompleteClass */
  override def generateDeclarationFiles(): Boolean = js.native
  
  /* CompleteClass */
  override def mapRoot(): String = js.native
  
  /* CompleteClass */
  override def mapSourceFiles(): Boolean = js.native
  
  /* CompleteClass */
  override def moduleGenTarget(): typings.typescriptServices.TypeScript.ModuleGenTarget = js.native
  
  /* CompleteClass */
  override def noImplicitAny(): Boolean = js.native
  
  /* CompleteClass */
  override def noLib(): Boolean = js.native
  
  /* CompleteClass */
  override def noResolve(): Boolean = js.native
  
  /* CompleteClass */
  override def outDirOption(): String = js.native
  
  /* CompleteClass */
  override def outFileOption(): String = js.native
  
  /* CompleteClass */
  override def propagateEnumConstants(): Boolean = js.native
  
  /* CompleteClass */
  override def removeComments(): Boolean = js.native
  
  /* CompleteClass */
  override def sourceRoot(): String = js.native
  
  /* CompleteClass */
  override def toCompilationSettings(): js.Any = js.native
  
  /* CompleteClass */
  override def useCaseSensitiveFileResolution(): Boolean = js.native
  
  /* CompleteClass */
  override def watch(): Boolean = js.native
}
object ImmutableCompilationSettings {
  
  @JSGlobal("TypeScript.ImmutableCompilationSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ImmutableCompilationSettings._defaultSettings")
  @js.native
  def _defaultSettings: js.Any = js.native
  inline def _defaultSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultSettings(): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSettings")().asInstanceOf[typings.typescriptServices.TypeScript.ImmutableCompilationSettings]
  
  /* static member */
  inline def fromCompilationSettings(settings: typings.typescriptServices.TypeScript.CompilationSettings): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompilationSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ImmutableCompilationSettings]
}
