package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aix
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var author: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person] = js.undefined
  /**
  	The executable files that should be installed into the `PATH`.
  	*/
  var bin: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  	The URL to the package's issue tracker and/or the email address to which issues should be reported.
  	*/
  var bugs: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.BugsLocation] = js.undefined
  /**
  	Alias of `bundledDependencies`.
  	*/
  var bundleDependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	Package names that are bundled when the package is published.
  	*/
  var bundledDependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	Is used to set configuration parameters used in package scripts that persist across upgrades.
  	*/
  var config: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
  	A list of people who contributed to the package.
  	*/
  var contributors: js.UndefOr[js.Array[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person]] = js.undefined
  /**
  	CPU architectures the module runs on.
  	*/
  var cpu: js.UndefOr[
    js.Array[
      typeDashFestLib.typeDashFestMod.LiteralUnion[
        typeDashFestLib.typeDashFestLibStrings.arm | typeDashFestLib.typeDashFestLibStrings.arm64 | typeDashFestLib.typeDashFestLibStrings.ia32 | typeDashFestLib.typeDashFestLibStrings.mips | typeDashFestLib.typeDashFestLibStrings.mipsel | typeDashFestLib.typeDashFestLibStrings.ppc | typeDashFestLib.typeDashFestLibStrings.ppc64 | typeDashFestLib.typeDashFestLibStrings.s390 | typeDashFestLib.typeDashFestLibStrings.s390x | typeDashFestLib.typeDashFestLibStrings.x32 | typeDashFestLib.typeDashFestLibStrings.x64 | typeDashFestLib.typeDashFestLibStrings.`!arm` | typeDashFestLib.typeDashFestLibStrings.`!arm64` | typeDashFestLib.typeDashFestLibStrings.`!ia32` | typeDashFestLib.typeDashFestLibStrings.`!mips` | typeDashFestLib.typeDashFestLibStrings.`!mipsel` | typeDashFestLib.typeDashFestLibStrings.`!ppc` | typeDashFestLib.typeDashFestLibStrings.`!ppc64` | typeDashFestLib.typeDashFestLibStrings.`!s390` | typeDashFestLib.typeDashFestLibStrings.`!s390x` | typeDashFestLib.typeDashFestLibStrings.`!x32` | typeDashFestLib.typeDashFestLibStrings.`!x64`, 
        java.lang.String
      ]
    ]
  ] = js.undefined
  /**
  	The dependencies of the package.
  	*/
  var dependencies: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency] = js.undefined
  /**
  	Package description, listed in `npm search`.
  	*/
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
  	Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
  	*/
  var devDependencies: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency] = js.undefined
  /**
  	Indicates the structure of the package.
  	*/
  var directories: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.DirectoryLocations] = js.undefined
  /**
  	@deprecated
  	*/
  var engineStrict: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	Engines that this package runs on.
  	*/
  var engines: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ EngineName in 'npm' | 'node' | string ]: string}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ EngineName in 'npm' | 'node' | string ]: string}
    */ typeDashFestLib.typeDashFestLibStrings.Anon_Aix with js.Any
  ] = js.undefined
  /**
  	The files included in the package.
  	*/
  var files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	The URL to the package's homepage.
  	*/
  var homepage: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[typeDashFestLib.typeDashFestLibStrings.DOT, java.lang.String]
  ] = js.undefined
  /**
  	Keywords associated with package, listed in `npm search`.
  	*/
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	The license for the package.
  	*/
  var license: js.UndefOr[java.lang.String] = js.undefined
  /**
  	The licenses for the package.
  	*/
  var licenses: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  /**
  	The module ID that is the primary entry point to the program.
  	*/
  var main: js.UndefOr[java.lang.String] = js.undefined
  /**
  	A list of people who maintain the package.
  	*/
  var maintainers: js.UndefOr[js.Array[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person]] = js.undefined
  /**
  	Filenames to put in place for the `man` program to find.
  	*/
  var man: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  	The name of the package.
  	*/
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	Dependencies that are skipped if they fail to install.
  	*/
  var optionalDependencies: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency] = js.undefined
  /**
  	Operating systems the module runs on.
  	*/
  var os: js.UndefOr[
    js.Array[
      typeDashFestLib.typeDashFestMod.LiteralUnion[
        typeDashFestLib.typeDashFestLibStrings.aix | typeDashFestLib.typeDashFestLibStrings.darwin | typeDashFestLib.typeDashFestLibStrings.freebsd | typeDashFestLib.typeDashFestLibStrings.linux | typeDashFestLib.typeDashFestLibStrings.openbsd | typeDashFestLib.typeDashFestLibStrings.sunos | typeDashFestLib.typeDashFestLibStrings.win32 | typeDashFestLib.typeDashFestLibStrings.`!aix` | typeDashFestLib.typeDashFestLibStrings.`!darwin` | typeDashFestLib.typeDashFestLibStrings.`!freebsd` | typeDashFestLib.typeDashFestLibStrings.`!linux` | typeDashFestLib.typeDashFestLibStrings.`!openbsd` | typeDashFestLib.typeDashFestLibStrings.`!sunos` | typeDashFestLib.typeDashFestLibStrings.`!win32`, 
        java.lang.String
      ]
    ]
  ] = js.undefined
  /**
  	Dependencies that will usually be required by the package user directly or via another dependency.
  	*/
  var peerDependencies: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency] = js.undefined
  /**
  	If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
  	@deprecated
  	*/
  var preferGlobal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	If set to `true`, then npm will refuse to publish it.
  	*/
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
  	 */
  var publishConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
  	Location for the code repository.
  	*/
  var repository: js.UndefOr[java.lang.String | Anon_TypeUrl] = js.undefined
  /**
  	Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
  	*/
  var scripts: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Scripts] = js.undefined
  /**
  	Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
  	*/
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Aix {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    author: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person = null,
    bin: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    bugs: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.BugsLocation = null,
    bundleDependencies: js.Array[java.lang.String] = null,
    bundledDependencies: js.Array[java.lang.String] = null,
    config: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contributors: js.Array[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person] = null,
    cpu: js.Array[
      typeDashFestLib.typeDashFestMod.LiteralUnion[
        typeDashFestLib.typeDashFestLibStrings.arm | typeDashFestLib.typeDashFestLibStrings.arm64 | typeDashFestLib.typeDashFestLibStrings.ia32 | typeDashFestLib.typeDashFestLibStrings.mips | typeDashFestLib.typeDashFestLibStrings.mipsel | typeDashFestLib.typeDashFestLibStrings.ppc | typeDashFestLib.typeDashFestLibStrings.ppc64 | typeDashFestLib.typeDashFestLibStrings.s390 | typeDashFestLib.typeDashFestLibStrings.s390x | typeDashFestLib.typeDashFestLibStrings.x32 | typeDashFestLib.typeDashFestLibStrings.x64 | typeDashFestLib.typeDashFestLibStrings.`!arm` | typeDashFestLib.typeDashFestLibStrings.`!arm64` | typeDashFestLib.typeDashFestLibStrings.`!ia32` | typeDashFestLib.typeDashFestLibStrings.`!mips` | typeDashFestLib.typeDashFestLibStrings.`!mipsel` | typeDashFestLib.typeDashFestLibStrings.`!ppc` | typeDashFestLib.typeDashFestLibStrings.`!ppc64` | typeDashFestLib.typeDashFestLibStrings.`!s390` | typeDashFestLib.typeDashFestLibStrings.`!s390x` | typeDashFestLib.typeDashFestLibStrings.`!x32` | typeDashFestLib.typeDashFestLibStrings.`!x64`, 
        java.lang.String
      ]
    ] = null,
    dependencies: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency = null,
    description: java.lang.String = null,
    devDependencies: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency = null,
    directories: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.DirectoryLocations = null,
    engineStrict: js.UndefOr[scala.Boolean] = js.undefined,
    engines: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ EngineName in 'npm' | 'node' | string ]: string}
    */ typeDashFestLib.typeDashFestLibStrings.Anon_Aix with js.Any = null,
    files: js.Array[java.lang.String] = null,
    homepage: typeDashFestLib.typeDashFestMod.LiteralUnion[typeDashFestLib.typeDashFestLibStrings.DOT, java.lang.String] = null,
    keywords: js.Array[java.lang.String] = null,
    license: java.lang.String = null,
    licenses: js.Array[Anon_Type] = null,
    main: java.lang.String = null,
    maintainers: js.Array[typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Person] = null,
    man: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    optionalDependencies: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency = null,
    os: js.Array[
      typeDashFestLib.typeDashFestMod.LiteralUnion[
        typeDashFestLib.typeDashFestLibStrings.aix | typeDashFestLib.typeDashFestLibStrings.darwin | typeDashFestLib.typeDashFestLibStrings.freebsd | typeDashFestLib.typeDashFestLibStrings.linux | typeDashFestLib.typeDashFestLibStrings.openbsd | typeDashFestLib.typeDashFestLibStrings.sunos | typeDashFestLib.typeDashFestLibStrings.win32 | typeDashFestLib.typeDashFestLibStrings.`!aix` | typeDashFestLib.typeDashFestLibStrings.`!darwin` | typeDashFestLib.typeDashFestLibStrings.`!freebsd` | typeDashFestLib.typeDashFestLibStrings.`!linux` | typeDashFestLib.typeDashFestLibStrings.`!openbsd` | typeDashFestLib.typeDashFestLibStrings.`!sunos` | typeDashFestLib.typeDashFestLibStrings.`!win32`, 
        java.lang.String
      ]
    ] = null,
    peerDependencies: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Dependency = null,
    preferGlobal: js.UndefOr[scala.Boolean] = js.undefined,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    publishConfig: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    repository: java.lang.String | Anon_TypeUrl = null,
    scripts: typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs.Scripts = null,
    version: java.lang.String = null
  ): Anon_Aix = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies)
    if (bundledDependencies != null) __obj.updateDynamic("bundledDependencies")(bundledDependencies)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (directories != null) __obj.updateDynamic("directories")(directories)
    if (!js.isUndefined(engineStrict)) __obj.updateDynamic("engineStrict")(engineStrict)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (files != null) __obj.updateDynamic("files")(files)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (licenses != null) __obj.updateDynamic("licenses")(licenses)
    if (main != null) __obj.updateDynamic("main")(main)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (os != null) __obj.updateDynamic("os")(os)
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies)
    if (!js.isUndefined(preferGlobal)) __obj.updateDynamic("preferGlobal")(preferGlobal)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (publishConfig != null) __obj.updateDynamic("publishConfig")(publishConfig)
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Aix]
  }
}

