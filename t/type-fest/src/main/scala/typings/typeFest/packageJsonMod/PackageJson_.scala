package typings.typeFest.packageJsonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.typeFest.anon.DictmoduleName
import typings.typeFest.anon.Type
import typings.typeFest.anon.Url
import typings.typeFest.literalUnionMod.LiteralUnion
import typings.typeFest.packageJsonMod.PackageJson.BugsLocation
import typings.typeFest.packageJsonMod.PackageJson.Dependency
import typings.typeFest.packageJsonMod.PackageJson.DirectoryLocations
import typings.typeFest.packageJsonMod.PackageJson.Person
import typings.typeFest.packageJsonMod.PackageJson.Scripts
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name :string | undefined,   version :string | undefined,   description :string | undefined,   keywords :std.Array<string> | undefined,   homepage :type-fest.type-fest.LiteralUnion<'.', string> | undefined,   bugs :type-fest.type-fest/source/package-json.PackageJson.BugsLocation | undefined,   license :string | undefined,   licenses :std.Array<{  type :string | undefined,   url :string | undefined}> | undefined,   author :type-fest.type-fest/source/package-json.PackageJson.Person | undefined,   contributors :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person> | undefined,   maintainers :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person> | undefined,   files :std.Array<string> | undefined,   main :string | undefined,   bin :string | {[binary: string] : string} | undefined,   man :string | std.Array<string> | undefined,   directories :type-fest.type-fest/source/package-json.PackageJson.DirectoryLocations | undefined,   repository :string | {  type :string,   url :string} | undefined,   scripts :type-fest.type-fest/source/package-json.PackageJson.Scripts | undefined,   config :{[configKey: string] : unknown} | undefined,   dependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   devDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   optionalDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   peerDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   bundledDependencies :std.Array<string> | undefined,   bundleDependencies :std.Array<string> | undefined,   engines :{[ EngineName in 'npm' | 'node' | string ]: string} | undefined,   engineStrict :boolean | undefined,   os :std.Array<type-fest.type-fest.LiteralUnion<'aix' | 'darwin' | 'freebsd' | 'linux' | 'openbsd' | 'sunos' | 'win32' | '!aix' | '!darwin' | '!freebsd' | '!linux' | '!openbsd' | '!sunos' | '!win32', string>> | undefined,   cpu :std.Array<type-fest.type-fest.LiteralUnion<'arm' | 'arm64' | 'ia32' | 'mips' | 'mipsel' | 'ppc' | 'ppc64' | 's390' | 's390x' | 'x32' | 'x64' | '!arm' | '!arm64' | '!ia32' | '!mips' | '!mipsel' | '!ppc' | '!ppc64' | '!s390' | '!s390x' | '!x32' | '!x64', string>> | undefined,   preferGlobal :boolean | undefined,   private :boolean | undefined,   publishConfig :{[config: string] : unknown} | undefined, [key: string] : unknown} & type-fest.type-fest/source/package-json.PackageJson.NonStandardEntryPoints & type-fest.type-fest/source/package-json.PackageJson.TypeScriptConfiguration & type-fest.type-fest/source/package-json.PackageJson.YarnConfiguration & type-fest.type-fest/source/package-json.PackageJson.JSPMConfiguration */
@js.native
trait PackageJson_
  extends /* key */ StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.native
  /**
  	The executable files that should be installed into the `PATH`.
  	*/
  var bin: js.UndefOr[String | StringDictionary[String]] = js.native
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.native
  /**
  	The URL to the package's issue tracker and/or the email address to which issues should be reported.
  	*/
  var bugs: js.UndefOr[BugsLocation] = js.native
  /**
  	Alias of `bundledDependencies`.
  	*/
  var bundleDependencies: js.UndefOr[js.Array[String]] = js.native
  /**
  	Package names that are bundled when the package is published.
  	*/
  var bundledDependencies: js.UndefOr[js.Array[String]] = js.native
  /**
  	Is used to set configuration parameters used in package scripts that persist across upgrades.
  	*/
  var config: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
  	A list of people who contributed to the package.
  	*/
  var contributors: js.UndefOr[js.Array[Person]] = js.native
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
  ] = js.native
  /**
  	The dependencies of the package.
  	*/
  var dependencies: js.UndefOr[Dependency] = js.native
  /**
  	Package description, listed in `npm search`.
  	*/
  var description: js.UndefOr[String] = js.native
  /**
  	Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
  	*/
  var devDependencies: js.UndefOr[Dependency] = js.native
  /**
  	Indicates the structure of the package.
  	*/
  var directories: js.UndefOr[DirectoryLocations] = js.native
  /**
  	@deprecated
  	*/
  var engineStrict: js.UndefOr[Boolean] = js.native
  /**
  	Engines that this package runs on.
  	*/
  var engines: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EngineName in 'npm' | 'node' | string ]: string}
    */ typings.typeFest.typeFestStrings.PackageJson with TopLevel[js.Any]
  ] = js.native
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[String | DictmoduleName] = js.native
  /**
  	The files included in the package.
  	*/
  var files: js.UndefOr[js.Array[String]] = js.native
  /**
  		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
  		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
  		*/
  var flat: js.UndefOr[Boolean] = js.native
  /**
  	The URL to the package's homepage.
  	*/
  var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.native
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[PackageJson] = js.native
  /**
  	Keywords associated with package, listed in `npm search`.
  	*/
  var keywords: js.UndefOr[js.Array[String]] = js.native
  /**
  	The license for the package.
  	*/
  var license: js.UndefOr[String] = js.native
  /**
  	The licenses for the package.
  	*/
  var licenses: js.UndefOr[js.Array[Type]] = js.native
  /**
  	The module ID that is the primary entry point to the program.
  	*/
  var main: js.UndefOr[String] = js.native
  /**
  	A list of people who maintain the package.
  	*/
  var maintainers: js.UndefOr[js.Array[Person]] = js.native
  /**
  	Filenames to put in place for the `man` program to find.
  	*/
  var man: js.UndefOr[String | js.Array[String]] = js.native
  /**
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[String] = js.native
  /**
  	The name of the package.
  	*/
  var name: js.UndefOr[String] = js.native
  /**
  	Dependencies that are skipped if they fail to install.
  	*/
  var optionalDependencies: js.UndefOr[Dependency] = js.native
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
  ] = js.native
  /**
  	Dependencies that will usually be required by the package user directly or via another dependency.
  	*/
  var peerDependencies: js.UndefOr[Dependency] = js.native
  /**
  	If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
  	@deprecated
  	*/
  var preferGlobal: js.UndefOr[Boolean] = js.native
  /**
  	If set to `true`, then npm will refuse to publish it.
  	*/
  var `private`: js.UndefOr[Boolean] = js.native
  /**
  	 * A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
  	 */
  var publishConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
  	Location for the code repository.
  	*/
  var repository: js.UndefOr[String | Url] = js.native
  /**
  		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
  		*/
  var resolutions: js.UndefOr[Dependency] = js.native
  /**
  	Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
  	*/
  var scripts: js.UndefOr[Scripts] = js.native
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[String] = js.native
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  @JSName("typings")
  var typings_ : js.UndefOr[String] = js.native
  /**
  	Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
  	*/
  var version: js.UndefOr[String] = js.native
}

object PackageJson_ {
  @scala.inline
  def apply(): PackageJson_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageJson_]
  }
  @scala.inline
  implicit class PackageJson_Ops[Self <: PackageJson_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: Person): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBin(value: String | StringDictionary[String]): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    @scala.inline
    def setBrowser(value: String | (StringDictionary[String | `false`])): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setBugs(value: BugsLocation): Self = this.set("bugs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    @scala.inline
    def setBundleDependenciesVarargs(value: String*): Self = this.set("bundleDependencies", js.Array(value :_*))
    @scala.inline
    def setBundleDependencies(value: js.Array[String]): Self = this.set("bundleDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleDependencies: Self = this.set("bundleDependencies", js.undefined)
    @scala.inline
    def setBundledDependenciesVarargs(value: String*): Self = this.set("bundledDependencies", js.Array(value :_*))
    @scala.inline
    def setBundledDependencies(value: js.Array[String]): Self = this.set("bundledDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundledDependencies: Self = this.set("bundledDependencies", js.undefined)
    @scala.inline
    def setConfig(value: StringDictionary[js.Any]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setContributorsVarargs(value: Person*): Self = this.set("contributors", js.Array(value :_*))
    @scala.inline
    def setContributors(value: js.Array[Person]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    @scala.inline
    def setCpuVarargs(
      value: (LiteralUnion[
          arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
          String
        ])*
    ): Self = this.set("cpu", js.Array(value :_*))
    @scala.inline
    def setCpu(
      value: js.Array[
          LiteralUnion[
            arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
            String
          ]
        ]
    ): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setDependencies(value: Dependency): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDevDependencies(value: Dependency): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    @scala.inline
    def setDirectories(value: DirectoryLocations): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setEngineStrict(value: Boolean): Self = this.set("engineStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineStrict: Self = this.set("engineStrict", js.undefined)
    @scala.inline
    def setEngines(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ EngineName in 'npm' | 'node' | string ]: string}
      */ typings.typeFest.typeFestStrings.PackageJson with TopLevel[js.Any]
    ): Self = this.set("engines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngines: Self = this.set("engines", js.undefined)
    @scala.inline
    def setEsnext(value: String | DictmoduleName): Self = this.set("esnext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsnext: Self = this.set("esnext", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setHomepage(value: LiteralUnion[Dot, String]): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setJspm(value: PackageJson): Self = this.set("jspm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJspm: Self = this.set("jspm", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setLicensesVarargs(value: Type*): Self = this.set("licenses", js.Array(value :_*))
    @scala.inline
    def setLicenses(value: js.Array[Type]): Self = this.set("licenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenses: Self = this.set("licenses", js.undefined)
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setMaintainersVarargs(value: Person*): Self = this.set("maintainers", js.Array(value :_*))
    @scala.inline
    def setMaintainers(value: js.Array[Person]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainers: Self = this.set("maintainers", js.undefined)
    @scala.inline
    def setManVarargs(value: String*): Self = this.set("man", js.Array(value :_*))
    @scala.inline
    def setMan(value: String | js.Array[String]): Self = this.set("man", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMan: Self = this.set("man", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionalDependencies(value: Dependency): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalDependencies: Self = this.set("optionalDependencies", js.undefined)
    @scala.inline
    def setOsVarargs(
      value: (LiteralUnion[
          aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
          String
        ])*
    ): Self = this.set("os", js.Array(value :_*))
    @scala.inline
    def setOs(
      value: js.Array[
          LiteralUnion[
            aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
            String
          ]
        ]
    ): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setPeerDependencies(value: Dependency): Self = this.set("peerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerDependencies: Self = this.set("peerDependencies", js.undefined)
    @scala.inline
    def setPreferGlobal(value: Boolean): Self = this.set("preferGlobal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferGlobal: Self = this.set("preferGlobal", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setPublishConfig(value: StringDictionary[js.Any]): Self = this.set("publishConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishConfig: Self = this.set("publishConfig", js.undefined)
    @scala.inline
    def setRepository(value: String | Url): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    @scala.inline
    def setResolutions(value: Dependency): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setScripts(value: Scripts): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setTypings_(value: String): Self = this.set("typings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypings_ : Self = this.set("typings", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

