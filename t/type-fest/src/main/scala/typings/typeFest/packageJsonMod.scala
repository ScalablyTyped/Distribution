package typings.typeFest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Record
import typings.typeFest.anon.DictmoduleName
import typings.typeFest.anon.Directory
import typings.typeFest.anon.Email
import typings.typeFest.anon.Install
import typings.typeFest.anon.Optional
import typings.typeFest.anon.Type
import typings.typeFest.anon.TypeUrl
import typings.typeFest.anon.Url
import typings.typeFest.basicMod.JsonObject
import typings.typeFest.basicMod.JsonValue
import typings.typeFest.literalUnionMod.LiteralUnion
import typings.typeFest.packageJsonMod.PackageJson.JSPMConfiguration
import typings.typeFest.packageJsonMod.PackageJson.NodeJsStandard
import typings.typeFest.packageJsonMod.PackageJson.NonStandardEntryPoints
import typings.typeFest.packageJsonMod.PackageJson.PackageJsonStandard
import typings.typeFest.packageJsonMod.PackageJson.TypeScriptConfiguration
import typings.typeFest.packageJsonMod.PackageJson.YarnConfiguration
import typings.typeFest.typeFestBooleans.`false`
import typings.typeFest.typeFestStrings.Dot
import typings.typeFest.typeFestStrings.Exclamationmarkaix
import typings.typeFest.typeFestStrings.Exclamationmarkarm
import typings.typeFest.typeFestStrings.Exclamationmarkarm64
import typings.typeFest.typeFestStrings.Exclamationmarkdarwin
import typings.typeFest.typeFestStrings.Exclamationmarkfreebsd
import typings.typeFest.typeFestStrings.Exclamationmarkia32
import typings.typeFest.typeFestStrings.Exclamationmarklinux
import typings.typeFest.typeFestStrings.Exclamationmarkmips
import typings.typeFest.typeFestStrings.Exclamationmarkmipsel
import typings.typeFest.typeFestStrings.Exclamationmarkopenbsd
import typings.typeFest.typeFestStrings.Exclamationmarkppc
import typings.typeFest.typeFestStrings.Exclamationmarkppc64
import typings.typeFest.typeFestStrings.Exclamationmarks390
import typings.typeFest.typeFestStrings.Exclamationmarks390x
import typings.typeFest.typeFestStrings.Exclamationmarksunos
import typings.typeFest.typeFestStrings.Exclamationmarkwin32
import typings.typeFest.typeFestStrings.Exclamationmarkx32
import typings.typeFest.typeFestStrings.Exclamationmarkx64
import typings.typeFest.typeFestStrings.`import`
import typings.typeFest.typeFestStrings.`node-addons`
import typings.typeFest.typeFestStrings.`react-native`
import typings.typeFest.typeFestStrings.aix
import typings.typeFest.typeFestStrings.arm
import typings.typeFest.typeFestStrings.arm64
import typings.typeFest.typeFestStrings.browser
import typings.typeFest.typeFestStrings.commonjs_
import typings.typeFest.typeFestStrings.darwin
import typings.typeFest.typeFestStrings.default
import typings.typeFest.typeFestStrings.deno
import typings.typeFest.typeFestStrings.electron
import typings.typeFest.typeFestStrings.freebsd
import typings.typeFest.typeFestStrings.ia32
import typings.typeFest.typeFestStrings.linux
import typings.typeFest.typeFestStrings.mips
import typings.typeFest.typeFestStrings.mipsel
import typings.typeFest.typeFestStrings.module
import typings.typeFest.typeFestStrings.node
import typings.typeFest.typeFestStrings.openbsd
import typings.typeFest.typeFestStrings.ppc
import typings.typeFest.typeFestStrings.ppc64
import typings.typeFest.typeFestStrings.public
import typings.typeFest.typeFestStrings.require
import typings.typeFest.typeFestStrings.restricted
import typings.typeFest.typeFestStrings.s390
import typings.typeFest.typeFestStrings.s390x
import typings.typeFest.typeFestStrings.sunos
import typings.typeFest.typeFestStrings.win32
import typings.typeFest.typeFestStrings.x32
import typings.typeFest.typeFestStrings.x64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonMod {
  
  object PackageJson {
    
    type BugsLocation = String | Url
    
    type Dependency = Partial[Record[String, String]]
    
    trait DirectoryLocations
      extends StObject
         with /**
    		Additional, less common properties from the [npm docs on `publishConfig`](https://docs.npmjs.com/cli/v7/configuring-npm/package-json#publishconfig).
    		*/
    /* additionalProperties */ StringDictionary[js.UndefOr[JsonValue]] {
      
      /**
      		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
      		*/
      var bin: js.UndefOr[String] = js.undefined
      
      /**
      		Location for Markdown files.
      		*/
      var doc: js.UndefOr[String] = js.undefined
      
      /**
      		Location for example scripts.
      		*/
      var example: js.UndefOr[String] = js.undefined
      
      /**
      		Location for the bulk of the library.
      		*/
      var lib: js.UndefOr[String] = js.undefined
      
      /**
      		Location for man pages. Sugar to generate a `man` array by walking the folder.
      		*/
      var man: js.UndefOr[String] = js.undefined
      
      /**
      		Location for test files.
      		*/
      var test: js.UndefOr[String] = js.undefined
    }
    object DirectoryLocations {
      
      inline def apply(): DirectoryLocations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DirectoryLocations]
      }
      
      extension [Self <: DirectoryLocations](x: Self) {
        
        inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
        
        inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
        
        inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
        
        inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
        
        inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
        
        inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
        
        inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
        
        inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
        
        inline def setMan(value: String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
        
        inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
        
        inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      }
    }
    
    type ExportCondition = LiteralUnion[
        `import` | require | node | `node-addons` | deno | browser | electron | `react-native` | default, 
        String
      ]
    
    type ExportConditions = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ condition in type-fest.type-fest/source/package-json.PackageJson.ExportCondition ]: type-fest.type-fest/source/package-json.PackageJson.Exports}
      */ typings.typeFest.typeFestStrings.ExportConditions & TopLevel[Any]
    
    type Exports = Null | String | (js.Array[String | ExportConditions]) | ExportConditions | StringDictionary[Any]
    
    type Imports = // eslint-disable-line @typescript-eslint/consistent-indexed-object-style
    StringDictionary[
        String | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in type-fest.type-fest/source/package-json.PackageJson.ExportCondition ]: type-fest.type-fest/source/package-json.PackageJson.Exports}
      */ typings.typeFest.typeFestStrings.Imports & TopLevel[Any])
      ]
    
    trait JSPMConfiguration extends StObject {
      
      /**
      		JSPM configuration.
      		*/
      var jspm: js.UndefOr[PackageJson] = js.undefined
    }
    object JSPMConfiguration {
      
      inline def apply(): JSPMConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JSPMConfiguration]
      }
      
      extension [Self <: JSPMConfiguration](x: Self) {
        
        inline def setJspm(value: PackageJson): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
        
        inline def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
      }
    }
    
    trait NodeJsStandard extends StObject {
      
      /**
      		Defines which package manager is expected to be used when working on the current project. It can set to any of the [supported package managers](https://nodejs.org/api/corepack.html#supported-package-managers), and will ensure that your teams use the exact same package manager versions without having to install anything else than Node.js.
      		__This field is currently experimental and needs to be opted-in; check the [Corepack](https://nodejs.org/api/corepack.html) page for details about the procedure.__
      		@example
      		```json
      		{
      			"packageManager": "<package manager name>@<version>"
      		}
      		```
      		*/
      var packageManager: js.UndefOr[String] = js.undefined
    }
    object NodeJsStandard {
      
      inline def apply(): NodeJsStandard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NodeJsStandard]
      }
      
      extension [Self <: NodeJsStandard](x: Self) {
        
        inline def setPackageManager(value: String): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
        
        inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      }
    }
    
    trait NonStandardEntryPoints extends StObject {
      
      /**
      		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
      		*/
      var browser: js.UndefOr[String | (Partial[Record[String, String | `false`]])] = js.undefined
      
      /**
      		A module ID with untranspiled code that is the primary entry point to the program.
      		*/
      var esnext: js.UndefOr[String | DictmoduleName] = js.undefined
      
      /**
      		An ECMAScript module ID that is the primary entry point to the program.
      		*/
      var module: js.UndefOr[String] = js.undefined
      
      /**
      		Denote which files in your project are "pure" and therefore safe for Webpack to prune if unused.
      		[Read more.](https://webpack.js.org/guides/tree-shaking/)
      		*/
      var sideEffects: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    }
    object NonStandardEntryPoints {
      
      inline def apply(): NonStandardEntryPoints = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonStandardEntryPoints]
      }
      
      extension [Self <: NonStandardEntryPoints](x: Self) {
        
        inline def setBrowser(value: String | (Partial[Record[String, String | `false`]])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        inline def setEsnext(value: String | DictmoduleName): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
        
        inline def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
        
        inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
        
        inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
        
        inline def setSideEffects(value: Boolean | js.Array[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
        
        inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
        
        inline def setSideEffectsVarargs(value: String*): Self = StObject.set(x, "sideEffects", js.Array(value*))
      }
    }
    
    trait PackageJsonStandard extends StObject {
      
      var author: js.UndefOr[Person] = js.undefined
      
      /**
      		The executable files that should be installed into the `PATH`.
      		*/
      var bin: js.UndefOr[String | (Partial[Record[String, String]])] = js.undefined
      
      /**
      		The URL to the package's issue tracker and/or the email address to which issues should be reported.
      		*/
      var bugs: js.UndefOr[BugsLocation] = js.undefined
      
      /**
      		Alias of `bundledDependencies`.
      		*/
      var bundleDependencies: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
      		Package names that are bundled when the package is published.
      		*/
      var bundledDependencies: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
      		Is used to set configuration parameters used in package scripts that persist across upgrades.
      		*/
      var config: js.UndefOr[JsonObject] = js.undefined
      
      /**
      		A list of people who contributed to the package.
      		*/
      var contributors: js.UndefOr[js.Array[Person]] = js.undefined
      
      /**
      		CPU architectures the module runs on.
      		*/
      var cpu: js.UndefOr[
            js.Array[
              LiteralUnion[
                arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                String
              ]
            ]
          ] = js.undefined
      
      /**
      		The dependencies of the package.
      		*/
      var dependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
      		Package description, listed in `npm search`.
      		*/
      var description: js.UndefOr[String] = js.undefined
      
      /**
      		Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
      		*/
      var devDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
      		Indicates the structure of the package.
      		*/
      var directories: js.UndefOr[DirectoryLocations] = js.undefined
      
      /**
      		@deprecated
      		*/
      var engineStrict: js.UndefOr[Boolean] = js.undefined
      
      /**
      		Engines that this package runs on.
      		*/
      var engines: js.UndefOr[
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ EngineName in 'npm' | 'node' | string ]:? string}
        */ typings.typeFest.typeFestStrings.PackageJsonStandard & TopLevel[Any]
          ] = js.undefined
      
      /**
      		Subpath exports to define entry points of the package.
      		[Read more.](https://nodejs.org/api/packages.html#subpath-exports)
      		*/
      var exports: js.UndefOr[Exports] = js.undefined
      
      /**
      		The files included in the package.
      		*/
      var files: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
      		Describes and notifies consumers of a package's monetary support information.
      		[Read more.](https://github.com/npm/rfcs/blob/latest/accepted/0017-add-funding-support.md)
      		*/
      var funding: js.UndefOr[String | TypeUrl] = js.undefined
      
      /**
      		The URL to the package's homepage.
      		*/
      var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.undefined
      
      /**
      		Subpath imports to define internal package import maps that only apply to import specifiers from within the package itself.
      		[Read more.](https://nodejs.org/api/packages.html#subpath-imports)
      		*/
      var imports: js.UndefOr[Imports] = js.undefined
      
      /**
      		Keywords associated with package, listed in `npm search`.
      		*/
      var keywords: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
      		The license for the package.
      		*/
      var license: js.UndefOr[String] = js.undefined
      
      /**
      		The licenses for the package.
      		*/
      var licenses: js.UndefOr[js.Array[Type]] = js.undefined
      
      /**
      		The module ID that is the primary entry point to the program.
      		*/
      var main: js.UndefOr[String] = js.undefined
      
      /**
      		A list of people who maintain the package.
      		*/
      var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
      
      /**
      		Filenames to put in place for the `man` program to find.
      		*/
      var man: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
      		The name of the package.
      		*/
      var name: js.UndefOr[String] = js.undefined
      
      /**
      		Dependencies that are skipped if they fail to install.
      		*/
      var optionalDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
      		Operating systems the module runs on.
      		*/
      var os: js.UndefOr[
            js.Array[
              LiteralUnion[
                aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                String
              ]
            ]
          ] = js.undefined
      
      /**
      		Dependencies that will usually be required by the package user directly or via another dependency.
      		*/
      var peerDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
      		Indicate peer dependencies that are optional.
      		*/
      var peerDependenciesMeta: js.UndefOr[Partial[Record[String, Optional]]] = js.undefined
      
      /**
      		If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
      		@deprecated
      		*/
      var preferGlobal: js.UndefOr[Boolean] = js.undefined
      
      /**
      		If set to `true`, then npm will refuse to publish it.
      		*/
      var `private`: js.UndefOr[Boolean] = js.undefined
      
      /**
      		A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
      		*/
      var publishConfig: js.UndefOr[PublishConfig] = js.undefined
      
      /**
      		Location for the code repository.
      		*/
      var repository: js.UndefOr[String | Directory] = js.undefined
      
      /**
      		Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
      		*/
      var scripts: js.UndefOr[Scripts] = js.undefined
      
      /**
      		Resolution algorithm for importing ".js" files from the package's scope.
      		[Read more.](https://nodejs.org/api/esm.html#esm_package_json_type_field)
      		*/
      var `type`: js.UndefOr[module | commonjs_] = js.undefined
      
      /**
      		Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
      		*/
      var version: js.UndefOr[String] = js.undefined
    }
    object PackageJsonStandard {
      
      inline def apply(): PackageJsonStandard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PackageJsonStandard]
      }
      
      extension [Self <: PackageJsonStandard](x: Self) {
        
        inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setBin(value: String | (Partial[Record[String, String]])): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
        
        inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
        
        inline def setBugs(value: BugsLocation): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
        
        inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
        
        inline def setBundleDependencies(value: js.Array[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
        
        inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
        
        inline def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value*))
        
        inline def setBundledDependencies(value: js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
        
        inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
        
        inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
        
        inline def setConfig(value: JsonObject): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
        
        inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
        
        inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
        
        inline def setCpu(
          value: js.Array[
                  LiteralUnion[
                    arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                    String
                  ]
                ]
        ): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
        
        inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
        
        inline def setCpuVarargs(
          value: (LiteralUnion[
                  arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                  String
                ])*
        ): Self = StObject.set(x, "cpu", js.Array(value*))
        
        inline def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
        
        inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDevDependencies(value: Dependency): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
        
        inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
        
        inline def setDirectories(value: DirectoryLocations): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
        
        inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
        
        inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
        
        inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
        
        inline def setEngines(
          value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ EngineName in 'npm' | 'node' | string ]:? string}
          */ typings.typeFest.typeFestStrings.PackageJsonStandard & TopLevel[Any]
        ): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
        
        inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
        
        inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
        
        inline def setExportsNull: Self = StObject.set(x, "exports", null)
        
        inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
        
        inline def setExportsVarargs(value: (String | ExportConditions)*): Self = StObject.set(x, "exports", js.Array(value*))
        
        inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
        
        inline def setFunding(value: String | TypeUrl): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
        
        inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
        
        inline def setHomepage(value: LiteralUnion[Dot, String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
        
        inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
        
        inline def setImports(value: Imports): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
        
        inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
        
        inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
        
        inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
        
        inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
        
        inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
        
        inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
        
        inline def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
        
        inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
        
        inline def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value*))
        
        inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
        
        inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
        
        inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
        
        inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
        
        inline def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
        
        inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
        
        inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOptionalDependencies(value: Dependency): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
        
        inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
        
        inline def setOs(
          value: js.Array[
                  LiteralUnion[
                    aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                    String
                  ]
                ]
        ): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
        
        inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
        
        inline def setOsVarargs(
          value: (LiteralUnion[
                  aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                  String
                ])*
        ): Self = StObject.set(x, "os", js.Array(value*))
        
        inline def setPeerDependencies(value: Dependency): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
        
        inline def setPeerDependenciesMeta(value: Partial[Record[String, Optional]]): Self = StObject.set(x, "peerDependenciesMeta", value.asInstanceOf[js.Any])
        
        inline def setPeerDependenciesMetaUndefined: Self = StObject.set(x, "peerDependenciesMeta", js.undefined)
        
        inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
        
        inline def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
        
        inline def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
        
        inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
        
        inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
        
        inline def setPublishConfig(value: PublishConfig): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
        
        inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
        
        inline def setRepository(value: String | Directory): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
        
        inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
        
        inline def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
        
        inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
        
        inline def setType(value: module | commonjs_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    type Person = String | Email
    
    trait PublishConfig
      extends StObject
         with /**
    		Additional, less common properties from the [npm docs on `publishConfig`](https://docs.npmjs.com/cli/v7/configuring-npm/package-json#publishconfig).
    		*/
    /* additionalProperties */ StringDictionary[js.UndefOr[JsonValue]] {
      
      /**
      		When publishing scoped packages, the access level defaults to restricted. If you want your scoped package to be publicly viewable (and installable) set `--access=public`. The only valid values for access are public and restricted. Unscoped packages always have an access level of public.
      		*/
      var access: js.UndefOr[public | restricted] = js.undefined
      
      /**
      		The base URL of the npm registry.
      		Default: `'https://registry.npmjs.org/'`
      		*/
      var registry: js.UndefOr[String] = js.undefined
      
      /**
      		The tag to publish the package under.
      		Default: `'latest'`
      		*/
      var tag: js.UndefOr[String] = js.undefined
    }
    object PublishConfig {
      
      inline def apply(): PublishConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PublishConfig]
      }
      
      extension [Self <: PublishConfig](x: Self) {
        
        inline def setAccess(value: public | restricted): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
        
        inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
        
        inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    type Scripts = Install & (Partial[Record[String, String]])
    
    trait TypeScriptConfiguration extends StObject {
      
      /**
      		Location of the bundled TypeScript declaration file.
      		*/
      var types: js.UndefOr[String] = js.undefined
      
      /**
      		Version selection map of TypeScript.
      		*/
      var typesVersions: js.UndefOr[Partial[Record[String, Partial[Record[String, js.Array[String]]]]]] = js.undefined
      
      /**
      		Location of the bundled TypeScript declaration file. Alias of `types`.
      		*/
      @JSName("typings")
      var typings_ : js.UndefOr[String] = js.undefined
    }
    object TypeScriptConfiguration {
      
      inline def apply(): TypeScriptConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TypeScriptConfiguration]
      }
      
      extension [Self <: TypeScriptConfiguration](x: Self) {
        
        inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
        
        inline def setTypesVersions(value: Partial[Record[String, Partial[Record[String, js.Array[String]]]]]): Self = StObject.set(x, "typesVersions", value.asInstanceOf[js.Any])
        
        inline def setTypesVersionsUndefined: Self = StObject.set(x, "typesVersions", js.undefined)
        
        inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
        
        inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      }
    }
    
    trait WorkspaceConfig extends StObject {
      
      /**
      		Designed to solve the problem of packages which break when their `node_modules` are moved to the root workspace directory - a process known as hoisting. For these packages, both within your workspace, and also some that have been installed via `node_modules`, it is important to have a mechanism for preventing the default Yarn workspace behavior. By adding workspace pattern strings here, Yarn will resume non-workspace behavior for any package which matches the defined patterns.
      		[Read more](https://classic.yarnpkg.com/blog/2018/02/15/nohoist/)
      		*/
      var nohoist: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
      
      /**
      		An array of workspace pattern strings which contain the workspace packages.
      		*/
      var packages: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
    }
    object WorkspaceConfig {
      
      inline def apply(): WorkspaceConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WorkspaceConfig]
      }
      
      extension [Self <: WorkspaceConfig](x: Self) {
        
        inline def setNohoist(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "nohoist", value.asInstanceOf[js.Any])
        
        inline def setNohoistUndefined: Self = StObject.set(x, "nohoist", js.undefined)
        
        inline def setNohoistVarargs(value: WorkspacePattern*): Self = StObject.set(x, "nohoist", js.Array(value*))
        
        inline def setPackages(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
        
        inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
        
        inline def setPackagesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "packages", js.Array(value*))
      }
    }
    
    /**
    	A workspace pattern points to a directory or group of directories which contain packages that should be included in the workspace installation process.
    	The patterns are handled with [minimatch](https://github.com/isaacs/minimatch).
    	@example
    	`docs` → Include the docs directory and install its dependencies.
    	`packages/ *` → Include all nested directories within the packages directory, like `packages/cli` and `packages/core`.
    	*/
    type WorkspacePattern = String
    
    trait YarnConfiguration extends StObject {
      
      /**
      		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command-line, set this to `true`.
      		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an app), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
      		*/
      var flat: js.UndefOr[Boolean] = js.undefined
      
      /**
      		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
      		*/
      var resolutions: js.UndefOr[Dependency] = js.undefined
      
      /**
      		Used to configure [Yarn workspaces](https://classic.yarnpkg.com/docs/workspaces/).
      		Workspaces allow you to manage multiple packages within the same repository in such a way that you only need to run `yarn install` once to install all of them in a single pass.
      		Please note that the top-level `private` property of `package.json` **must** be set to `true` in order to use workspaces.
      		*/
      var workspaces: js.UndefOr[js.Array[WorkspacePattern] | WorkspaceConfig] = js.undefined
    }
    object YarnConfiguration {
      
      inline def apply(): YarnConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[YarnConfiguration]
      }
      
      extension [Self <: YarnConfiguration](x: Self) {
        
        inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
        
        inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
        
        inline def setResolutions(value: Dependency): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
        
        inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
        
        inline def setWorkspaces(value: js.Array[WorkspacePattern] | WorkspaceConfig): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
        
        inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
        
        inline def setWorkspacesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "workspaces", js.Array(value*))
      }
    }
  }
  type PackageJson = JsonObject & NodeJsStandard & PackageJsonStandard & NonStandardEntryPoints & TypeScriptConfiguration & YarnConfiguration & JSPMConfiguration
}
