package typings.typescript.typescriptMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue | TsConfigSourceFile]] {
  var allowJs: js.UndefOr[Boolean] = js.undefined
  var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined
  var allowUmdGlobalAccess: js.UndefOr[Boolean] = js.undefined
  var allowUnreachableCode: js.UndefOr[Boolean] = js.undefined
  var allowUnusedLabels: js.UndefOr[Boolean] = js.undefined
  var alwaysStrict: js.UndefOr[Boolean] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var checkJs: js.UndefOr[Boolean] = js.undefined
  var composite: js.UndefOr[Boolean] = js.undefined
  var declaration: js.UndefOr[Boolean] = js.undefined
  var declarationDir: js.UndefOr[String] = js.undefined
  var declarationMap: js.UndefOr[Boolean] = js.undefined
  var disableSizeLimit: js.UndefOr[Boolean] = js.undefined
  var downlevelIteration: js.UndefOr[Boolean] = js.undefined
  var emitBOM: js.UndefOr[Boolean] = js.undefined
  var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
  var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
  var esModuleInterop: js.UndefOr[Boolean] = js.undefined
  var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
  var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined
  var importHelpers: js.UndefOr[Boolean] = js.undefined
  var incremental: js.UndefOr[Boolean] = js.undefined
  var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
  var inlineSources: js.UndefOr[Boolean] = js.undefined
  var isolatedModules: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[JsxEmit] = js.undefined
  var jsxFactory: js.UndefOr[String] = js.undefined
  var keyofStringsOnly: js.UndefOr[Boolean] = js.undefined
  var lib: js.UndefOr[js.Array[String]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var mapRoot: js.UndefOr[String] = js.undefined
  var maxNodeModuleJsDepth: js.UndefOr[Double] = js.undefined
  var module: js.UndefOr[ModuleKind] = js.undefined
  var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.undefined
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  var noEmit: js.UndefOr[Boolean] = js.undefined
  var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
  var noEmitOnError: js.UndefOr[Boolean] = js.undefined
  var noErrorTruncation: js.UndefOr[Boolean] = js.undefined
  var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.undefined
  var noImplicitAny: js.UndefOr[Boolean] = js.undefined
  var noImplicitReturns: js.UndefOr[Boolean] = js.undefined
  var noImplicitThis: js.UndefOr[Boolean] = js.undefined
  var noImplicitUseStrict: js.UndefOr[Boolean] = js.undefined
  var noLib: js.UndefOr[Boolean] = js.undefined
  var noResolve: js.UndefOr[Boolean] = js.undefined
  var noStrictGenericChecks: js.UndefOr[Boolean] = js.undefined
  var noUnusedLocals: js.UndefOr[Boolean] = js.undefined
  var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
  var out: js.UndefOr[String] = js.undefined
  var outDir: js.UndefOr[String] = js.undefined
  var outFile: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[MapLike[js.Array[String]]] = js.undefined
  var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var reactNamespace: js.UndefOr[String] = js.undefined
  var removeComments: js.UndefOr[Boolean] = js.undefined
  var resolveJsonModule: js.UndefOr[Boolean] = js.undefined
  var rootDir: js.UndefOr[String] = js.undefined
  var rootDirs: js.UndefOr[js.Array[String]] = js.undefined
  var skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined
  var skipLibCheck: js.UndefOr[Boolean] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var strictBindCallApply: js.UndefOr[Boolean] = js.undefined
  var strictFunctionTypes: js.UndefOr[Boolean] = js.undefined
  var strictNullChecks: js.UndefOr[Boolean] = js.undefined
  var strictPropertyInitialization: js.UndefOr[Boolean] = js.undefined
  var stripInternal: js.UndefOr[Boolean] = js.undefined
  var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.undefined
  var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[ScriptTarget] = js.undefined
  var traceResolution: js.UndefOr[Boolean] = js.undefined
  var tsBuildInfoFile: js.UndefOr[String] = js.undefined
  /** Paths used to compute primary types search locations */
  var typeRoots: js.UndefOr[js.Array[String]] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object CompilerOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue | TsConfigSourceFile]] = null,
    allowJs: js.UndefOr[Boolean] = js.undefined,
    allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined,
    allowUmdGlobalAccess: js.UndefOr[Boolean] = js.undefined,
    allowUnreachableCode: js.UndefOr[Boolean] = js.undefined,
    allowUnusedLabels: js.UndefOr[Boolean] = js.undefined,
    alwaysStrict: js.UndefOr[Boolean] = js.undefined,
    baseUrl: String = null,
    charset: String = null,
    checkJs: js.UndefOr[Boolean] = js.undefined,
    composite: js.UndefOr[Boolean] = js.undefined,
    declaration: js.UndefOr[Boolean] = js.undefined,
    declarationDir: String = null,
    declarationMap: js.UndefOr[Boolean] = js.undefined,
    disableSizeLimit: js.UndefOr[Boolean] = js.undefined,
    downlevelIteration: js.UndefOr[Boolean] = js.undefined,
    emitBOM: js.UndefOr[Boolean] = js.undefined,
    emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined,
    emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined,
    esModuleInterop: js.UndefOr[Boolean] = js.undefined,
    experimentalDecorators: js.UndefOr[Boolean] = js.undefined,
    forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined,
    importHelpers: js.UndefOr[Boolean] = js.undefined,
    incremental: js.UndefOr[Boolean] = js.undefined,
    inlineSourceMap: js.UndefOr[Boolean] = js.undefined,
    inlineSources: js.UndefOr[Boolean] = js.undefined,
    isolatedModules: js.UndefOr[Boolean] = js.undefined,
    jsx: JsxEmit = null,
    jsxFactory: String = null,
    keyofStringsOnly: js.UndefOr[Boolean] = js.undefined,
    lib: js.Array[String] = null,
    locale: String = null,
    mapRoot: String = null,
    maxNodeModuleJsDepth: Int | Double = null,
    module: ModuleKind = null,
    moduleResolution: ModuleResolutionKind = null,
    newLine: NewLineKind = null,
    noEmit: js.UndefOr[Boolean] = js.undefined,
    noEmitHelpers: js.UndefOr[Boolean] = js.undefined,
    noEmitOnError: js.UndefOr[Boolean] = js.undefined,
    noErrorTruncation: js.UndefOr[Boolean] = js.undefined,
    noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.undefined,
    noImplicitAny: js.UndefOr[Boolean] = js.undefined,
    noImplicitReturns: js.UndefOr[Boolean] = js.undefined,
    noImplicitThis: js.UndefOr[Boolean] = js.undefined,
    noImplicitUseStrict: js.UndefOr[Boolean] = js.undefined,
    noLib: js.UndefOr[Boolean] = js.undefined,
    noResolve: js.UndefOr[Boolean] = js.undefined,
    noStrictGenericChecks: js.UndefOr[Boolean] = js.undefined,
    noUnusedLocals: js.UndefOr[Boolean] = js.undefined,
    noUnusedParameters: js.UndefOr[Boolean] = js.undefined,
    out: String = null,
    outDir: String = null,
    outFile: String = null,
    paths: MapLike[js.Array[String]] = null,
    preserveConstEnums: js.UndefOr[Boolean] = js.undefined,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    project: String = null,
    reactNamespace: String = null,
    removeComments: js.UndefOr[Boolean] = js.undefined,
    resolveJsonModule: js.UndefOr[Boolean] = js.undefined,
    rootDir: String = null,
    rootDirs: js.Array[String] = null,
    skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined,
    skipLibCheck: js.UndefOr[Boolean] = js.undefined,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    strictBindCallApply: js.UndefOr[Boolean] = js.undefined,
    strictFunctionTypes: js.UndefOr[Boolean] = js.undefined,
    strictNullChecks: js.UndefOr[Boolean] = js.undefined,
    strictPropertyInitialization: js.UndefOr[Boolean] = js.undefined,
    stripInternal: js.UndefOr[Boolean] = js.undefined,
    suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.undefined,
    suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined,
    target: ScriptTarget = null,
    traceResolution: js.UndefOr[Boolean] = js.undefined,
    tsBuildInfoFile: String = null,
    typeRoots: js.Array[String] = null,
    types: js.Array[String] = null
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowJs)) __obj.updateDynamic("allowJs")(allowJs)
    if (!js.isUndefined(allowSyntheticDefaultImports)) __obj.updateDynamic("allowSyntheticDefaultImports")(allowSyntheticDefaultImports)
    if (!js.isUndefined(allowUmdGlobalAccess)) __obj.updateDynamic("allowUmdGlobalAccess")(allowUmdGlobalAccess)
    if (!js.isUndefined(allowUnreachableCode)) __obj.updateDynamic("allowUnreachableCode")(allowUnreachableCode)
    if (!js.isUndefined(allowUnusedLabels)) __obj.updateDynamic("allowUnusedLabels")(allowUnusedLabels)
    if (!js.isUndefined(alwaysStrict)) __obj.updateDynamic("alwaysStrict")(alwaysStrict)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (!js.isUndefined(checkJs)) __obj.updateDynamic("checkJs")(checkJs)
    if (!js.isUndefined(composite)) __obj.updateDynamic("composite")(composite)
    if (!js.isUndefined(declaration)) __obj.updateDynamic("declaration")(declaration)
    if (declarationDir != null) __obj.updateDynamic("declarationDir")(declarationDir)
    if (!js.isUndefined(declarationMap)) __obj.updateDynamic("declarationMap")(declarationMap)
    if (!js.isUndefined(disableSizeLimit)) __obj.updateDynamic("disableSizeLimit")(disableSizeLimit)
    if (!js.isUndefined(downlevelIteration)) __obj.updateDynamic("downlevelIteration")(downlevelIteration)
    if (!js.isUndefined(emitBOM)) __obj.updateDynamic("emitBOM")(emitBOM)
    if (!js.isUndefined(emitDeclarationOnly)) __obj.updateDynamic("emitDeclarationOnly")(emitDeclarationOnly)
    if (!js.isUndefined(emitDecoratorMetadata)) __obj.updateDynamic("emitDecoratorMetadata")(emitDecoratorMetadata)
    if (!js.isUndefined(esModuleInterop)) __obj.updateDynamic("esModuleInterop")(esModuleInterop)
    if (!js.isUndefined(experimentalDecorators)) __obj.updateDynamic("experimentalDecorators")(experimentalDecorators)
    if (!js.isUndefined(forceConsistentCasingInFileNames)) __obj.updateDynamic("forceConsistentCasingInFileNames")(forceConsistentCasingInFileNames)
    if (!js.isUndefined(importHelpers)) __obj.updateDynamic("importHelpers")(importHelpers)
    if (!js.isUndefined(incremental)) __obj.updateDynamic("incremental")(incremental)
    if (!js.isUndefined(inlineSourceMap)) __obj.updateDynamic("inlineSourceMap")(inlineSourceMap)
    if (!js.isUndefined(inlineSources)) __obj.updateDynamic("inlineSources")(inlineSources)
    if (!js.isUndefined(isolatedModules)) __obj.updateDynamic("isolatedModules")(isolatedModules)
    if (jsx != null) __obj.updateDynamic("jsx")(jsx)
    if (jsxFactory != null) __obj.updateDynamic("jsxFactory")(jsxFactory)
    if (!js.isUndefined(keyofStringsOnly)) __obj.updateDynamic("keyofStringsOnly")(keyofStringsOnly)
    if (lib != null) __obj.updateDynamic("lib")(lib)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mapRoot != null) __obj.updateDynamic("mapRoot")(mapRoot)
    if (maxNodeModuleJsDepth != null) __obj.updateDynamic("maxNodeModuleJsDepth")(maxNodeModuleJsDepth.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module)
    if (moduleResolution != null) __obj.updateDynamic("moduleResolution")(moduleResolution)
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (!js.isUndefined(noEmit)) __obj.updateDynamic("noEmit")(noEmit)
    if (!js.isUndefined(noEmitHelpers)) __obj.updateDynamic("noEmitHelpers")(noEmitHelpers)
    if (!js.isUndefined(noEmitOnError)) __obj.updateDynamic("noEmitOnError")(noEmitOnError)
    if (!js.isUndefined(noErrorTruncation)) __obj.updateDynamic("noErrorTruncation")(noErrorTruncation)
    if (!js.isUndefined(noFallthroughCasesInSwitch)) __obj.updateDynamic("noFallthroughCasesInSwitch")(noFallthroughCasesInSwitch)
    if (!js.isUndefined(noImplicitAny)) __obj.updateDynamic("noImplicitAny")(noImplicitAny)
    if (!js.isUndefined(noImplicitReturns)) __obj.updateDynamic("noImplicitReturns")(noImplicitReturns)
    if (!js.isUndefined(noImplicitThis)) __obj.updateDynamic("noImplicitThis")(noImplicitThis)
    if (!js.isUndefined(noImplicitUseStrict)) __obj.updateDynamic("noImplicitUseStrict")(noImplicitUseStrict)
    if (!js.isUndefined(noLib)) __obj.updateDynamic("noLib")(noLib)
    if (!js.isUndefined(noResolve)) __obj.updateDynamic("noResolve")(noResolve)
    if (!js.isUndefined(noStrictGenericChecks)) __obj.updateDynamic("noStrictGenericChecks")(noStrictGenericChecks)
    if (!js.isUndefined(noUnusedLocals)) __obj.updateDynamic("noUnusedLocals")(noUnusedLocals)
    if (!js.isUndefined(noUnusedParameters)) __obj.updateDynamic("noUnusedParameters")(noUnusedParameters)
    if (out != null) __obj.updateDynamic("out")(out)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(preserveConstEnums)) __obj.updateDynamic("preserveConstEnums")(preserveConstEnums)
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (project != null) __obj.updateDynamic("project")(project)
    if (reactNamespace != null) __obj.updateDynamic("reactNamespace")(reactNamespace)
    if (!js.isUndefined(removeComments)) __obj.updateDynamic("removeComments")(removeComments)
    if (!js.isUndefined(resolveJsonModule)) __obj.updateDynamic("resolveJsonModule")(resolveJsonModule)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (rootDirs != null) __obj.updateDynamic("rootDirs")(rootDirs)
    if (!js.isUndefined(skipDefaultLibCheck)) __obj.updateDynamic("skipDefaultLibCheck")(skipDefaultLibCheck)
    if (!js.isUndefined(skipLibCheck)) __obj.updateDynamic("skipLibCheck")(skipLibCheck)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(strictBindCallApply)) __obj.updateDynamic("strictBindCallApply")(strictBindCallApply)
    if (!js.isUndefined(strictFunctionTypes)) __obj.updateDynamic("strictFunctionTypes")(strictFunctionTypes)
    if (!js.isUndefined(strictNullChecks)) __obj.updateDynamic("strictNullChecks")(strictNullChecks)
    if (!js.isUndefined(strictPropertyInitialization)) __obj.updateDynamic("strictPropertyInitialization")(strictPropertyInitialization)
    if (!js.isUndefined(stripInternal)) __obj.updateDynamic("stripInternal")(stripInternal)
    if (!js.isUndefined(suppressExcessPropertyErrors)) __obj.updateDynamic("suppressExcessPropertyErrors")(suppressExcessPropertyErrors)
    if (!js.isUndefined(suppressImplicitAnyIndexErrors)) __obj.updateDynamic("suppressImplicitAnyIndexErrors")(suppressImplicitAnyIndexErrors)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(traceResolution)) __obj.updateDynamic("traceResolution")(traceResolution)
    if (tsBuildInfoFile != null) __obj.updateDynamic("tsBuildInfoFile")(tsBuildInfoFile)
    if (typeRoots != null) __obj.updateDynamic("typeRoots")(typeRoots)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[CompilerOptions]
  }
}

