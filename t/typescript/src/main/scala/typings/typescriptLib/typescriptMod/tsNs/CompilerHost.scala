package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerHost extends ModuleResolutionHost {
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
  var getDefaultLibLocation: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ java.lang.String, 
      /* path */ Path, 
      /* languageVersion */ ScriptTarget, 
      /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[scala.Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.native
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ java.lang.String, 
      /* extensions */ js.Array[java.lang.String], 
      /* excludes */ js.UndefOr[js.Array[java.lang.String]], 
      /* includes */ js.Array[java.lang.String], 
      /* depth */ js.UndefOr[scala.Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  var resolveModuleNames: js.UndefOr[
    js.Function3[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  /**
           * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
           */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function2[
      /* typeReferenceDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      js.Array[ResolvedTypeReferenceDirective]
    ]
  ] = js.native
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback = js.native
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String = js.native
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MCompilerHost(): java.lang.String = js.native
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  @JSName("getDirectories")
  def getDirectories_MCompilerHost(path: java.lang.String): js.Array[java.lang.String] = js.native
  def getNewLine(): java.lang.String = js.native
  def getSourceFile(fileName: java.lang.String, languageVersion: ScriptTarget): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersion: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersion: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, scala.Unit],
    shouldCreateNewSourceFile: scala.Boolean
  ): js.UndefOr[SourceFile] = js.native
  def useCaseSensitiveFileNames(): scala.Boolean = js.native
  def writeFile(fileName: java.lang.String, data: java.lang.String, writeByteOrderMark: scala.Boolean): scala.Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: scala.Boolean,
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: scala.Boolean,
    onError: js.Function1[/* message */ java.lang.String, scala.Unit],
    sourceFiles: js.Array[SourceFile]
  ): scala.Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: scala.Boolean,
    onError: js.UndefOr[scala.Nothing],
    sourceFiles: js.Array[SourceFile]
  ): scala.Unit = js.native
}

