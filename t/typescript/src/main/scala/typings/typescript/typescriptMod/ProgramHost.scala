package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgramHost[T /* <: BuilderProgram */] extends js.Object {
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  /**
    * Used to create the program when need for program creation or recreation detected
    */
  @JSName("createProgram")
  var createProgram_Original: CreateProgram[T] = js.native
  /** If provided, used for module resolution as well as to handle directory structure */
  var directoryExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
  /** If provided, used in resolutions as well as handling directory structure */
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
  /** If provided is used to get the environment variable */
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
  /** If provided, used to cache and handle directory structure modifications */
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ String, 
      /* extensions */ js.UndefOr[js.Array[String]], 
      /* exclude */ js.UndefOr[js.Array[String]], 
      /* include */ js.UndefOr[js.Array[String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.native
  /** Symbol links resolution */
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  /** If provided, used to resolve the module names, otherwise typescript's default module resolution */
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
  /** If provided, used to resolve type reference directives, otherwise typescript's default resolution */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeReferenceDirectiveNames */ js.Array[String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  /** If provided would be used to write log about compilation */
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  def createProgram(): T = js.native
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): T = js.native
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T
  ): T = js.native
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): T = js.native
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): T = js.native
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost, oldProgram: T): T = js.native
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  def createProgram(rootNames: js.Array[String]): T = js.native
  def createProgram(rootNames: js.Array[String], options: js.UndefOr[scala.Nothing], host: CompilerHost): T = js.native
  def createProgram(rootNames: js.Array[String], options: js.UndefOr[scala.Nothing], host: CompilerHost, oldProgram: T): T = js.native
  def createProgram(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  def createProgram(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  /**
    * Used to create the program when need for program creation or recreation detected
    */
  def createProgram(rootNames: js.Array[String], options: CompilerOptions): T = js.native
  def createProgram(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): T = js.native
  def createProgram(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost, oldProgram: T): T = js.native
  def createProgram(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  def createProgram(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  /**
    * Use to check file presence for source files and
    * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
    */
  def fileExists(path: String): Boolean = js.native
  def getCurrentDirectory(): String = js.native
  def getDefaultLibFileName(options: CompilerOptions): String = js.native
  def getNewLine(): String = js.native
  /**
    * Use to read file text for source files and
    * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
    */
  def readFile(path: String): js.UndefOr[String] = js.native
  def readFile(path: String, encoding: String): js.UndefOr[String] = js.native
  def useCaseSensitiveFileNames(): Boolean = js.native
}

