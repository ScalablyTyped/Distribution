package typings.typeFest.sourceTsconfigJsonMod

import typings.std.Lowercase
import typings.std.Record
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.FallbackPolling
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.IgnoreDeprecations
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.ImportsNotUsedAsValues
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.JSX
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Lib
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Module
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.ModuleDetection
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.ModuleResolution
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.NewLine
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Plugin
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Target
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.WatchDirectory
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.WatchFile
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.References
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.TypeAcquisition
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.PollingWatchKind
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.WatchDirectoryKind
import typings.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.WatchFileKind
import typings.typeFest.typeFestStrings.`5Dot0`
import typings.typeFest.typeFestStrings.amd_
import typings.typeFest.typeFestStrings.bundler_
import typings.typeFest.typeFestStrings.classic_
import typings.typeFest.typeFestStrings.commonjs_
import typings.typeFest.typeFestStrings.crlf_
import typings.typeFest.typeFestStrings.dom_
import typings.typeFest.typeFestStrings.dynamicPriorityPolling_
import typings.typeFest.typeFestStrings.dynamicPriority_
import typings.typeFest.typeFestStrings.es2015_
import typings.typeFest.typeFestStrings.es2016_
import typings.typeFest.typeFestStrings.es2017_
import typings.typeFest.typeFestStrings.es2018_
import typings.typeFest.typeFestStrings.es2019_
import typings.typeFest.typeFestStrings.es2020_
import typings.typeFest.typeFestStrings.es2021_
import typings.typeFest.typeFestStrings.es2022_
import typings.typeFest.typeFestStrings.es3_
import typings.typeFest.typeFestStrings.es5_
import typings.typeFest.typeFestStrings.es6_
import typings.typeFest.typeFestStrings.es7_
import typings.typeFest.typeFestStrings.esnext_
import typings.typeFest.typeFestStrings.fixedChunkSizePolling_
import typings.typeFest.typeFestStrings.fixedChunkSize_
import typings.typeFest.typeFestStrings.fixedInterval_
import typings.typeFest.typeFestStrings.fixedPollingInterval_
import typings.typeFest.typeFestStrings.lf_
import typings.typeFest.typeFestStrings.node10_
import typings.typeFest.typeFestStrings.node16_
import typings.typeFest.typeFestStrings.node_
import typings.typeFest.typeFestStrings.nodenext_
import typings.typeFest.typeFestStrings.none_
import typings.typeFest.typeFestStrings.priorityInterval_
import typings.typeFest.typeFestStrings.priorityPollingInterval_
import typings.typeFest.typeFestStrings.scripthost_
import typings.typeFest.typeFestStrings.system_
import typings.typeFest.typeFestStrings.umd_
import typings.typeFest.typeFestStrings.useFsEventsOnParentDirectory_
import typings.typeFest.typeFestStrings.useFsEvents_
import typings.typeFest.typeFestStrings.webworker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConfigJson extends StObject {
  
  /**
  	Enable Compile-on-Save for this project.
  	*/
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
  
  /**
  	Instructs the TypeScript compiler how to compile `.ts` files.
  	*/
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  
  /**
  	Specifies a list of files to be excluded from compilation. The `exclude` property only affects the files included via the `include` property and not the `files` property.
  	Glob patterns require TypeScript version 2.0 or later.
  	*/
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Path to base configuration file to inherit from.
  	*/
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	If no `files` or `include` property is present in a `tsconfig.json`, the compiler defaults to including all files in the containing directory and subdirectories except those specified by `exclude`. When a `files` property is specified, only those files and those specified by `include` are included.
  	*/
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Specifies a list of glob patterns that match files to be included in compilation.
  	If no `files` or `include` property is present in a `tsconfig.json`, the compiler defaults to including all files in the containing directory and subdirectories except those specified by `exclude`.
  	*/
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Referenced projects.
  	*/
  var references: js.UndefOr[js.Array[References]] = js.undefined
  
  /**
  	Auto type (.d.ts) acquisition options for this project.
  	*/
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  /**
  	Instructs the TypeScript compiler how to watch files.
  	*/
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object TsConfigJson {
  
  inline def apply(): TsConfigJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsConfigJson]
  }
  
  trait CompilerOptions extends StObject {
    
    /**
    		Suppress errors for file formats that TypeScript does not understand.
    		@default false
    		*/
    var allowArbitraryExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allows TypeScript files to import each other with a TypeScript-specific extension like .ts, .mts, or .tsx.
    		@default false
    		*/
    var allowImportingTsExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allow javascript files to be compiled.
    		@default false
    		*/
    var allowJs: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allow default imports from modules with no default export. This does not affect code emit, just typechecking.
    		@default module === 'system' || esModuleInterop
    		*/
    var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allow accessing UMD globals from modules.
    		@default false
    		*/
    var allowUmdGlobalAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not report errors on unreachable code.
    		@default false
    		*/
    var allowUnreachableCode: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not report errors on unused labels.
    		@default false
    		*/
    var allowUnusedLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Parse in strict mode and emit `'use strict'` for each source file.
    		@default false
    		*/
    var alwaysStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Have recompiles in '--incremental' and '--watch' assume that changes within a file will only affect files directly depending on it.
    		@default false
    		*/
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Base directory to resolve non-relative module names.
    		*/
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
    		The character set of the input files.
    		@default 'utf8'
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var charset: js.UndefOr[String] = js.undefined
    
    /**
    		Report errors in `.js` files.
    		@default false
    		*/
    var checkJs: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enables building for project references.
    		@default true
    		*/
    var composite: js.UndefOr[Boolean] = js.undefined
    
    /**
    		List of additional conditions that should succeed when TypeScript resolves from package.json.
    		*/
    var customConditions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Generates corresponding d.ts files.
    		@default false
    		*/
    var declaration: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify output directory for generated declaration files.
    		*/
    var declarationDir: js.UndefOr[String] = js.undefined
    
    /**
    		Generates a sourcemap for each corresponding `.d.ts` file.
    		@default false
    		*/
    var declarationMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Show diagnostic information.
    		@default false
    		*/
    var diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Reduce the number of projects loaded automatically by TypeScript.
    		@default false
    		*/
    var disableReferencedProjectLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable size limit for JavaScript project.
    		@default false
    		*/
    var disableSizeLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Opt a project out of multi-project reference checking when editing.
    		@default false
    		*/
    var disableSolutionSearching: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable preferring source files instead of declaration files when referencing composite projects.
    		@default true if composite, false otherwise
    		*/
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Provide full support for iterables in `for-of`, spread, and destructuring when targeting `ES5` or `ES3`.
    		@default false
    		*/
    var downlevelIteration: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a UTF-8 Byte Order Mark (BOM) in the beginning of output files.
    		@default false
    		*/
    var emitBOM: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Only emit `.d.ts` declaration files.
    		@default false
    		*/
    var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit design-type metadata for decorated declarations in source.
    		@default false
    		*/
    var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit `__importStar` and `__importDefault` helpers for runtime Babel ecosystem compatibility and enable `--allowSyntheticDefaultImports` for typesystem compatibility.
    		@default false
    		*/
    var esModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Differentiate between undefined and not present when type checking.
    		@default false
    		*/
    var exactOptionalPropertyTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enables experimental support for ES7 decorators.
    		@default false
    		*/
    var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files which TypeScript sees as a part of your project and the reason they are part of the compilation.
    		@default false
    		*/
    var explainFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Output more detailed compiler performance information after building.
    		@default false
    		*/
    var extendedDiagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the polling strategy to use when the system runs out of or doesn't support native file watchers.
    		@deprecated Use watchOptions.fallbackPolling instead.
    		*/
    var fallbackPolling: js.UndefOr[FallbackPolling] = js.undefined
    
    /**
    		Disallow inconsistently-cased references to the same file.
    		@default true
    		*/
    var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a v8 CPU profile of the compiler run for debugging.
    		@default 'profile.cpuprofile'
    		*/
    var generateCpuProfile: js.UndefOr[String] = js.undefined
    
    /**
    		Suppress deprecation warnings
    		*/
    var ignoreDeprecations: js.UndefOr[IgnoreDeprecations] = js.undefined
    
    /**
    		Import emit helpers (e.g. `__extends`, `__rest`, etc..) from tslib.
    		@default false
    		*/
    var importHelpers: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify emit/checking behavior for imports that are only used for types.
    		@default 'remove'
    		@deprecated Use `verbatimModuleSyntax` instead.
    		*/
    var importsNotUsedAsValues: js.UndefOr[ImportsNotUsedAsValues] = js.undefined
    
    /**
    		Enable incremental compilation.
    		@default `composite`
    		*/
    var incremental: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a single file with source maps instead of having a separate file.
    		@default false
    		*/
    var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit the source alongside the sourcemaps within a single file.
    		Requires `--inlineSourceMap` to be set.
    		@default false
    		*/
    var inlineSources: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Unconditionally emit imports for unresolved files.
    		@default false
    		*/
    var isolatedModules: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify what JSX code is generated.
    		@default 'preserve'
    		*/
    var jsx: js.UndefOr[JSX] = js.undefined
    
    /**
    		Specify the JSX factory function to use when targeting React JSX emit, e.g. `React.createElement` or `h`.
    		@default 'React.createElement'
    		*/
    var jsxFactory: js.UndefOr[String] = js.undefined
    
    /**
    		Specify the JSX Fragment reference used for fragments when targeting React JSX emit e.g. 'React.Fragment' or 'Fragment'.
    		@default 'React.Fragment'
    		*/
    var jsxFragmentFactory: js.UndefOr[String] = js.undefined
    
    /**
    		Specify module specifier used to import the JSX factory functions when using `jsx: react-jsx*`.
    		@default 'react'
    		*/
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    /**
    		Resolve `keyof` to string valued property names only (no numbers or symbols).
    		@default false
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var keyofStringsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		List of library files to be included in the compilation.
    		*/
    var lib: js.UndefOr[js.Array[Lib]] = js.undefined
    
    /**
    		Enable to list all emitted files.
    		@default false
    		*/
    var listEmittedFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files part of the compilation.
    		@default false
    		*/
    var listFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files that are part of the compilation and then stop processing.
    		@default false
    		*/
    var listFilesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the location where debugger should locate map files instead of generated locations.
    		*/
    var mapRoot: js.UndefOr[String] = js.undefined
    
    /**
    		The maximum dependency depth to search under `node_modules` and load JavaScript files. Only applicable with `--allowJs`.
    		@default 0
    		*/
    var maxNodeModuleJsDepth: js.UndefOr[Double] = js.undefined
    
    /**
    		Specify module code generation: 'None', 'CommonJS', 'AMD', 'System', 'UMD', 'ES6', 'ES2015' or 'ESNext'. Only 'AMD' and 'System' can be used in conjunction with `--outFile`. 'ES6' and 'ES2015' values may be used when targeting 'ES5' or lower.
    		@default ['ES3', 'ES5'].includes(target) ? 'CommonJS' : 'ES6'
    		*/
    var module: js.UndefOr[Module] = js.undefined
    
    /**
    		Control what method is used to detect module-format JS files.
    		@default 'auto'
    		*/
    var moduleDetection: js.UndefOr[ModuleDetection] = js.undefined
    
    /**
    		Specifies module resolution strategy: 'node' (Node) or 'classic' (TypeScript pre 1.6).
    		@default ['AMD', 'System', 'ES6'].includes(module) ? 'classic' : 'node'
    		*/
    var moduleResolution: js.UndefOr[ModuleResolution] = js.undefined
    
    /**
    		List of file name suffixes to search when resolving a module.
    		*/
    var moduleSuffixes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specifies the end of line sequence to be used when emitting files: 'crlf' (Windows) or 'lf' (Unix).
    		@default 'LF'
    		*/
    var newLine: js.UndefOr[NewLine] = js.undefined
    
    /**
    		Do not emit output.
    		@default false
    		*/
    var noEmit: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not generate custom helper functions like `__extends` in compiled output.
    		@default false
    		*/
    var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit outputs if any type checking errors were reported.
    		@default false
    		*/
    var noEmitOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not truncate error messages.
    		@default false
    		*/
    var noErrorTruncation: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors for fallthrough cases in switch statement.
    		@default false
    		*/
    var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Warn on expressions and declarations with an implied 'any' type.
    		@default false
    		*/
    var noImplicitAny: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Ensure overriding members in derived classes are marked with an override modifier.
    		@default false
    		*/
    var noImplicitOverride: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report error when not all code paths in function return a value.
    		@default false
    		*/
    var noImplicitReturns: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Raise error on 'this' expressions with an implied any type.
    		@default false
    		*/
    var noImplicitThis: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit `'use strict'` directives in module output.
    		@default false
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var noImplicitUseStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not include the default library file (lib.d.ts).
    		@default false
    		*/
    var noLib: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enforces using indexed accessors for keys declared using an indexed type.
    		@default false
    		*/
    var noPropertyAccessFromIndexSignature: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not add triple-slash references or module import targets to the list of compiled files.
    		@default false
    		*/
    var noResolve: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable strict checking of generic signatures in function types.
    		@default false
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var noStrictGenericChecks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Add `undefined` to a type when accessed using an index.
    		@default false
    		*/
    var noUncheckedIndexedAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors on unused locals.
    		@default false
    		*/
    var noUnusedLocals: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors on unused parameters.
    		@default false
    		*/
    var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Redirect output structure to the directory.
    		*/
    var outDir: js.UndefOr[String] = js.undefined
    
    /**
    		Concatenate and emit output to single file.
    		*/
    var outFile: js.UndefOr[String] = js.undefined
    
    /**
    		Specify path mapping to be computed relative to baseUrl option.
    		*/
    var paths: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    /**
    		List of TypeScript language server plugins to load.
    		*/
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
    
    /**
    		Do not erase const enum declarations in generated code.
    		@default false
    		*/
    var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not resolve symlinks to their real path; treat a symlinked file like a real one.
    		@default false
    		*/
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Preserve unused imported values in the JavaScript output that would otherwise be removed.
    		@default true
    		@deprecated Use `verbatimModuleSyntax` instead.
    		*/
    var preserveValueImports: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Keep outdated console output in watch mode instead of clearing the screen.
    		@default false
    		*/
    var preserveWatchOutput: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Stylize errors and messages using color and context (experimental).
    		@default true // Unless piping to another program or redirecting output to a file.
    		*/
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the object invoked for `createElement` and `__spread` when targeting `'react'` JSX emit.
    		@default 'React'
    		*/
    var reactNamespace: js.UndefOr[String] = js.undefined
    
    /**
    		Do not emit comments to output.
    		@default false
    		*/
    var removeComments: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Include modules imported with `.json` extension.
    		@default false
    		*/
    var resolveJsonModule: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Forces TypeScript to consult the exports field of package.json files if it ever reads from a package in node_modules.
    		@default false
    		*/
    var resolvePackageJsonExports: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Forces TypeScript to consult the imports field of package.json files when performing a lookup that starts with # from a file whose ancestor directory contains a package.json.
    		@default false
    		*/
    var resolvePackageJsonImports: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the root directory of input files.
    		Use to control the output directory structure with `--outDir`.
    		*/
    var rootDir: js.UndefOr[String] = js.undefined
    
    /**
    		Specify list of root directories to be used when resolving modules.
    		*/
    var rootDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		@deprecated use `skipLibCheck` instead.
    		*/
    var skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Skip type checking of declaration files.
    		@default false
    		*/
    var skipLibCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Generates corresponding '.map' file.
    		@default false
    		*/
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the location where debugger should locate TypeScript files instead of source locations.
    		*/
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    /**
    		Enable all strict type checking options.
    		@default false
    		*/
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enable stricter checking of of the `bind`, `call`, and `apply` methods on functions.
    		@default false
    		*/
    var strictBindCallApply: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable bivariant parameter checking for function types.
    		@default false
    		*/
    var strictFunctionTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enable strict null checks.
    		@default false
    		*/
    var strictNullChecks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Ensure non-undefined class properties are initialized in the constructor.
    		@default false
    		*/
    var strictPropertyInitialization: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit declarations for code that has an `@internal` annotation.
    		*/
    var stripInternal: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Suppress excess property checks for object literals.
    		@default false
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Suppress noImplicitAny errors for indexing objects lacking index signatures.
    		@default false
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify ECMAScript target version.
    		@default 'es3'
    		*/
    var target: js.UndefOr[Target] = js.undefined
    
    /**
    		Enable tracing of the name resolution process.
    		@default false
    		*/
    var traceResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify file to store incremental compilation information.
    		@default '.tsbuildinfo'
    		*/
    var tsBuildInfoFile: js.UndefOr[String] = js.undefined
    
    /**
    		Specify list of directories for type definition files to be included.
    		*/
    var typeRoots: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Type declaration files to be included in compilation.
    		*/
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Emit ECMAScript standard class fields.
    		@default false
    		*/
    var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Default catch clause variables as `unknown` instead of `any`.
    		@default false
    		*/
    var useUnknownInCatchVariables: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Anything that uses the type modifier is dropped entirely.
    		@default false
    		*/
    var verbatimModuleSyntax: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Watch input files.
    		@default false
    		@deprecated Use watchOptions instead.
    		*/
    var watch: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the strategy for watching directories under systems that lack recursive file-watching functionality.
    		@default 'useFsEvents'
    		@deprecated Use watchOptions.watchDirectory instead.
    		*/
    var watchDirectory: js.UndefOr[WatchDirectory] = js.undefined
    
    /**
    		Specify the strategy for watching individual files.
    		@default 'useFsEvents'
    		@deprecated Use watchOptions.watchFile instead.
    		*/
    var watchFile: js.UndefOr[WatchFile] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.fixedPollingInterval_
      - typings.typeFest.typeFestStrings.priorityPollingInterval_
      - typings.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typings.typeFest.typeFestStrings.fixedInterval_
      - typings.typeFest.typeFestStrings.priorityInterval_
      - typings.typeFest.typeFestStrings.dynamicPriority_
      - typings.typeFest.typeFestStrings.fixedChunkSize_
    */
    trait FallbackPolling extends StObject
    object FallbackPolling {
      
      inline def dynamicPriority: dynamicPriority_ = "dynamicPriority".asInstanceOf[dynamicPriority_]
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSize: fixedChunkSize_ = "fixedChunkSize".asInstanceOf[fixedChunkSize_]
      
      inline def fixedInterval: fixedInterval_ = "fixedInterval".asInstanceOf[fixedInterval_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def priorityInterval: priorityInterval_ = "priorityInterval".asInstanceOf[priorityInterval_]
      
      inline def priorityPollingInterval: priorityPollingInterval_ = "priorityPollingInterval".asInstanceOf[priorityPollingInterval_]
    }
    
    type IgnoreDeprecations = `5Dot0`
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.remove
      - typings.typeFest.typeFestStrings.preserve
      - typings.typeFest.typeFestStrings.error
    */
    trait ImportsNotUsedAsValues extends StObject
    object ImportsNotUsedAsValues {
      
      inline def error: typings.typeFest.typeFestStrings.error = "error".asInstanceOf[typings.typeFest.typeFestStrings.error]
      
      inline def preserve: typings.typeFest.typeFestStrings.preserve = "preserve".asInstanceOf[typings.typeFest.typeFestStrings.preserve]
      
      inline def remove: typings.typeFest.typeFestStrings.remove = "remove".asInstanceOf[typings.typeFest.typeFestStrings.remove]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.preserve
      - typings.typeFest.typeFestStrings.react
      - typings.typeFest.typeFestStrings.`react-jsx`
      - typings.typeFest.typeFestStrings.`react-jsxdev`
      - typings.typeFest.typeFestStrings.`react-native`
    */
    trait JSX extends StObject
    object JSX {
      
      inline def preserve: typings.typeFest.typeFestStrings.preserve = "preserve".asInstanceOf[typings.typeFest.typeFestStrings.preserve]
      
      inline def react: typings.typeFest.typeFestStrings.react = "react".asInstanceOf[typings.typeFest.typeFestStrings.react]
      
      inline def `react-jsx`: typings.typeFest.typeFestStrings.`react-jsx` = "react-jsx".asInstanceOf[typings.typeFest.typeFestStrings.`react-jsx`]
      
      inline def `react-jsxdev`: typings.typeFest.typeFestStrings.`react-jsxdev` = "react-jsxdev".asInstanceOf[typings.typeFest.typeFestStrings.`react-jsxdev`]
      
      inline def `react-native`: typings.typeFest.typeFestStrings.`react-native` = "react-native".asInstanceOf[typings.typeFest.typeFestStrings.`react-native`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.ES5
      - typings.typeFest.typeFestStrings.ES6
      - typings.typeFest.typeFestStrings.ES7
      - typings.typeFest.typeFestStrings.ES2015
      - typings.typeFest.typeFestStrings.ES2015DotCollection
      - typings.typeFest.typeFestStrings.ES2015DotCore
      - typings.typeFest.typeFestStrings.ES2015DotGenerator
      - typings.typeFest.typeFestStrings.ES2015DotIterable
      - typings.typeFest.typeFestStrings.ES2015DotPromise
      - typings.typeFest.typeFestStrings.ES2015DotProxy
      - typings.typeFest.typeFestStrings.ES2015DotReflect
      - typings.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown
      - typings.typeFest.typeFestStrings.ES2015DotSymbol
      - typings.typeFest.typeFestStrings.ES2016
      - typings.typeFest.typeFestStrings.ES2016DotArrayDotInclude
      - typings.typeFest.typeFestStrings.ES2017
      - typings.typeFest.typeFestStrings.ES2017DotIntl
      - typings.typeFest.typeFestStrings.ES2017DotObject
      - typings.typeFest.typeFestStrings.ES2017DotSharedMemory
      - typings.typeFest.typeFestStrings.ES2017DotString
      - typings.typeFest.typeFestStrings.ES2017DotTypedArrays
      - typings.typeFest.typeFestStrings.ES2018
      - typings.typeFest.typeFestStrings.ES2018DotAsyncGenerator
      - typings.typeFest.typeFestStrings.ES2018DotAsyncIterable
      - typings.typeFest.typeFestStrings.ES2018DotIntl
      - typings.typeFest.typeFestStrings.ES2018DotPromise
      - typings.typeFest.typeFestStrings.ES2018DotRegexp
      - typings.typeFest.typeFestStrings.ES2019
      - typings.typeFest.typeFestStrings.ES2019DotArray
      - typings.typeFest.typeFestStrings.ES2019DotObject
      - typings.typeFest.typeFestStrings.ES2019DotString
      - typings.typeFest.typeFestStrings.ES2019DotSymbol
      - typings.typeFest.typeFestStrings.ES2020
      - typings.typeFest.typeFestStrings.ES2020DotBigInt
      - typings.typeFest.typeFestStrings.ES2020DotPromise
      - typings.typeFest.typeFestStrings.ES2020DotString
      - typings.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown
      - typings.typeFest.typeFestStrings.ES2020DotSharedMemory
      - typings.typeFest.typeFestStrings.ES2020DotIntl
      - typings.typeFest.typeFestStrings.ES2021
      - typings.typeFest.typeFestStrings.ES2021DotPromise
      - typings.typeFest.typeFestStrings.ES2021DotString
      - typings.typeFest.typeFestStrings.ES2021DotWeakRef
      - typings.typeFest.typeFestStrings.ESNext
      - typings.typeFest.typeFestStrings.ESNextDotArray
      - typings.typeFest.typeFestStrings.ESNextDotAsyncIterable
      - typings.typeFest.typeFestStrings.ESNextDotBigInt
      - typings.typeFest.typeFestStrings.ESNextDotIntl
      - typings.typeFest.typeFestStrings.ESNextDotPromise
      - typings.typeFest.typeFestStrings.ESNextDotString
      - typings.typeFest.typeFestStrings.ESNextDotSymbol
      - typings.typeFest.typeFestStrings.ESNextDotWeakRef
      - typings.typeFest.typeFestStrings.DOM
      - typings.typeFest.typeFestStrings.DOMDotIterable
      - typings.typeFest.typeFestStrings.ScriptHost
      - typings.typeFest.typeFestStrings.WebWorker
      - typings.typeFest.typeFestStrings.WebWorkerDotImportScripts
      - typings.typeFest.typeFestStrings.WebWorkerDotIterable
      - typings.typeFest.typeFestStrings.es5_
      - typings.typeFest.typeFestStrings.es6_
      - typings.typeFest.typeFestStrings.es7_
      - typings.typeFest.typeFestStrings.es2015_
      - typings.typeFest.typeFestStrings.es2015Dotcollection
      - typings.typeFest.typeFestStrings.es2015Dotcore
      - typings.typeFest.typeFestStrings.es2015Dotgenerator
      - typings.typeFest.typeFestStrings.es2015Dotiterable
      - typings.typeFest.typeFestStrings.es2015Dotpromise
      - typings.typeFest.typeFestStrings.es2015Dotproxy
      - typings.typeFest.typeFestStrings.es2015Dotreflect
      - typings.typeFest.typeFestStrings.es2015DotsymbolDotwellknown
      - typings.typeFest.typeFestStrings.es2015Dotsymbol
      - typings.typeFest.typeFestStrings.es2016_
      - typings.typeFest.typeFestStrings.es2016DotarrayDotinclude
      - typings.typeFest.typeFestStrings.es2017_
      - typings.typeFest.typeFestStrings.es2017Dotintl
      - typings.typeFest.typeFestStrings.es2017Dotobject
      - typings.typeFest.typeFestStrings.es2017Dotsharedmemory
      - typings.typeFest.typeFestStrings.es2017Dotstring
      - typings.typeFest.typeFestStrings.es2017Dottypedarrays
      - typings.typeFest.typeFestStrings.es2018_
      - typings.typeFest.typeFestStrings.es2018Dotasyncgenerator
      - typings.typeFest.typeFestStrings.es2018Dotasynciterable
      - typings.typeFest.typeFestStrings.es2018Dotintl
      - typings.typeFest.typeFestStrings.es2018Dotpromise
      - typings.typeFest.typeFestStrings.es2018Dotregexp
      - typings.typeFest.typeFestStrings.es2019_
      - typings.typeFest.typeFestStrings.es2019Dotarray
      - typings.typeFest.typeFestStrings.es2019Dotobject
      - typings.typeFest.typeFestStrings.es2019Dotstring
      - typings.typeFest.typeFestStrings.es2019Dotsymbol
      - typings.typeFest.typeFestStrings.es2020_
      - typings.typeFest.typeFestStrings.es2020Dotbigint
      - typings.typeFest.typeFestStrings.es2020Dotpromise
      - typings.typeFest.typeFestStrings.es2020Dotstring
      - typings.typeFest.typeFestStrings.es2020DotsymbolDotwellknown
      - typings.typeFest.typeFestStrings.es2020Dotsharedmemory
      - typings.typeFest.typeFestStrings.es2020Dotintl
      - typings.typeFest.typeFestStrings.es2021_
      - typings.typeFest.typeFestStrings.es2021Dotpromise
      - typings.typeFest.typeFestStrings.es2021Dotstring
      - typings.typeFest.typeFestStrings.es2021Dotweakref
      - typings.typeFest.typeFestStrings.esnext_
      - typings.typeFest.typeFestStrings.esnextDotarray
      - typings.typeFest.typeFestStrings.esnextDotasynciterable
      - typings.typeFest.typeFestStrings.esnextDotbigint
      - typings.typeFest.typeFestStrings.esnextDotintl
      - typings.typeFest.typeFestStrings.esnextDotpromise
      - typings.typeFest.typeFestStrings.esnextDotstring
      - typings.typeFest.typeFestStrings.esnextDotsymbol
      - typings.typeFest.typeFestStrings.esnextDotweakref
      - typings.typeFest.typeFestStrings.dom_
      - typings.typeFest.typeFestStrings.domDotiterable
      - typings.typeFest.typeFestStrings.scripthost_
      - typings.typeFest.typeFestStrings.webworker_
      - typings.typeFest.typeFestStrings.webworkerDotimportscripts
      - typings.typeFest.typeFestStrings.webworkerDotiterable
    */
    trait Lib extends StObject
    object Lib {
      
      inline def DOM: typings.typeFest.typeFestStrings.DOM = "DOM".asInstanceOf[typings.typeFest.typeFestStrings.DOM]
      
      inline def DOMDotIterable: typings.typeFest.typeFestStrings.DOMDotIterable = "DOM.Iterable".asInstanceOf[typings.typeFest.typeFestStrings.DOMDotIterable]
      
      inline def ES2015: typings.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typings.typeFest.typeFestStrings.ES2015]
      
      inline def ES2015DotCollection: typings.typeFest.typeFestStrings.ES2015DotCollection = "ES2015.Collection".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotCollection]
      
      inline def ES2015DotCore: typings.typeFest.typeFestStrings.ES2015DotCore = "ES2015.Core".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotCore]
      
      inline def ES2015DotGenerator: typings.typeFest.typeFestStrings.ES2015DotGenerator = "ES2015.Generator".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotGenerator]
      
      inline def ES2015DotIterable: typings.typeFest.typeFestStrings.ES2015DotIterable = "ES2015.Iterable".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotIterable]
      
      inline def ES2015DotPromise: typings.typeFest.typeFestStrings.ES2015DotPromise = "ES2015.Promise".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotPromise]
      
      inline def ES2015DotProxy: typings.typeFest.typeFestStrings.ES2015DotProxy = "ES2015.Proxy".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotProxy]
      
      inline def ES2015DotReflect: typings.typeFest.typeFestStrings.ES2015DotReflect = "ES2015.Reflect".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotReflect]
      
      inline def ES2015DotSymbol: typings.typeFest.typeFestStrings.ES2015DotSymbol = "ES2015.Symbol".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotSymbol]
      
      inline def ES2015DotSymbolDotWellKnown: typings.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown = "ES2015.Symbol.WellKnown".asInstanceOf[typings.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown]
      
      inline def ES2016: typings.typeFest.typeFestStrings.ES2016 = "ES2016".asInstanceOf[typings.typeFest.typeFestStrings.ES2016]
      
      inline def ES2016DotArrayDotInclude: typings.typeFest.typeFestStrings.ES2016DotArrayDotInclude = "ES2016.Array.Include".asInstanceOf[typings.typeFest.typeFestStrings.ES2016DotArrayDotInclude]
      
      inline def ES2017: typings.typeFest.typeFestStrings.ES2017 = "ES2017".asInstanceOf[typings.typeFest.typeFestStrings.ES2017]
      
      inline def ES2017DotIntl: typings.typeFest.typeFestStrings.ES2017DotIntl = "ES2017.Intl".asInstanceOf[typings.typeFest.typeFestStrings.ES2017DotIntl]
      
      inline def ES2017DotObject: typings.typeFest.typeFestStrings.ES2017DotObject = "ES2017.Object".asInstanceOf[typings.typeFest.typeFestStrings.ES2017DotObject]
      
      inline def ES2017DotSharedMemory: typings.typeFest.typeFestStrings.ES2017DotSharedMemory = "ES2017.SharedMemory".asInstanceOf[typings.typeFest.typeFestStrings.ES2017DotSharedMemory]
      
      inline def ES2017DotString: typings.typeFest.typeFestStrings.ES2017DotString = "ES2017.String".asInstanceOf[typings.typeFest.typeFestStrings.ES2017DotString]
      
      inline def ES2017DotTypedArrays: typings.typeFest.typeFestStrings.ES2017DotTypedArrays = "ES2017.TypedArrays".asInstanceOf[typings.typeFest.typeFestStrings.ES2017DotTypedArrays]
      
      inline def ES2018: typings.typeFest.typeFestStrings.ES2018 = "ES2018".asInstanceOf[typings.typeFest.typeFestStrings.ES2018]
      
      inline def ES2018DotAsyncGenerator: typings.typeFest.typeFestStrings.ES2018DotAsyncGenerator = "ES2018.AsyncGenerator".asInstanceOf[typings.typeFest.typeFestStrings.ES2018DotAsyncGenerator]
      
      inline def ES2018DotAsyncIterable: typings.typeFest.typeFestStrings.ES2018DotAsyncIterable = "ES2018.AsyncIterable".asInstanceOf[typings.typeFest.typeFestStrings.ES2018DotAsyncIterable]
      
      inline def ES2018DotIntl: typings.typeFest.typeFestStrings.ES2018DotIntl = "ES2018.Intl".asInstanceOf[typings.typeFest.typeFestStrings.ES2018DotIntl]
      
      inline def ES2018DotPromise: typings.typeFest.typeFestStrings.ES2018DotPromise = "ES2018.Promise".asInstanceOf[typings.typeFest.typeFestStrings.ES2018DotPromise]
      
      inline def ES2018DotRegexp: typings.typeFest.typeFestStrings.ES2018DotRegexp = "ES2018.Regexp".asInstanceOf[typings.typeFest.typeFestStrings.ES2018DotRegexp]
      
      inline def ES2019: typings.typeFest.typeFestStrings.ES2019 = "ES2019".asInstanceOf[typings.typeFest.typeFestStrings.ES2019]
      
      inline def ES2019DotArray: typings.typeFest.typeFestStrings.ES2019DotArray = "ES2019.Array".asInstanceOf[typings.typeFest.typeFestStrings.ES2019DotArray]
      
      inline def ES2019DotObject: typings.typeFest.typeFestStrings.ES2019DotObject = "ES2019.Object".asInstanceOf[typings.typeFest.typeFestStrings.ES2019DotObject]
      
      inline def ES2019DotString: typings.typeFest.typeFestStrings.ES2019DotString = "ES2019.String".asInstanceOf[typings.typeFest.typeFestStrings.ES2019DotString]
      
      inline def ES2019DotSymbol: typings.typeFest.typeFestStrings.ES2019DotSymbol = "ES2019.Symbol".asInstanceOf[typings.typeFest.typeFestStrings.ES2019DotSymbol]
      
      inline def ES2020: typings.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typings.typeFest.typeFestStrings.ES2020]
      
      inline def ES2020DotBigInt: typings.typeFest.typeFestStrings.ES2020DotBigInt = "ES2020.BigInt".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotBigInt]
      
      inline def ES2020DotIntl: typings.typeFest.typeFestStrings.ES2020DotIntl = "ES2020.Intl".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotIntl]
      
      inline def ES2020DotPromise: typings.typeFest.typeFestStrings.ES2020DotPromise = "ES2020.Promise".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotPromise]
      
      inline def ES2020DotSharedMemory: typings.typeFest.typeFestStrings.ES2020DotSharedMemory = "ES2020.SharedMemory".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotSharedMemory]
      
      inline def ES2020DotString: typings.typeFest.typeFestStrings.ES2020DotString = "ES2020.String".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotString]
      
      inline def ES2020DotSymbolDotWellKnown: typings.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown = "ES2020.Symbol.WellKnown".asInstanceOf[typings.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown]
      
      inline def ES2021: typings.typeFest.typeFestStrings.ES2021 = "ES2021".asInstanceOf[typings.typeFest.typeFestStrings.ES2021]
      
      inline def ES2021DotPromise: typings.typeFest.typeFestStrings.ES2021DotPromise = "ES2021.Promise".asInstanceOf[typings.typeFest.typeFestStrings.ES2021DotPromise]
      
      inline def ES2021DotString: typings.typeFest.typeFestStrings.ES2021DotString = "ES2021.String".asInstanceOf[typings.typeFest.typeFestStrings.ES2021DotString]
      
      inline def ES2021DotWeakRef: typings.typeFest.typeFestStrings.ES2021DotWeakRef = "ES2021.WeakRef".asInstanceOf[typings.typeFest.typeFestStrings.ES2021DotWeakRef]
      
      inline def ES5: typings.typeFest.typeFestStrings.ES5 = "ES5".asInstanceOf[typings.typeFest.typeFestStrings.ES5]
      
      inline def ES6: typings.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typings.typeFest.typeFestStrings.ES6]
      
      inline def ES7: typings.typeFest.typeFestStrings.ES7 = "ES7".asInstanceOf[typings.typeFest.typeFestStrings.ES7]
      
      inline def ESNext: typings.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typings.typeFest.typeFestStrings.ESNext]
      
      inline def ESNextDotArray: typings.typeFest.typeFestStrings.ESNextDotArray = "ESNext.Array".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotArray]
      
      inline def ESNextDotAsyncIterable: typings.typeFest.typeFestStrings.ESNextDotAsyncIterable = "ESNext.AsyncIterable".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotAsyncIterable]
      
      inline def ESNextDotBigInt: typings.typeFest.typeFestStrings.ESNextDotBigInt = "ESNext.BigInt".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotBigInt]
      
      inline def ESNextDotIntl: typings.typeFest.typeFestStrings.ESNextDotIntl = "ESNext.Intl".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotIntl]
      
      inline def ESNextDotPromise: typings.typeFest.typeFestStrings.ESNextDotPromise = "ESNext.Promise".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotPromise]
      
      inline def ESNextDotString: typings.typeFest.typeFestStrings.ESNextDotString = "ESNext.String".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotString]
      
      inline def ESNextDotSymbol: typings.typeFest.typeFestStrings.ESNextDotSymbol = "ESNext.Symbol".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotSymbol]
      
      inline def ESNextDotWeakRef: typings.typeFest.typeFestStrings.ESNextDotWeakRef = "ESNext.WeakRef".asInstanceOf[typings.typeFest.typeFestStrings.ESNextDotWeakRef]
      
      inline def ScriptHost: typings.typeFest.typeFestStrings.ScriptHost = "ScriptHost".asInstanceOf[typings.typeFest.typeFestStrings.ScriptHost]
      
      inline def WebWorker: typings.typeFest.typeFestStrings.WebWorker = "WebWorker".asInstanceOf[typings.typeFest.typeFestStrings.WebWorker]
      
      inline def WebWorkerDotImportScripts: typings.typeFest.typeFestStrings.WebWorkerDotImportScripts = "WebWorker.ImportScripts".asInstanceOf[typings.typeFest.typeFestStrings.WebWorkerDotImportScripts]
      
      inline def WebWorkerDotIterable: typings.typeFest.typeFestStrings.WebWorkerDotIterable = "WebWorker.Iterable".asInstanceOf[typings.typeFest.typeFestStrings.WebWorkerDotIterable]
      
      inline def dom: dom_ = "dom".asInstanceOf[dom_]
      
      inline def domDotiterable: typings.typeFest.typeFestStrings.domDotiterable = "dom.iterable".asInstanceOf[typings.typeFest.typeFestStrings.domDotiterable]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2015Dotcollection: typings.typeFest.typeFestStrings.es2015Dotcollection = "es2015.collection".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotcollection]
      
      inline def es2015Dotcore: typings.typeFest.typeFestStrings.es2015Dotcore = "es2015.core".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotcore]
      
      inline def es2015Dotgenerator: typings.typeFest.typeFestStrings.es2015Dotgenerator = "es2015.generator".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotgenerator]
      
      inline def es2015Dotiterable: typings.typeFest.typeFestStrings.es2015Dotiterable = "es2015.iterable".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotiterable]
      
      inline def es2015Dotpromise: typings.typeFest.typeFestStrings.es2015Dotpromise = "es2015.promise".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotpromise]
      
      inline def es2015Dotproxy: typings.typeFest.typeFestStrings.es2015Dotproxy = "es2015.proxy".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotproxy]
      
      inline def es2015Dotreflect: typings.typeFest.typeFestStrings.es2015Dotreflect = "es2015.reflect".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotreflect]
      
      inline def es2015Dotsymbol: typings.typeFest.typeFestStrings.es2015Dotsymbol = "es2015.symbol".asInstanceOf[typings.typeFest.typeFestStrings.es2015Dotsymbol]
      
      inline def es2015DotsymbolDotwellknown: typings.typeFest.typeFestStrings.es2015DotsymbolDotwellknown = "es2015.symbol.wellknown".asInstanceOf[typings.typeFest.typeFestStrings.es2015DotsymbolDotwellknown]
      
      inline def es2016: es2016_ = "es2016".asInstanceOf[es2016_]
      
      inline def es2016DotarrayDotinclude: typings.typeFest.typeFestStrings.es2016DotarrayDotinclude = "es2016.array.include".asInstanceOf[typings.typeFest.typeFestStrings.es2016DotarrayDotinclude]
      
      inline def es2017: es2017_ = "es2017".asInstanceOf[es2017_]
      
      inline def es2017Dotintl: typings.typeFest.typeFestStrings.es2017Dotintl = "es2017.intl".asInstanceOf[typings.typeFest.typeFestStrings.es2017Dotintl]
      
      inline def es2017Dotobject: typings.typeFest.typeFestStrings.es2017Dotobject = "es2017.object".asInstanceOf[typings.typeFest.typeFestStrings.es2017Dotobject]
      
      inline def es2017Dotsharedmemory: typings.typeFest.typeFestStrings.es2017Dotsharedmemory = "es2017.sharedmemory".asInstanceOf[typings.typeFest.typeFestStrings.es2017Dotsharedmemory]
      
      inline def es2017Dotstring: typings.typeFest.typeFestStrings.es2017Dotstring = "es2017.string".asInstanceOf[typings.typeFest.typeFestStrings.es2017Dotstring]
      
      inline def es2017Dottypedarrays: typings.typeFest.typeFestStrings.es2017Dottypedarrays = "es2017.typedarrays".asInstanceOf[typings.typeFest.typeFestStrings.es2017Dottypedarrays]
      
      inline def es2018: es2018_ = "es2018".asInstanceOf[es2018_]
      
      inline def es2018Dotasyncgenerator: typings.typeFest.typeFestStrings.es2018Dotasyncgenerator = "es2018.asyncgenerator".asInstanceOf[typings.typeFest.typeFestStrings.es2018Dotasyncgenerator]
      
      inline def es2018Dotasynciterable: typings.typeFest.typeFestStrings.es2018Dotasynciterable = "es2018.asynciterable".asInstanceOf[typings.typeFest.typeFestStrings.es2018Dotasynciterable]
      
      inline def es2018Dotintl: typings.typeFest.typeFestStrings.es2018Dotintl = "es2018.intl".asInstanceOf[typings.typeFest.typeFestStrings.es2018Dotintl]
      
      inline def es2018Dotpromise: typings.typeFest.typeFestStrings.es2018Dotpromise = "es2018.promise".asInstanceOf[typings.typeFest.typeFestStrings.es2018Dotpromise]
      
      inline def es2018Dotregexp: typings.typeFest.typeFestStrings.es2018Dotregexp = "es2018.regexp".asInstanceOf[typings.typeFest.typeFestStrings.es2018Dotregexp]
      
      inline def es2019: es2019_ = "es2019".asInstanceOf[es2019_]
      
      inline def es2019Dotarray: typings.typeFest.typeFestStrings.es2019Dotarray = "es2019.array".asInstanceOf[typings.typeFest.typeFestStrings.es2019Dotarray]
      
      inline def es2019Dotobject: typings.typeFest.typeFestStrings.es2019Dotobject = "es2019.object".asInstanceOf[typings.typeFest.typeFestStrings.es2019Dotobject]
      
      inline def es2019Dotstring: typings.typeFest.typeFestStrings.es2019Dotstring = "es2019.string".asInstanceOf[typings.typeFest.typeFestStrings.es2019Dotstring]
      
      inline def es2019Dotsymbol: typings.typeFest.typeFestStrings.es2019Dotsymbol = "es2019.symbol".asInstanceOf[typings.typeFest.typeFestStrings.es2019Dotsymbol]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2020Dotbigint: typings.typeFest.typeFestStrings.es2020Dotbigint = "es2020.bigint".asInstanceOf[typings.typeFest.typeFestStrings.es2020Dotbigint]
      
      inline def es2020Dotintl: typings.typeFest.typeFestStrings.es2020Dotintl = "es2020.intl".asInstanceOf[typings.typeFest.typeFestStrings.es2020Dotintl]
      
      inline def es2020Dotpromise: typings.typeFest.typeFestStrings.es2020Dotpromise = "es2020.promise".asInstanceOf[typings.typeFest.typeFestStrings.es2020Dotpromise]
      
      inline def es2020Dotsharedmemory: typings.typeFest.typeFestStrings.es2020Dotsharedmemory = "es2020.sharedmemory".asInstanceOf[typings.typeFest.typeFestStrings.es2020Dotsharedmemory]
      
      inline def es2020Dotstring: typings.typeFest.typeFestStrings.es2020Dotstring = "es2020.string".asInstanceOf[typings.typeFest.typeFestStrings.es2020Dotstring]
      
      inline def es2020DotsymbolDotwellknown: typings.typeFest.typeFestStrings.es2020DotsymbolDotwellknown = "es2020.symbol.wellknown".asInstanceOf[typings.typeFest.typeFestStrings.es2020DotsymbolDotwellknown]
      
      inline def es2021: es2021_ = "es2021".asInstanceOf[es2021_]
      
      inline def es2021Dotpromise: typings.typeFest.typeFestStrings.es2021Dotpromise = "es2021.promise".asInstanceOf[typings.typeFest.typeFestStrings.es2021Dotpromise]
      
      inline def es2021Dotstring: typings.typeFest.typeFestStrings.es2021Dotstring = "es2021.string".asInstanceOf[typings.typeFest.typeFestStrings.es2021Dotstring]
      
      inline def es2021Dotweakref: typings.typeFest.typeFestStrings.es2021Dotweakref = "es2021.weakref".asInstanceOf[typings.typeFest.typeFestStrings.es2021Dotweakref]
      
      inline def es5: es5_ = "es5".asInstanceOf[es5_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def es7: es7_ = "es7".asInstanceOf[es7_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
      
      inline def esnextDotarray: typings.typeFest.typeFestStrings.esnextDotarray = "esnext.array".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotarray]
      
      inline def esnextDotasynciterable: typings.typeFest.typeFestStrings.esnextDotasynciterable = "esnext.asynciterable".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotasynciterable]
      
      inline def esnextDotbigint: typings.typeFest.typeFestStrings.esnextDotbigint = "esnext.bigint".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotbigint]
      
      inline def esnextDotintl: typings.typeFest.typeFestStrings.esnextDotintl = "esnext.intl".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotintl]
      
      inline def esnextDotpromise: typings.typeFest.typeFestStrings.esnextDotpromise = "esnext.promise".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotpromise]
      
      inline def esnextDotstring: typings.typeFest.typeFestStrings.esnextDotstring = "esnext.string".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotstring]
      
      inline def esnextDotsymbol: typings.typeFest.typeFestStrings.esnextDotsymbol = "esnext.symbol".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotsymbol]
      
      inline def esnextDotweakref: typings.typeFest.typeFestStrings.esnextDotweakref = "esnext.weakref".asInstanceOf[typings.typeFest.typeFestStrings.esnextDotweakref]
      
      inline def scripthost: scripthost_ = "scripthost".asInstanceOf[scripthost_]
      
      inline def webworker: webworker_ = "webworker".asInstanceOf[webworker_]
      
      inline def webworkerDotimportscripts: typings.typeFest.typeFestStrings.webworkerDotimportscripts = "webworker.importscripts".asInstanceOf[typings.typeFest.typeFestStrings.webworkerDotimportscripts]
      
      inline def webworkerDotiterable: typings.typeFest.typeFestStrings.webworkerDotiterable = "webworker.iterable".asInstanceOf[typings.typeFest.typeFestStrings.webworkerDotiterable]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.CommonJS
      - typings.typeFest.typeFestStrings.AMD
      - typings.typeFest.typeFestStrings.System
      - typings.typeFest.typeFestStrings.UMD
      - typings.typeFest.typeFestStrings.ES6
      - typings.typeFest.typeFestStrings.ES2015
      - typings.typeFest.typeFestStrings.ES2020
      - typings.typeFest.typeFestStrings.ES2022
      - typings.typeFest.typeFestStrings.ESNext
      - typings.typeFest.typeFestStrings.Node16
      - typings.typeFest.typeFestStrings.NodeNext
      - typings.typeFest.typeFestStrings.None
      - typings.typeFest.typeFestStrings.commonjs_
      - typings.typeFest.typeFestStrings.amd_
      - typings.typeFest.typeFestStrings.system_
      - typings.typeFest.typeFestStrings.umd_
      - typings.typeFest.typeFestStrings.es6_
      - typings.typeFest.typeFestStrings.es2015_
      - typings.typeFest.typeFestStrings.es2020_
      - typings.typeFest.typeFestStrings.es2022_
      - typings.typeFest.typeFestStrings.esnext_
      - typings.typeFest.typeFestStrings.node16_
      - typings.typeFest.typeFestStrings.nodenext_
      - typings.typeFest.typeFestStrings.none_
    */
    trait Module extends StObject
    object Module {
      
      inline def AMD: typings.typeFest.typeFestStrings.AMD = "AMD".asInstanceOf[typings.typeFest.typeFestStrings.AMD]
      
      inline def CommonJS: typings.typeFest.typeFestStrings.CommonJS = "CommonJS".asInstanceOf[typings.typeFest.typeFestStrings.CommonJS]
      
      inline def ES2015: typings.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typings.typeFest.typeFestStrings.ES2015]
      
      inline def ES2020: typings.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typings.typeFest.typeFestStrings.ES2020]
      
      inline def ES2022: typings.typeFest.typeFestStrings.ES2022 = "ES2022".asInstanceOf[typings.typeFest.typeFestStrings.ES2022]
      
      inline def ES6: typings.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typings.typeFest.typeFestStrings.ES6]
      
      inline def ESNext: typings.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typings.typeFest.typeFestStrings.ESNext]
      
      inline def Node16: typings.typeFest.typeFestStrings.Node16 = "Node16".asInstanceOf[typings.typeFest.typeFestStrings.Node16]
      
      inline def NodeNext: typings.typeFest.typeFestStrings.NodeNext = "NodeNext".asInstanceOf[typings.typeFest.typeFestStrings.NodeNext]
      
      inline def None: typings.typeFest.typeFestStrings.None = "None".asInstanceOf[typings.typeFest.typeFestStrings.None]
      
      inline def System: typings.typeFest.typeFestStrings.System = "System".asInstanceOf[typings.typeFest.typeFestStrings.System]
      
      inline def UMD: typings.typeFest.typeFestStrings.UMD = "UMD".asInstanceOf[typings.typeFest.typeFestStrings.UMD]
      
      inline def amd: amd_ = "amd".asInstanceOf[amd_]
      
      inline def commonjs: commonjs_ = "commonjs".asInstanceOf[commonjs_]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2022: es2022_ = "es2022".asInstanceOf[es2022_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
      
      inline def node16: node16_ = "node16".asInstanceOf[node16_]
      
      inline def nodenext: nodenext_ = "nodenext".asInstanceOf[nodenext_]
      
      inline def none: none_ = "none".asInstanceOf[none_]
      
      inline def system: system_ = "system".asInstanceOf[system_]
      
      inline def umd: umd_ = "umd".asInstanceOf[umd_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.auto
      - typings.typeFest.typeFestStrings.legacy
      - typings.typeFest.typeFestStrings.force
    */
    trait ModuleDetection extends StObject
    object ModuleDetection {
      
      inline def auto: typings.typeFest.typeFestStrings.auto = "auto".asInstanceOf[typings.typeFest.typeFestStrings.auto]
      
      inline def force: typings.typeFest.typeFestStrings.force = "force".asInstanceOf[typings.typeFest.typeFestStrings.force]
      
      inline def legacy: typings.typeFest.typeFestStrings.legacy = "legacy".asInstanceOf[typings.typeFest.typeFestStrings.legacy]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.classic_
      - typings.typeFest.typeFestStrings.node_
      - typings.typeFest.typeFestStrings.node10_
      - typings.typeFest.typeFestStrings.node16_
      - typings.typeFest.typeFestStrings.nodenext_
      - typings.typeFest.typeFestStrings.bundler_
      - typings.typeFest.typeFestStrings.Classic
      - typings.typeFest.typeFestStrings.Node
      - typings.typeFest.typeFestStrings.Node10
      - typings.typeFest.typeFestStrings.Node16
      - typings.typeFest.typeFestStrings.NodeNext
      - typings.typeFest.typeFestStrings.Bundler
    */
    trait ModuleResolution extends StObject
    object ModuleResolution {
      
      inline def Bundler: typings.typeFest.typeFestStrings.Bundler = "Bundler".asInstanceOf[typings.typeFest.typeFestStrings.Bundler]
      
      inline def Classic: typings.typeFest.typeFestStrings.Classic = "Classic".asInstanceOf[typings.typeFest.typeFestStrings.Classic]
      
      inline def Node: typings.typeFest.typeFestStrings.Node = "Node".asInstanceOf[typings.typeFest.typeFestStrings.Node]
      
      inline def Node10: typings.typeFest.typeFestStrings.Node10 = "Node10".asInstanceOf[typings.typeFest.typeFestStrings.Node10]
      
      inline def Node16: typings.typeFest.typeFestStrings.Node16 = "Node16".asInstanceOf[typings.typeFest.typeFestStrings.Node16]
      
      inline def NodeNext: typings.typeFest.typeFestStrings.NodeNext = "NodeNext".asInstanceOf[typings.typeFest.typeFestStrings.NodeNext]
      
      inline def bundler: bundler_ = "bundler".asInstanceOf[bundler_]
      
      inline def classic: classic_ = "classic".asInstanceOf[classic_]
      
      inline def node: node_ = "node".asInstanceOf[node_]
      
      inline def node10: node10_ = "node10".asInstanceOf[node10_]
      
      inline def node16: node16_ = "node16".asInstanceOf[node16_]
      
      inline def nodenext: nodenext_ = "nodenext".asInstanceOf[nodenext_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowArbitraryExtensions(value: Boolean): Self = StObject.set(x, "allowArbitraryExtensions", value.asInstanceOf[js.Any])
      
      inline def setAllowArbitraryExtensionsUndefined: Self = StObject.set(x, "allowArbitraryExtensions", js.undefined)
      
      inline def setAllowImportingTsExtensions(value: Boolean): Self = StObject.set(x, "allowImportingTsExtensions", value.asInstanceOf[js.Any])
      
      inline def setAllowImportingTsExtensionsUndefined: Self = StObject.set(x, "allowImportingTsExtensions", js.undefined)
      
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
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCheckJs(value: Boolean): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      inline def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      inline def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setCustomConditions(value: js.Array[String]): Self = StObject.set(x, "customConditions", value.asInstanceOf[js.Any])
      
      inline def setCustomConditionsUndefined: Self = StObject.set(x, "customConditions", js.undefined)
      
      inline def setCustomConditionsVarargs(value: String*): Self = StObject.set(x, "customConditions", js.Array(value*))
      
      inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDir(value: String): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      inline def setDeclarationMap(value: Boolean): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
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
      
      inline def setExactOptionalPropertyTypes(value: Boolean): Self = StObject.set(x, "exactOptionalPropertyTypes", value.asInstanceOf[js.Any])
      
      inline def setExactOptionalPropertyTypesUndefined: Self = StObject.set(x, "exactOptionalPropertyTypes", js.undefined)
      
      inline def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setExplainFiles(value: Boolean): Self = StObject.set(x, "explainFiles", value.asInstanceOf[js.Any])
      
      inline def setExplainFilesUndefined: Self = StObject.set(x, "explainFiles", js.undefined)
      
      inline def setExtendedDiagnostics(value: Boolean): Self = StObject.set(x, "extendedDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setExtendedDiagnosticsUndefined: Self = StObject.set(x, "extendedDiagnostics", js.undefined)
      
      inline def setFallbackPolling(value: FallbackPolling): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
      
      inline def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
      
      inline def setForceConsistentCasingInFileNames(value: Boolean): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      inline def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      inline def setGenerateCpuProfile(value: String): Self = StObject.set(x, "generateCpuProfile", value.asInstanceOf[js.Any])
      
      inline def setGenerateCpuProfileUndefined: Self = StObject.set(x, "generateCpuProfile", js.undefined)
      
      inline def setIgnoreDeprecations(value: IgnoreDeprecations): Self = StObject.set(x, "ignoreDeprecations", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDeprecationsUndefined: Self = StObject.set(x, "ignoreDeprecations", js.undefined)
      
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
      
      inline def setJsx(value: JSX): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      inline def setJsxFragmentFactory(value: String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKeyofStringsOnly(value: Boolean): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      inline def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      inline def setLib(value: js.Array[Lib]): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setLibVarargs(value: Lib*): Self = StObject.set(x, "lib", js.Array(value*))
      
      inline def setListEmittedFiles(value: Boolean): Self = StObject.set(x, "listEmittedFiles", value.asInstanceOf[js.Any])
      
      inline def setListEmittedFilesUndefined: Self = StObject.set(x, "listEmittedFiles", js.undefined)
      
      inline def setListFiles(value: Boolean): Self = StObject.set(x, "listFiles", value.asInstanceOf[js.Any])
      
      inline def setListFilesOnly(value: Boolean): Self = StObject.set(x, "listFilesOnly", value.asInstanceOf[js.Any])
      
      inline def setListFilesOnlyUndefined: Self = StObject.set(x, "listFilesOnly", js.undefined)
      
      inline def setListFilesUndefined: Self = StObject.set(x, "listFiles", js.undefined)
      
      inline def setMapRoot(value: String): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      inline def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      inline def setMaxNodeModuleJsDepth(value: Double): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleDetection(value: ModuleDetection): Self = StObject.set(x, "moduleDetection", value.asInstanceOf[js.Any])
      
      inline def setModuleDetectionUndefined: Self = StObject.set(x, "moduleDetection", js.undefined)
      
      inline def setModuleResolution(value: ModuleResolution): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      inline def setModuleSuffixes(value: js.Array[String]): Self = StObject.set(x, "moduleSuffixes", value.asInstanceOf[js.Any])
      
      inline def setModuleSuffixesUndefined: Self = StObject.set(x, "moduleSuffixes", js.undefined)
      
      inline def setModuleSuffixesVarargs(value: String*): Self = StObject.set(x, "moduleSuffixes", js.Array(value*))
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setNewLine(value: NewLine): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
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
      
      inline def setNoImplicitOverride(value: Boolean): Self = StObject.set(x, "noImplicitOverride", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitOverrideUndefined: Self = StObject.set(x, "noImplicitOverride", js.undefined)
      
      inline def setNoImplicitReturns(value: Boolean): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      inline def setNoImplicitThis(value: Boolean): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      inline def setNoImplicitUseStrict(value: Boolean): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      inline def setNoLib(value: Boolean): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      inline def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      inline def setNoPropertyAccessFromIndexSignature(value: Boolean): Self = StObject.set(x, "noPropertyAccessFromIndexSignature", value.asInstanceOf[js.Any])
      
      inline def setNoPropertyAccessFromIndexSignatureUndefined: Self = StObject.set(x, "noPropertyAccessFromIndexSignature", js.undefined)
      
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
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setPaths(value: Record[String, js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPreserveConstEnums(value: Boolean): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      inline def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setPreserveValueImports(value: Boolean): Self = StObject.set(x, "preserveValueImports", value.asInstanceOf[js.Any])
      
      inline def setPreserveValueImportsUndefined: Self = StObject.set(x, "preserveValueImports", js.undefined)
      
      inline def setPreserveWatchOutput(value: Boolean): Self = StObject.set(x, "preserveWatchOutput", value.asInstanceOf[js.Any])
      
      inline def setPreserveWatchOutputUndefined: Self = StObject.set(x, "preserveWatchOutput", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setReactNamespace(value: String): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      inline def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      inline def setResolveJsonModule(value: Boolean): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      inline def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      inline def setResolvePackageJsonExports(value: Boolean): Self = StObject.set(x, "resolvePackageJsonExports", value.asInstanceOf[js.Any])
      
      inline def setResolvePackageJsonExportsUndefined: Self = StObject.set(x, "resolvePackageJsonExports", js.undefined)
      
      inline def setResolvePackageJsonImports(value: Boolean): Self = StObject.set(x, "resolvePackageJsonImports", value.asInstanceOf[js.Any])
      
      inline def setResolvePackageJsonImportsUndefined: Self = StObject.set(x, "resolvePackageJsonImports", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootDirs(value: js.Array[String]): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      inline def setRootDirsVarargs(value: String*): Self = StObject.set(x, "rootDirs", js.Array(value*))
      
      inline def setSkipDefaultLibCheck(value: Boolean): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      inline def setSkipLibCheck(value: Boolean): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
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
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTraceResolution(value: Boolean): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      inline def setTsBuildInfoFile(value: String): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      inline def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      inline def setTypeRoots(value: js.Array[String]): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      inline def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      inline def setTypeRootsVarargs(value: String*): Self = StObject.set(x, "typeRoots", js.Array(value*))
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
      
      inline def setUseUnknownInCatchVariables(value: Boolean): Self = StObject.set(x, "useUnknownInCatchVariables", value.asInstanceOf[js.Any])
      
      inline def setUseUnknownInCatchVariablesUndefined: Self = StObject.set(x, "useUnknownInCatchVariables", js.undefined)
      
      inline def setVerbatimModuleSyntax(value: Boolean): Self = StObject.set(x, "verbatimModuleSyntax", value.asInstanceOf[js.Any])
      
      inline def setVerbatimModuleSyntaxUndefined: Self = StObject.set(x, "verbatimModuleSyntax", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectory(value: WatchDirectory): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      inline def setWatchFile(value: WatchFile): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
      
      inline def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.CRLF
      - typings.typeFest.typeFestStrings.LF
      - typings.typeFest.typeFestStrings.crlf_
      - typings.typeFest.typeFestStrings.lf_
    */
    trait NewLine extends StObject
    object NewLine {
      
      inline def CRLF: typings.typeFest.typeFestStrings.CRLF = "CRLF".asInstanceOf[typings.typeFest.typeFestStrings.CRLF]
      
      inline def LF: typings.typeFest.typeFestStrings.LF = "LF".asInstanceOf[typings.typeFest.typeFestStrings.LF]
      
      inline def crlf: crlf_ = "crlf".asInstanceOf[crlf_]
      
      inline def lf: lf_ = "lf".asInstanceOf[lf_]
    }
    
    trait Plugin extends StObject {
      
      /**
      			Plugin name.
      			*/
      var name: String
    }
    object Plugin {
      
      inline def apply(name: String): Plugin = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugin]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.ES3
      - typings.typeFest.typeFestStrings.ES5
      - typings.typeFest.typeFestStrings.ES6
      - typings.typeFest.typeFestStrings.ES2015
      - typings.typeFest.typeFestStrings.ES2016
      - typings.typeFest.typeFestStrings.ES2017
      - typings.typeFest.typeFestStrings.ES2018
      - typings.typeFest.typeFestStrings.ES2019
      - typings.typeFest.typeFestStrings.ES2020
      - typings.typeFest.typeFestStrings.ES2021
      - typings.typeFest.typeFestStrings.ES2022
      - typings.typeFest.typeFestStrings.ESNext
      - typings.typeFest.typeFestStrings.es3_
      - typings.typeFest.typeFestStrings.es5_
      - typings.typeFest.typeFestStrings.es6_
      - typings.typeFest.typeFestStrings.es2015_
      - typings.typeFest.typeFestStrings.es2016_
      - typings.typeFest.typeFestStrings.es2017_
      - typings.typeFest.typeFestStrings.es2018_
      - typings.typeFest.typeFestStrings.es2019_
      - typings.typeFest.typeFestStrings.es2020_
      - typings.typeFest.typeFestStrings.es2021_
      - typings.typeFest.typeFestStrings.es2022_
      - typings.typeFest.typeFestStrings.esnext_
    */
    trait Target extends StObject
    object Target {
      
      inline def ES2015: typings.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typings.typeFest.typeFestStrings.ES2015]
      
      inline def ES2016: typings.typeFest.typeFestStrings.ES2016 = "ES2016".asInstanceOf[typings.typeFest.typeFestStrings.ES2016]
      
      inline def ES2017: typings.typeFest.typeFestStrings.ES2017 = "ES2017".asInstanceOf[typings.typeFest.typeFestStrings.ES2017]
      
      inline def ES2018: typings.typeFest.typeFestStrings.ES2018 = "ES2018".asInstanceOf[typings.typeFest.typeFestStrings.ES2018]
      
      inline def ES2019: typings.typeFest.typeFestStrings.ES2019 = "ES2019".asInstanceOf[typings.typeFest.typeFestStrings.ES2019]
      
      inline def ES2020: typings.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typings.typeFest.typeFestStrings.ES2020]
      
      inline def ES2021: typings.typeFest.typeFestStrings.ES2021 = "ES2021".asInstanceOf[typings.typeFest.typeFestStrings.ES2021]
      
      inline def ES2022: typings.typeFest.typeFestStrings.ES2022 = "ES2022".asInstanceOf[typings.typeFest.typeFestStrings.ES2022]
      
      inline def ES3: typings.typeFest.typeFestStrings.ES3 = "ES3".asInstanceOf[typings.typeFest.typeFestStrings.ES3]
      
      inline def ES5: typings.typeFest.typeFestStrings.ES5 = "ES5".asInstanceOf[typings.typeFest.typeFestStrings.ES5]
      
      inline def ES6: typings.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typings.typeFest.typeFestStrings.ES6]
      
      inline def ESNext: typings.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typings.typeFest.typeFestStrings.ESNext]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2016: es2016_ = "es2016".asInstanceOf[es2016_]
      
      inline def es2017: es2017_ = "es2017".asInstanceOf[es2017_]
      
      inline def es2018: es2018_ = "es2018".asInstanceOf[es2018_]
      
      inline def es2019: es2019_ = "es2019".asInstanceOf[es2019_]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2021: es2021_ = "es2021".asInstanceOf[es2021_]
      
      inline def es2022: es2022_ = "es2022".asInstanceOf[es2022_]
      
      inline def es3: es3_ = "es3".asInstanceOf[es3_]
      
      inline def es5: es5_ = "es5".asInstanceOf[es5_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.useFsEvents_
      - typings.typeFest.typeFestStrings.fixedPollingInterval_
      - typings.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typings.typeFest.typeFestStrings.fixedChunkSizePolling_
    */
    trait WatchDirectory extends StObject
    object WatchDirectory {
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSizePolling: fixedChunkSizePolling_ = "fixedChunkSizePolling".asInstanceOf[fixedChunkSizePolling_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def useFsEvents: useFsEvents_ = "useFsEvents".asInstanceOf[useFsEvents_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.fixedPollingInterval_
      - typings.typeFest.typeFestStrings.priorityPollingInterval_
      - typings.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typings.typeFest.typeFestStrings.useFsEvents_
      - typings.typeFest.typeFestStrings.useFsEventsOnParentDirectory_
      - typings.typeFest.typeFestStrings.fixedChunkSizePolling_
    */
    trait WatchFile extends StObject
    object WatchFile {
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSizePolling: fixedChunkSizePolling_ = "fixedChunkSizePolling".asInstanceOf[fixedChunkSizePolling_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def priorityPollingInterval: priorityPollingInterval_ = "priorityPollingInterval".asInstanceOf[priorityPollingInterval_]
      
      inline def useFsEvents: useFsEvents_ = "useFsEvents".asInstanceOf[useFsEvents_]
      
      inline def useFsEventsOnParentDirectory: useFsEventsOnParentDirectory_ = "useFsEventsOnParentDirectory".asInstanceOf[useFsEventsOnParentDirectory_]
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsConfigJson] (val x: Self) extends AnyVal {
    
    inline def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    inline def setCompileOnSaveUndefined: Self = StObject.set(x, "compileOnSave", js.undefined)
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setReferences(value: js.Array[References]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: References*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
  
  trait References extends StObject {
    
    /**
    		True if it is intended that this reference form a circularity.
    		*/
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /**
    		The path as the user originally wrote it.
    		*/
    var originalPath: js.UndefOr[String] = js.undefined
    
    /**
    		A normalized path on disk.
    		*/
    var path: String
    
    /**
    		True if the output of this reference should be prepended to the output of this project.
    		Only valid for `--outFile` compilations.
    		@deprecated This option will be removed in TypeScript 5.5.
    		*/
    var prepend: js.UndefOr[Boolean] = js.undefined
  }
  object References {
    
    inline def apply(path: String): References = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[References]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: References] (val x: Self) extends AnyVal {
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  trait TypeAcquisition extends StObject {
    
    /**
    		Enable auto type acquisition.
    		*/
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies a list of type declarations to be excluded from auto type acquisition. For example, `['jquery', 'lodash']`.
    		*/
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specifies a list of type declarations to be included in auto type acquisition. For example, `['jquery', 'lodash']`.
    		*/
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TypeAcquisition {
    
    inline def apply(): TypeAcquisition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeAcquisition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeAcquisition] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait WatchOptions extends StObject {
    
    /**
    		Specifies a list of directories to exclude from watch
    		*/
    var excludeDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specifies a list of files to exclude from watch
    		*/
    var excludeFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specify the polling strategy to use when the system runs out of or doesn't support native file watchers.
    		*/
    var fallbackPolling: js.UndefOr[PollingWatchKind | Lowercase[PollingWatchKind]] = js.undefined
    
    /**
    		Enable synchronous updates on directory watchers for platforms that don't support recursive watching natively.
    		*/
    var synchronousWatchDirectory: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the strategy for watching directories under systems that lack recursive file-watching functionality.
    		@default 'UseFsEvents'
    		*/
    var watchDirectory: js.UndefOr[WatchDirectoryKind | Lowercase[WatchDirectoryKind]] = js.undefined
    
    /**
    		Specify the strategy for watching individual files.
    		@default 'UseFsEvents'
    		*/
    var watchFile: js.UndefOr[WatchFileKind | Lowercase[WatchFileKind]] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      inline def setExcludeDirectories(value: js.Array[String]): Self = StObject.set(x, "excludeDirectories", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirectoriesUndefined: Self = StObject.set(x, "excludeDirectories", js.undefined)
      
      inline def setExcludeDirectoriesVarargs(value: String*): Self = StObject.set(x, "excludeDirectories", js.Array(value*))
      
      inline def setExcludeFiles(value: js.Array[String]): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
      
      inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
      
      inline def setExcludeFilesVarargs(value: String*): Self = StObject.set(x, "excludeFiles", js.Array(value*))
      
      inline def setFallbackPolling(value: PollingWatchKind | Lowercase[PollingWatchKind]): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
      
      inline def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
      
      inline def setSynchronousWatchDirectory(value: Boolean): Self = StObject.set(x, "synchronousWatchDirectory", value.asInstanceOf[js.Any])
      
      inline def setSynchronousWatchDirectoryUndefined: Self = StObject.set(x, "synchronousWatchDirectory", js.undefined)
      
      inline def setWatchDirectory(value: WatchDirectoryKind | Lowercase[WatchDirectoryKind]): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      inline def setWatchFile(value: WatchFileKind | Lowercase[WatchFileKind]): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
      
      inline def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.FixedInterval
      - typings.typeFest.typeFestStrings.PriorityInterval
      - typings.typeFest.typeFestStrings.DynamicPriority
      - typings.typeFest.typeFestStrings.FixedChunkSize
    */
    trait PollingWatchKind extends StObject
    object PollingWatchKind {
      
      inline def DynamicPriority: typings.typeFest.typeFestStrings.DynamicPriority = "DynamicPriority".asInstanceOf[typings.typeFest.typeFestStrings.DynamicPriority]
      
      inline def FixedChunkSize: typings.typeFest.typeFestStrings.FixedChunkSize = "FixedChunkSize".asInstanceOf[typings.typeFest.typeFestStrings.FixedChunkSize]
      
      inline def FixedInterval: typings.typeFest.typeFestStrings.FixedInterval = "FixedInterval".asInstanceOf[typings.typeFest.typeFestStrings.FixedInterval]
      
      inline def PriorityInterval: typings.typeFest.typeFestStrings.PriorityInterval = "PriorityInterval".asInstanceOf[typings.typeFest.typeFestStrings.PriorityInterval]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.UseFsEvents
      - typings.typeFest.typeFestStrings.FixedPollingInterval
      - typings.typeFest.typeFestStrings.DynamicPriorityPolling
      - typings.typeFest.typeFestStrings.FixedChunkSizePolling
    */
    trait WatchDirectoryKind extends StObject
    object WatchDirectoryKind {
      
      inline def DynamicPriorityPolling: typings.typeFest.typeFestStrings.DynamicPriorityPolling = "DynamicPriorityPolling".asInstanceOf[typings.typeFest.typeFestStrings.DynamicPriorityPolling]
      
      inline def FixedChunkSizePolling: typings.typeFest.typeFestStrings.FixedChunkSizePolling = "FixedChunkSizePolling".asInstanceOf[typings.typeFest.typeFestStrings.FixedChunkSizePolling]
      
      inline def FixedPollingInterval: typings.typeFest.typeFestStrings.FixedPollingInterval = "FixedPollingInterval".asInstanceOf[typings.typeFest.typeFestStrings.FixedPollingInterval]
      
      inline def UseFsEvents: typings.typeFest.typeFestStrings.UseFsEvents = "UseFsEvents".asInstanceOf[typings.typeFest.typeFestStrings.UseFsEvents]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.typeFest.typeFestStrings.FixedPollingInterval
      - typings.typeFest.typeFestStrings.PriorityPollingInterval
      - typings.typeFest.typeFestStrings.DynamicPriorityPolling
      - typings.typeFest.typeFestStrings.FixedChunkSizePolling
      - typings.typeFest.typeFestStrings.UseFsEvents
      - typings.typeFest.typeFestStrings.UseFsEventsOnParentDirectory
    */
    trait WatchFileKind extends StObject
    object WatchFileKind {
      
      inline def DynamicPriorityPolling: typings.typeFest.typeFestStrings.DynamicPriorityPolling = "DynamicPriorityPolling".asInstanceOf[typings.typeFest.typeFestStrings.DynamicPriorityPolling]
      
      inline def FixedChunkSizePolling: typings.typeFest.typeFestStrings.FixedChunkSizePolling = "FixedChunkSizePolling".asInstanceOf[typings.typeFest.typeFestStrings.FixedChunkSizePolling]
      
      inline def FixedPollingInterval: typings.typeFest.typeFestStrings.FixedPollingInterval = "FixedPollingInterval".asInstanceOf[typings.typeFest.typeFestStrings.FixedPollingInterval]
      
      inline def PriorityPollingInterval: typings.typeFest.typeFestStrings.PriorityPollingInterval = "PriorityPollingInterval".asInstanceOf[typings.typeFest.typeFestStrings.PriorityPollingInterval]
      
      inline def UseFsEvents: typings.typeFest.typeFestStrings.UseFsEvents = "UseFsEvents".asInstanceOf[typings.typeFest.typeFestStrings.UseFsEvents]
      
      inline def UseFsEventsOnParentDirectory: typings.typeFest.typeFestStrings.UseFsEventsOnParentDirectory = "UseFsEventsOnParentDirectory".asInstanceOf[typings.typeFest.typeFestStrings.UseFsEventsOnParentDirectory]
    }
  }
}
