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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ts-loader/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendSuffixIfMatch(patterns: js.Array[RegExp], filePath: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendSuffixIfMatch")(patterns.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def appendSuffixesIfMatch(suffixDict: StringDictionary[js.Array[RegExp]], filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendSuffixesIfMatch")(suffixDict.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def arrify[T](`val`: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrify[T](`val`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def collectAllDependants(reverseDependencyGraph: ReverseDependencyGraph, fileName: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependants")(reverseDependencyGraph.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def collectAllDependants(
    reverseDependencyGraph: ReverseDependencyGraph,
    fileName: String,
    collected: StringDictionary[Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependants")(reverseDependencyGraph.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], collected.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependencies")(dependencyGraph.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String, collected: StringDictionary[Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependencies")(dependencyGraph.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], collected.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def ensureProgram(instance: TSInstance): js.UndefOr[Program] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureProgram")(instance.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Program]]
  
  inline def formatErrors(
    diagnostics: js.Array[Diagnostic],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(diagnostics.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  inline def formatErrors(
    diagnostics: Unit,
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(diagnostics.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  
  inline def getAndCacheOutputJSFileName(inputFileName: String, projectReference: ResolvedProjectReference, instance: TSInstance): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndCacheOutputJSFileName")(inputFileName.asInstanceOf[js.Any], projectReference.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAndCacheProjectReference(filePath: String, instance: TSInstance): js.UndefOr[ResolvedProjectReference] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndCacheProjectReference")(filePath.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResolvedProjectReference]]
  
  inline def isUsingProjectReferences(instance: TSInstance): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingProjectReferences")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeError(message: String): WebpackError = ^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any]).asInstanceOf[WebpackError]
  inline def makeError(message: String, file: String): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  inline def makeError(message: String, file: String, location: Character): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], file.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  inline def makeError(message: String, file: Unit, location: Character): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], file.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  
  inline def readFile(fileName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def readFile(fileName: String, encoding: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(fileName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def supportsProjectReferences(instance: TSInstance): js.UndefOr[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsProjectReferences")(instance.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`true`]]
  
  inline def supportsSolutionBuild(loaderOptions: LoaderOptions, compiler: Typeoftypescript): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("supportsSolutionBuild")(loaderOptions.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unorderedRemoveItem[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unorderedRemoveItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateSourceMapOncePerProject(
    instance: TSInstance,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    jsFileName: String,
    project: ResolvedProjectReference
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSourceMapOncePerProject")(instance.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], jsFileName.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
