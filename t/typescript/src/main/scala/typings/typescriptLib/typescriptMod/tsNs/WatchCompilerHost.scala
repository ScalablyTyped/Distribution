package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchCompilerHost[T /* <: BuilderProgram */] extends WatchHost {
  /** If provided, callback to invoke after every new program creation */
  var afterProgramCreate: js.UndefOr[js.Function1[/* program */ T, scala.Unit]] = js.native
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  @JSName("createProgram")
  var createProgram_Original: CreateProgram[T] = js.native
  /** If provided, used for module resolution as well as to handle directory structure */
  var directoryExists: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.native
  var getDefaultLibLocation: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** If provided, used in resolutions as well as handling directory structure */
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  /** If provided is used to get the environment variable */
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  /** If provided, used to cache and handle directory structure modifications */
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[scala.Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  /** Symbol links resolution */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  /** If provided, used to resolve the module names, otherwise typescript's default module resolution */
  var resolveModuleNames: js.UndefOr[
    js.Function4[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  /** If provided, used to resolve type reference directives, otherwise typescript's default resolution */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function3[
      /* typeReferenceDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  /** If provided would be used to write log about compilation */
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.Array[java.lang.String]): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost, oldProgram: T): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost, oldProgram: T): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: T,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): T = js.native
  /**
           * Used to create the program when need for program creation or recreation detected
           */
  def createProgram(
    rootNames: js.UndefOr[scala.Nothing],
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
  def fileExists(path: java.lang.String): scala.Boolean = js.native
  def getCurrentDirectory(): java.lang.String = js.native
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  def getNewLine(): java.lang.String = js.native
  /**
           * Use to read file text for source files and
           * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
           */
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
           * Use to read file text for source files and
           * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
           */
  def readFile(path: java.lang.String, encoding: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def useCaseSensitiveFileNames(): scala.Boolean = js.native
}

