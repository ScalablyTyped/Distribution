package typings.tsLoader

import org.scalablytyped.runtime.StringDictionary
import typings.chalk.mod.Chalk
import typings.std.RegExp
import typings.tsLoader.anon.Character
import typings.tsLoader.anon.File
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.interfacesMod.DependencyGraph
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.interfacesMod.ReverseDependencyGraph
import typings.tsLoader.interfacesMod.TSInstance
import typings.tsLoader.interfacesMod.WebpackError
import typings.tsLoader.tsLoaderBooleans.`true`
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Program
import typings.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ts-loader/dist/utils", "appendSuffixIfMatch")
  @js.native
  def appendSuffixIfMatch(patterns: js.Array[RegExp], filePath: String, suffix: String): String = js.native
  
  @JSImport("ts-loader/dist/utils", "appendSuffixesIfMatch")
  @js.native
  def appendSuffixesIfMatch(suffixDict: StringDictionary[js.Array[RegExp]], filePath: String): String = js.native
  
  @JSImport("ts-loader/dist/utils", "arrify")
  @js.native
  def arrify[T](`val`: T): js.Array[T] = js.native
  @JSImport("ts-loader/dist/utils", "arrify")
  @js.native
  def arrify[T](`val`: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("ts-loader/dist/utils", "collectAllDependants")
  @js.native
  def collectAllDependants(reverseDependencyGraph: ReverseDependencyGraph, fileName: String): js.Array[String] = js.native
  @JSImport("ts-loader/dist/utils", "collectAllDependants")
  @js.native
  def collectAllDependants(
    reverseDependencyGraph: ReverseDependencyGraph,
    fileName: String,
    collected: StringDictionary[Boolean]
  ): js.Array[String] = js.native
  
  @JSImport("ts-loader/dist/utils", "collectAllDependencies")
  @js.native
  def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String): js.Array[String] = js.native
  @JSImport("ts-loader/dist/utils", "collectAllDependencies")
  @js.native
  def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String, collected: StringDictionary[Boolean]): js.Array[String] = js.native
  
  @JSImport("ts-loader/dist/utils", "ensureProgram")
  @js.native
  def ensureProgram(instance: TSInstance): js.UndefOr[Program] = js.native
  
  @JSImport("ts-loader/dist/utils", "formatErrors")
  @js.native
  def formatErrors(
    diagnostics: js.UndefOr[scala.Nothing],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = js.native
  @JSImport("ts-loader/dist/utils", "formatErrors")
  @js.native
  def formatErrors(
    diagnostics: js.Array[Diagnostic],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = js.native
  
  @JSImport("ts-loader/dist/utils", "getAndCacheOutputJSFileName")
  @js.native
  def getAndCacheOutputJSFileName(inputFileName: String, projectReference: ResolvedProjectReference, instance: TSInstance): String = js.native
  
  @JSImport("ts-loader/dist/utils", "getAndCacheProjectReference")
  @js.native
  def getAndCacheProjectReference(filePath: String, instance: TSInstance): js.UndefOr[ResolvedProjectReference] = js.native
  
  @JSImport("ts-loader/dist/utils", "isUsingProjectReferences")
  @js.native
  def isUsingProjectReferences(instance: TSInstance): Boolean = js.native
  
  @JSImport("ts-loader/dist/utils", "makeError")
  @js.native
  def makeError(message: String): WebpackError = js.native
  @JSImport("ts-loader/dist/utils", "makeError")
  @js.native
  def makeError(message: String, file: js.UndefOr[scala.Nothing], location: Character): WebpackError = js.native
  @JSImport("ts-loader/dist/utils", "makeError")
  @js.native
  def makeError(message: String, file: String): WebpackError = js.native
  @JSImport("ts-loader/dist/utils", "makeError")
  @js.native
  def makeError(message: String, file: String, location: Character): WebpackError = js.native
  
  @JSImport("ts-loader/dist/utils", "readFile")
  @js.native
  def readFile(fileName: String): js.UndefOr[String] = js.native
  @JSImport("ts-loader/dist/utils", "readFile")
  @js.native
  def readFile(fileName: String, encoding: String): js.UndefOr[String] = js.native
  
  @JSImport("ts-loader/dist/utils", "supportsProjectReferences")
  @js.native
  def supportsProjectReferences(instance: TSInstance): js.UndefOr[`true`] = js.native
  
  @JSImport("ts-loader/dist/utils", "supportsSolutionBuild")
  @js.native
  def supportsSolutionBuild(loaderOptions: LoaderOptions, compiler: Typeoftypescript): Boolean = js.native
  
  @JSImport("ts-loader/dist/utils", "unorderedRemoveItem")
  @js.native
  def unorderedRemoveItem[T](array: js.Array[T], item: T): Boolean = js.native
  
  @JSImport("ts-loader/dist/utils", "validateSourceMapOncePerProject")
  @js.native
  def validateSourceMapOncePerProject(
    instance: TSInstance,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    jsFileName: String,
    project: ResolvedProjectReference
  ): Unit = js.native
}
