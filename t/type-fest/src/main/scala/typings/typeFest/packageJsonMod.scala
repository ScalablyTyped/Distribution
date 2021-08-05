package typings.typeFest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.typeFest.anon.DictmoduleName
import typings.typeFest.anon.Email
import typings.typeFest.anon.EmailUrl
import typings.typeFest.anon.Type
import typings.typeFest.anon.Url
import typings.typeFest.literalUnionMod.LiteralUnion
import typings.typeFest.packageJsonMod.PackageJson.BugsLocation
import typings.typeFest.packageJsonMod.PackageJson.Dependency
import typings.typeFest.packageJsonMod.PackageJson.DirectoryLocations
import typings.typeFest.packageJsonMod.PackageJson.JSPMConfiguration
import typings.typeFest.packageJsonMod.PackageJson.NonStandardEntryPoints
import typings.typeFest.packageJsonMod.PackageJson.Person
import typings.typeFest.packageJsonMod.PackageJson.Scripts
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
import typings.typeFest.typeFestStrings.aix
import typings.typeFest.typeFestStrings.arm
import typings.typeFest.typeFestStrings.arm64
import typings.typeFest.typeFestStrings.darwin
import typings.typeFest.typeFestStrings.freebsd
import typings.typeFest.typeFestStrings.ia32
import typings.typeFest.typeFestStrings.linux
import typings.typeFest.typeFestStrings.mips
import typings.typeFest.typeFestStrings.mipsel
import typings.typeFest.typeFestStrings.openbsd
import typings.typeFest.typeFestStrings.ppc
import typings.typeFest.typeFestStrings.ppc64
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
  
  trait PackageJson
    extends StObject
       with NonStandardEntryPoints
       with TypeScriptConfiguration
       with YarnConfiguration
       with JSPMConfiguration
       with /* key */ StringDictionary[js.Any] {
    
    var author: js.UndefOr[Person] = js.undefined
    
    /**
    	The executable files that should be installed into the `PATH`.
    	*/
    var bin: js.UndefOr[String | StringDictionary[String]] = js.undefined
    
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
    var config: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
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
    {[ EngineName in 'npm' | 'node' | string ]: string}
      */ typings.typeFest.typeFestStrings.PackageJson & TopLevel[js.Any]
      ] = js.undefined
    
    /**
    	The files included in the package.
    	*/
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	The URL to the package's homepage.
    	*/
    var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.undefined
    
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
    	If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
    	@deprecated
    	*/
    var preferGlobal: js.UndefOr[Boolean] = js.undefined
    
    /**
    	If set to `true`, then npm will refuse to publish it.
    	*/
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
    	 */
    var publishConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
    	Location for the code repository.
    	*/
    var repository: js.UndefOr[String | Url] = js.undefined
    
    /**
    	Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
    	*/
    var scripts: js.UndefOr[Scripts] = js.undefined
    
    /**
    	Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
    	*/
    var version: js.UndefOr[String] = js.undefined
  }
  object PackageJson {
    
    inline def apply(): PackageJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJson]
    }
    
    type BugsLocation = String | EmailUrl
    
    type Dependency = StringDictionary[String]
    
    trait DirectoryLocations
      extends StObject
         with /* directoryType */ StringDictionary[js.Any] {
      
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
    
    trait NonStandardEntryPoints extends StObject {
      
      /**
      		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
      		*/
      var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.undefined
      
      /**
      		A module ID with untranspiled code that is the primary entry point to the program.
      		*/
      var esnext: js.UndefOr[String | DictmoduleName] = js.undefined
      
      /**
      		An ECMAScript module ID that is the primary entry point to the program.
      		*/
      var module: js.UndefOr[String] = js.undefined
    }
    object NonStandardEntryPoints {
      
      inline def apply(): NonStandardEntryPoints = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonStandardEntryPoints]
      }
      
      extension [Self <: NonStandardEntryPoints](x: Self) {
        
        inline def setBrowser(value: String | (StringDictionary[String | `false`])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        inline def setEsnext(value: String | DictmoduleName): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
        
        inline def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
        
        inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
        
        inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      }
    }
    
    extension [Self <: PackageJson](x: Self) {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBin(value: String | StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBugs(value: BugsLocation): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setBundleDependencies(value: js.Array[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value :_*))
      
      inline def setBundledDependencies(value: js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value :_*))
      
      inline def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
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
      ): Self = StObject.set(x, "cpu", js.Array(value :_*))
      
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
      {[ EngineName in 'npm' | 'node' | string ]: string}
        */ typings.typeFest.typeFestStrings.PackageJson & TopLevel[js.Any]
      ): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setHomepage(value: LiteralUnion[Dot, String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      inline def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value :_*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      inline def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
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
      ): Self = StObject.set(x, "os", js.Array(value :_*))
      
      inline def setPeerDependencies(value: Dependency): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
      
      inline def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublishConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setRepository(value: String | Url): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
    
    type Person = String | Email
    
    trait Scripts
      extends StObject
         with /* scriptName */ StringDictionary[String] {
      
      /**
      		Run **after** the package is installed.
      		*/
      var install: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** the package is installed and after `install`.
      		*/
      var postinstall: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** the tarball has been generated and moved to its final destination.
      		*/
      var postpack: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** the package is published.
      		*/
      var postpublish: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var postrestart: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm start` command, after `start`.
      		*/
      var poststart: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm stop` command, after `stop`.
      		*/
      var poststop: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm test` command, after `test`.
      		*/
      var posttest: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** the package is uninstalled.
      		*/
      var postuninstall: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** bump the package version.
      		*/
      var postversion: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** the package is installed.
      		*/
      var preinstall: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
      		*/
      var prepack: js.UndefOr[String] = js.undefined
      
      /**
      		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
      		*/
      var prepare: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** the package is published (Also run on local `npm install` without any arguments).
      		*/
      var prepublish: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** the package is prepared and packed, **only** on `npm publish`.
      		*/
      var prepublishOnly: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var prerestart: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm start` command, before `start`.
      		*/
      var prestart: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm stop` command, before `stop`.
      		*/
      var prestop: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm test` command, before `test`.
      		*/
      var pretest: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** the package is uninstalled and before `uninstall`.
      		*/
      var preuninstall: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** bump the package version and before `version`.
      		*/
      var preversion: js.UndefOr[String] = js.undefined
      
      /**
      		Run **after** the package is published.
      		*/
      var publish: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var restart: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm start` command.
      		*/
      var start: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm stop` command.
      		*/
      var stop: js.UndefOr[String] = js.undefined
      
      /**
      		Run with the `npm test` command.
      		*/
      var test: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** the package is uninstalled.
      		*/
      var uninstall: js.UndefOr[String] = js.undefined
      
      /**
      		Run **before** bump the package version.
      		*/
      var version: js.UndefOr[String] = js.undefined
    }
    object Scripts {
      
      inline def apply(): Scripts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scripts]
      }
      
      extension [Self <: Scripts](x: Self) {
        
        inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
        
        inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
        
        inline def setPostinstall(value: String): Self = StObject.set(x, "postinstall", value.asInstanceOf[js.Any])
        
        inline def setPostinstallUndefined: Self = StObject.set(x, "postinstall", js.undefined)
        
        inline def setPostpack(value: String): Self = StObject.set(x, "postpack", value.asInstanceOf[js.Any])
        
        inline def setPostpackUndefined: Self = StObject.set(x, "postpack", js.undefined)
        
        inline def setPostpublish(value: String): Self = StObject.set(x, "postpublish", value.asInstanceOf[js.Any])
        
        inline def setPostpublishUndefined: Self = StObject.set(x, "postpublish", js.undefined)
        
        inline def setPostrestart(value: String): Self = StObject.set(x, "postrestart", value.asInstanceOf[js.Any])
        
        inline def setPostrestartUndefined: Self = StObject.set(x, "postrestart", js.undefined)
        
        inline def setPoststart(value: String): Self = StObject.set(x, "poststart", value.asInstanceOf[js.Any])
        
        inline def setPoststartUndefined: Self = StObject.set(x, "poststart", js.undefined)
        
        inline def setPoststop(value: String): Self = StObject.set(x, "poststop", value.asInstanceOf[js.Any])
        
        inline def setPoststopUndefined: Self = StObject.set(x, "poststop", js.undefined)
        
        inline def setPosttest(value: String): Self = StObject.set(x, "posttest", value.asInstanceOf[js.Any])
        
        inline def setPosttestUndefined: Self = StObject.set(x, "posttest", js.undefined)
        
        inline def setPostuninstall(value: String): Self = StObject.set(x, "postuninstall", value.asInstanceOf[js.Any])
        
        inline def setPostuninstallUndefined: Self = StObject.set(x, "postuninstall", js.undefined)
        
        inline def setPostversion(value: String): Self = StObject.set(x, "postversion", value.asInstanceOf[js.Any])
        
        inline def setPostversionUndefined: Self = StObject.set(x, "postversion", js.undefined)
        
        inline def setPreinstall(value: String): Self = StObject.set(x, "preinstall", value.asInstanceOf[js.Any])
        
        inline def setPreinstallUndefined: Self = StObject.set(x, "preinstall", js.undefined)
        
        inline def setPrepack(value: String): Self = StObject.set(x, "prepack", value.asInstanceOf[js.Any])
        
        inline def setPrepackUndefined: Self = StObject.set(x, "prepack", js.undefined)
        
        inline def setPrepare(value: String): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
        
        inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
        
        inline def setPrepublish(value: String): Self = StObject.set(x, "prepublish", value.asInstanceOf[js.Any])
        
        inline def setPrepublishOnly(value: String): Self = StObject.set(x, "prepublishOnly", value.asInstanceOf[js.Any])
        
        inline def setPrepublishOnlyUndefined: Self = StObject.set(x, "prepublishOnly", js.undefined)
        
        inline def setPrepublishUndefined: Self = StObject.set(x, "prepublish", js.undefined)
        
        inline def setPrerestart(value: String): Self = StObject.set(x, "prerestart", value.asInstanceOf[js.Any])
        
        inline def setPrerestartUndefined: Self = StObject.set(x, "prerestart", js.undefined)
        
        inline def setPrestart(value: String): Self = StObject.set(x, "prestart", value.asInstanceOf[js.Any])
        
        inline def setPrestartUndefined: Self = StObject.set(x, "prestart", js.undefined)
        
        inline def setPrestop(value: String): Self = StObject.set(x, "prestop", value.asInstanceOf[js.Any])
        
        inline def setPrestopUndefined: Self = StObject.set(x, "prestop", js.undefined)
        
        inline def setPretest(value: String): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
        
        inline def setPretestUndefined: Self = StObject.set(x, "pretest", js.undefined)
        
        inline def setPreuninstall(value: String): Self = StObject.set(x, "preuninstall", value.asInstanceOf[js.Any])
        
        inline def setPreuninstallUndefined: Self = StObject.set(x, "preuninstall", js.undefined)
        
        inline def setPreversion(value: String): Self = StObject.set(x, "preversion", value.asInstanceOf[js.Any])
        
        inline def setPreversionUndefined: Self = StObject.set(x, "preversion", js.undefined)
        
        inline def setPublish(value: String): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
        
        inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
        
        inline def setRestart(value: String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
        
        inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
        
        inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setStop(value: String): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
        
        inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
        
        inline def setUninstall(value: String): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
        
        inline def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait TypeScriptConfiguration extends StObject {
      
      /**
      		Location of the bundled TypeScript declaration file.
      		*/
      var types: js.UndefOr[String] = js.undefined
      
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
        
        inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
        
        inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      }
    }
    
    trait YarnConfiguration extends StObject {
      
      /**
      		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
      		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
      		*/
      var flat: js.UndefOr[Boolean] = js.undefined
      
      /**
      		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
      		*/
      var resolutions: js.UndefOr[Dependency] = js.undefined
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
      }
    }
  }
}
