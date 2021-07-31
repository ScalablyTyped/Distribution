package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeRequire
import typings.requireDirectory.mod.RequireDirectoryOptions
import typings.std.Error
import typings.std.Exclude
import typings.yargs.anon.FnCall
import typings.yargs.anon.FnCallKeyOptionDefinition
import typings.yargs.anon.FnCallMinMaxMsg
import typings.yargs.anon.FnCallOptMsg
import typings.yargs.anon.FnCallStrArg1Arg2Arg3
import typings.yargs.anon.Max
import typings.yargs.commandMod.CommandBuilder
import typings.yargs.commandMod.CommandBuilderDefinition
import typings.yargs.commandMod.CommandHandlerCallback
import typings.yargs.commandMod.CommandInstance
import typings.yargs.commandMod.FinishCommandHandler
import typings.yargs.commonTypesMod.Dictionary
import typings.yargs.completionMod.CompletionFunction
import typings.yargs.middlewareMod.Middleware
import typings.yargs.middlewareMod.MiddlewareCallback
import typings.yargs.usageMod.FailureFunction
import typings.yargs.usageMod.UsageInstance
import typings.yargs.validationMod.KeyOrPos
import typings.yargs.validationMod.ValidationInstance
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import typings.yargs.yargsStrings.boolean
import typings.yargs.yargsStrings.count
import typings.yargs.yargsStrings.error
import typings.yargs.yargsStrings.log
import typings.yargs.yargsStrings.number
import typings.yargs.yargsStrings.string
import typings.yargs.yerrorMod.YError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yargsMod {
  
  @JSImport("yargs/build/lib/yargs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Yargs(): YargsInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")().asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: String): YargsInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any]).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: String, cwd: String): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: String, cwd: String, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: String, cwd: Unit, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: js.Array[String]): YargsInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any]).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: js.Array[String], cwd: String): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: js.Array[String], cwd: String, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: js.Array[String], cwd: Unit, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: Unit, cwd: String): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: Unit, cwd: String, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  @scala.inline
  def Yargs(processArgs: Unit, cwd: Unit, parentRequire: NodeRequire): YargsInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Yargs")(processArgs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], parentRequire.asInstanceOf[js.Any])).asInstanceOf[YargsInstance]
  
  @scala.inline
  def isYargsInstance(y: Unit): /* is yargs.yargs/build/lib/yargs.YargsInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYargsInstance")(y.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/yargs.YargsInstance */ Boolean]
  @scala.inline
  def isYargsInstance(y: YargsInstance): /* is yargs.yargs/build/lib/yargs.YargsInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYargsInstance")(y.asInstanceOf[js.Any]).asInstanceOf[/* is yargs.yargs/build/lib/yargs.YargsInstance */ Boolean]
  
  @scala.inline
  def rebase(base: String, dir: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rebase")(base.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Arguments
    extends StObject
       with typings.yargsParser.mod.Arguments
  object Arguments {
    
    @scala.inline
    def apply($0: String, _underscore: js.Array[String]): Arguments = {
      val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
  }
  
  /* Inlined parent std.Partial<yargs-parser.yargs-parser.Configuration> */
  trait Configuration extends StObject {
    
    var `boolean-negation`: js.UndefOr[Boolean] = js.undefined
    
    var `camel-case-expansion`: js.UndefOr[Boolean] = js.undefined
    
    var `combine-arrays`: js.UndefOr[Boolean] = js.undefined
    
    /** Should a config object be deep-merged with the object config it extends? */
    var `deep-merge-config`: js.UndefOr[Boolean] = js.undefined
    
    var `dot-notation`: js.UndefOr[Boolean] = js.undefined
    
    var `duplicate-arguments-array`: js.UndefOr[Boolean] = js.undefined
    
    var `flatten-duplicate-arrays`: js.UndefOr[Boolean] = js.undefined
    
    var `halt-at-non-option`: js.UndefOr[Boolean] = js.undefined
    
    var `negation-prefix`: js.UndefOr[String] = js.undefined
    
    var `parse-numbers`: js.UndefOr[Boolean] = js.undefined
    
    var `populate--`: js.UndefOr[Boolean] = js.undefined
    
    var `set-placeholder-key`: js.UndefOr[Boolean] = js.undefined
    
    var `short-option-groups`: js.UndefOr[Boolean] = js.undefined
    
    /** Should commands be sorted in help? */
    var `sort-commands`: js.UndefOr[Boolean] = js.undefined
    
    var `strip-aliased`: js.UndefOr[Boolean] = js.undefined
    
    var `strip-dashed`: js.UndefOr[Boolean] = js.undefined
    
    var `unknown-options-as-args`: js.UndefOr[Boolean] = js.undefined
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBoolean-negation`(value: Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBoolean-negationUndefined`: Self = StObject.set(x, "boolean-negation", js.undefined)
      
      @scala.inline
      def `setCamel-case-expansion`(value: Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCamel-case-expansionUndefined`: Self = StObject.set(x, "camel-case-expansion", js.undefined)
      
      @scala.inline
      def `setCombine-arrays`(value: Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCombine-arraysUndefined`: Self = StObject.set(x, "combine-arrays", js.undefined)
      
      @scala.inline
      def `setDeep-merge-config`(value: Boolean): Self = StObject.set(x, "deep-merge-config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDeep-merge-configUndefined`: Self = StObject.set(x, "deep-merge-config", js.undefined)
      
      @scala.inline
      def `setDot-notation`(value: Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDot-notationUndefined`: Self = StObject.set(x, "dot-notation", js.undefined)
      
      @scala.inline
      def `setDuplicate-arguments-array`(value: Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDuplicate-arguments-arrayUndefined`: Self = StObject.set(x, "duplicate-arguments-array", js.undefined)
      
      @scala.inline
      def `setFlatten-duplicate-arrays`(value: Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlatten-duplicate-arraysUndefined`: Self = StObject.set(x, "flatten-duplicate-arrays", js.undefined)
      
      @scala.inline
      def `setHalt-at-non-option`(value: Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHalt-at-non-optionUndefined`: Self = StObject.set(x, "halt-at-non-option", js.undefined)
      
      @scala.inline
      def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNegation-prefixUndefined`: Self = StObject.set(x, "negation-prefix", js.undefined)
      
      @scala.inline
      def `setParse-numbers`(value: Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setParse-numbersUndefined`: Self = StObject.set(x, "parse-numbers", js.undefined)
      
      @scala.inline
      def `setPopulate--`(value: Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPopulate--Undefined`: Self = StObject.set(x, "populate--", js.undefined)
      
      @scala.inline
      def `setSet-placeholder-key`(value: Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSet-placeholder-keyUndefined`: Self = StObject.set(x, "set-placeholder-key", js.undefined)
      
      @scala.inline
      def `setShort-option-groups`(value: Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-option-groupsUndefined`: Self = StObject.set(x, "short-option-groups", js.undefined)
      
      @scala.inline
      def `setSort-commands`(value: Boolean): Self = StObject.set(x, "sort-commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSort-commandsUndefined`: Self = StObject.set(x, "sort-commands", js.undefined)
      
      @scala.inline
      def `setStrip-aliased`(value: Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-aliasedUndefined`: Self = StObject.set(x, "strip-aliased", js.undefined)
      
      @scala.inline
      def `setStrip-dashed`(value: Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-dashedUndefined`: Self = StObject.set(x, "strip-dashed", js.undefined)
      
      @scala.inline
      def `setUnknown-options-as-args`(value: Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUnknown-options-as-argsUndefined`: Self = StObject.set(x, "unknown-options-as-args", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var commands: js.Array[String]
    
    var files: js.Array[String]
    
    var fullCommands: js.Array[String]
  }
  object Context {
    
    @scala.inline
    def apply(commands: js.Array[String], files: js.Array[String], fullCommands: js.Array[String]): Context = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], fullCommands = fullCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFullCommands(value: js.Array[String]): Self = StObject.set(x, "fullCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullCommandsVarargs(value: String*): Self = StObject.set(x, "fullCommands", js.Array(value :_*))
    }
  }
  
  trait DetailedArguments
    extends StObject
       with typings.yargsParser.mod.DetailedArguments
  object DetailedArguments {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[js.Array[String]],
      argv: typings.yargsParser.mod.Arguments,
      configuration: typings.yargsParser.mod.Configuration,
      newAliases: StringDictionary[Boolean]
    ): DetailedArguments = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[DetailedArguments]
    }
  }
  
  /* Inlined std.Pick<std.Console, 'error' | 'log'> */
  trait LoggerInstance extends StObject {
    
    def error(data: js.Any*): Unit
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ js.Any, Unit]
    
    def log(data: js.Any*): Unit
    @JSName("log")
    var log_Original: js.Function1[/* repeated */ js.Any, Unit]
  }
  object LoggerInstance {
    
    @scala.inline
    def apply(error: /* repeated */ js.Any => Unit, log: /* repeated */ js.Any => Unit): LoggerInstance = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[LoggerInstance]
    }
    
    @scala.inline
    implicit class LoggerInstanceMutableBuilder[Self <: LoggerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  trait OptionDefinition extends StObject {
    
    var default: js.UndefOr[js.Any] = js.undefined
    
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var array: js.UndefOr[Boolean] = js.undefined
    
    var boolean: js.UndefOr[Boolean] = js.undefined
    
    var choices: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var coerce: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
      ] = js.undefined
    
    var config: js.UndefOr[Boolean] = js.undefined
    
    var configParser: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
      ] = js.undefined
    
    var conflicts: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var count: js.UndefOr[Boolean] = js.undefined
    
    var defaultDescription: js.UndefOr[String] = js.undefined
    
    var demand: js.UndefOr[String | `true`] = js.undefined
    
    var demandOption: js.UndefOr[String | `true`] = js.undefined
    
    var deprecate: js.UndefOr[String | Boolean] = js.undefined
    
    var deprecated: js.UndefOr[String | Boolean] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var describe: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var implies: js.UndefOr[String | Double | js.Array[KeyOrPos]] = js.undefined
    
    var nargs: js.UndefOr[Double] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var number: js.UndefOr[Boolean] = js.undefined
    
    var require: js.UndefOr[String | `true`] = js.undefined
    
    var required: js.UndefOr[String | `true`] = js.undefined
    
    var requiresArg: js.UndefOr[Boolean] = js.undefined
    
    var skipValidation: js.UndefOr[Boolean] = js.undefined
    
    var string: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[array | boolean | count | number | string] = js.undefined
  }
  object OptionDefinition {
    
    @scala.inline
    def apply(): OptionDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionDefinition]
    }
    
    @scala.inline
    implicit class OptionDefinitionMutableBuilder[Self <: OptionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setChoices(value: String | js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setCoerce(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
      ): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      @scala.inline
      def setConfig(value: Boolean): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigParser(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
      ): Self = StObject.set(x, "configParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigParserUndefined: Self = StObject.set(x, "configParser", js.undefined)
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConflicts(value: String | js.Array[String]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
      
      @scala.inline
      def setConflictsVarargs(value: String*): Self = StObject.set(x, "conflicts", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDescriptionUndefined: Self = StObject.set(x, "defaultDescription", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDemand(value: String | `true`): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandOption(value: String | `true`): Self = StObject.set(x, "demandOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandOptionUndefined: Self = StObject.set(x, "demandOption", js.undefined)
      
      @scala.inline
      def setDemandUndefined: Self = StObject.set(x, "demand", js.undefined)
      
      @scala.inline
      def setDeprecate(value: String | Boolean): Self = StObject.set(x, "deprecate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecateUndefined: Self = StObject.set(x, "deprecate", js.undefined)
      
      @scala.inline
      def setDeprecated(value: String | Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setImplies(value: String | Double | js.Array[KeyOrPos]): Self = StObject.set(x, "implies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpliesUndefined: Self = StObject.set(x, "implies", js.undefined)
      
      @scala.inline
      def setImpliesVarargs(value: KeyOrPos*): Self = StObject.set(x, "implies", js.Array(value :_*))
      
      @scala.inline
      def setNargs(value: Double): Self = StObject.set(x, "nargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNargsUndefined: Self = StObject.set(x, "nargs", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setRequire(value: String | `true`): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      @scala.inline
      def setRequired(value: String | `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiresArg(value: Boolean): Self = StObject.set(x, "requiresArg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresArgUndefined: Self = StObject.set(x, "requiresArg", js.undefined)
      
      @scala.inline
      def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
      
      @scala.inline
      def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setType(value: array | boolean | count | number | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with typings.yargsParser.mod.Options {
    
    def __(str: String): String
    def __(str: String, arg1: String): String
    def __(str: String, arg1: String, arg2: String): String
    def __(str: String, arg1: String, arg2: String, arg3: String): String
    def __(str: String, arg1: String, arg2: Unit, arg3: String): String
    def __(str: String, arg1: Unit, arg2: String): String
    def __(str: String, arg1: Unit, arg2: String, arg3: String): String
    def __(str: String, arg1: Unit, arg2: Unit, arg3: String): String
    @JSName("__")
    var ___Original: FnCallStrArg1Arg2Arg3
    
    var choices: Dictionary[js.Array[String]]
    
    var configObjects: js.Array[Dictionary[js.Any]]
    
    var defaultDescription: Dictionary[js.UndefOr[String]]
    
    var demandedCommands: Dictionary[Max]
    
    var demandedOptions: Dictionary[js.UndefOr[String]]
    
    var deprecatedOptions: Dictionary[js.UndefOr[String | Boolean]]
    
    var hiddenOptions: js.Array[String]
    
    /** Manually set keys */
    var key: Dictionary[Boolean | String]
    
    var local: js.Array[String]
    
    var showHiddenOpt: String
    
    var skipValidation: js.Array[String]
  }
  object Options {
    
    @scala.inline
    def apply(
      __ : FnCallStrArg1Arg2Arg3,
      choices: Dictionary[js.Array[String]],
      configObjects: js.Array[Dictionary[js.Any]],
      defaultDescription: Dictionary[js.UndefOr[String]],
      demandedCommands: Dictionary[Max],
      demandedOptions: Dictionary[js.UndefOr[String]],
      deprecatedOptions: Dictionary[js.UndefOr[String | Boolean]],
      hiddenOptions: js.Array[String],
      key: Dictionary[Boolean | String],
      local: js.Array[String],
      showHiddenOpt: String,
      skipValidation: js.Array[String]
    ): Options = {
      val __obj = js.Dynamic.literal(__ = __.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], configObjects = configObjects.asInstanceOf[js.Any], defaultDescription = defaultDescription.asInstanceOf[js.Any], demandedCommands = demandedCommands.asInstanceOf[js.Any], demandedOptions = demandedOptions.asInstanceOf[js.Any], deprecatedOptions = deprecatedOptions.asInstanceOf[js.Any], hiddenOptions = hiddenOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], showHiddenOpt = showHiddenOpt.asInstanceOf[js.Any], skipValidation = skipValidation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: Dictionary[js.Array[String]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigObjects(value: js.Array[Dictionary[js.Any]]): Self = StObject.set(x, "configObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigObjectsVarargs(value: Dictionary[js.Any]*): Self = StObject.set(x, "configObjects", js.Array(value :_*))
      
      @scala.inline
      def setDefaultDescription(value: Dictionary[js.UndefOr[String]]): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandedCommands(value: Dictionary[Max]): Self = StObject.set(x, "demandedCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandedOptions(value: Dictionary[js.UndefOr[String]]): Self = StObject.set(x, "demandedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedOptions(value: Dictionary[js.UndefOr[String | Boolean]]): Self = StObject.set(x, "deprecatedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenOptions(value: js.Array[String]): Self = StObject.set(x, "hiddenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenOptionsVarargs(value: String*): Self = StObject.set(x, "hiddenOptions", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Dictionary[Boolean | String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: js.Array[String]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalVarargs(value: String*): Self = StObject.set(x, "local", js.Array(value :_*))
      
      @scala.inline
      def setShowHiddenOpt(value: String): Self = StObject.set(x, "showHiddenOpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipValidation(value: js.Array[String]): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipValidationVarargs(value: String*): Self = StObject.set(x, "skipValidation", js.Array(value :_*))
      
      @scala.inline
      def set__(value: FnCallStrArg1Arg2Arg3): Self = StObject.set(x, "__", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseCallback = js.Function3[
    /* err */ js.UndefOr[YError | String | Null], 
    /* argv */ Arguments | js.Promise[Arguments], 
    /* output */ String, 
    Unit
  ]
  
  /* Inlined parent std.Pick<yargs.yargs/build/lib/yargs.OptionDefinition, 'alias' | 'array' | 'coerce' | 'choices' | 'conflicts' | 'default' | 'defaultDescription' | 'demand' | 'desc' | 'describe' | 'description' | 'implies' | 'normalize'> */
  trait PositionalDefinition extends StObject {
    
    var default: js.UndefOr[js.Any] = js.undefined
    
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var array: js.UndefOr[Boolean] = js.undefined
    
    var choices: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var coerce: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
      ] = js.undefined
    
    var conflicts: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var defaultDescription: js.UndefOr[String] = js.undefined
    
    var demand: js.UndefOr[String | `true`] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var describe: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var implies: js.UndefOr[String | Double | js.Array[KeyOrPos]] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[boolean | number | string] = js.undefined
  }
  object PositionalDefinition {
    
    @scala.inline
    def apply(): PositionalDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionalDefinition]
    }
    
    @scala.inline
    implicit class PositionalDefinitionMutableBuilder[Self <: PositionalDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setChoices(value: String | js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setCoerce(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
      ): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      @scala.inline
      def setConflicts(value: String | js.Array[String]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
      
      @scala.inline
      def setConflictsVarargs(value: String*): Self = StObject.set(x, "conflicts", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDescriptionUndefined: Self = StObject.set(x, "defaultDescription", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDemand(value: String | `true`): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandUndefined: Self = StObject.set(x, "demand", js.undefined)
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImplies(value: String | Double | js.Array[KeyOrPos]): Self = StObject.set(x, "implies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpliesUndefined: Self = StObject.set(x, "implies", js.undefined)
      
      @scala.inline
      def setImpliesVarargs(value: KeyOrPos*): Self = StObject.set(x, "implies", js.Array(value :_*))
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setType(value: boolean | number | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait YargsInstance extends StObject {
    
    def default(key: String, value: js.Any): YargsInstance = js.native
    def default(key: String, value: js.Any, defaultDescription: String): YargsInstance = js.native
    def default(keys: js.Array[String], value: Exclude[js.Any, js.Function]): YargsInstance = js.native
    def default(keys: Dictionary[js.Any]): YargsInstance = js.native
    
    @JSName("$0")
    var $0: String = js.native
    
    def _copyDoubleDash(argv: js.Promise[Arguments]): js.Promise[Arguments] = js.native
    def _copyDoubleDash(argv: Arguments): Arguments = js.native
    
    def _getLoggerInstance(): LoggerInstance = js.native
    
    def _getParseContext(): js.Object = js.native
    
    def _hasOutput(): Boolean = js.native
    
    def _hasParseCallback(): Boolean = js.native
    
    def _parseArgs(args: String): Arguments | js.Promise[Arguments] = js.native
    def _parseArgs(args: String, shortCircuit: Boolean): Arguments | js.Promise[Arguments] = js.native
    def _parseArgs(args: js.Array[String]): Arguments | js.Promise[Arguments] = js.native
    def _parseArgs(args: js.Array[String], shortCircuit: Boolean): Arguments | js.Promise[Arguments] = js.native
    def _parseArgs(args: Null, shortCircuit: Null, _calledFromCommand: Boolean): Arguments | js.Promise[Arguments] = js.native
    def _parseArgs(args: Null, shortCircuit: Null, _calledFromCommand: Boolean, commandIndex: Double): Arguments | js.Promise[Arguments] = js.native
    
    def _runValidation(
      argv: Arguments,
      aliases: Dictionary[js.Array[String]],
      positionalMap: Dictionary[js.Array[String]]
    ): Unit = js.native
    def _runValidation(
      argv: Arguments,
      aliases: Dictionary[js.Array[String]],
      positionalMap: Dictionary[js.Array[String]],
      parseErrors: Null,
      isDefaultCommand: Boolean
    ): Unit = js.native
    def _runValidation(
      argv: Arguments,
      aliases: Dictionary[js.Array[String]],
      positionalMap: Dictionary[js.Array[String]],
      parseErrors: Error
    ): Unit = js.native
    def _runValidation(
      argv: Arguments,
      aliases: Dictionary[js.Array[String]],
      positionalMap: Dictionary[js.Array[String]],
      parseErrors: Error,
      isDefaultCommand: Boolean
    ): Unit = js.native
    
    def _setHasOutput(): Unit = js.native
    
    def addHelpOpt(): YargsInstance = js.native
    def addHelpOpt(opt: String): YargsInstance = js.native
    def addHelpOpt(opt: String, msg: String): YargsInstance = js.native
    def addHelpOpt(opt: Unit, msg: String): YargsInstance = js.native
    @JSName("addHelpOpt")
    def addHelpOpt_false(opt: `false`): YargsInstance = js.native
    
    def addShowHiddenOpt(): YargsInstance = js.native
    def addShowHiddenOpt(opt: String): YargsInstance = js.native
    def addShowHiddenOpt(opt: String, msg: String): YargsInstance = js.native
    def addShowHiddenOpt(opt: Unit, msg: String): YargsInstance = js.native
    @JSName("addShowHiddenOpt")
    def addShowHiddenOpt_false(opt: `false`): YargsInstance = js.native
    
    def alias(keyAliases: Dictionary[String | js.Array[String]]): YargsInstance = js.native
    def alias(keys: String, aliases: String): YargsInstance = js.native
    def alias(keys: String, aliases: js.Array[String]): YargsInstance = js.native
    def alias(keys: js.Array[String], aliases: String): YargsInstance = js.native
    def alias(keys: js.Array[String], aliases: js.Array[String]): YargsInstance = js.native
    
    var argv: Arguments = js.native
    
    def array(keys: String): YargsInstance = js.native
    def array(keys: js.Array[String]): YargsInstance = js.native
    
    def boolean(keys: String): YargsInstance = js.native
    def boolean(keys: js.Array[String]): YargsInstance = js.native
    
    def check(f: js.Function2[/* argv */ Arguments, /* aliases */ Dictionary[js.Array[String]], js.Any]): YargsInstance = js.native
    def check(
      f: js.Function2[/* argv */ Arguments, /* aliases */ Dictionary[js.Array[String]], js.Any],
      _global: Boolean
    ): YargsInstance = js.native
    
    def choices(keyChoices: Dictionary[String | js.Array[String]]): YargsInstance = js.native
    def choices(keys: String, choices: String): YargsInstance = js.native
    def choices(keys: String, choices: js.Array[String]): YargsInstance = js.native
    def choices(keys: js.Array[String], choices: String): YargsInstance = js.native
    def choices(keys: js.Array[String], choices: js.Array[String]): YargsInstance = js.native
    
    def coerce(
      keyCoerceCallbacks: Dictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
        ]
    ): YargsInstance = js.native
    def coerce(
      keys: String,
      coerceCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
    ): YargsInstance = js.native
    def coerce(
      keys: js.Array[String],
      coerceCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoerceCallback */ js.Any
    ): YargsInstance = js.native
    
    def commandDir(dir: String): YargsInstance = js.native
    def commandDir(dir: String, opts: RequireDirectoryOptions[js.Any, js.Any]): YargsInstance = js.native
    
    @JSName("command")
    def command_false(
      cmd: String | js.Array[String],
      description: js.UndefOr[String | `false`],
      builder: js.UndefOr[CommandBuilderDefinition | CommandBuilder],
      handler: js.UndefOr[CommandHandlerCallback],
      commandMiddleware: js.UndefOr[js.Array[Middleware]],
      deprecated: js.UndefOr[Boolean]
    ): YargsInstance = js.native
    
    def completion(): YargsInstance = js.native
    def completion(cmd: String): YargsInstance = js.native
    def completion(cmd: String, desc: String): YargsInstance = js.native
    def completion(cmd: String, desc: String, fn: CompletionFunction): YargsInstance = js.native
    def completion(cmd: String, desc: Unit, fn: CompletionFunction): YargsInstance = js.native
    def completion(cmd: String, fn: CompletionFunction): YargsInstance = js.native
    def completion(cmd: Unit, desc: String): YargsInstance = js.native
    def completion(cmd: Unit, desc: String, fn: CompletionFunction): YargsInstance = js.native
    def completion(cmd: Unit, desc: Unit, fn: CompletionFunction): YargsInstance = js.native
    def completion(cmd: Unit, fn: CompletionFunction): YargsInstance = js.native
    @JSName("completion")
    def completion_false(cmd: String, desc: `false`): YargsInstance = js.native
    @JSName("completion")
    def completion_false(cmd: String, desc: `false`, fn: CompletionFunction): YargsInstance = js.native
    @JSName("completion")
    def completion_false(cmd: Unit, desc: `false`): YargsInstance = js.native
    @JSName("completion")
    def completion_false(cmd: Unit, desc: `false`, fn: CompletionFunction): YargsInstance = js.native
    
    def config(): YargsInstance = js.native
    def config(config: Dictionary[js.Any]): YargsInstance = js.native
    def config(keys: String): YargsInstance = js.native
    def config(
      keys: String,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(keys: String, msg: String): YargsInstance = js.native
    def config(
      keys: String,
      msg: String,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(
      keys: String,
      msg: Unit,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(keys: js.Array[String]): YargsInstance = js.native
    def config(
      keys: js.Array[String],
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(keys: js.Array[String], msg: String): YargsInstance = js.native
    def config(
      keys: js.Array[String],
      msg: String,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(
      keys: js.Array[String],
      msg: Unit,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(
      keys: Unit,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(keys: Unit, msg: String): YargsInstance = js.native
    def config(
      keys: Unit,
      msg: String,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    def config(
      keys: Unit,
      msg: Unit,
      configCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigCallback */ js.Any
    ): YargsInstance = js.native
    
    def conflicts(keyConflicts: Dictionary[String | js.Array[String]]): YargsInstance = js.native
    def conflicts(key: String, conflictsWith: String): YargsInstance = js.native
    def conflicts(key: String, conflictsWith: js.Array[String]): YargsInstance = js.native
    
    def count(keys: String): YargsInstance = js.native
    def count(keys: js.Array[String]): YargsInstance = js.native
    
    var customScriptName: Boolean = js.native
    
    def defaults(key: String, value: js.Any): YargsInstance = js.native
    def defaults(key: String, value: js.Any, defaultDescription: String): YargsInstance = js.native
    def defaults(keys: js.Array[String], value: Exclude[js.Any, js.Function]): YargsInstance = js.native
    def defaults(keys: Dictionary[js.Any]): YargsInstance = js.native
    @JSName("defaults")
    var defaults_Original: FnCall = js.native
    
    def demand(keyMsgs: Dictionary[js.UndefOr[String]]): YargsInstance = js.native
    def demand(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String]): YargsInstance = js.native
    def demand(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String], msg: String): YargsInstance = js.native
    def demand(keys: String): YargsInstance = js.native
    def demand(keys: String, max: js.Array[String]): YargsInstance = js.native
    def demand(keys: String, max: js.Array[String], msg: String): YargsInstance = js.native
    def demand(keys: String, msg: String): YargsInstance = js.native
    def demand(keys: js.Array[String]): YargsInstance = js.native
    def demand(keys: js.Array[String], max: js.Array[String]): YargsInstance = js.native
    def demand(keys: js.Array[String], max: js.Array[String], msg: String): YargsInstance = js.native
    def demand(keys: js.Array[String], msg: String): YargsInstance = js.native
    def demand(min: Double): YargsInstance = js.native
    def demand(min: Double, max: String): YargsInstance = js.native
    def demand(min: Double, max: String, msg: String): YargsInstance = js.native
    def demand(min: Double, max: Double): YargsInstance = js.native
    def demand(min: Double, max: Double, msg: String): YargsInstance = js.native
    def demand(min: Double, max: Unit, msg: String): YargsInstance = js.native
    
    def demandCommand(): YargsInstance = js.native
    def demandCommand(min: Double): YargsInstance = js.native
    def demandCommand(min: Double, max: Double): YargsInstance = js.native
    def demandCommand(min: Double, max: Double, minMsg: String): YargsInstance = js.native
    def demandCommand(min: Double, max: Double, minMsg: String, maxMsg: String): YargsInstance = js.native
    def demandCommand(min: Double, max: Double, minMsg: Null, maxMsg: String): YargsInstance = js.native
    def demandCommand(min: Double, max: Double, minMsg: Unit, maxMsg: String): YargsInstance = js.native
    def demandCommand(min: Double, minMsg: String): YargsInstance = js.native
    
    def demandOption(keyMsgs: Dictionary[js.UndefOr[String]]): YargsInstance = js.native
    def demandOption(keys: String): YargsInstance = js.native
    def demandOption(keys: String, msg: String): YargsInstance = js.native
    def demandOption(keys: js.Array[String]): YargsInstance = js.native
    def demandOption(keys: js.Array[String], msg: String): YargsInstance = js.native
    
    @JSName("demand")
    def demand_true(keys: String, max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("demand")
    def demand_true(keys: String, msg: `true`): YargsInstance = js.native
    @JSName("demand")
    def demand_true(keys: js.Array[String], max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("demand")
    def demand_true(keys: js.Array[String], msg: `true`): YargsInstance = js.native
    
    def deprecateOption(option: String): YargsInstance = js.native
    def deprecateOption(option: String, message: String): YargsInstance = js.native
    def deprecateOption(option: String, message: Boolean): YargsInstance = js.native
    
    def describe(keyDescriptions: Dictionary[String]): YargsInstance = js.native
    def describe(keys: String): YargsInstance = js.native
    def describe(keys: String, description: String): YargsInstance = js.native
    def describe(keys: js.Array[String]): YargsInstance = js.native
    def describe(keys: js.Array[String], description: String): YargsInstance = js.native
    
    def detectLocale(detect: Boolean): YargsInstance = js.native
    
    def env(): YargsInstance = js.native
    def env(prefix: String): YargsInstance = js.native
    @JSName("env")
    def env_false(prefix: `false`): YargsInstance = js.native
    
    def epilog(msg: String): YargsInstance = js.native
    @JSName("epilog")
    var epilog_Original: js.Function1[/* msg */ String, YargsInstance] = js.native
    
    def epilogue(msg: String): YargsInstance = js.native
    
    def example(cmd: String): YargsInstance = js.native
    def example(cmd: String, description: String): YargsInstance = js.native
    def example(cmd: js.Array[js.Tuple2[String, js.UndefOr[String]]]): YargsInstance = js.native
    def example(cmd: js.Array[js.Tuple2[String, js.UndefOr[String]]], description: String): YargsInstance = js.native
    
    def exit(code: Double): Unit = js.native
    def exit(code: Double, err: String): Unit = js.native
    def exit(code: Double, err: YError): Unit = js.native
    
    def exitProcess(enabled: Boolean): YargsInstance = js.native
    
    def fail(f: FailureFunction): YargsInstance = js.native
    
    def getCommandInstance(): CommandInstance = js.native
    
    def getCompletion(args: js.Array[String], done: js.Function1[/* completions */ js.Array[String], js.Any]): Unit = js.native
    
    def getContext(): Context = js.native
    
    def getDemandedCommands(): Dictionary[Max] = js.native
    
    def getDemandedOptions(): Dictionary[js.UndefOr[String]] = js.native
    
    def getDeprecatedOptions(): Dictionary[js.UndefOr[String | Boolean]] = js.native
    
    def getDetectLocale(): Boolean = js.native
    
    def getExitProcess(): Boolean = js.native
    
    def getGroups(): Dictionary[js.Array[String]] = js.native
    
    def getHandlerFinishCommand(): FinishCommandHandler | Null = js.native
    
    def getOptions(): Options = js.native
    
    def getParserConfiguration(): Configuration = js.native
    
    def getStrict(): Boolean = js.native
    
    def getStrictCommands(): Boolean = js.native
    
    def getUsageInstance(): UsageInstance = js.native
    
    def getValidationInstance(): ValidationInstance = js.native
    
    def global(keys: String): YargsInstance = js.native
    def global(keys: String, global: Boolean): YargsInstance = js.native
    def global(keys: js.Array[String]): YargsInstance = js.native
    def global(keys: js.Array[String], global: Boolean): YargsInstance = js.native
    
    def group(keys: String, groupName: String): YargsInstance = js.native
    def group(keys: js.Array[String], groupName: String): YargsInstance = js.native
    
    def help(): YargsInstance = js.native
    def help(opt: String): YargsInstance = js.native
    def help(opt: String, msg: String): YargsInstance = js.native
    def help(opt: Unit, msg: String): YargsInstance = js.native
    @JSName("help")
    var help_Original: FnCallOptMsg = js.native
    @JSName("help")
    def help_false(opt: `false`): YargsInstance = js.native
    
    def hide(key: String): YargsInstance = js.native
    
    def implies(keyImplications: Dictionary[KeyOrPos | js.Array[KeyOrPos]]): YargsInstance = js.native
    def implies(key: String, implication: js.Array[KeyOrPos]): YargsInstance = js.native
    def implies(key: String, implication: KeyOrPos): YargsInstance = js.native
    
    def locale(): String = js.native
    def locale(locale: String): YargsInstance = js.native
    
    def middleware(callback: js.Array[MiddlewareCallback]): YargsInstance = js.native
    def middleware(callback: js.Array[MiddlewareCallback], applyBeforeValidation: Boolean): YargsInstance = js.native
    def middleware(callback: MiddlewareCallback): YargsInstance = js.native
    def middleware(callback: MiddlewareCallback, applyBeforeValidation: Boolean): YargsInstance = js.native
    
    def nargs(keyNargs: Dictionary[Double]): YargsInstance = js.native
    def nargs(keys: String, nargs: Double): YargsInstance = js.native
    def nargs(keys: js.Array[String], nargs: Double): YargsInstance = js.native
    
    def normalize(keys: String): YargsInstance = js.native
    def normalize(keys: js.Array[String]): YargsInstance = js.native
    
    def number(keys: String): YargsInstance = js.native
    def number(keys: js.Array[String]): YargsInstance = js.native
    
    def onFinishCommand(f: FinishCommandHandler): YargsInstance = js.native
    
    def option(keyOptionDefinitions: Dictionary[OptionDefinition]): YargsInstance = js.native
    def option(key: String, optionDefinition: OptionDefinition): YargsInstance = js.native
    
    def options(keyOptionDefinitions: Dictionary[OptionDefinition]): YargsInstance = js.native
    def options(key: String, optionDefinition: OptionDefinition): YargsInstance = js.native
    @JSName("options")
    var options_Original: FnCallKeyOptionDefinition = js.native
    
    def parse(): Arguments | js.Promise[Arguments] = js.native
    def parse(args: String, context: js.Object): Arguments | js.Promise[Arguments] = js.native
    def parse(args: String, context: js.Object, parseCallback: ParseCallback): Arguments | js.Promise[Arguments] = js.native
    def parse(args: String, parseCallback: ParseCallback): Arguments | js.Promise[Arguments] = js.native
    def parse(args: String, shortCircuit: Boolean): Arguments | js.Promise[Arguments] = js.native
    def parse(args: js.Array[String], context: js.Object): Arguments | js.Promise[Arguments] = js.native
    def parse(args: js.Array[String], context: js.Object, parseCallback: ParseCallback): Arguments | js.Promise[Arguments] = js.native
    def parse(args: js.Array[String], parseCallback: ParseCallback): Arguments | js.Promise[Arguments] = js.native
    def parse(args: js.Array[String], shortCircuit: Boolean): Arguments | js.Promise[Arguments] = js.native
    
    var parsed: DetailedArguments | `false` = js.native
    
    def parserConfiguration(config: Configuration): YargsInstance = js.native
    
    def pkgConf(key: String): YargsInstance = js.native
    def pkgConf(key: String, rootPath: String): YargsInstance = js.native
    
    def positional(key: String, positionalDefinition: PositionalDefinition): YargsInstance = js.native
    
    def recommendCommands(recommend: Boolean): YargsInstance = js.native
    
    def require(keyMsgs: Dictionary[js.UndefOr[String]]): YargsInstance = js.native
    def require(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String]): YargsInstance = js.native
    def require(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String], msg: String): YargsInstance = js.native
    def require(keys: String): YargsInstance = js.native
    def require(keys: String, max: js.Array[String]): YargsInstance = js.native
    def require(keys: String, max: js.Array[String], msg: String): YargsInstance = js.native
    def require(keys: String, msg: String): YargsInstance = js.native
    def require(keys: js.Array[String]): YargsInstance = js.native
    def require(keys: js.Array[String], max: js.Array[String]): YargsInstance = js.native
    def require(keys: js.Array[String], max: js.Array[String], msg: String): YargsInstance = js.native
    def require(keys: js.Array[String], msg: String): YargsInstance = js.native
    def require(min: Double): YargsInstance = js.native
    def require(min: Double, max: String): YargsInstance = js.native
    def require(min: Double, max: String, msg: String): YargsInstance = js.native
    def require(min: Double, max: Double): YargsInstance = js.native
    def require(min: Double, max: Double, msg: String): YargsInstance = js.native
    def require(min: Double, max: Unit, msg: String): YargsInstance = js.native
    @JSName("require")
    var require_Original: FnCallMinMaxMsg = js.native
    @JSName("require")
    def require_true(keys: String, max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("require")
    def require_true(keys: String, msg: `true`): YargsInstance = js.native
    @JSName("require")
    def require_true(keys: js.Array[String], max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("require")
    def require_true(keys: js.Array[String], msg: `true`): YargsInstance = js.native
    
    def required(keyMsgs: Dictionary[js.UndefOr[String]]): YargsInstance = js.native
    def required(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String]): YargsInstance = js.native
    def required(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String], msg: String): YargsInstance = js.native
    def required(keys: String): YargsInstance = js.native
    def required(keys: String, max: js.Array[String]): YargsInstance = js.native
    def required(keys: String, max: js.Array[String], msg: String): YargsInstance = js.native
    def required(keys: String, msg: String): YargsInstance = js.native
    def required(keys: js.Array[String]): YargsInstance = js.native
    def required(keys: js.Array[String], max: js.Array[String]): YargsInstance = js.native
    def required(keys: js.Array[String], max: js.Array[String], msg: String): YargsInstance = js.native
    def required(keys: js.Array[String], msg: String): YargsInstance = js.native
    def required(min: Double): YargsInstance = js.native
    def required(min: Double, max: String): YargsInstance = js.native
    def required(min: Double, max: String, msg: String): YargsInstance = js.native
    def required(min: Double, max: Double): YargsInstance = js.native
    def required(min: Double, max: Double, msg: String): YargsInstance = js.native
    def required(min: Double, max: Unit, msg: String): YargsInstance = js.native
    @JSName("required")
    var required_Original: FnCallMinMaxMsg = js.native
    @JSName("required")
    def required_true(keys: String, max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("required")
    def required_true(keys: String, msg: `true`): YargsInstance = js.native
    @JSName("required")
    def required_true(keys: js.Array[String], max: js.Array[String], msg: `true`): YargsInstance = js.native
    @JSName("required")
    def required_true(keys: js.Array[String], msg: `true`): YargsInstance = js.native
    
    def requiresArg(keys: String): YargsInstance = js.native
    def requiresArg(keys: js.Array[String]): YargsInstance = js.native
    def requiresArg(keys: Dictionary[js.Any]): YargsInstance = js.native
    
    def reset(): YargsInstance = js.native
    def reset(aliases: StringDictionary[js.Array[String]]): YargsInstance = js.native
    
    def resetOptions(): YargsInstance = js.native
    def resetOptions(aliases: StringDictionary[js.Array[String]]): YargsInstance = js.native
    
    def scriptName(scriptName: String): YargsInstance = js.native
    
    def showCompletionScript(): YargsInstance = js.native
    def showCompletionScript($0: String): YargsInstance = js.native
    def showCompletionScript($0: String, cmd: String): YargsInstance = js.native
    def showCompletionScript($0: Unit, cmd: String): YargsInstance = js.native
    
    def showHelp(level: js.Function1[/* message */ String, Unit]): YargsInstance = js.native
    
    def showHelpOnFail(): YargsInstance = js.native
    def showHelpOnFail(enabled: Boolean, message: String): YargsInstance = js.native
    def showHelpOnFail(message: String): YargsInstance = js.native
    
    @JSName("showHelp")
    def showHelp_error(level: error): YargsInstance = js.native
    @JSName("showHelp")
    def showHelp_log(level: log): YargsInstance = js.native
    
    def showHidden(): YargsInstance = js.native
    def showHidden(opt: String): YargsInstance = js.native
    def showHidden(opt: String, msg: String): YargsInstance = js.native
    def showHidden(opt: Unit, msg: String): YargsInstance = js.native
    @JSName("showHidden")
    var showHidden_Original: FnCallOptMsg = js.native
    @JSName("showHidden")
    def showHidden_false(opt: `false`): YargsInstance = js.native
    
    def skipValidation(keys: String): YargsInstance = js.native
    def skipValidation(keys: js.Array[String]): YargsInstance = js.native
    
    def strict(): YargsInstance = js.native
    def strict(enable: Boolean): YargsInstance = js.native
    
    def strictCommands(): YargsInstance = js.native
    def strictCommands(enable: Boolean): YargsInstance = js.native
    
    def string(key: String): YargsInstance = js.native
    def string(key: js.Array[String]): YargsInstance = js.native
    
    def terminalWidth(): Double | Null = js.native
    
    def updateLocale(obj: Dictionary[String]): YargsInstance = js.native
    @JSName("updateLocale")
    var updateLocale_Original: js.Function1[/* obj */ Dictionary[String], YargsInstance] = js.native
    
    def updateStrings(obj: Dictionary[String]): YargsInstance = js.native
    
    def usage(): YargsInstance = js.native
    def usage(msg: String): YargsInstance = js.native
    def usage(msg: String, description: String): YargsInstance = js.native
    def usage(msg: String, description: String, builder: Unit, handler: CommandHandlerCallback): YargsInstance = js.native
    def usage(msg: String, description: String, builder: CommandBuilder): YargsInstance = js.native
    def usage(msg: String, description: String, builder: CommandBuilderDefinition): YargsInstance = js.native
    def usage(
      msg: String,
      description: String,
      builder: CommandBuilderDefinition,
      handler: CommandHandlerCallback
    ): YargsInstance = js.native
    def usage(msg: String, description: String, builder: CommandBuilder, handler: CommandHandlerCallback): YargsInstance = js.native
    def usage(msg: String, description: Unit, builder: Unit, handler: CommandHandlerCallback): YargsInstance = js.native
    def usage(msg: String, description: Unit, builder: CommandBuilder): YargsInstance = js.native
    def usage(msg: String, description: Unit, builder: CommandBuilderDefinition): YargsInstance = js.native
    def usage(msg: String, description: Unit, builder: CommandBuilderDefinition, handler: CommandHandlerCallback): YargsInstance = js.native
    def usage(msg: String, description: Unit, builder: CommandBuilder, handler: CommandHandlerCallback): YargsInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`): YargsInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`, builder: Unit, handler: CommandHandlerCallback): YargsInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`, builder: CommandBuilder): YargsInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`, builder: CommandBuilderDefinition): YargsInstance = js.native
    @JSName("usage")
    def usage_false(
      msg: String,
      description: `false`,
      builder: CommandBuilderDefinition,
      handler: CommandHandlerCallback
    ): YargsInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`, builder: CommandBuilder, handler: CommandHandlerCallback): YargsInstance = js.native
    
    def version(): YargsInstance = js.native
    def version(key: String, msg: String, ver: String): YargsInstance = js.native
    def version(key: String, msg: Unit, ver: String): YargsInstance = js.native
    def version(key: String, ver: String): YargsInstance = js.native
    def version(key: Unit, msg: String, ver: String): YargsInstance = js.native
    def version(key: Unit, msg: Unit, ver: String): YargsInstance = js.native
    def version(key: Unit, ver: String): YargsInstance = js.native
    def version(ver: String): YargsInstance = js.native
    @JSName("version")
    def version_false(ver: `false`): YargsInstance = js.native
    
    def wrap(): YargsInstance = js.native
    def wrap(cols: Double): YargsInstance = js.native
  }
}
