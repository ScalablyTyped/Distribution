package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerHost extends ModuleResolutionHost {
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ String, 
      /* path */ Path, 
      /* languageVersion */ ScriptTarget, 
      /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.native
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ String, 
      /* extensions */ js.Array[String], 
      /* excludes */ js.UndefOr[js.Array[String]], 
      /* includes */ js.Array[String], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.native
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[String], 
      /* containingFile */ String, 
      /* reusedNames */ js.UndefOr[js.Array[String]], 
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
      /* typeReferenceDirectiveNames */ js.Array[String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback = js.native
  def getCanonicalFileName(fileName: String): String = js.native
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MCompilerHost(): String = js.native
  def getDefaultLibFileName(options: CompilerOptions): String = js.native
  def getNewLine(): String = js.native
  def getSourceFile(fileName: String, languageVersion: ScriptTarget): js.UndefOr[SourceFile] = js.native
  def getSourceFile(fileName: String, languageVersion: ScriptTarget, onError: js.Function1[/* message */ String, Unit]): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: String,
    languageVersion: ScriptTarget,
    onError: js.Function1[/* message */ String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def useCaseSensitiveFileNames(): Boolean = js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
}

