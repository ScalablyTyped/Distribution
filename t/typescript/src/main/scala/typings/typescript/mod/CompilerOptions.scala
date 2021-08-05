package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerOptions
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue | TsConfigSourceFile]] {
  
  var allowJs: js.UndefOr[Boolean] = js.undefined
  
  var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined
  
  var allowUmdGlobalAccess: js.UndefOr[Boolean] = js.undefined
  
  var allowUnreachableCode: js.UndefOr[Boolean] = js.undefined
  
  var allowUnusedLabels: js.UndefOr[Boolean] = js.undefined
  
  var alwaysStrict: js.UndefOr[Boolean] = js.undefined
  
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
  
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  
  var charset: js.UndefOr[java.lang.String] = js.undefined
  
  var checkJs: js.UndefOr[Boolean] = js.undefined
  
  var composite: js.UndefOr[Boolean] = js.undefined
  
  var declaration: js.UndefOr[Boolean] = js.undefined
  
  var declarationDir: js.UndefOr[java.lang.String] = js.undefined
  
  var declarationMap: js.UndefOr[Boolean] = js.undefined
  
  var disableReferencedProjectLoad: js.UndefOr[Boolean] = js.undefined
  
  var disableSizeLimit: js.UndefOr[Boolean] = js.undefined
  
  var disableSolutionSearching: js.UndefOr[Boolean] = js.undefined
  
  var disableSourceOfProjectReferenceRedirect: js.UndefOr[Boolean] = js.undefined
  
  var downlevelIteration: js.UndefOr[Boolean] = js.undefined
  
  var emitBOM: js.UndefOr[Boolean] = js.undefined
  
  var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
  
  var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
  
  var esModuleInterop: js.UndefOr[Boolean] = js.undefined
  
  var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
  
  var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined
  
  var importHelpers: js.UndefOr[Boolean] = js.undefined
  
  var importsNotUsedAsValues: js.UndefOr[ImportsNotUsedAsValues] = js.undefined
  
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
  
  var inlineSources: js.UndefOr[Boolean] = js.undefined
  
  var isolatedModules: js.UndefOr[Boolean] = js.undefined
  
  var jsx: js.UndefOr[JsxEmit] = js.undefined
  
  var jsxFactory: js.UndefOr[java.lang.String] = js.undefined
  
  var jsxFragmentFactory: js.UndefOr[java.lang.String] = js.undefined
  
  var jsxImportSource: js.UndefOr[java.lang.String] = js.undefined
  
  var keyofStringsOnly: js.UndefOr[Boolean] = js.undefined
  
  var lib: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var locale: js.UndefOr[java.lang.String] = js.undefined
  
  var mapRoot: js.UndefOr[java.lang.String] = js.undefined
  
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
  
  var noUncheckedIndexedAccess: js.UndefOr[Boolean] = js.undefined
  
  var noUnusedLocals: js.UndefOr[Boolean] = js.undefined
  
  var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
  
  var out: js.UndefOr[java.lang.String] = js.undefined
  
  var outDir: js.UndefOr[java.lang.String] = js.undefined
  
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  
  var paths: js.UndefOr[MapLike[js.Array[java.lang.String]]] = js.undefined
  
  var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var project: js.UndefOr[java.lang.String] = js.undefined
  
  var reactNamespace: js.UndefOr[java.lang.String] = js.undefined
  
  var removeComments: js.UndefOr[Boolean] = js.undefined
  
  var resolveJsonModule: js.UndefOr[Boolean] = js.undefined
  
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  
  var rootDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined
  
  var skipLibCheck: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  
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
  
  var tsBuildInfoFile: js.UndefOr[java.lang.String] = js.undefined
  
  /** Paths used to compute primary types search locations */
  var typeRoots: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
}
object CompilerOptions {
  
  inline def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  extension [Self <: CompilerOptions](x: Self) {
    
    inline def setAllowJs(value: Boolean): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
    
    inline def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
    
    inline def setAllowSyntheticDefaultImports(value: Boolean): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
    
    inline def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
    
    inline def setAllowUmdGlobalAccess(value: Boolean): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
    
    inline def setAllowUnreachableCode(value: Boolean): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
    
    inline def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
    
    inline def setAllowUnusedLabels(value: Boolean): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
    
    inline def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
    
    inline def setAlwaysStrict(value: Boolean): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
    
    inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
    
    inline def setAssumeChangesOnlyAffectDirectDependencies(value: Boolean): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
    
    inline def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
    
    inline def setBaseUrl(value: java.lang.String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setCharset(value: java.lang.String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setCheckJs(value: Boolean): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
    
    inline def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
    
    inline def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationDir(value: java.lang.String): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
    
    inline def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
    
    inline def setDeclarationMap(value: Boolean): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
    
    inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setDisableReferencedProjectLoad(value: Boolean): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
    
    inline def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
    
    inline def setDisableSizeLimit(value: Boolean): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
    
    inline def setDisableSolutionSearching(value: Boolean): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
    
    inline def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
    
    inline def setDisableSourceOfProjectReferenceRedirect(value: Boolean): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
    
    inline def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
    
    inline def setDownlevelIteration(value: Boolean): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
    
    inline def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
    
    inline def setEmitBOM(value: Boolean): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
    
    inline def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
    
    inline def setEmitDeclarationOnly(value: Boolean): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
    
    inline def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
    
    inline def setEmitDecoratorMetadata(value: Boolean): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
    
    inline def setEsModuleInterop(value: Boolean): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
    
    inline def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
    
    inline def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
    
    inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
    
    inline def setForceConsistentCasingInFileNames(value: Boolean): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
    
    inline def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
    
    inline def setImportHelpers(value: Boolean): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
    
    inline def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
    
    inline def setImportsNotUsedAsValues(value: ImportsNotUsedAsValues): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
    
    inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
    
    inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
    
    inline def setInlineSources(value: Boolean): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
    
    inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
    
    inline def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
    
    inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
    
    inline def setJsx(value: JsxEmit): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxFactory(value: java.lang.String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
    
    inline def setJsxFragmentFactory(value: java.lang.String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
    
    inline def setJsxImportSource(value: java.lang.String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
    
    inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
    
    inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    
    inline def setKeyofStringsOnly(value: Boolean): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
    
    inline def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
    
    inline def setLib(value: js.Array[java.lang.String]): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
    
    inline def setLibVarargs(value: java.lang.String*): Self = StObject.set(x, "lib", js.Array(value :_*))
    
    inline def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMapRoot(value: java.lang.String): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
    
    inline def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
    
    inline def setMaxNodeModuleJsDepth(value: Double): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
    
    inline def setModule(value: ModuleKind): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleResolution(value: ModuleResolutionKind): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
    
    inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    inline def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
    
    inline def setNoEmitHelpers(value: Boolean): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
    
    inline def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
    
    inline def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
    
    inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
    
    inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
    
    inline def setNoErrorTruncation(value: Boolean): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
    
    inline def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
    
    inline def setNoFallthroughCasesInSwitch(value: Boolean): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
    
    inline def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
    
    inline def setNoImplicitAny(value: Boolean): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
    
    inline def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
    
    inline def setNoImplicitReturns(value: Boolean): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
    
    inline def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
    
    inline def setNoImplicitThis(value: Boolean): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
    
    inline def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
    
    inline def setNoImplicitUseStrict(value: Boolean): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
    
    inline def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
    
    inline def setNoLib(value: Boolean): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
    
    inline def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
    
    inline def setNoResolve(value: Boolean): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
    
    inline def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
    
    inline def setNoStrictGenericChecks(value: Boolean): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
    
    inline def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
    
    inline def setNoUncheckedIndexedAccess(value: Boolean): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
    
    inline def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
    
    inline def setNoUnusedLocals(value: Boolean): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
    
    inline def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
    
    inline def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
    
    inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
    
    inline def setOut(value: java.lang.String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutDir(value: java.lang.String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
    
    inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
    
    inline def setOutFile(value: java.lang.String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
    
    inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setPaths(value: MapLike[js.Array[java.lang.String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPreserveConstEnums(value: Boolean): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
    
    inline def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setProject(value: java.lang.String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setReactNamespace(value: java.lang.String): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
    
    inline def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
    
    inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
    
    inline def setResolveJsonModule(value: Boolean): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
    
    inline def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
    
    inline def setRootDir(value: java.lang.String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setRootDirs(value: js.Array[java.lang.String]): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
    
    inline def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
    
    inline def setRootDirsVarargs(value: java.lang.String*): Self = StObject.set(x, "rootDirs", js.Array(value :_*))
    
    inline def setSkipDefaultLibCheck(value: Boolean): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
    
    inline def setSkipLibCheck(value: Boolean): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSourceRoot(value: java.lang.String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictBindCallApply(value: Boolean): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
    
    inline def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
    
    inline def setStrictFunctionTypes(value: Boolean): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
    
    inline def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
    
    inline def setStrictNullChecks(value: Boolean): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
    
    inline def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
    
    inline def setStrictPropertyInitialization(value: Boolean): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
    
    inline def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStripInternal(value: Boolean): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
    
    inline def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
    
    inline def setSuppressExcessPropertyErrors(value: Boolean): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
    
    inline def setSuppressImplicitAnyIndexErrors(value: Boolean): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
    
    inline def setTarget(value: ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTraceResolution(value: Boolean): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
    
    inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
    
    inline def setTsBuildInfoFile(value: java.lang.String): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
    
    inline def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
    
    inline def setTypeRoots(value: js.Array[java.lang.String]): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
    
    inline def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
    
    inline def setTypeRootsVarargs(value: java.lang.String*): Self = StObject.set(x, "typeRoots", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
    
    inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
  }
}
