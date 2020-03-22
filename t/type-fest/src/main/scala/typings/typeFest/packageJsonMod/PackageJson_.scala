package typings.typeFest.packageJsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.typeFest.AnonDictmoduleName
import typings.typeFest.AnonType
import typings.typeFest.AnonUrl
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

/* Inlined {  name ? :string,   version ? :string,   description ? :string,   keywords ? :std.Array<string>,   homepage ? :type-fest.type-fest.LiteralUnion<'.', string>,   bugs ? :type-fest.type-fest/source/package-json.PackageJson.BugsLocation,   license ? :string,   licenses ? :std.Array<{  type ? :string,   url ? :string}>,   author ? :type-fest.type-fest/source/package-json.PackageJson.Person,   contributors ? :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person>,   maintainers ? :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person>,   files ? :std.Array<string>,   main ? :string,   bin ? :string | {[binary: string] : string},   man ? :string | std.Array<string>,   directories ? :type-fest.type-fest/source/package-json.PackageJson.DirectoryLocations,   repository ? :string | {  type  :string,   url  :string},   scripts ? :type-fest.type-fest/source/package-json.PackageJson.Scripts,   config ? :{[configKey: string] : unknown},   dependencies ? :type-fest.type-fest/source/package-json.PackageJson.Dependency,   devDependencies ? :type-fest.type-fest/source/package-json.PackageJson.Dependency,   optionalDependencies ? :type-fest.type-fest/source/package-json.PackageJson.Dependency,   peerDependencies ? :type-fest.type-fest/source/package-json.PackageJson.Dependency,   bundledDependencies ? :std.Array<string>,   bundleDependencies ? :std.Array<string>,   engines ? :{[ EngineName in 'npm' | 'node' | string ]: string},   engineStrict ? :boolean,   os ? :std.Array<type-fest.type-fest.LiteralUnion<'aix' | 'darwin' | 'freebsd' | 'linux' | 'openbsd' | 'sunos' | 'win32' | '!aix' | '!darwin' | '!freebsd' | '!linux' | '!openbsd' | '!sunos' | '!win32', string>>,   cpu ? :std.Array<type-fest.type-fest.LiteralUnion<'arm' | 'arm64' | 'ia32' | 'mips' | 'mipsel' | 'ppc' | 'ppc64' | 's390' | 's390x' | 'x32' | 'x64' | '!arm' | '!arm64' | '!ia32' | '!mips' | '!mipsel' | '!ppc' | '!ppc64' | '!s390' | '!s390x' | '!x32' | '!x64', string>>,   preferGlobal ? :boolean,   private ? :boolean,   publishConfig ? :{[config: string] : unknown}, [key: string] : unknown} & type-fest.type-fest/source/package-json.PackageJson.NonStandardEntryPoints & type-fest.type-fest/source/package-json.PackageJson.TypeScriptConfiguration & type-fest.type-fest/source/package-json.PackageJson.YarnConfiguration & type-fest.type-fest/source/package-json.PackageJson.JSPMConfiguration */
trait PackageJson_
  extends /* key */ StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.undefined
  /**
  	The executable files that should be installed into the `PATH`.
  	*/
  var bin: js.UndefOr[String | StringDictionary[String]] = js.undefined
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.undefined
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
    */ typings.typeFest.typeFestStrings.PackageJson with js.Any
  ] = js.undefined
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[String | AnonDictmoduleName] = js.undefined
  /**
  	The files included in the package.
  	*/
  var files: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
  		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
  		*/
  var flat: js.UndefOr[Boolean] = js.undefined
  /**
  	The URL to the package's homepage.
  	*/
  var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.undefined
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[PackageJson] = js.undefined
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
  var licenses: js.UndefOr[js.Array[AnonType]] = js.undefined
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
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[String] = js.undefined
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
  var repository: js.UndefOr[String | AnonUrl] = js.undefined
  /**
  		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
  		*/
  var resolutions: js.UndefOr[Dependency] = js.undefined
  /**
  	Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
  	*/
  var scripts: js.UndefOr[Scripts] = js.undefined
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[String] = js.undefined
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  @JSName("typings")
  var typings_ : js.UndefOr[String] = js.undefined
  /**
  	Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
  	*/
  var version: js.UndefOr[String] = js.undefined
}

object PackageJson_ {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    author: Person = null,
    bin: String | StringDictionary[String] = null,
    browser: String | (StringDictionary[String | `false`]) = null,
    bugs: BugsLocation = null,
    bundleDependencies: js.Array[String] = null,
    bundledDependencies: js.Array[String] = null,
    config: StringDictionary[js.Any] = null,
    contributors: js.Array[Person] = null,
    cpu: js.Array[
      LiteralUnion[
        arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
        String
      ]
    ] = null,
    dependencies: Dependency = null,
    description: String = null,
    devDependencies: Dependency = null,
    directories: DirectoryLocations = null,
    engineStrict: js.UndefOr[Boolean] = js.undefined,
    engines: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EngineName in 'npm' | 'node' | string ]: string}
    */ typings.typeFest.typeFestStrings.PackageJson with js.Any = null,
    esnext: String | AnonDictmoduleName = null,
    files: js.Array[String] = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    homepage: LiteralUnion[Dot, String] = null,
    jspm: PackageJson = null,
    keywords: js.Array[String] = null,
    license: String = null,
    licenses: js.Array[AnonType] = null,
    main: String = null,
    maintainers: js.Array[Person] = null,
    man: String | js.Array[String] = null,
    module: String = null,
    name: String = null,
    optionalDependencies: Dependency = null,
    os: js.Array[
      LiteralUnion[
        aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
        String
      ]
    ] = null,
    peerDependencies: Dependency = null,
    preferGlobal: js.UndefOr[Boolean] = js.undefined,
    `private`: js.UndefOr[Boolean] = js.undefined,
    publishConfig: StringDictionary[js.Any] = null,
    repository: String | AnonUrl = null,
    resolutions: Dependency = null,
    scripts: Scripts = null,
    types: String = null,
    typings_ : String = null,
    version: String = null
  ): PackageJson_ = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies.asInstanceOf[js.Any])
    if (bundledDependencies != null) __obj.updateDynamic("bundledDependencies")(bundledDependencies.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (!js.isUndefined(engineStrict)) __obj.updateDynamic("engineStrict")(engineStrict.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (esnext != null) __obj.updateDynamic("esnext")(esnext.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (jspm != null) __obj.updateDynamic("jspm")(jspm.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (licenses != null) __obj.updateDynamic("licenses")(licenses.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGlobal)) __obj.updateDynamic("preferGlobal")(preferGlobal.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (publishConfig != null) __obj.updateDynamic("publishConfig")(publishConfig.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (typings_ != null) __obj.updateDynamic("typings")(typings_.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson_]
  }
}

