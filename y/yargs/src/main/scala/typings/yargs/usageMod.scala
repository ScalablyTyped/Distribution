package typings.yargs

import typings.y18n.mod.Y18N
import typings.yargs.anon.Name
import typings.yargs.commonTypesMod.Dictionary
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsMod.YargsInstance
import typings.yargs.yargsStrings.error
import typings.yargs.yargsStrings.log
import typings.yargs.yerrorMod.YError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @JSImport("yargs/build/lib/usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usage(yargs: YargsInstance, y18n: Y18N): UsageInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("usage")(yargs.asInstanceOf[js.Any], y18n.asInstanceOf[js.Any])).asInstanceOf[UsageInstance]
  
  type FailureFunction = js.Function3[
    /* msg */ js.UndefOr[String | Null], 
    /* err */ js.UndefOr[YError | String], 
    /* usage */ UsageInstance, 
    Unit
  ]
  
  trait FrozenUsageInstance extends StObject {
    
    var commands: js.Array[js.Tuple5[String, String, Boolean, js.Array[String], Boolean]]
    
    var descriptions: Dictionary[js.UndefOr[String]]
    
    var epilogs: js.Array[String]
    
    var examples: js.Array[js.Tuple2[String, String]]
    
    var failMessage: js.UndefOr[String | Null] = js.undefined
    
    var failureOutput: Boolean
    
    var usageDisabled: Boolean
    
    var usages: js.Array[js.Tuple2[String, String]]
  }
  object FrozenUsageInstance {
    
    inline def apply(
      commands: js.Array[js.Tuple5[String, String, Boolean, js.Array[String], Boolean]],
      descriptions: Dictionary[js.UndefOr[String]],
      epilogs: js.Array[String],
      examples: js.Array[js.Tuple2[String, String]],
      failureOutput: Boolean,
      usageDisabled: Boolean,
      usages: js.Array[js.Tuple2[String, String]]
    ): FrozenUsageInstance = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], epilogs = epilogs.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], failureOutput = failureOutput.asInstanceOf[js.Any], usageDisabled = usageDisabled.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrozenUsageInstance]
    }
    
    extension [Self <: FrozenUsageInstance](x: Self) {
      
      inline def setCommands(value: js.Array[js.Tuple5[String, String, Boolean, js.Array[String], Boolean]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: (js.Tuple5[String, String, Boolean, js.Array[String], Boolean])*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      inline def setDescriptions(value: Dictionary[js.UndefOr[String]]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setEpilogs(value: js.Array[String]): Self = StObject.set(x, "epilogs", value.asInstanceOf[js.Any])
      
      inline def setEpilogsVarargs(value: String*): Self = StObject.set(x, "epilogs", js.Array(value :_*))
      
      inline def setExamples(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      inline def setFailMessage(value: String): Self = StObject.set(x, "failMessage", value.asInstanceOf[js.Any])
      
      inline def setFailMessageNull: Self = StObject.set(x, "failMessage", null)
      
      inline def setFailMessageUndefined: Self = StObject.set(x, "failMessage", js.undefined)
      
      inline def setFailureOutput(value: Boolean): Self = StObject.set(x, "failureOutput", value.asInstanceOf[js.Any])
      
      inline def setUsageDisabled(value: Boolean): Self = StObject.set(x, "usageDisabled", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "usages", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UsageInstance extends StObject {
    
    def cacheHelpMessage(): Unit = js.native
    
    def clearCachedHelpMessage(): Unit = js.native
    
    def command(cmd: String, description: String, isDefault: Boolean, aliases: js.Array[String]): Unit = js.native
    def command(
      cmd: String,
      description: String,
      isDefault: Boolean,
      aliases: js.Array[String],
      deprecated: Boolean
    ): Unit = js.native
    def command(cmd: String, description: Unit, isDefault: Boolean, aliases: js.Array[String]): Unit = js.native
    def command(cmd: String, description: Unit, isDefault: Boolean, aliases: js.Array[String], deprecated: Boolean): Unit = js.native
    
    def deferY18nLookup(str: String): String = js.native
    
    def describe(keys: String): Unit = js.native
    def describe(keys: String, desc: String): Unit = js.native
    def describe(keys: js.Array[String]): Unit = js.native
    def describe(keys: js.Array[String], desc: String): Unit = js.native
    def describe(keys: Dictionary[String]): Unit = js.native
    def describe(keys: Dictionary[String], desc: String): Unit = js.native
    
    def epilog(msg: String): Unit = js.native
    
    def example(cmd: String): Unit = js.native
    def example(cmd: String, description: String): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(msg: String): Unit = js.native
    def fail(msg: String, err: String): Unit = js.native
    def fail(msg: String, err: YError): Unit = js.native
    def fail(msg: Null, err: String): Unit = js.native
    def fail(msg: Null, err: YError): Unit = js.native
    def fail(msg: Unit, err: String): Unit = js.native
    def fail(msg: Unit, err: YError): Unit = js.native
    
    def failFn(f: FailureFunction): Unit = js.native
    
    def freeze(): Unit = js.native
    
    def functionDescription(fn: Name): String = js.native
    
    def getCommands(): js.Array[js.Tuple5[String, String, Boolean, js.Array[String], Boolean]] = js.native
    
    def getDescriptions(): Dictionary[js.UndefOr[String]] = js.native
    
    def getPositionalGroupName(): String = js.native
    
    def getUsage(): js.Array[js.Tuple2[String, String]] = js.native
    
    def getUsageDisabled(): Boolean = js.native
    
    def help(): String = js.native
    
    def reset(localLookup: Dictionary[Boolean]): UsageInstance = js.native
    
    def showHelp(level: js.Function1[/* message */ String, Unit]): Unit = js.native
    
    def showHelpOnFail(): UsageInstance = js.native
    def showHelpOnFail(enabled: String): UsageInstance = js.native
    def showHelpOnFail(enabled: String, message: String): UsageInstance = js.native
    def showHelpOnFail(enabled: Boolean): UsageInstance = js.native
    def showHelpOnFail(enabled: Boolean, message: String): UsageInstance = js.native
    def showHelpOnFail(enabled: Unit, message: String): UsageInstance = js.native
    
    @JSName("showHelp")
    def showHelp_error(level: error): Unit = js.native
    @JSName("showHelp")
    def showHelp_log(level: log): Unit = js.native
    
    def showVersion(): Unit = js.native
    
    def stringifiedValues(): String = js.native
    def stringifiedValues(values: js.Array[js.Any]): String = js.native
    def stringifiedValues(values: js.Array[js.Any], separator: String): String = js.native
    def stringifiedValues(values: Unit, separator: String): String = js.native
    
    def unfreeze(): Unit = js.native
    
    def usage(): UsageInstance = js.native
    def usage(msg: String): UsageInstance = js.native
    def usage(msg: String, description: String): UsageInstance = js.native
    def usage(msg: Null, description: String): UsageInstance = js.native
    @JSName("usage")
    def usage_false(msg: String, description: `false`): UsageInstance = js.native
    @JSName("usage")
    def usage_false(msg: Null, description: `false`): UsageInstance = js.native
    
    def version(ver: js.Any): Unit = js.native
    
    def wrap(): Unit = js.native
    def wrap(cols: Double): Unit = js.native
  }
}
