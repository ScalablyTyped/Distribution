package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.tslint.anon.PartialIOptions
import typings.tslint.anon.PartialexcludeArraystring
import typings.tslint.anon.Severity
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.RuleSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("tslint/lib/configuration", "CONFIG_FILENAME")
  @js.native
  val CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  @JSImport("tslint/lib/configuration", "CONFIG_FILENAMES")
  @js.native
  val CONFIG_FILENAMES: js.Array[String] = js.native
  
  @JSImport("tslint/lib/configuration", "DEFAULT_CONFIG")
  @js.native
  val DEFAULT_CONFIG: IConfigurationFile = js.native
  
  @JSImport("tslint/lib/configuration", "EMPTY_CONFIG")
  @js.native
  val EMPTY_CONFIG: IConfigurationFile = js.native
  
  @JSImport("tslint/lib/configuration", "JSON_CONFIG_FILENAME")
  @js.native
  val JSON_CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  @JSImport("tslint/lib/configuration", "convertRuleOptions")
  @js.native
  def convertRuleOptions(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = js.native
  
  @JSImport("tslint/lib/configuration", "extendConfigurationFile")
  @js.native
  def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = js.native
  
  @JSImport("tslint/lib/configuration", "findConfiguration")
  @js.native
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  @JSImport("tslint/lib/configuration", "findConfiguration")
  @js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  @JSImport("tslint/lib/configuration", "findConfiguration")
  @js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  
  @JSImport("tslint/lib/configuration", "findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint/lib/configuration", "getRelativePath")
  @js.native
  def getRelativePath(): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "getRelativePath")
  @js.native
  def getRelativePath(directory: js.UndefOr[scala.Nothing], relativeTo: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "getRelativePath")
  @js.native
  def getRelativePath(directory: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "getRelativePath")
  @js.native
  def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/configuration", "getRelativePath")
  @js.native
  def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(): js.Array[String] = js.native
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  @JSImport("tslint/lib/configuration", "getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  
  @JSImport("tslint/lib/configuration", "isFileExcluded")
  @js.native
  def isFileExcluded(filepath: String): Boolean = js.native
  @JSImport("tslint/lib/configuration", "isFileExcluded")
  @js.native
  def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = js.native
  
  @JSImport("tslint/lib/configuration", "loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
  
  @JSImport("tslint/lib/configuration", "parseConfigFile")
  @js.native
  def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "parseConfigFile")
  @js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: js.UndefOr[scala.Nothing],
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "parseConfigFile")
  @js.native
  def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = js.native
  @JSImport("tslint/lib/configuration", "parseConfigFile")
  @js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  
  @JSImport("tslint/lib/configuration", "readConfigurationFile")
  @js.native
  def readConfigurationFile(filepath: String): RawConfigFile = js.native
  
  @JSImport("tslint/lib/configuration", "stringifyConfiguration")
  @js.native
  def stringifyConfiguration(configFile: IConfigurationFile): String = js.native
  
  @JSImport("tslint/lib/configuration", "useAsPath")
  @js.native
  def useAsPath(directory: String): Boolean = js.native
  
  @js.native
  trait IConfigurationFile extends StObject {
    
    /**
      * @deprecated property is never set
      *
      * The severity that is applied to rules in this config file as well as rules
      * in any inherited config files which have their severity set to "default".
      * Not inherited.
      */
    var defaultSeverity: js.UndefOr[RuleSeverity] = js.native
    
    /**
      * An array of config files whose rules are inherited by this config file.
      */
    var `extends`: js.Array[String] = js.native
    
    /**
      * Rules that are used to lint to JavaScript files.
      */
    var jsRules: Map[String, PartialIOptions] = js.native
    
    /**
      * A subset of the CLI options.
      */
    var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
    
    /**
      * Rules that are used to lint TypeScript files.
      */
    var rules: Map[String, PartialIOptions] = js.native
    
    /**
      * Directories containing custom rules. Resolved using node module semantics.
      */
    var rulesDirectory: js.Array[String] = js.native
  }
  object IConfigurationFile {
    
    @scala.inline
    def apply(
      `extends`: js.Array[String],
      jsRules: Map[String, PartialIOptions],
      rules: Map[String, PartialIOptions],
      rulesDirectory: js.Array[String]
    ): IConfigurationFile = {
      val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfigurationFile]
    }
    
    @scala.inline
    implicit class IConfigurationFileMutableBuilder[Self <: IConfigurationFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSeverity(value: RuleSeverity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
      
      @scala.inline
      def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setJsRules(value: Map[String, PartialIOptions]): Self = StObject.set(x, "jsRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinterOptions(value: PartialexcludeArraystring): Self = StObject.set(x, "linterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinterOptionsUndefined: Self = StObject.set(x, "linterOptions", js.undefined)
      
      @scala.inline
      def setRules(value: Map[String, PartialIOptions]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectory(value: js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IConfigurationLoadResult extends StObject {
    
    var path: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[IConfigurationFile] = js.native
  }
  object IConfigurationLoadResult {
    
    @scala.inline
    def apply(): IConfigurationLoadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConfigurationLoadResult]
    }
    
    @scala.inline
    implicit class IConfigurationLoadResultMutableBuilder[Self <: IConfigurationLoadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setResults(value: IConfigurationFile): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    }
  }
  
  @js.native
  trait RawConfigFile extends StObject {
    
    var defaultSeverity: js.UndefOr[String] = js.native
    
    var `extends`: js.UndefOr[String | js.Array[String]] = js.native
    
    var jsRules: js.UndefOr[RawRulesConfig | Boolean] = js.native
    
    var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
    
    var rules: js.UndefOr[RawRulesConfig] = js.native
    
    var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
  }
  object RawConfigFile {
    
    @scala.inline
    def apply(): RawConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawConfigFile]
    }
    
    @scala.inline
    implicit class RawConfigFileMutableBuilder[Self <: RawConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSeverity(value: String): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
      
      @scala.inline
      def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setJsRules(value: RawRulesConfig | Boolean): Self = StObject.set(x, "jsRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsRulesUndefined: Self = StObject.set(x, "jsRules", js.undefined)
      
      @scala.inline
      def setLinterOptions(value: PartialexcludeArraystring): Self = StObject.set(x, "linterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinterOptionsUndefined: Self = StObject.set(x, "linterOptions", js.undefined)
      
      @scala.inline
      def setRules(value: RawRulesConfig): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      @scala.inline
      def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value :_*))
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  type RawRuleConfig = js.UndefOr[Null | Boolean | js.Array[js.Any] | Severity]
  
  type RawRulesConfig = StringDictionary[RawRuleConfig]
}
