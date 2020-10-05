package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerHost extends ModuleResolutionHost {
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
  var getDefaultLibLocation: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ java.lang.String, js.UndefOr[ParsedCommandLine]]] = js.native
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ java.lang.String, 
      /* path */ Path, 
      /* languageVersion */ ScriptTarget, 
      /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.native
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ java.lang.String, 
      /* extensions */ js.Array[java.lang.String], 
      /* excludes */ js.UndefOr[js.Array[java.lang.String]], 
      /* includes */ js.Array[java.lang.String], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  /**
    * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
    */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeReferenceDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback = js.native
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String = js.native
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MCompilerHost(): java.lang.String = js.native
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  def getNewLine(): java.lang.String = js.native
  def getSourceFile(fileName: java.lang.String, languageVersion: ScriptTarget): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersion: ScriptTarget,
    onError: js.UndefOr[scala.Nothing],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersion: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersion: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def useCaseSensitiveFileNames(): Boolean = js.native
  def writeFile(fileName: java.lang.String, data: java.lang.String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.UndefOr[scala.Nothing],
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit]
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
}

