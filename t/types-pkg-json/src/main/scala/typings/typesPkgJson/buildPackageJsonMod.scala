package typings.typesPkgJson

import org.scalablytyped.runtime.StringDictionary
import typings.typesPkgJson.anon.DictmoduleName
import typings.typesPkgJson.buildConfigurationMod.ESLintConfiguration
import typings.typesPkgJson.buildConfigurationMod.JSPMConfiguration
import typings.typesPkgJson.buildConfigurationMod.TypeScriptConfiguration
import typings.typesPkgJson.buildConfigurationYarnMod.YarnConfiguration
import typings.typesPkgJson.buildFieldsMod.Bin
import typings.typesPkgJson.buildFieldsMod.BugsLocation
import typings.typesPkgJson.buildFieldsMod.CPU
import typings.typesPkgJson.buildFieldsMod.Dependencies
import typings.typesPkgJson.buildFieldsMod.DirectoryLocations
import typings.typesPkgJson.buildFieldsMod.Engines
import typings.typesPkgJson.buildFieldsMod.Funding
import typings.typesPkgJson.buildFieldsMod.License
import typings.typesPkgJson.buildFieldsMod.LicenseID
import typings.typesPkgJson.buildFieldsMod.Licenses
import typings.typesPkgJson.buildFieldsMod.OS
import typings.typesPkgJson.buildFieldsMod.PeerDependenciesMeta
import typings.typesPkgJson.buildFieldsMod.Person
import typings.typesPkgJson.buildFieldsMod.Repository
import typings.typesPkgJson.buildFieldsScriptsMod.Scripts
import typings.typesPkgJson.buildUtilsMod.LiteralUnion
import typings.typesPkgJson.typesPkgJsonBooleans.`false`
import typings.typesPkgJson.typesPkgJsonStrings.Dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPackageJsonMod {
  
  trait NonStandardEntryPoints extends StObject {
    
    /**
      * A hint to JavaScript bundlers or component tools when packaging modules for client side use.
      */
    var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.undefined
    
    /**
      * A module ID with untranspiled code that is the primary entry point to the program.
      */
    var esnext: js.UndefOr[String | DictmoduleName] = js.undefined
    
    /**
      * An ECMAScript module ID that is the primary entry point to the program.
      */
    var module: js.UndefOr[String] = js.undefined
    
    /**
      * Denote which files in your project are "pure" and therefore safe for Webpack to prune if unused.
      * [Read more.](https://webpack.js.org/guides/tree-shaking/)
      */
    var sideEffects: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  }
  object NonStandardEntryPoints {
    
    inline def apply(): NonStandardEntryPoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NonStandardEntryPoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonStandardEntryPoints] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String | (StringDictionary[String | `false`])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject * / any */ trait PackageJSON
    extends StObject
       with NonStandardEntryPoints
       with TypeScriptConfiguration
       with ESLintConfiguration
       with YarnConfiguration
       with JSPMConfiguration {
    
    var author: js.UndefOr[Person] = js.undefined
    
    /**
      * The executable files that should be installed into the `PATH`.
      */
    var bin: js.UndefOr[Bin] = js.undefined
    
    /**
      * The URL to the package's issue tracker and/or the email address to which issues should be reported.
      */
    var bugs: js.UndefOr[BugsLocation] = js.undefined
    
    /**
      * Alias of `bundledDependencies`.
      */
    var bundleDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Package names that are bundled when the package is published.
      */
    var bundledDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Is used to set configuration parameters used in package scripts that persist across upgrades.
      */
    var config: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
      ] = js.undefined
    
    /**
      * A list of people who contributed to the package.
      */
    var contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    /**
      * CPU architectures the module runs on.
      */
    var cpu: js.UndefOr[js.Array[CPU]] = js.undefined
    
    /**
      * The dependencies of the package.
      */
    var dependencies: js.UndefOr[Dependencies] = js.undefined
    
    /**
      * Package description, listed in `npm search`.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
      */
    var devDependencies: js.UndefOr[Dependencies] = js.undefined
    
    /**
      * Indicates the structure of the package.
      */
    var directories: js.UndefOr[DirectoryLocations] = js.undefined
    
    /**
      * @deprecated
      */
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Engines that this package runs on.
      */
    var engines: js.UndefOr[Engines] = js.undefined
    
    /**
      * The files included in the package.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Describes and notifies consumers of a package's monetary support information.
      [Read more.](https://github.com/npm/rfcs/blob/latest/accepted/0017-add-funding-support.md)
      */
    var funding: js.UndefOr[Funding] = js.undefined
    
    /**
      * The URL to the package's homepage.
      */
    var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.undefined
    
    /**
      * Keywords associated with package, listed in `npm search`.
      */
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The license for the package.
      */
    var license: js.UndefOr[LicenseID] = js.undefined
    
    /**
      * The licenses for the package.
      */
    var licenses: js.UndefOr[Licenses] = js.undefined
    
    /**
      * The module ID that is the primary entry point to the program.
      */
    var main: js.UndefOr[String] = js.undefined
    
    /**
      * A list of people who maintain the package.
      */
    var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    /**
      * Filenames to put in place for the `man` program to find.
      */
    var man: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The name of the package.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Dependencies that are skipped if they fail to install.
      */
    var optionalDependencies: js.UndefOr[Dependencies] = js.undefined
    
    /**
      * Operating systems the module runs on.
      */
    var os: js.UndefOr[js.Array[OS]] = js.undefined
    
    /**
      * Dependencies that will usually be required by the package user directly or via another dependency.
      */
    var peerDependencies: js.UndefOr[Dependencies] = js.undefined
    
    /**
      * Indicate peer dependencies that are optional.
      */
    var peerDependenciesMeta: js.UndefOr[PeerDependenciesMeta] = js.undefined
    
    /**
      * If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
      * @deprecated
      */
    var preferGlobal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, then npm will refuse to publish it.
      */
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest',
      * published to the global public registry or that a scoped module is private by default.
      */
    var publishConfig: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
      ] = js.undefined
    
    /**
      * Location for the code repository.
      */
    var repository: js.UndefOr[Repository] = js.undefined
    
    /**
      * Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
      */
    var scripts: js.UndefOr[Scripts] = js.undefined
    
    /**
      * Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object PackageJSON {
    
    inline def apply(): PackageJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJSON] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBin(value: Bin): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBugs(value: BugsLocation): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setBundleDependencies(value: js.Array[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value*))
      
      inline def setBundledDependencies(value: js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
      
      inline def setConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
      
      inline def setCpu(value: js.Array[CPU]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setCpuVarargs(value: CPU*): Self = StObject.set(x, "cpu", js.Array(value*))
      
      inline def setDependencies(value: Dependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: Dependencies): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDirectories(value: DirectoryLocations): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setEngines(value: Engines): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFunding(value: Funding): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
      
      inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
      
      inline def setHomepage(value: LiteralUnion[Dot, String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLicense(value: LicenseID): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setLicenses(value: Licenses): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      inline def setLicensesVarargs(value: License*): Self = StObject.set(x, "licenses", js.Array(value*))
      
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
      
      inline def setOptionalDependencies(value: Dependencies): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setOs(value: js.Array[OS]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setOsVarargs(value: OS*): Self = StObject.set(x, "os", js.Array(value*))
      
      inline def setPeerDependencies(value: Dependencies): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesMeta(value: PeerDependenciesMeta): Self = StObject.set(x, "peerDependenciesMeta", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesMetaUndefined: Self = StObject.set(x, "peerDependenciesMeta", js.undefined)
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
      
      inline def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublishConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
      ): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
